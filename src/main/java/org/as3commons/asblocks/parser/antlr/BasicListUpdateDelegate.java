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

import org.as3commons.asblocks.impl.ASTUtils;
import org.as3commons.asblocks.impl.TokenBuilder;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

/**
 * Manages the tokens of the parent tree in the most basic way possible, simply
 * inserting the run of tokens belonging to the child into the run of tokens
 * belonging to the parent and updating start/stop tokens for the parent if
 * required.
 */
public class BasicListUpdateDelegate implements TreeTokenListUpdateDelegate
{

	// TODO: delete PLACEHOLDER tokens when they are superseded by the addition of real tokens

	public void addedChild(LinkedListTree parent, LinkedListTree child)
	{
		if (isPlaceholder(parent))
		{
			if (isPlaceholder(child))
			{
				throw new IllegalArgumentException(
						"The parent node ("
								+ ASTUtils.tokenNameFromAST(parent)
								+ ") has only a placeholder token, so a child which also has only a placeholder token ("
								+ ASTUtils.tokenNameFromAST(child)
								+ ") can't be added yet");
			}
			LinkedListToken placeholder = parent.getStartToken();
			if (placeholder.getPrev() != null)
			{
				placeholder.getPrev().setNext(child.getStartToken());
			}
			if (placeholder.getNext() != null)
			{
				placeholder.getNext().setPrev(child.getStopToken());
			}
			parent.setStartToken(child.getStartToken());
			parent.setStopToken(child.getStopToken());
			return;
		}
		LinkedListToken stop = findTokenInsertionPointForChildWithinParent(
				parent, child);
		if (parent.getStartToken() == null)
		{
			parent.setStartToken(child.getStartToken());
		}
		if (stop != null)
		{
			insertAfter(stop, stop.getNext(), child.getStartToken(),
					child.getStopToken());
		}
		if (child.getStopToken() != null)
		{
			parent.setStopToken(child.getStopToken());
		}
	}

	private boolean isPlaceholder(LinkedListTree ast)
	{
		return ast.getStartToken() == ast.getStopToken()
				&& ast.getStartToken() != null
				&& ast.getStartToken().getType() == AS3Parser.VIRTUAL_PLACEHOLDER
				&& ((PlaceholderLinkedListToken) ast.getStartToken()).getHeld() == ast;
	}

	private LinkedListToken findTokenInsertionPointForChildWithinParent(
			LinkedListTree parent, LinkedListTree child)
	{
		// FIXME: this fails to take into account am ancestor not
		// having the same kind of TreeTokenListUpdateDelegate
		while (parent != null)
		{
			if (parent.getChildCount() == 1)
			{
				// the just-added child is the only child of 'parent'
				if (parent.getStopToken() != null)
				{
					return parent.getStopToken();
				}
				if (parent.getStartToken() != null)
				{
					return parent.getStartToken();
				}
			}
			int index = parent.getIndexOfChild(child);
			if (index > 0 && index < parent.getChildCount() - 1)
			{
				// 'child' is not the *first* child of 'parent'
				LinkedListTree precedent = (LinkedListTree) parent
						.getChild(index - 1);
				if (precedent.getStopToken() == null)
				{
					// TODO: loop, rather than recurse,
					return findTokenInsertionPointForChildWithinParent(parent,
							precedent);
				}
				return precedent.getStopToken();
			}
			if (index == 0 && parent.getStartToken() != null)
			{
				return parent.getStartToken();
			}
			if (parent.getStopToken() != null)
			{
				return parent.getStopToken();
			}
			child = parent;
			parent = parent.getParent();
		}
		return null;
	}

	public void addedChildAt(LinkedListTree parent, int index,
			LinkedListTree child)
	{
		LinkedListToken target;
		LinkedListToken targetNext;
		if (index == 0)
		{
			LinkedListTree prevFirstChild = (LinkedListTree) parent.getChild(1);
			targetNext = prevFirstChild.getStartToken();
			target = targetNext.getPrev();
			if (targetNext == parent.getStartToken())
			{
				parent.setStartToken(child.getStartToken());
			}
		}
		else
		{
			target = ((LinkedListTree) parent.getChild(index - 1))
					.getStopToken();
			targetNext = target.getNext();
		}
		insertAfter(target, targetNext, child.getStartToken(),
				child.getStopToken());
	}

