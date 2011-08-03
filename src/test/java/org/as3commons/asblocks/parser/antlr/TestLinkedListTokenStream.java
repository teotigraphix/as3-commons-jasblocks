////////////////////////////////////////////////////////////////////////////////
// Copyright 2011 Michael Schmalle - Teoti Graphix, LLC
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
// http://www.apache.org/licenses/LICENSE-2.0 
// 
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, 
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and 
// limitations under the License
// 
// Author: Michael Schmalle, Principal Architect
// mschmalle at teotigraphix dot com
////////////////////////////////////////////////////////////////////////////////

package org.as3commons.asblocks.parser.antlr;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.as3commons.asblocks.impl.ASTUtils;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTokenSource;
import org.as3commons.asblocks.parser.antlr.LinkedListTokenStream;
import org.as3commons.asblocks.parser.antlr.as3.AS3Lexer;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class TestLinkedListTokenStream extends TestCase
{
	private static final int TYPE_TEST = 123;

	public void testEOF()
	{
		TokenSource source = new TokenSource() {
			private boolean done = false;

			@Override
			public Token nextToken()
			{
				if (done)
				{
					return Token.EOF_TOKEN;
				}
				done = true;
				return new CommonToken(TYPE_TEST, "test");
			}

			@Override
			public String getSourceName()
			{
				return null;
			}
		};
		LinkedListTokenSource linkedSource = new LinkedListTokenSource(source);
		LinkedListTokenStream stream = new LinkedListTokenStream(linkedSource);
		LinkedListToken tok = next(stream);
		assertEquals(TYPE_TEST, tok.getType());
		LinkedListToken eof = next(stream);
		assertEquals(CharStream.EOF, eof.getType());
		assertEquals(tok, eof.getPrev());

		LinkedListToken eof2 = next(stream);
		assertEquals(CharStream.EOF, eof2.getType());
		assertSame(eof, eof2);
		assertEquals(tok, eof2.getPrev());
	}

	private LinkedListToken next(LinkedListTokenStream stream)
	{
		LinkedListToken tok = (LinkedListToken) stream.LT(1);
		stream.consume();
		return tok;
	}

	public void testMarkRewind()
	{
		ANTLRStringStream input = new ANTLRStringStream("package  { b");
		AS3Lexer lex = new AS3Lexer(input);
		LinkedListTokenSource src = new LinkedListTokenSource(lex);
		LinkedListTokenStream str = new LinkedListTokenStream(src);

		ASTUtils.assertAS3TokenTypeIs(AS3Parser.PACKAGE, str.LA(1));
		str.consume();
		ASTUtils.assertAS3TokenTypeIs(AS3Parser.LBRACE, str.LA(1));
		int mark = str.mark();
		assertEquals(2, mark);
		str.consume();
		ASTUtils.assertAS3TokenTypeIs(AS3Parser.IDENT, str.LA(1));

		str.rewind(mark);
		ASTUtils.assertAS3TokenTypeIs(AS3Parser.LBRACE, str.LA(1));
		str.consume();

		// no-args version should just go back to last mark
		str.rewind();
		assertEquals(mark, str.index());
	}
}
