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
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASConditionalExpression;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASFieldAccessExpression;
import org.as3commons.asblocks.dom.IASIntegerLiteral;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.Visibility;

import junit.framework.TestCase;

public class Test_ASTASConditionalExpression extends TestCase
{
	private IASConditionalExpression conditionalExpr = null;
	private ASFactory factory = new ASFactory();
	private IASCompilationUnit unit;
	private IASCompilationUnit reflect;

	protected void setUp()
	{
		unit = factory.newClass("Test");
		reflect = null;
		conditionalExpr = null;
	}

	protected void tearDown() throws IOException
	{
		if (reflect == null)
		{
			IASClassType clazz = (IASClassType) unit.getType();
			IASMethod meth = clazz.newMethod("test", Visibility.PUBLIC, null);
			if (conditionalExpr != null)
			{
				meth.newExpressionStatement(conditionalExpr);
			}
			reflect = assertReflection();
		}
	}

	private IASCompilationUnit assertReflection() throws IOException
	{
		return CodeMirror.assertReflection(factory, unit);
	}

	public void test_example1()
	{
		IASExpression condition = factory.newExpression("foo");
		IASExpression thenExp = factory.newExpression("bar");
		IASExpression elseExp = factory.newExpression("baz");
		IASConditionalExpression ce = factory.newConditionalExpression(condition, thenExp, elseExp);
		assertEquals("foo ? bar : baz", ce.toString());
	}

	public void test_example2()
	{
		IASExpression condition = factory.newExpression("foo");
		IASExpression thenExp = factory.newExpression("bar");
		IASExpression elseExp = factory.newExpression("baz");
		IASConditionalExpression ce = factory.newConditionalExpression(condition, thenExp, elseExp);
		ce.setCondition(factory.newExpression("foo < 42"));
		ce.setThenExpression(factory.newExpression("foBar()"));
		ce.setElseExpression(factory.newExpression("foBaz()"));
		assertEquals("foo < 42 ? foBar() : foBaz()", ce.toString());
	}

	public void test_example3()
	{
		IASConditionalExpression ce = (IASConditionalExpression) factory.newExpression("foo ? bar : baz");
		assertNotNull(ce);
	}

	public void testBasic()
	{
		IASExpression conditionExpr = factory.newExpression("a.b");
		IASExpression thenExpr = factory.newExpression("1");
		IASExpression elseExpr = factory.newExpression("2");
		conditionalExpr = factory.newConditionalExpression(conditionExpr, thenExpr, elseExpr);
		ExtraAssertions.assertInstanceof(conditionalExpr.getCondition(), IASFieldAccessExpression.class);
		ExtraAssertions.assertInstanceof(conditionalExpr.getThenExpression(), IASIntegerLiteral.class);
		ExtraAssertions.assertInstanceof(conditionalExpr.getElseExpression(), IASIntegerLiteral.class);
	}

	public void testParse()
	{
		conditionalExpr = (IASConditionalExpression) factory.newExpression("a.b ? 1 : 2");
		ExtraAssertions.assertInstanceof(conditionalExpr.getCondition(), IASFieldAccessExpression.class);
		ExtraAssertions.assertInstanceof(conditionalExpr.getThenExpression(), IASIntegerLiteral.class);
		ExtraAssertions.assertInstanceof(conditionalExpr.getElseExpression(), IASIntegerLiteral.class);
	}

	public void testSetters()
	{
		IASExpression conditionExpr = factory.newExpression("a.b");
		IASExpression thenExpr = factory.newExpression("1");
		IASExpression elseExpr = factory.newExpression("2");
		conditionalExpr = factory.newConditionalExpression(conditionExpr, thenExpr, elseExpr);
		conditionalExpr.setCondition(factory.newBooleanLiteral(true));
		conditionalExpr.setThenExpression(factory.newIntegerLiteral(3));
		conditionalExpr.setElseExpression(factory.newIntegerLiteral(4));
	}
}
