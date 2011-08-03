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
import org.as3commons.asblocks.dom.AssignmentOperator;
import org.as3commons.asblocks.dom.IASAssignmentExpression;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

import junit.framework.TestCase;

public class Test_ASTASAssignmentExpression extends TestCase
{
	private IASExpression left;
	private IASExpression right;
	private ASFactory fact = new ASFactory();
	private IASAssignmentExpression expr;

	public void setUp()
	{
		left = fact.newExpression("a");
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

	public void testAssign()
	{
		expr = fact.newAssignExpression(left, right);
		assertOp(AssignmentOperator.ASSIGN);
	}

	public void testAdd()
	{
		expr = fact.newAddAssignExpression(left, right);
		assertOp(AssignmentOperator.ADD_ASSIGN);
	}

	public void testBitAnd()
	{
		expr = fact.newBitAndAssignExpression(left, right);
		assertOp(AssignmentOperator.BITAND_ASSIGN);
	}

	public void testBitOr()
	{
		expr = fact.newBitOrAssignExpression(left, right);
		assertOp(AssignmentOperator.BITOR_ASSIGN);
	}

	public void testBitXor()
	{
		expr = fact.newBitXorAssignExpression(left, right);
		assertOp(AssignmentOperator.BITXOR_ASSIGN);
	}

	public void testDivision()
	{
		expr = fact.newDivideAssignExpression(left, right);
		assertOp(AssignmentOperator.DIV_ASSIGN);
	}

	public void testModulo()
	{
		expr = fact.newModuloAssignExpression(left, right);
		assertOp(AssignmentOperator.MOD_ASSIGN);
	}

	public void testMultiply()
	{
		expr = fact.newMultiplyAssignExpression(left, right);
		assertOp(AssignmentOperator.MUL_ASSIGN);
	}

	public void testShiftLeft()
	{
		expr = fact.newShiftLeftAssignExpression(left, right);
		assertOp(AssignmentOperator.SL_ASSIGN);
	}

	public void testShiftRight()
	{
		expr = fact.newShiftRightAssignExpression(left, right);
		assertOp(AssignmentOperator.SR_ASSIGN);
	}

	public void testShiftRightUnsigned()
	{
		expr = fact.newShiftRightUnsignedAssignExpression(left, right);
		assertOp(AssignmentOperator.SRU_ASSIGN);
	}

	public void testSubtract()
	{
		expr = fact.newSubtractAssignExpression(left, right);
		assertOp(AssignmentOperator.SUB_ASSIGN);
	}

	private void assertOp(AssignmentOperator expected)
	{
		LinkedListTree ast = ((ASTExpression) expr).getAST();
		IASExpression expr = fact.newExpression(ASTUtils.stringifyNode(ast));
		assertEquals(expected, ((IASAssignmentExpression) expr).getOperator());
	}

	public void testOpString() throws IllegalArgumentException,
			IllegalAccessException
	{
//		EnumAssert.assertValidEnumConstants(AssignmentOperator.class);
	}

	public void testSetOp()
	{
		expr = fact.newAddAssignExpression(left, right);
		assertOp(AssignmentOperator.ADD_ASSIGN);
		expr.setOperator(AssignmentOperator.SUB_ASSIGN);
		assertOp(AssignmentOperator.SUB_ASSIGN);
	}

	public void testSetLeft()
	{
		expr = fact.newAddAssignExpression(left, right);
		left = fact.newIntegerLiteral(24);
		expr.setLeftExpression(left);
	}

	public void testSetRight()
	{
		expr = fact.newAddAssignExpression(left, right);
		right = fact.newIntegerLiteral(24);
		expr.setRightExpression(right);
	}
}
