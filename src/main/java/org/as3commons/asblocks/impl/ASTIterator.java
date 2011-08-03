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

/**
 * Iterates over the children of the given AST node.
 */
public class ASTIterator //implements Iterable<LinkedListTree>
{
	private LinkedListTree parent;

	private int index = -1;

	public ASTIterator(LinkedListTree parent)
	{
		if (parent == null)
		{
			throw new IllegalArgumentException("null not allowed");
		}
		this.parent = parent;
	}

	public boolean hasNext()
	{
		return index < parent.getChildCount() - 1;
	}

	public LinkedListTree next(int tokenType)
	{
		if (!hasNext())
		{
			throw new IllegalStateException("expected "
					+ ASTUtils.tokenName(tokenType) + " but reached last child");
		}
		if (parent.getChild(index + 1).getType() != tokenType)
		{
			throw new IllegalStateException("expected "
					+ ASTUtils.tokenName(tokenType) + " but got "
					+ parent.getChild(index + 1));
		}
		return next();
	}

	public LinkedListTree next()
	{
		if (!hasNext())
		{
			throw new NoSuchElementException();
		}
		index++;
		return (LinkedListTree) parent.getChild(index);
	}

	/**
	 * After a call to remove, another call to next() is required to access
	 * the element following the one just deleted.
	 */
	public void remove()
	{
		parent.deleteChild(index);
		index--;
	}

	public void replace(LinkedListTree replacement)
	{
		parent.setChildWithTokens(index, replacement);
	}

	public LinkedListTree search(int tokenType)
	{
		while (hasNext())
		{
			LinkedListTree ast = next();
			if (ast.getType() == tokenType)
			{
				return ast;
			}
		}
		return null;
	}

	public LinkedListTree find(int tokenType)
	{
		LinkedListTree result = search(tokenType);
		if (result != null)
		{
			return result;
		}
		throw new IllegalStateException("expected "
				+ ASTUtils.tokenName(tokenType) + " but not found");
	}

	public void insertBeforeCurrent(LinkedListTree insert)
	{
		parent.addChildAtWithTokens(index, insert);
	}

	public int getCurrentIndex()
	{
		return index;
	}
}