package org.as3commons.asblocks.parser.antlr.as3;

import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.as3commons.asblocks.impl.TokenBuilder;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.LinkedListTreeAdaptor;

public class AS3ParserHelper
{
	public static void demarcate(LinkedListTree parent)
	{
		parent.setStartToken(parent.getFirstChild().getStartToken());
		parent.setStopToken(parent.getLastChild().getStopToken());
	}

	/**
	 * Adds a placeholder token into the stream, corresponding to the
	 * location of the given AST node, if the given AST node has no
	 * children.  Only use this function with 'imaginary' nodes, not with
	 * nodes that already correspond to a concrete Token.
	 */
	public static LinkedListToken placeholder(TokenStream input,
			LinkedListTree imaginary)
	{
		if (imaginary.getChildCount() > 0)
		{
			// one of this node's children will presumably have
			// some tokens of its own, so there's no need for us
			// to synthesize one,
			return imaginary.getStartToken();
		}

		// Since this this AST node is 'imaginary', it does not directly
		// correspond to any Token in the input stream.  Also, since
		// it has no children, there is nothing anchoring it to a
		// position in the token-stream, which will make it difficult to
		// know where new tokens should be inserted if the calling app
		// adds a child to this node.  We therefore insert a virtual
		// token at this point in the stream just so that the AST node
		// can remember its own location.

		LinkedListToken tok = (LinkedListToken) input.LT(1);
		LinkedListToken placeholder = TokenBuilder.newPlaceholder(imaginary);
		tok.prependToken(placeholder);
		return placeholder;
	}

	public static boolean findVirtualHiddenToken(TokenStream input,
			ParserRuleReturnScope retval)
	{
		// the point of this method is to look for something that can serve as 
		// a semicolon. So a carriage return or a comment containing a carriage 
		// return will fit the bill.
		int index = retval.start.getTokenIndex();
		if (index < 0)
		{
			// (mschmalle) I changed this and added the -1 since it
			// seems like we are accessing an indexed zero array
			// and the value was one off, which would make this
			// method useless when not using backtracking
			index = input.size() - 1;
		}
		else
		{
			Token lt = input.get(index);
			if (lt.getType() == AS3Parser.EOF || lt.getType() == AS3Parser.SEMI
					|| lt.getType() == AS3Parser.RBRACE)
				return false;
		}

		//the token index is pointing to the next default channel token, which is not what we want.
		//We want to walk backward to the previous default channel token (first loop), and then walk forward
		//again looking for EOL/comments (2nd loop)
		int ix = index - 1;
		for (; ix >= 0; ix--)
		{
			Token lt = input.get(ix);
			if (lt.getChannel() == Token.DEFAULT_CHANNEL)
				break;
		}

		//walk forward again
		ix++; //to move to next token that's not default channel
		for (; ix < input.size(); ix++) //now search for the next "statement ender"
		{
			Token lt = input.get(ix);
			int type = lt.getType();
			if (lt.getChannel() == Token.DEFAULT_CHANNEL)
				break;
			if (type == AS3Parser.EOL
					|| type == AS3Parser.SL_COMMENT
					|| (type == AS3Parser.ML_COMMENT && lt.getText() != null 
							&& lt.getText().matches("/.*\r\n|\r|\n")))
			{
				retval.start = lt;
				return true;
			}
		}

		return false;
	}

	public static boolean parseBlock(TokenStream input,
			ParserRuleReturnScope retval, LinkedListTreeAdaptor adaptor)
	{
		int braceCount = 0;

		int type = input.LA(1);
		if (type != AS3Parser.LBRACE)
			return false;

		do
		{
			if (type == AS3Parser.LBRACE)
			{
				braceCount++;
			}
			if (type == AS3Parser.RBRACE)
			{
				braceCount--;
			}

			input.consume();
			
			if (braceCount == 0)
			{
				break;
			}
			
			type = input.LA(1);

		} while (braceCount != 0 && type != AS3Parser.EOF);

		retval.stop = input.LT(1);
		
		adaptor.setTokenBoundaries(retval.getTree(), retval.start, retval.stop);

		return true;
	}
}
