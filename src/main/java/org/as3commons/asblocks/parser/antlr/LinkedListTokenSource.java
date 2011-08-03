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
import org.antlr.runtime.TokenSource;

public class LinkedListTokenSource implements TokenSource
{
	private TokenSource delegate;
	private LinkedListToken last = null;

	public LinkedListTokenSource(TokenSource delegate)
	{
		this.delegate = delegate;
	}

	public Token nextToken()
	{
		LinkedListToken curr = createToken(delegate.nextToken());
		if (last != null)
		{
			last.setNext(curr);
		}
		curr.setPrev(last);
		last = curr;
		return curr;
	}

	private LinkedListToken createToken(Token tok)
	{
		LinkedListToken result = new LinkedListToken(tok.getType(),
				tok.getText());
		result.setLine(tok.getLine());
		result.setCharPositionInLine(tok.getCharPositionInLine());
		result.setChannel(tok.getChannel());
		result.setTokenIndex(tok.getTokenIndex());
		return result;
	}

	/**
	 * Redefines the TokenSource to which this object delagates the task of
	 * token creation.  This can be used to switch Lexers when an island
	 * grammar is required, for instance.
	 */
	public void setDelegate(TokenSource delegate)
	{
		this.delegate = delegate;
	}

	/**
	 * Overrides the 'last' token which this object is remembering in order
	 * to build next/previous links.
	 */
	public void setLast(LinkedListToken tok)
	{
	}

	@Override
	public String getSourceName()
	{
		return null;
	}
}