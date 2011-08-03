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

import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASAssignmentExpression;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASExpressionStatement;
import org.as3commons.asblocks.dom.IASFunctionExpression;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.Visibility;

import junit.framework.TestCase;

public class Test_ASTASFunctionExpression extends TestCase
{
	private ASFactory factory = new ASFactory();
	private IASCompilationUnit unit;
	private IASMethod meth;
	private IASCompilationUnit reflect;

	protected void setUp()
	{
		unit = factory.newClass("Test");
		IASClassType clazz = (IASClassType) unit.getType();
		meth = clazz.newMethod("test", Visibility.PUBLIC, null);
		reflect = null;
	}

	protected void tearDown() throws IOException
	{
		if (reflect == null)
		{
			reflect = assertReflection();
		}
	}

	private IASCompilationUnit assertReflection() throws IOException
	{
		return CodeMirror.assertReflection(factory, unit);
	}

	public void test_example1()
	{
		IASFunctionExpression fl = factory.newFunctionExpression();
		assertEquals("function () {\n}", fl.toString());
	}

	public void test_example2()
	{
		IASFunctionExpression fl = factory.newFunctionExpression();
		fl.setType("int");
		fl.addParameter("arg0", "String");
		fl.parseStatement("trace('Hello World')");
		assertEquals("function (arg0:String):int {\n	trace('Hello World');\n}", fl.toString());
	}

	public void test_example3()
	{
		IASFunctionExpression fl = factory.newFunctionExpression();
		fl.setType("int");
		fl.addParameter("arg0", "String");
		fl.parseStatement("trace('Hello World')");
		IASExpression target = factory.newExpression("foo");
		IASAssignmentExpression assign = factory.newAssignExpression(target, fl);

		assertEquals("foo = function (arg0:String):int {\n	trace('Hello World');\n}", assign.toString());
	}

	public void testIt()
	{
		IASFunctionExpression func = factory.newFunctionExpression();
		assertNotNull(func);
		func.addParameter("foo", "String");
		meth.newExpressionStatement(factory.newAssignExpression(factory.newExpression("myFunc"), func));
		func.parseStatement("trace('hello world')");
	}

	public void testParse()
	{
		IASExpressionStatement exprStmt = (IASExpressionStatement) meth.parseStatement("theFunc = function () { trace('foo!'); }");
		IASAssignmentExpression assign = (IASAssignmentExpression) exprStmt.getExpression();
		ExtraAssertions.assertInstanceof(assign.getRightExpression(), IASFunctionExpression.class);
	}

	public void testParseNamed()
	{
		IASExpressionStatement exprStmt = (IASExpressionStatement) meth.parseStatement("theFunc = function fn() { trace('foo!'); }");
		IASAssignmentExpression assign = (IASAssignmentExpression) exprStmt.getExpression();
		ExtraAssertions.assertInstanceof(assign.getRightExpression(), IASFunctionExpression.class);
	}
}
