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

import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASIntegerLiteral;
import org.as3commons.asblocks.dom.IASInvocation;
import org.as3commons.asblocks.dom.IASNewExpression;
import org.as3commons.asblocks.dom.IASStringLiteral;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

public class Test_ASTASNewExpression extends Test_ASTASInvocationExpression
{

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
			LinkedListTree parsed = AS3FragmentParser.parseExpression(buff
					.toString());
			CodeMirror.assertASTMatch(ast, parsed);
		}
	}	
	
	protected IASInvocation newTestExpr(IASExpression sub, List args)
	{
		return factory.newNewExpression(sub, args);
	}

	private IASNewExpression getExpr()
	{
		return (IASNewExpression) expr;
	}

	public void testNoArgs()
	{
		expr = newTestExpr(sub, null);
		assertNull(getExpr().getArguments());
	}

	public void testRemoveArgs()
	{
		args.add(factory.newIntegerLiteral(1));
		expr = newTestExpr(sub, args);
		getExpr().setArguments(null);
		assertNull(getExpr().getArguments());
	}

	public void testAddArgs()
	{
		expr = newTestExpr(sub, null);
		getExpr().setArguments(args);
		assertNotNull(getExpr().getArguments());
	}

	public void testParse()
	{
		expr = (IASInvocation) factory.newExpression("new Foo()");
	}
	
	
	
	
	
	
	
	
	
	// pass
	public void testBasic()
	{
	}

	// pass
	public void testSetExpression()
	{
	}

	// pass
	public void testSetArguments()
	{
	}

	public void testReplaceArguments()
	{
	}
	
	
}