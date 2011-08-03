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

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;

public class LinkedListTokenStream implements TokenStream
{

	protected TokenSource tokenSource;
	protected LinkedListToken head;
	protected LinkedListToken tail;

	/** Skip tokens on any channel but this one; this is how we skip whitespace... */
	protected int channel = Token.DEFAULT_CHANNEL;

	/** By default, track all incoming tokens */
	protected boolean discardOffChannelTokens = false;

	/** Track the last mark() call result value for use in rewind(). */
	protected LinkedListToken lastMarker;

	/** The current element in the tokens list (next token
	 *  to consume).  p==null indicates that the tokens list is empty
	 */
	protected LinkedListToken p = null;

	public LinkedListTokenStream()
	{
	}

	/**
	 * The given TokenSource must produce tokens of type LinkedListToken
	 */
	public LinkedListTokenStream(TokenSource tokenSource)
	{
		this.tokenSource = tokenSource;
	}

	public LinkedListTokenStream(TokenSource tokenSource, int channel)
	{
		this(tokenSource);
		this.channel = channel;
	}

	public TokenSource getSource()
	{
		return tokenSource;
	}

	/**
	 * Reverses the stream 'count' tokens back, causing the tokens to be
	 * removed from the stream.  Can be used to erase tokens which parser
	 * lookahead has summoned, but which represent input to be handled by
	 * an 'island grammar'.
	 */
	public void scrub(int count)
	{
		if (p == null)
		{
			p = tail;
		}
		for (; count > 0; count--)
		{
			p = p.getPrev();
		}
		p.setNext(null);
		tail = p;
		p = null;
	}

	/** Reset this token stream by setting its token source. */
	public void setTokenSource(TokenSource tokenSource)
	{
		this.tokenSource = tokenSource;
		p = null;
		channel = Token.DEFAULT_CHANNEL;
	}

	private LinkedListToken readNextToken()
	{
		LinkedListToken t = (LinkedListToken) tokenSource.nextToken();
		while (t != null && t.getType() != CharStream.EOF)
		{
			boolean discard = false;
			if (discardOffChannelTokens && t.getChannel() != this.channel)
			{
				discard = true;
			}
			if (!discard)
			{
				if (head == null && tail == null)
				{
					head = tail = t;
				}
				else
				{
					tail.setNext(t);
					t.setPrev(tail);
					tail = t;
				}
				break;
			}
			t = (LinkedListToken) tokenSource.nextToken();
		}
		if (t.getType() == CharStream.EOF)
		{
			// prevent ourselves from producing lots of EOF tokens
			// if the parser is 'pushy'; also, do the head/tail dance
			if (tail != null && tail.getType() == CharStream.EOF)
			{
				return tail;
			}
			else
			{
				if (head == null && tail == null)
				{
					head = tail = t;
				}
				else
				{
					tail.setNext(t);
					t.setPrev(tail);
					tail = t;
				}
			}
		}
		return skipOffTokenChannels(t);
	}

	/**
	 * Returns the token that follows the given token in the stream, or
	 * null if there's no token following
	 */
	private LinkedListToken succ(LinkedListToken tok)
	{
		LinkedListToken next = tok.getNext();
		if (next == null)
		{
			next = readNextToken();
		}
		return next;
	}

	/** Return absolute token i; ignore which channel the tokens are on;
	 *  that is, count all tokens not just on-channel tokens.
	 */
	public Token get(int i)
	{
		LinkedListToken tok = head;
		for (int c = 0; c < i; c++)
		{
			tok = succ(tok);
		}
		return tok;
	}

	public TokenSource getTokenSource()
	{
		return tokenSource;
	}

	public Token LT(int k)
	{
		if (p == null)
		{
			p = readNextToken();
		}
		if (k == 0)
		{
			return null;
		}
		if (k < 0)
		{
			return LB(-k);
		}
		LinkedListToken i = p;
		int n = 1;
		// find k good tokens
		while (n < k)
		{
			LinkedListToken next = succ(i);
			if (i == null)
			{
				return Token.EOF_TOKEN;
			}
			// skip off-channel tokens
			i = skipOffTokenChannels(next); // leave p on valid token
			n++;
		}
		if (i == null)
		{
			return Token.EOF_TOKEN;
		}
		return i;
	}

	/** Look backwards k tokens on-channel tokens */
	protected Token LB(int k)
	{
		if (p == null)
		{
			p = readNextToken();
		}
		if (k == 0)
		{
			return null;
		}

		LinkedListToken i = p;
		int n = 1;
		// find k good tokens looking backwards
		while (n <= k)
		{
			LinkedListToken next = i.getPrev();
			if (next == null)
			{
				return null;
			}
			// skip off-channel tokens
			i = skipOffTokenChannelsReverse(next); // leave p on valid token
			n++;
		}
		return i;
	}

	public int LA(int i)
	{
		return LT(i).getType();
	}

	public int index()
	{
		int i = 0;
		for (LinkedListToken tok = head; tok != p && tok != null; tok = tok
				.getNext())
		{
			i++;
		}
		return i;
	}

	public int size()
	{
		int s = 0;
		for (LinkedListToken tok = head; tok != null; tok = tok.getNext())
		{
			s++;
		}
		return s;
	}

	public void consume()
	{
		do
		{
			p = p.getNext();
		} while (p != null && p.getChannel() != channel);
	}

	public int mark()
	{
		// TODO: could store marks in a hash; does it make any difference?
		lastMarker = (LinkedListToken) LT(1);
		return index();
	}

	public void release(int marker)
	{
		// no resources to release
	}

	public void rewind(int marker)
	{
		seek(marker);
	}

	public void rewind()
	{
		p = lastMarker;
	}

	public String toString(int start, int stop)
	{
		LinkedListToken tok = head;
		int i = 0;
		for (; i < start && tok != null; i++)
		{
			tok = succ(tok);
		}
		StringBuffer buf = new StringBuffer();
		for (; i <= stop && tok != null; i++)
		{
			buf.append(tok.getText());
			tok = succ(tok);
		}
		return buf.toString();
	}

	public String toString(Token start, Token stop)
	{
		LinkedListToken tok = (LinkedListToken) start;
		StringBuffer buf = new StringBuffer();
		do
		{
			buf.append(tok.getText());
			tok = succ(tok);
		} while (tok != null && tok != stop);
		return buf.toString();
	}

	public void seek(int index)
	{
		p = head;
		for (int i = 0; i < index; i++)
		{
			p = succ(p);
		}
	}

	/**
	 * Given a starting token, return the first on-channel token.
	 */
	protected LinkedListToken skipOffTokenChannels(LinkedListToken i)
	{
		while (i != null && i.getChannel() != channel)
		{
			i = succ(i);
		}
		return i;
	}

	protected LinkedListToken skipOffTokenChannelsReverse(LinkedListToken i)
	{
		while (i != null && i.getChannel() != channel)
		{
			i = i.getPrev();
		}
		return i;
	}

	public void discardOffChannelTokens(boolean discardOffChannelTokens)
	{
		this.discardOffChannelTokens = discardOffChannelTokens;
	}

	@Override
	public String getSourceName()
	{
		return null;
	}

	@Override
	public int range()
	{
		return 0;
	}
}