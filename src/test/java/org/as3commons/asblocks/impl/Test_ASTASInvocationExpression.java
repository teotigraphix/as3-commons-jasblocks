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
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASFieldAccessExpression;
import org.as3commons.asblocks.dom.IASIntegerLiteral;
import org.as3commons.asblocks.dom.IASInvocation;
import org.as3commons.asblocks.dom.IASInvocationExpression;
import org.as3commons.asblocks.dom.IASStringLiteral;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.junit.Test;

public class Test_ASTASInvocationExpression extends TestCase
{
	protected ASFactory factory = new ASFactory();
	protected IASExpression sub;
	protected IASInvocation expr;
	protected List args;

	public void setUp()
	{
		args = new ArrayList();
		sub = factory.newExpression("com.example.MyClass");
	}

	public void tearDown()
	{
		StringWriter buff = new StringWriter();
		if (expr != null)
		{
			LinkedListTree ast = ((ASTInvocation) expr).getAST();
			new ASTPrinter(buff).print(ast);
			LinkedListTree parsed = AS3FragmentParser.parseExpression(buff.toString());
			CodeMirror.assertASTMatch(ast, parsed);
		}
	}

	protected IASInvocation newTestExpr(IASExpression sub, List args)
	{
		return factory.newInvocationExpression(sub, args);
	}

	@Test
	public void test_examples1()
	{
		IASExpression target = factory.newExpression("foo");
		IASInvocationExpression ii = factory.newInvocationExpression(target, null);
		assertEquals("foo()", ii.toString());
	}

	@Test
	public void test_examples2()
	{
		IASExpression target = factory.newExpression("foo");
		List<IASExpression> arguments = new ArrayList<IASExpression>();
		arguments.add(factory.newExpression("bar"));
		arguments.add(factory.newStringLiteral("baz"));
		IASInvocationExpression ii = factory.newInvocationExpression(target, arguments);
		assertEquals("foo(bar, \"baz\")", ii.toString());
	}

	@Test
	public void test_examples3()
	{
		IASExpression target = factory.newExpression("foo");
		IASInvocationExpression ii = factory.newInvocationExpression(target, null);
		ii.setTarget(factory.newExpression("bar"));
		assertEquals("bar()", ii.toString());
	}

	@Test
	public void test_examples4()
	{
		IASExpression target = factory.newExpression("baz");
		IASInvocationExpression ii = factory.newInvocationExpression(target, null);
		List<IASExpression> arguments = new ArrayList<IASExpression>();
		arguments.add(factory.newExpression("bar"));
		arguments.add(factory.newStringLiteral("foo"));
		ii.setArguments(arguments);
		assertEquals("baz(bar, \"foo\")", ii.toString());
	}

	@Test
	public void test_examples5()
	{
		IASExpression target1 = factory.newExpression("foo");
		IASFieldAccessExpression access = factory.newFieldAccessExpression(target1, "bar");
		IASInvocationExpression ii = factory.newInvocationExpression(access, null);
		List<IASExpression> arguments = new ArrayList<IASExpression>();
		arguments.add(factory.newIntegerLiteral(42));
		ii.setArguments(arguments);
		assertEquals("foo.bar(42)", ii.toString());
	}
	
	// pass
	public void testBasic()
	{
		args.add(factory.newIntegerLiteral(1));
		expr = newTestExpr(sub, args);
		assertEquals(sub, expr.getTarget());
		List actualArgs = expr.getArguments();
		assertEquals(1, actualArgs.size());
	}

	// pass
	public void testSetExpression()
	{
		expr = newTestExpr(sub, args);
		sub = factory.newExpression("Replacement");
		expr.setTarget(sub);
		assertEquals(sub, expr.getTarget());
	}

	// pass
	public void testSetArguments()
	{
		expr = newTestExpr(sub, args);
		List newArgs = new ArrayList();
		IASIntegerLiteral arg1 = factory.newIntegerLiteral(1);
		newArgs.add(arg1);
		IASStringLiteral arg2 = factory.newStringLiteral("foo");
		newArgs.add(arg2);
		expr.setArguments(newArgs);
		assertEquals(2, expr.getArguments().size());
		assertEquals(arg1, expr.getArguments().get(0));
		assertEquals(arg2, expr.getArguments().get(1));
	}

	public void testReplaceArguments()
	{
		expr = newTestExpr(sub, args);
		List args = new ArrayList();
		IASIntegerLiteral arg = factory.newIntegerLiteral(1);
		args.add(arg);
		expr.setArguments(args);
		List newArgs = new ArrayList();
		IASStringLiteral newArg = factory.newStringLiteral("foo");
		newArgs.add(newArg);
		expr.setArguments(newArgs);
		assertEquals(1, expr.getArguments().size());
		assertEquals(newArg, expr.getArguments().get(0));
	}
}