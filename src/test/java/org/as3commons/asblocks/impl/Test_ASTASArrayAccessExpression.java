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

import java.io.StringWriter;

import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASArrayAccessExpression;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.junit.Test;

import junit.framework.TestCase;

public class Test_ASTASArrayAccessExpression extends TestCase
{
	private ASFactory factory = new ASFactory();
	private IASArrayAccessExpression expr;
	protected IASExpression subscript;
	protected IASExpression target;

	public void setUp()
	{
		expr = null;
	}

	public void tearDown()
	{
		if (expr != null)
		{
			StringWriter buff = new StringWriter();
			LinkedListTree ast = ((ASTExpression) expr).getAST();
			new ASTPrinter(buff).print(ast);
			LinkedListTree parsed = AS3FragmentParser.parseExpression(buff.toString());
			CodeMirror.assertASTMatch(ast, parsed);
		}
	}

	@Test
	public void test_example1()
	{
		IASExpression target = factory.newExpression("foo");
		IASExpression subscript = factory.newIntegerLiteral(42);
		IASArrayAccessExpression aae = factory.newArrayAccessExpression(target, subscript);
		assertEquals("foo[42]", aae.toString());
	}

	@Test
	public void test_example2()
	{
		IASExpression target = factory.newExpression("foo[42]");
		IASExpression subscript = factory.newExpression("0");
		IASArrayAccessExpression aae = factory.newArrayAccessExpression(target, subscript);
		assertEquals("foo[42][0]", aae.toString());
	}

	public void testBasic()
	{
		target = factory.newExpression("foo");
		subscript = factory.newIntegerLiteral(1);
		expr = factory.newArrayAccessExpression(target, subscript);
		assertEquals(target, expr.getTarget());
		assertEquals(subscript, expr.getSubscript());
	}

	public void testParse()
	{
		expr = (IASArrayAccessExpression) factory.newExpression("foo[1]");
		target = factory.newExpression("foo");
		subscript = factory.newExpression("1");
	}

	public void testTokenBoundries()
	{
		expr = (IASArrayAccessExpression) factory.newExpression("a[b][c]");
		IASExpression target = factory.newExpression("foo");
		expr.setTarget(target);
	}

	public void testSubscript()
	{
		expr = (IASArrayAccessExpression) factory.newExpression("foo[1]");
		target = factory.newExpression("foo");
		subscript = factory.newStringLiteral("bar");
		expr.setSubscript(subscript);
	}
}