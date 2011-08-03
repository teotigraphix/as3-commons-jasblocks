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
import org.as3commons.asblocks.dom.IASPostfixExpression;
import org.as3commons.asblocks.dom.PostfixOperator;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

import junit.framework.TestCase;

public class Test_ASTASPostfixExpression extends TestCase
{
	private ASFactory fact = new ASFactory();
	private IASExpression sub;
	private IASPostfixExpression expr;

	protected void setUp()
	{
		sub = fact.newExpression("i");
	}

	protected void tearDown()
	{
		if (expr != null)
		{
			assertEquals(sub, expr.getExpression());
		}
	}

	public void testSetOp()
	{
		expr = fact.newPostDecExpression(sub);
		assertOp(PostfixOperator.POSTDEC);
		expr.setOperator(PostfixOperator.POSTINC);
		assertOp(PostfixOperator.POSTINC);
	}

	public void testPostDec()
	{
		expr = fact.newPostDecExpression(sub);
		assertOp(PostfixOperator.POSTDEC);
	}

	public void testPostInc()
	{
		expr = fact.newPostIncExpression(sub);
		assertOp(PostfixOperator.POSTINC);
	}

	public void testSetSubexpression()
	{
		expr = fact.newPostIncExpression(sub);
		sub = fact.newExpression("j");
		expr.setExpression(sub);
	}

	private void assertOp(PostfixOperator expected)
	{
		LinkedListTree ast = ((ASTExpression) expr).getAST();
		IASExpression expr = fact.newExpression(ASTUtils.stringifyNode(ast));
		assertEquals(expected, ((ASTASPostfixExpression) expr).getOperator());
	}

	public void testOpString() throws IllegalArgumentException,
			IllegalAccessException
	{
		//		EnumAssert.assertValidEnumConstants(PostfixOperator.class);
	}
}