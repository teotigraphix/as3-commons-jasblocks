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

import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASPrefixExpression;
import org.as3commons.asblocks.dom.PrefixOperator;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

import junit.framework.TestCase;

public class Test_ASTASPrefixExpression extends TestCase
{
	private ASFactory fact = new ASFactory();
	private IASExpression sub;
	private IASPrefixExpression expr;

	protected void setUp()
	{
		sub = fact.newExpression("i");
	}

	protected void tearDown()
	{
		if (expr != null)
		{
			assertNotNull(expr.getExpression());
		}
	}

	public void testSetOp()
	{
		expr = fact.newPreDecExpression(sub);
		assertOp(PrefixOperator.PREDEC);
		expr.setOperator(PrefixOperator.PREINC);
		assertOp(PrefixOperator.PREINC);
	}

	public void testPreDec()
	{
		expr = fact.newPreDecExpression(sub);
		assertOp(PrefixOperator.PREDEC);
	}

	public void testPreInc()
	{
		expr = fact.newPreIncExpression(sub);
		assertOp(PrefixOperator.PREINC);
	}

	public void testPositive()
	{
		expr = fact.newPositiveExpression(sub);
		assertOp(PrefixOperator.POS);
	}

	public void testNegative()
	{
		expr = fact.newNegativeExpression(sub);
		assertOp(PrefixOperator.NEG);
	}

	public void testNot()
	{
		expr = fact.newNotExpression(sub);
		assertOp(PrefixOperator.NOT);
	}

	public void testSetSubexpression()
	{
		expr = fact.newPreIncExpression(sub);
		sub = fact.newExpression("j");
		expr.setExpression(sub);
	}

	private void assertOp(PrefixOperator expected)
	{
		LinkedListTree ast = ((ASTExpression) expr).getAST();
		IASExpression expr = fact.newExpression(ASTUtils.stringifyNode(ast));
		assertEquals(expected, ((IASPrefixExpression) expr).getOperator());
	}

	public void testOpString() throws IllegalArgumentException,
			IllegalAccessException
	{
		//		EnumAssert.assertValidEnumConstants(PrefixOperator.class);
	}
}