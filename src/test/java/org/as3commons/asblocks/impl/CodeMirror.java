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

package org.as3commons.asblocks.impl;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.IASWriter;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class CodeMirror
{

	/**
	 * Serializes the given compilation unit to a string, parses it back
	 * to a second compilation unit, and serializes that to a second string,
	 * finally asserting that the first string and the second string of
	 * source code are the same.
	 */
	public static IASCompilationUnit assertReflection(ASFactory fact,
														IASCompilationUnit unit)
	{
		LinkedListTree ast = ((ASTScriptElement) unit).getAST();
		saintyCheckTokenStream(ast);
		saintyCheckStartStopTokens(ast);
		assertTokenStreamNotDisjoint(ast);
		StringWriter out = new StringWriter();
		IASWriter writer = fact.newWriter();
		try
		{
			writer.write(out, unit);
		}
		catch (IOException e)
		{
			throw new Error(e);
		}
		try
		{
			IASCompilationUnit unit2 = fact.newParser().parseIn(
					new StringReader(out.toString()));
			LinkedListTree ast2 = ((ASTASCompilationUnit) unit2).getAST();
			assertASTMatch(ast, ast2);
			StringWriter out2 = new StringWriter();
			try
			{
				writer.write(out2, unit2);
			}
			catch (IOException e)
			{
				throw new Error(e);
			}
			Assert.assertEquals(out.toString(), out2.toString());
			return unit2;
		}
		catch (ASBlocksSyntaxError e)
		{
			Assert.fail(e.toString() + "\n" + out.toString());
			return null; // never reached
		}
	}

	public static Set<LinkedListToken> assertTokenStreamNotDisjoint(LinkedListTree ast)
	{
		Set<LinkedListToken> tokensFromStartToStop = tokenStreamToSet(ast);
		for (int i = 0; i < ast.getChildCount(); i++)
		{
			LinkedListTree child = (LinkedListTree) ast.getChild(i);
			Set<LinkedListToken> childTokens = assertTokenStreamNotDisjoint(child);
			
			boolean result = tokensFromStartToStop.containsAll(childTokens);
			if (!result)
			{
				Assert.assertTrue("'" + child + "' (child " + i + " of '" + ast
						+ "') had a token stream disjoint with its parent",	result);
			}

		}
		return tokensFromStartToStop;
	}

	private static Set<LinkedListToken> tokenStreamToSet(LinkedListTree ast)
	{
		Set<LinkedListToken> tokens = new HashSet<LinkedListToken>();
		for (LinkedListToken tok = ast.getStartToken(); tok != null;)
		{
			tokens.add(tok);
			if (tok == ast.getStopToken())
			{
				break;
			}
			tok = tok.getNext();
		}
		return tokens;
	}

	public static void assertASTMatch(LinkedListTree ast1, LinkedListTree ast2)
	{
		String path = pathTo(ast1);
		ASTUtils.assertAS3TokenTypeIs("At " + path, ast1.getType(),
				ast2.getType());
		if (ast1.getType() == AS3Parser.IDENT)
		{
			Assert.assertEquals("At " + path, ast1.getText(), ast2.getText());
		}
		Assert.assertEquals("At " + path + " child count mismatch: "
				+ stringifyFirstLevel(ast1) + " vs. "
				+ stringifyFirstLevel(ast2), ast1.getChildCount(),
				ast2.getChildCount());
		for (int i = 0; i < ast1.getChildCount(); i++)
		{
			assertASTMatch((LinkedListTree) ast1.getChild(i),
					(LinkedListTree) ast2.getChild(i));
		}
	}

	private static String pathTo(LinkedListTree ast)
	{
		StringBuffer buff = new StringBuffer();
		while (ast != null)
		{
			buff.insert(0, ast);
			ast = ast.getParent();
			if (ast != null)
			{
				buff.insert(0, "/");
			}
		}
		return buff.toString();
	}

	private static String stringifyFirstLevel(LinkedListTree ast)
	{
		StringBuffer buf = new StringBuffer("(");
		for (int i = 0; i < ast.getChildCount(); i++)
		{
			if (i > 0)
			{
				buf.append(" ");
			}
			buf.append(ast.getChild(i));
		}
		buf.append(")");
		return buf.toString();
	}

	/**
	 * Search through the stream for tokens who's 'prev' property doesn't
	 * match the token who's 'last' property we just dereferenced in
	 * the last iteration.
	 * i.e. checks that when prev.next==next, then next.prev==prev too.
	 */
	private static void saintyCheckTokenStream(LinkedListTree ast)
	{
		LinkedListToken last = null;
		for (LinkedListToken tok = ast.getStartToken(); tok != null; tok = tok
				.getNext())
		{
			if (last != null && last != tok.getPrev())
			{
				Assert.fail("last[" + last + "].next=>[" + tok
						+ "] but next.prev=>[" + tok.getPrev() + "]");
			}
			last = tok;
		}
	}

	private static void saintyCheckStartStopTokens(LinkedListTree ast)
	{
		assertStopNotBeforeStart(ast);
		ASTIterator i = new ASTIterator(ast);
		while (i.hasNext())
		{
			saintyCheckStartStopTokens(i.next());
		}
	}

	private static void assertStopNotBeforeStart(LinkedListTree ast)
	{
		LinkedListToken start = ast.getStartToken();
		LinkedListToken stop = ast.getStopToken();
		if (stop == start)
			return;
		for (LinkedListToken tok = stop; tok != null; tok = tok.getNext())
		{
			Assert.assertFalse("Found stopToken preceeding startToken: " + ast
					+ "(" + start + " - " + stop + ")", tok == start);
		}
	}
}