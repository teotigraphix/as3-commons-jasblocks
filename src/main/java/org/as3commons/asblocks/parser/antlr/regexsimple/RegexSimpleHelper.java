/*
 * RegexSimpleHelper.java
 * 
 * Copyright (c) 2006-2007 David Holroyd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.as3commons.asblocks.parser.antlr.regexsimple;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.as3commons.asblocks.impl.AS3FragmentParser;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTokenSource;
import org.as3commons.asblocks.parser.antlr.LinkedListTokenStream;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.LinkedListTreeAdaptor;
import org.as3commons.asblocks.parser.antlr.as3.AS3Lexer;

public class RegexSimpleHelper {
	private static final LinkedListTreeAdaptor TREE_ADAPTOR = new LinkedListTreeAdaptor();

	/**
	 * Creates a properly-configured parser object for the E4X grammar.
	 */
	public static RegexSimpleParser parserOn(Reader in) throws IOException {
		ANTLRReaderStream cs = new ANTLRReaderStream(in);
		RegexSimpleLexer lexer = new RegexSimpleLexer(cs);
		LinkedListTokenSource source = new LinkedListTokenSource(lexer);
		LinkedListTokenStream stream = new LinkedListTokenStream(source);
		RegexSimpleParser parser = new RegexSimpleParser(stream);
		parser.setTreeAdaptor(TREE_ADAPTOR);
		parser.setInput(lexer, cs);
		return parser;
	}

	public static LinkedListTree parseRegexpLiteral(LinkedListToken startMarker, AS3Lexer lexer, CharStream cs, LinkedListTokenStream stream) throws RecognitionException {
		String tail = cs.substring(cs.index(), cs.size()-1);
		int initialTailLength = tail.length();
		RegexSimpleParser parser;
		try {
			parser = regexpParserOn(new StringReader(tail), stream);
		} catch (IOException e) {
			// TODO: better exception type?
			throw new RuntimeException(e);
		}
		LinkedListTree ast = AS3FragmentParser.tree(parser.regexpLiteral());
		tail = parser.getInputTail();
		// skip over the regexp in the original, underlying CharStream
		cs.seek(cs.index() + (initialTailLength - tail.length()));
		LinkedListTokenSource source = (LinkedListTokenSource)stream.getTokenSource();
		stream.setTokenSource(source);  // cause any remembered RegexpSimple state to be dropped
		stream.scrub(1); // erase the subsequent token that the RegexpSimple parser got from this stream
		source.setDelegate(lexer);
		return ast;
	}

	private static RegexSimpleParser regexpParserOn(Reader in, LinkedListTokenStream stream) throws IOException {
		ANTLRReaderStream cs = new ANTLRReaderStream(in);
		RegexSimpleLexer lexer = new RegexSimpleLexer(cs);
		LinkedListTokenSource source = (LinkedListTokenSource)stream.getTokenSource();
		source.setDelegate(lexer);

		// The AS3 grammar will see the initial '/' as an DIV (divide)
		// token, and lookahead in the AS3Parser will have already
		// grabbed references to that token in order to make it the
		// startToken for various AST subtrees, so we can't just delete
		// it.  We therefore find the DIC token and change its type to
		// match the regexp vocabulary, and then rewind the token stream
		// so that this will be the first token that the
		// SinpleRegexpParser will see.
		LinkedListToken startMarker = (LinkedListToken)stream.LT(-1);
		startMarker.setType(RegexSimpleParser.REGEXP_DELIMITER);
		stream.seek(stream.index()-1);

		RegexSimpleParser parser = new RegexSimpleParser(stream);
		parser.setTreeAdaptor(new LinkedListTreeAdaptor());
		parser.setInput(lexer, cs);
		return parser;
	}
}