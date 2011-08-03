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

import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.TreeTokenListUpdateDelegate;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ParentheticListUpdateDelegate implements
		TreeTokenListUpdateDelegate
{

	// TODO: many methods simply duplicate those in
	//       BasicListUpdateDelegate, maybe just subclass it?

	private int tokenTypeOpen;
	private int tokenTypeClose;

	public ParentheticListUpdateDelegate(int tokenTypeOpen, int tokenTypeClose)
	{
		this.tokenTypeOpen = tokenTypeOpen;
		this.tokenTypeClose = tokenTypeClose;
	}

	public void addedChild(LinkedListTree parent, LinkedListTree child)
	{
		LinkedListToken insert = findClose(parent).getPrev();
		insertAfter(insert, insert.getNext(), child.getStartToken(),
				child.getStopToken());
	}

	private LinkedListToken findOpen(LinkedListTree parent)
	{
		for (LinkedListToken tok = parent.getStartToken(); tok != null; tok = tok
				.getNext())
		{
			if (tok.getType() == tokenTypeOpen)
			{
				return tok;
			}
		}
		return null;
	}

	private LinkedListToken findClose(LinkedListTree parent)
	{
		for (LinkedListToken tok = parent.getStopToken(); tok != null; tok = tok
				.getPrev())
		{
			if (tok.getType() == tokenTypeClose)
			{
				return maybeSkiptoLinePreceeding(tok);
			}
		}
		return null;
	}

	private LinkedListToken maybeSkiptoLinePreceeding(LinkedListToken target)
	{
		for (LinkedListToken tok = target.getPrev(); tok != null; tok = tok
				.getPrev())
		{
			switch (tok.getType())
			{
			case AS3Parser.WS:
				continue;
			case AS3Parser.EOL:
				return tok;
			default:
				return target;
			}
		}
		return target;
	}

	protected static void insertAfter(LinkedListToken target,
										LinkedListToken targetNext,
										LinkedListToken start,
										LinkedListToken stop)
	{
		if (target == null && targetNext == null)
		{
			throw new IllegalArgumentException(
					"At least one of target and targetNext must be non-null");
		}
		if (start != null)
		{
			// i.e. we're not adding an imaginary node that currently
			//      has no real children
			if (target != null)
			{
				target.setNext(start);
			}
			stop.setNext(targetNext);
			if (targetNext != null)
			{
				targetNext.setPrev(stop);
			}
		}
	}

	public void addedChildAt(LinkedListTree tree, int index, LinkedListTree child)
	{
		LinkedListToken target;
		LinkedListToken targetNext;
		if (index == 0)
		{
			target = findOpen(tree);
			targetNext = target.getNext();
		}
		else
		{
			LinkedListTree prev = (LinkedListTree) tree.getChild(index - 1);
			target = prev.getStopToken();
			targetNext = target.getNext();
		}
		insertAfter(target, targetNext, child.getStartToken(),
				child.getStopToken());
	}

	public void appendToken(LinkedListTree parent, LinkedListToken append)
	{
		LinkedListToken insert = findClose(parent).getPrev();
		insertAfter(insert, insert.getNext(), append, append);
	}

	public void addTokenAt(LinkedListTree parent, int index,
							LinkedListToken append)
	{
		LinkedListToken target;
		LinkedListToken targetNext;
		if (index == 0)
		{
			target = findOpen(parent);
			targetNext = target.getNext();
		}
		else
		{
			LinkedListTree beforeChild = (LinkedListTree) parent
					.getChild(index);
			targetNext = beforeChild.getStartToken();
			target = targetNext.getPrev();
		}
		insertAfter(target, targetNext, append, append);
	}

	public void deletedChildAt(LinkedListTree parent, int index,
								LinkedListTree child)
	{
		LinkedListToken start = child.getStartToken();
		LinkedListToken stop = child.getStopToken();
		LinkedListToken startPrev = start.getPrev();
		LinkedListToken stopNext = stop.getNext();
		if (startPrev != null)
		{
			startPrev.setNext(stopNext);
		}
		else if (stopNext != null)
		{
			stopNext.setPrev(startPrev);
		}
		// just to save possible confusion, break links out from the
		// removed token list too,
		start.setPrev(null);
		stop.setNext(null);
	}

	public void replacedChild(LinkedListTree tree, int index,
								LinkedListTree child, LinkedListTree oldChild)
	{
		// link the new child's tokens in place of the old,
		oldChild.getStartToken().getPrev().setNext(child.getStartToken());
		oldChild.getStopToken().getNext().setPrev(child.getStopToken());
		// just to save possible confusion, break links out from the
		// removed token list too,
		oldChild.getStartToken().setPrev(null);
		oldChild.getStopToken().setNext(null);
	}
}