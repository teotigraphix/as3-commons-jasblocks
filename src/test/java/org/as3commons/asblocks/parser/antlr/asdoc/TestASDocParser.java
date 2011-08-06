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

package org.as3commons.asblocks.parser.antlr.asdoc;

import java.io.IOException;
import java.io.StringReader;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.RecognitionException;
import org.as3commons.asblocks.parser.antlr.LinkedListTokenSource;
import org.as3commons.asblocks.parser.antlr.LinkedListTokenStream;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.LinkedListTreeAdaptor;
import org.as3commons.asblocks.parser.antlr.asdoc.ASDocLexer;
import org.as3commons.asblocks.parser.antlr.asdoc.ASDocParser;
import org.junit.Test;

public class TestASDocParser extends TestCase
{
	private static final LinkedListTreeAdaptor TREE_ADAPTOR = new LinkedListTreeAdaptor();

	public void testEmptyBody() throws IOException, RecognitionException
	{
		LinkedListTree tree = parse("");
		assertEquals(ASDocParser.ASDOC, tree.getType());
		assertEquals(ASDocParser.DESCRIPTION, tree.getFirstChild().getType());
	}

	@Test
	public void test_white_space() throws IOException, RecognitionException
	{
		String doc = "* First description\n" + "*   @param foo bar";
		LinkedListTree tree = parse(doc);
		
		LinkedListTree desc = (LinkedListTree) tree.getChild(0);
		assertEquals(ASDocParser.DESCRIPTION, desc.getType());
		
		LinkedListTree param = (LinkedListTree) tree.getChild(1);
		assertEquals(ASDocParser.PARA_TAG, param.getType());
		// NOTE: this is a hack for people that add more than on space after
		// an astrix, which is "not" correct but for this lexer to not fail
		// for these cases, the tag name is (WS? ATWORD)
		assertEquals("  @param", param.getFirstChild().getText());		
	}
	
	public void testParaBasic() throws IOException, RecognitionException
	{
		String doc = "* desc\n" + "* ription\n" + "* @param foo bar";
		LinkedListTree tree = parse(doc);

		LinkedListTree desc = (LinkedListTree) tree.getChild(0);
		assertEquals(ASDocParser.DESCRIPTION, desc.getType());

		LinkedListTree param = (LinkedListTree) tree.getChild(1);
		assertEquals(ASDocParser.PARA_TAG, param.getType());
		assertEquals("@param", param.getFirstChild().getText());
	}

	public void testLonelyParaTag() throws IOException, RecognitionException
	{
		String doc = "\n\t\t * @param test a test!\n\t\t ";
		LinkedListTree tree = parse(doc);
	}

	public void testJustNewlines() throws IOException, RecognitionException
	{
		String doc = "\n\n";
		LinkedListTree tree = parse(doc);
	}

	public void testInlineTag() throws IOException, RecognitionException
	{
		LinkedListTree tree = parse("{@link foo}");
		//OutputStreamWriter out = new OutputStreamWriter(System.out);
		//new ASTDot(out).dotify(tree);
		//out.flush();
		LinkedListTree desc = tree.getFirstChild();
		LinkedListTree tag = desc.getFirstChild();
		assertEquals(ASDocParser.INLINE_TAG, tag.getType());
		assertEquals("@link", tag.getFirstChild().getText());
	}

	private static LinkedListTree parse(String str) throws IOException,
			RecognitionException
	{
		ASDocParser parser = parserOn(str);
		return (LinkedListTree) parser.commentBody().getTree();
	}

	private static ASDocParser parserOn(String str) throws IOException
	{
		StringReader in = new StringReader(str);
		ANTLRReaderStream cs = new ANTLRReaderStream(in);
		ASDocLexer lexer = new ASDocLexer(cs);
		LinkedListTokenSource source = new LinkedListTokenSource(lexer);
		LinkedListTokenStream stream = new LinkedListTokenStream(source);
		ASDocParser parser = new ASDocParser(stream);
		parser.setTreeAdaptor(TREE_ADAPTOR);
		//		parser.setInput(lexer, cs);
		return parser;
	}
}
