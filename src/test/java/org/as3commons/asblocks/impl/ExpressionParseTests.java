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
import org.as3commons.asblocks.dom.BinaryOperator;
import org.as3commons.asblocks.dom.IASBinaryExpression;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASPrefixExpression;
import org.as3commons.asblocks.dom.PrefixOperator;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

import junit.framework.TestCase;

public class ExpressionParseTests extends TestCase
{
	private ASFactory fact = new ASFactory();

	public void testAdd()
	{
		IASExpression expr = fact.newExpression("1+1");
		assertTrue(expr instanceof IASBinaryExpression);
		IASBinaryExpression add = (IASBinaryExpression) expr;
		assertEquals(BinaryOperator.ADD, add.getOperator());
	}

	public void testMultiplyAddPresidence()
	{
		// addition has lower presidence, so appears higher in AST
		IASExpression expr = fact.newExpression("1+2*2");
		assertTrue(expr instanceof IASBinaryExpression);
		IASBinaryExpression add = (IASBinaryExpression) expr;
		assertEquals(BinaryOperator.ADD, add.getOperator());
		IASBinaryExpression right = (IASBinaryExpression) add
				.getRightExpression();
		assertEquals(BinaryOperator.MUL, right.getOperator());

		// addition still has lower presidence, so appears higher in AST
		expr = fact.newExpression("2*2+1");
		assertTrue(expr instanceof IASBinaryExpression);
		add = (IASBinaryExpression) expr;
		assertEquals(BinaryOperator.ADD, add.getOperator());
		IASBinaryExpression left = (IASBinaryExpression) add
				.getLeftExpression();
		assertEquals(BinaryOperator.MUL, left.getOperator());
	}

	public void testPreIncrement()
	{
		IASExpression expr = fact.newExpression("++i");
		assertTrue(expr instanceof IASPrefixExpression);
		IASPrefixExpression inc = (IASPrefixExpression) expr;
		assertEquals(PrefixOperator.PREINC, inc.getOperator());
	}

	public void testInvokeInvocation()
	{
		IASExpression expr = fact.newExpression("a().b()");
		StringWriter buff = new StringWriter();
		LinkedListTree ast = ((ASTExpression) expr).getAST();
		CodeMirror.assertTokenStreamNotDisjoint(ast);
		new ASTPrinter(buff).print(ast);
		LinkedListTree parsed = AS3FragmentParser.parseExpression(buff
				.toString());
		CodeMirror.assertASTMatch(ast, parsed);
	}
}