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

import org.antlr.runtime.RecognitionException;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

import junit.framework.TestCase;

public class TestAS3Parser extends TestCase
{

	public void testUnaryExpressionNotPlusMinus() throws RecognitionException
	{
		AS3Parser parser = ASTUtils.parse("delete foo");
		LinkedListTree ast = AS3FragmentParser.tree(parser
				.unaryExpressionNotPlusMinus());
		assertEquals("delete", ast.getText());
		assertEquals(1, ast.getChildCount());
		LinkedListTree child = ast.getFirstChild();
		assertEquals(AS3Parser.IDENT, child.getType());
		assertEquals("foo", child.getText());
	}

	public void testUnnamedRestParameter() throws RecognitionException
	{
		AS3Parser parser = ASTUtils.parse("(foo, ...)");
		LinkedListTree ast = AS3FragmentParser.tree(parser
				.parameterDeclarationList());
	}

	public void testNamedRestParameter() throws RecognitionException
	{
		AS3Parser parser = ASTUtils.parse("(foo, ...bar)");
		LinkedListTree ast = AS3FragmentParser.tree(parser
				.parameterDeclarationList());
	}

	public void testBasicNewExpression() throws RecognitionException
	{
		AS3Parser parser = ASTUtils.parse("new String.<Foo>()");
		LinkedListTree ast = AS3FragmentParser.tree(parser.expression());
		//assertEquals(AS3Parser.NEW, ast.getType());
		//assertEquals(2, ast.getChildCount());
		//assertEquals(AS3Parser.IDENT, ast.getFirstChild().getType());
		//assertEquals(AS3Parser.ARGUMENTS, ast.getLastChild().getType());
	}

	public void _testRecursiveNewExpression() throws RecognitionException
	{
		AS3Parser parser = ASTUtils.parse("new new Function('blah')()");
		LinkedListTree ast = AS3FragmentParser.tree(parser.newExpression());
		assertEquals(AS3Parser.NEW, ast.getType());
		//System.err.println(ast.toStringTree());
		assertEquals(2, ast.getChildCount());
		assertEquals(AS3Parser.NEW, ast.getFirstChild().getType());
		assertEquals(AS3Parser.ARGUMENTS, ast.getLastChild().getType());
	}
}