	protected static void insertAfter(LinkedListToken target,
			LinkedListToken targetNext, LinkedListToken start,
			LinkedListToken stop)
	{
		if (target == null && targetNext == null)
		{
			throw new IllegalArgumentException(
					"At least one of target and targetNext must be non-null");
		}
		if (start != null)
		{
			//			if (start.getPrev() != null || stop.getNext() != null) {
			//				throw new IllegalArgumentException("insertAfter("+target+", "+targetNext+", "+start+", "+stop+") : start.getPrev()="+start.getPrev()+" stop.getNext()="+stop.getNext());
			//			}
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

	public void appendToken(LinkedListTree parent, LinkedListToken append)
	{
		if (parent.getStopToken() == null)
		{
			parent.setStartToken(append);
			parent.setStopToken(append);
		}
		else
		{
			// TODO: can this be simplified now?
			append.setNext(parent.getStopToken().getNext());
			parent.getStopToken().setNext(append);
			append.setPrev(parent.getStopToken());
			parent.setStopToken(append);
		}
	}

	public void addTokenAt(LinkedListTree parent, int index,
			LinkedListToken append)
	{
		if (isPlaceholder(parent))
		{
			LinkedListToken placeholder = parent.getStartToken();
			parent.setStartToken(append);
			parent.setStopToken(append);
			placeholder.setPrev(null);
			placeholder.setNext(null);
		}
		if (parent.getStopToken() == null)
		{
			parent.setStartToken(append);
			parent.setStopToken(append);
		}
		else
		{
			LinkedListToken target;
			LinkedListToken targetNext;
			if (index == 0)
			{
				targetNext = parent.getStartToken();
				target = targetNext.getPrev();
				parent.setStartToken(append);
			}
			else if (index == parent.getChildCount())
			{
				target = parent.getStopToken();
				targetNext = target.getNext();
				parent.setStopToken(append);
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
	}

	public void deletedChildAt(LinkedListTree parent, int index,
			LinkedListTree child)
	{
		// FIXME: this should update start/stop tokens for the parent
		//        when the first/last child is removed
		LinkedListToken start = child.getStartToken();
		LinkedListToken stop = child.getStopToken();
		LinkedListToken prevStart = start.getPrev();
		LinkedListToken nextStop = stop.getNext();
		//		if (startPrev == null) {
		//			throw new IllegalArgumentException("No start.prev: "+child);
		//		}
		//		if (stopNext == null) {
		//			throw new IllegalArgumentException("No stop.next: "+child+" (stop="+stop+")");
		//		}
		if (parent.getChildCount() == 0 && start == parent.getStartToken()
				&& stop == parent.getStopToken())
		{
			// So, the child provided all the tokens that made up
			// the parent, and removing it will leave nothing!  In
			// this case, we insert a 'placeholder' token just so
			// there's something in the token stream for the parent
			// to reference, and the parent remains anchored to the
			// appropriate location within the source code
			LinkedListToken placeholder = TokenBuilder.newPlaceholder(parent);
			// XXX FIGURE OUT!
			if (prevStart != null)
			{
				prevStart.setNext(placeholder);
			}
			nextStop.setPrev(placeholder);
		}
		else
		{
			if (prevStart != null)
			{
				prevStart.setNext(nextStop);
			}
			else if (nextStop != null)
			{ // so try the other way around,
				nextStop.setPrev(prevStart);
			}
			if (parent.getStartToken() == start)
			{
				parent.setStartToken(nextStop);
			}
			if (parent.getStopToken() == stop)
			{
				parent.setStopToken(prevStart);
			}
		}
		// just to save possible confusion, break links out from the
		// removed token list too,
		start.setPrev(null);
		stop.setNext(null);
	}

	public void replacedChild(LinkedListTree tree, int index,
			LinkedListTree child, LinkedListTree oldChild)
	{
		// defensive assertions to catch bugs,
		if (child.getStartToken() == null)
		{
			throw new IllegalArgumentException("No startToken: " + child);
		}
		if (child.getStopToken() == null)
		{
			throw new IllegalArgumentException("No stopToken: " + child);
		}
		// link the new child's tokens in place of the old,
		LinkedListToken oldBefore = findOldBeforeToken(tree, index, child,
				oldChild);
		LinkedListToken oldAfter = findOldAfterToken(tree, index, child,
				oldChild);
		if (oldBefore != null)
		{
			oldBefore.setNext(child.getStartToken());
		}
		if (oldAfter != null)
		{
			oldAfter.setPrev(child.getStopToken());
		}
		// just to save possible confusion, break links out from the
		// removed token list too,
		oldChild.getStartToken().setPrev(null);
		oldChild.getStopToken().setNext(null);

		if (tree.getStartToken() == oldChild.getStartToken())
		{
			tree.setStartToken(child.getStartToken());
		}
		if (tree.getStopToken() == oldChild.getStopToken())
		{
			tree.setStopToken(child.getStopToken());
		}
	}

	private LinkedListToken findOldBeforeToken(LinkedListTree tree, int index,
			LinkedListTree child, LinkedListTree oldChild)
	{
		LinkedListToken oldStart = oldChild.getStartToken();
		if (oldStart == null)
		{
			throw new IllegalStateException("<" + oldChild + ">, child "
					+ index + " of <" + tree + ">, had no startToken");
		}
		return oldStart.getPrev();
	}

	private LinkedListToken findOldAfterToken(LinkedListTree tree, int index,
			LinkedListTree child, LinkedListTree oldChild)
	{
		LinkedListToken oldStop = oldChild.getStopToken();
		if (oldStop == null)
		{
			throw new IllegalStateException("<" + oldChild + ">, child "
					+ index + " of <" + tree + ">, had no stopToken");
		}
		return oldStop.getNext();
	}
}