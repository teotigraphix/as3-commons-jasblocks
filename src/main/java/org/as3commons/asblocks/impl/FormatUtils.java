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

import org.as3commons.asblocks.dom.IScriptElement;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

/**
 * Various formatting utility methods.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public class FormatUtils
{

	/**
	 * Inserts a NL token and WS indent before the <code>element</code>
	 * in the token stream.
	 * 
	 * @param element The element to insert a newline before.
	 */
	public static void insertNewlineBefore(IScriptElement element)
	{
		// get the elements AST
		LinkedListTree ast = ((ASTScriptElement) element).getAST();

		// find the correct indent for the element in it's block
		String indent = ASTUtils.findIndent(ast);

		// create the NL token
		LinkedListToken newlineToken = TokenBuilder.newNewline();

		// !!! scan forward passed any HIDDEN tokens, this takes into account
		// elements that have their start token on something that is really
		// not connected to them but is in the formatting token stream
		LinkedListToken startToken = findNonHiddenTokenForward(ast
				.getStartToken());

		// prepend the NL token to the element's first token
		startToken.prependToken(newlineToken);
		// set the element's first token to the NL
		ast.setStartToken(startToken);

		// if the indent actually holds a value
		if (indent.length() > 0)
		{
			// get the current element's first token which should now be the startToken
			LinkedListToken newStartToken = ast.getStartToken();
			// create a WS token based on the calculated indent
			LinkedListToken whitespaceToken = TokenBuilder
					.newWhiteSpace(indent);
			// prepend the WS token to the element's first token
			newStartToken.prependToken(whitespaceToken);
			// set the element's first token to the WS
			ast.setStartToken(whitespaceToken);
		}
	}

	/**
	 * Inserts a NL token and WS indent after the <code>element</code>
	 * in the token stream.
	 * 
	 * @param element The element to insert a newline after.
	 */
	public static void insertNewlineAfter(IScriptElement element)
	{
		// get the elements AST
		LinkedListTree ast = ((ASTScriptElement) element).getAST();

		// find the correct indent for the element in it's block
		String indent = ASTUtils.findIndent(ast);

		// create the NL token
		LinkedListToken newlineToken = TokenBuilder.newNewline();
		// append the NL token to the element's last token
		ast.getStopToken().appendToken(newlineToken);
		// set the element's last token to the NL
		ast.setStopToken(newlineToken);

		// if the indent actually holds a value
		if (indent.length() > 0)
		{
			// get the current element's last token which should now be the NL
			LinkedListToken stopToken = ast.getStopToken();
			// create a WS token based on the calculated indent
			LinkedListToken whitespaceToken = TokenBuilder
					.newWhiteSpace(indent);
			// append the WS token to the element's last token
			stopToken.appendToken(whitespaceToken);
			// set the element's last token to the WS
			ast.setStopToken(whitespaceToken);
		}
	}

	private static LinkedListToken findNonHiddenTokenForward(
			LinkedListToken token)
	{
		if (token.getChannel() != AS3Parser.HIDDEN)
			return token;

		for (LinkedListToken tok = token.getNext(); tok != null; tok = tok
				.getNext())
		{
			if (tok.getChannel() != AS3Parser.HIDDEN)
				return tok;
		}
		return token;
	}

	@SuppressWarnings("unused")
	private static LinkedListToken findNonHiddenTokenReverse(
			LinkedListToken token)
	{
		if (token.getChannel() != AS3Parser.HIDDEN)
			return token;

		for (LinkedListToken tok = token.getPrev(); tok != null; tok = tok
				.getPrev())
		{
			if (tok.getChannel() != AS3Parser.HIDDEN)
				return tok;
		}
		return token;
	}
}
