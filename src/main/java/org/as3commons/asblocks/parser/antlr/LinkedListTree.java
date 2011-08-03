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

package org.as3commons.asblocks.parser.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.Tree;

public class LinkedListTree extends BaseTree
{

	public Token token;

	private LinkedListTree parent = null;

	private LinkedListToken startToken;
	private LinkedListToken stopToken;

	protected LinkedListToken initialInsertionAfter;
	protected LinkedListToken initialInsertionBefore;

	private TreeTokenListUpdateDelegate tokenListUpdater;

	public LinkedListTree()
	{
	}

	public LinkedListTree(LinkedListTree node)
	{
		super(node);
		this.token = node.token;
	}

	public LinkedListTree(Token t)
	{
		this.token = t;
	}

	public TreeTokenListUpdateDelegate getTokenListUpdater()
	{
		return tokenListUpdater;
	}

	public void setTokenListUpdater(TreeTokenListUpdateDelegate tokenListUpdater)
	{
		this.tokenListUpdater = tokenListUpdater;
	}

	public void setParent(LinkedListTree parent)
	{
		this.parent = parent;
	}

	public LinkedListTree getParent()
	{
		return parent;
	}

	public Tree dupNode()
	{
		return new LinkedListTree(this);
	}

	public int getType()
	{
		if (token == null)
		{
			return 0;
		}
		return token.getType();
	}

	public String getText()
	{
		return toString();
	}

	public boolean isNil()
	{
		return token == null;
	}

	public Token getToken()
	{
		return token;
	}

	public int getLine()
	{
		if (token == null || token.getLine() == 0)
		{
			if (getChildCount() > 0)
			{
				return getChild(0).getLine();
			}
			return 0;
		}
		return token.getLine();
	}

	public int getCharPositionInLine()
	{
		if (token == null || token.getCharPositionInLine() == -1)
		{
			if (getChildCount() > 0)
			{
				return getChild(0).getCharPositionInLine();
			}
			return 0;
		}
		return token.getCharPositionInLine();
	}

	public String toString()
	{
		if (isNil())
		{
			return "nil";
		}
		return token.getText();
	}

	public LinkedListTree getFirstChild()
	{
		if (getChildCount() == 0)
		{
			return null;
		}
		return (LinkedListTree) getChild(0);
	}

	public LinkedListTree getLastChild()
	{
		int c = getChildCount();
		if (c == 0)
		{
			return null;
		}
		return (LinkedListTree) getChild(c - 1);
	}

	public int getIndexOfChild(LinkedListTree child)
	{
		if (children == null)
			return -1;
		return children.indexOf(child);
	}

	/**
	 * Adds the given child node to the end of the list of children
	 * maintanined by the given parent node, and inserts the tokens
	 * belonging to child into the tokenlist of parent just after the
	 * stop-token of the previous last child.
	 */
	public void addChildWithTokens(LinkedListTree child)
	{
		addChild(child);
		tokenListUpdater.addedChild(this, child);
	}

	public void setChildWithTokens(int index, LinkedListTree child)
	{
		LinkedListTree oldChild = (LinkedListTree) getChild(index);
		setChild(index, child);
		tokenListUpdater.replacedChild(this, index, child, oldChild);
	}

	@SuppressWarnings("unchecked")
	public void addChildAtWithTokens(int index, LinkedListTree child)
	{
		if (children == null)
		{
			createChildrenList();
		}
		children.add(index, child);
		if (child != null)
		{
			child.setParent(this);
		}
		tokenListUpdater.addedChildAt(this, index, child);
	}

	/**
	 * @deprecated use #addChildWithTokens(LinkedListTree), damnit
	 */
	public void addChild(Tree child)
	{
		super.addChild(child);
		if (child != null)
		{
			((LinkedListTree) child).setParent(this);
		}
	}

	/**
	 * @deprecated use #setChildWithTokens(int,LinkedListTree), damnit
	 */
	public void setChild(int index, BaseTree child)
	{
		super.setChild(index, child);
		((LinkedListTree) child).setParent(this);
	}

	public BaseTree deleteChild(int index)
	{
		LinkedListTree result = (LinkedListTree) super.deleteChild(index);
		tokenListUpdater.deletedChildAt(this, index, result);
		result.setParent(null);
		return result;
	}

	public void appendToken(LinkedListToken append)
	{
		tokenListUpdater.appendToken(this, append);
	}

	public void prependToken(LinkedListToken append)
	{
		tokenListUpdater.addTokenAt(this, 0, append);
	}
	
	public void addToken(int index, LinkedListToken append)
	{
		tokenListUpdater.addTokenAt(this, index, append);
	}

	public void setInitialInsertionAfter(LinkedListToken insert)
	{
		initialInsertionAfter = insert;
	}

	public void setInitialInsertionBefore(LinkedListToken insert)
	{
		initialInsertionBefore = insert;
	}

	public LinkedListToken getInitialInsertionAfter()
	{
		return initialInsertionAfter;
	}

	public LinkedListToken getInitialInsertionBefore()
	{
		return initialInsertionBefore;
	}

	public void setStartToken(LinkedListToken startToken)
	{
		if (parent != null)
		{
			parent.notifyChildStartTokenChange(this, startToken);
		}
		this.startToken = startToken;
	}

	public LinkedListToken getStartToken()
	{
		return startToken;
	}

	public LinkedListToken setStopToken(LinkedListToken stopToken)
	{
		if (parent != null)
		{
			parent.notifyChildStopTokenChange(this, stopToken);
		}
		return this.stopToken = stopToken;
	}

	public LinkedListToken getStopToken()
	{
		return stopToken;
	}

	/**
	 * called when one of this node's children updates it's start-token,
	 * so that this node can potentially take action; maybe by setting
	 * the same start-token IF the child was the very-first in this node's
	 * list of children.
	 */
	private void notifyChildStartTokenChange(LinkedListTree child,
			LinkedListToken newStart)
	{
		// TODO: maybe move to delegates
		if (isFirst(child) && isSameStartToken(child))
		{
			setStartToken(newStart);
		}
	}

	private boolean isSameStartToken(LinkedListTree child)
	{
		return child.getStartToken() == getStartToken();
	}

	private boolean isFirst(LinkedListTree child)
	{
		return child == getFirstChild();
	}

	/**
	 * called when one of this node's children updates it's stop-token,
	 * so that this node can potentially take action; maybe by setting
	 * the same stop-token IF the child was the very-last in this node's
	 * list of children.
	 */
	private void notifyChildStopTokenChange(LinkedListTree child,
			LinkedListToken newStop)
	{
		// TODO: maybe move to delegates
		if (isLast(child) && (isSameStopToken(child) || isNoStopToken(child)))
		{
			setStopToken(newStop);
		}
	}

	private boolean isNoStopToken(LinkedListTree child)
	{
		return child.getStopToken() == null;
	}

	private boolean isSameStopToken(LinkedListTree child)
	{
		return child.getStopToken() == getStopToken();
	}

	private boolean isLast(LinkedListTree child)
	{
		return child == getLastChild();
	}

	public int getTokenStartIndex()
	{
		throw new Error("unimplemented");
	}

	public int getTokenStopIndex()
	{
		throw new Error("unimplemented");
	}

	public void setTokenStartIndex(int arg0)
	{
		throw new Error("unimplemented");
	}

	public void setTokenStopIndex(int arg0)
	{
		throw new Error("unimplemented");
	}
}