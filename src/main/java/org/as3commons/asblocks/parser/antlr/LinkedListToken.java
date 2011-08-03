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

import org.antlr.runtime.ClassicToken;

public class LinkedListToken extends ClassicToken
{
	private LinkedListToken prev = null;
	private LinkedListToken next = null;

	public LinkedListToken(int type, String text)
	{
		super(type, text);
	}

	public LinkedListToken getNext()
	{
		return next;
	}

	public void setNext(LinkedListToken next)
	{
		if (this == next)
		{
			throw new IllegalArgumentException("Token stream loop detected ("
					+ toString() + ")");
		}
		this.next = next;
		if (next != null)
		{
			next.prev = this;
		}
	}

	public LinkedListToken getPrev()
	{
		return prev;
	}

	public void setPrev(LinkedListToken prev)
	{
		if (this == prev)
		{
			throw new IllegalArgumentException("Token stream loop detected");
		}
		this.prev = prev;
		if (prev != null)
		{
			prev.next = this;
		}
	}
	
	/**
	 * Sets the token's <code>next</code> to this tokens <code>next</code>.
	 * 
	 * @param token The token to add after this token in the stream.
	 */
	public void appendToken(LinkedListToken token)
	{
		if (token.getPrev() != null)
		{
			throw new IllegalArgumentException("appendToken(" + token
					+ ") : prev was not null");
		}
		if (token.getNext() != null)
		{
			throw new IllegalArgumentException("appendToken(" + token
					+ ") : next was not null");
		}
		token.next = next;
		token.prev = this;
		if (next != null)
		{
			next.prev = token;
		}
		next = token;
	}

	public void prependToken(LinkedListToken token)
	{
		if (token.getPrev() != null)
		{
			throw new IllegalArgumentException("prependToken(" + token
					+ ") : prev was not null");
		}
		if (token.getNext() != null)
		{
			throw new IllegalArgumentException("prependToken(" + token
					+ ") : next was not null");
		}
		token.prev = prev;
		token.next = this;
		if (prev != null)
		{
			prev.next = token;
		}
		prev = token;
	}

	public void deleteToken()
	{
		if (prev != null)
		{
			prev.next = next;
		}
		if (next != null)
		{
			next.prev = prev;
		}
		next = prev = null;
	}
}
