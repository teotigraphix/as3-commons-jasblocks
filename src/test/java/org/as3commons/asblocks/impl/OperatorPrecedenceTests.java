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
import org.as3commons.asblocks.dom.IASBinaryExpression;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

import junit.framework.TestCase;

public class OperatorPrecedenceTests extends TestCase
{
	private IASExpression left;
	private IASExpression right;
	private ASFactory fact = new ASFactory();
	private IASBinaryExpression expr;

	public void setUp()
	{
		right = fact.newIntegerLiteral(2);
		expr = null;
	}

	public void tearDown()
	{
		StringWriter buff = new StringWriter();
		LinkedListTree ast = ((ASTExpression) expr).getAST();
		new ASTPrinter(buff).print(ast);
		LinkedListTree parsed = AS3FragmentParser.parseExpression(buff
				.toString());
		CodeMirror.assertASTMatch(ast, parsed);
	}

	public void testBasic()
	{
		left = fact.newAddExpression(fact.newIntegerLiteral(1),
				fact.newIntegerLiteral(1));
		// the resulting structure will not be correct unless the
		// left-hand expression is parenthesized.  asblocks should add
		// parenthesis automatically, as required
		// i.e. (1 + 1) * 2
		expr = fact.newMultiplyExpression(left, right);
	}
}
