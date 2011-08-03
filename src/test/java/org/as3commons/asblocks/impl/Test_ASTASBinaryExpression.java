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
import org.as3commons.asblocks.dom.BinaryOperator;
import org.as3commons.asblocks.dom.IASBinaryExpression;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

import junit.framework.TestCase;

public class Test_ASTASBinaryExpression extends TestCase
{
	private IASExpression left;
	private IASExpression right;
	private ASFactory fact = new ASFactory();
	private IASBinaryExpression expr;

	public void setUp()
	{
		left = fact.newIntegerLiteral(1);
		right = fact.newIntegerLiteral(2);
		expr = null;
	}

	public void tearDown()
	{
		if (expr != null)
		{
			assertEquals(left, expr.getLeftExpression());
			assertEquals(right, expr.getRightExpression());
		}
	}

	public void testAdd()
	{
		expr = fact.newAddExpression(left, right);
		assertOp(BinaryOperator.ADD);
	}

	public void testAnd()
	{
		expr = fact.newAndExpression(left, right);
		assertOp(BinaryOperator.AND);
	}

	public void testBitAnd()
	{
		expr = fact.newBitAndExpression(left, right);
		assertOp(BinaryOperator.BITAND);
	}

	public void testBitOr()
	{
		expr = fact.newBitOrExpression(left, right);
		assertOp(BinaryOperator.BITOR);
	}

	public void testBitXor()
	{
		expr = fact.newBitXorExpression(left, right);
		assertOp(BinaryOperator.BITXOR);
	}

	public void testDivision()
	{
		expr = fact.newDivisionExpression(left, right);
		assertOp(BinaryOperator.DIV);
	}

	public void testEquals()
	{
		expr = fact.newEqualsExpression(left, right);
		assertOp(BinaryOperator.EQ);
	}

	public void testGreaterEquals()
	{
		expr = fact.newGreaterEqualsExpression(left, right);
		assertOp(BinaryOperator.GE);
	}

	public void testGreaterThan()
	{
		expr = fact.newGreaterThanExpression(left, right);
		assertOp(BinaryOperator.GT);
	}

	public void testLessEquals()
	{
		expr = fact.newLessEqualsExpression(left, right);
		assertOp(BinaryOperator.LE);
	}

	public void testLessThan()
	{
		expr = fact.newLessThanExpression(left, right);
		assertOp(BinaryOperator.LT);
	}

	public void testModulo()
	{
		expr = fact.newModuloExpression(left, right);
		assertOp(BinaryOperator.MOD);
	}

	public void testMultiply()
	{
		expr = fact.newMultiplyExpression(left, right);
		assertOp(BinaryOperator.MUL);
	}

	public void testNotEquals()
	{
		expr = fact.newNotEqualsExpression(left, right);
		assertOp(BinaryOperator.NE);
	}

	public void testOr()
	{
		expr = fact.newOrExpression(left, right);
		assertOp(BinaryOperator.OR);
	}

	public void testShiftLeft()
	{
		expr = fact.newShiftLeftExpression(left, right);
		assertOp(BinaryOperator.SL);
	}

	public void testShiftRight()
	{
		expr = fact.newShiftRightExpression(left, right);
		assertOp(BinaryOperator.SR);
	}

	public void testShiftRightUnsigned()
	{
		expr = fact.newShiftRightUnsignedExpression(left, right);
		assertOp(BinaryOperator.SRU);
	}

	public void testSubtract()
	{
		expr = fact.newSubtractExpression(left, right);
		assertOp(BinaryOperator.SUB);
	}

	private void assertOp(BinaryOperator expected)
	{
		LinkedListTree ast = ((ASTExpression) expr).getAST();
		IASExpression expression = fact.newExpression(ASTUtils
				.stringifyNode(ast));
		assertEquals(expected, ((IASBinaryExpression) expression).getOperator());
	}

	public void testOpString() throws IllegalArgumentException,
			IllegalAccessException
	{
		//		EnumAssert.assertValidEnumConstants(BinaryOperatorMap.class);
	}

	public void testSetOp()
	{
		expr = fact.newAddExpression(left, right);
		assertOp(BinaryOperator.ADD);
		expr.setOperator(BinaryOperator.SUB);
		assertOp(BinaryOperator.SUB);
	}

	public void testSetLeft()
	{
		expr = fact.newAddExpression(left, right);
		left = fact.newIntegerLiteral(24);
		expr.setLeftExpression(left);
	}

	public void testSetRight()
	{
		expr = fact.newAddExpression(left, right);
		right = fact.newIntegerLiteral(24);
		expr.setRightExpression(right);
	}
}