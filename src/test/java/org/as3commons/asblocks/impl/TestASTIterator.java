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

import java.util.NoSuchElementException;

import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

import junit.framework.TestCase;

public class TestASTIterator extends TestCase
{
	public void testCtor()
	{
		try
		{
			new ASTIterator(null);
			fail("should have rejected null constructor argument");
		}
		catch (IllegalArgumentException e)
		{
			// expected
		}
	}

	public void testNextNoElement()
	{
		ASTIterator i = iterateTreeWithSingleChild();
		i.next();
		try
		{
			i.next();
			fail("expected exception when there is no next element");
		}
		catch (NoSuchElementException e)
		{
			// expected
		}
	}

	public void testTypedNextNoElement()
	{
		ASTIterator i = iterateTreeWithSingleChild();
		i.next();
		try
		{
			i.next(AS3Parser.DECIMAL_LITERAL);
			fail("expected exception when there is no next element");
		}
		catch (IllegalStateException e)
		{
			// expected
		}
	}

	public void testTypedNextNotFound()
	{
		ASTIterator i = iterateTreeWithSingleChild();
		try
		{
			i.next(AS3Parser.STRING_LITERAL);
			fail("expected exception when the next element is of the wrong type");
		}
		catch (IllegalStateException e)
		{
			// expected
		}
	}

	public void testTypedNexFound()
	{
		ASTIterator i = iterateTreeWithSingleChild();
		LinkedListTree ast = i.next(AS3Parser.DECIMAL_LITERAL);
		assertEquals("200", ast.getText());
	}

	public void testFindNotFound()
	{
		ASTIterator i = iterateTreeWithSingleChild();
		try
		{
			i.find(AS3Parser.STRING_LITERAL);
			fail("expected exception when no child has the given type");
		}
		catch (IllegalStateException e)
		{
			// expected
		}
	}

	private ASTIterator iterateTreeWithSingleChild()
	{
		LinkedListTree tree = ASTUtils.newAST(AS3Parser.DECIMAL_LITERAL, "100");
		tree.addChildWithTokens(ASTUtils.newAST(AS3Parser.DECIMAL_LITERAL,
				"200"));
		return new ASTIterator(tree);
	}
}