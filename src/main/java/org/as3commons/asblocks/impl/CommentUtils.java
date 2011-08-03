package org.as3commons.asblocks.impl;

import org.as3commons.asblocks.dom.IScriptElement;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class CommentUtils
{
	public static void appendSLComment(IScriptElement element, String value)
	{
		appendSLCommentAST(((ASTScriptElement) element).getAST(), value);
	}

	public static void prependSLComment(IScriptElement element, String value)
	{
		prependSLCommentAST(((ASTScriptElement) element).getAST(), value);
	}

	public static void appendSLCommentAST(LinkedListTree ast, String value)
	{
		LinkedListToken comment = TokenBuilder.newSLComment("//" + value);
		String indent = findIndentForComment(ast);
		// add the EOL after the last statement
		ast.appendToken(TokenBuilder.newNewline());
		// add the whitespace indent to push the comment in
		ast.appendToken(TokenBuilder.newWhiteSpace(indent));
		// add the actual // comment text into the token stream
		ast.appendToken(comment);
	}

	public static void prependSLCommentAST(LinkedListTree ast, String value)
	{
		LinkedListToken comment = TokenBuilder.newSLComment("//" + value);
		String indent = findIndentForComment(ast);

		ast.prependToken(TokenBuilder.newWhiteSpace(indent));
		// add the actual // comment text into the token stream		
		// add the EOL after the last statement
		ast.prependToken(TokenBuilder.newNewline());
		// add the whitespace indent to push the comment in

		ast.prependToken(comment);
	}

	private static String findIndentForComment(LinkedListTree ast)
	{
		LinkedListTree last = ast.getLastChild();
		String indent;
		if (last == null)
		{
			indent = "\t" + ASTUtils.findIndent(ast);
		}
		else
		{
			indent = ASTUtils.findIndent(last);
		}
		return indent;
	}
	
	public static void prependMLComment(LinkedListTree node, String text)
	{
		LinkedListToken tok = null;
		
		//		assertValidContent(text);
		String indent = ASTUtils.findIndent(node);
		text = "/*" + text.replaceAll("(\n|\r\n|\r)", "$1" + indent + " *");
		if (!text.endsWith("*"))
		{
			text += "*";
		}
		text += "/";
		if (tok == null)
		{
			LinkedListToken comment = TokenBuilder.newMLComment(text);

			insertMLComment(node, indent, comment);
		}
//		else
//		{
//			tok.setText(text);
//		}
	}	

	public static void appendMLComment(LinkedListTree node, String text)
	{
		//LinkedListToken tok = findDocCommentToken(node);
		LinkedListToken tok = null; // = node.getStopToken();
		
		//		assertValidContent(text);
		String indent = ASTUtils.findIndent(node);
		text = "/*" + text.replaceAll("(\n|\r\n|\r)", "$1" + indent + " *");
		if (!text.endsWith("*"))
		{
			text += "*";
		}
		text += "/";
		if (tok == null)
		{
			LinkedListToken comment = TokenBuilder.newMLComment(text);

			insertMLComment(node, indent, comment);
		}
//		else
//		{
//			tok.setText(text);
//		}
	}

	private static void insertMLComment(LinkedListTree node, String indent,
			LinkedListToken comment)
	{
		LinkedListToken nl = TokenBuilder.newNewline();
		
		findTokenToInsertCommentBefore(node).prependToken(comment);
		comment.appendToken(nl);
		if (indent.length() > 0)
		{
			LinkedListToken indentTok = TokenBuilder.newWhiteSpace(indent);
			nl.appendToken(indentTok);
		}
	}

	private static LinkedListToken findTokenToInsertCommentBefore(
			LinkedListTree node)
	{
		//node = findCommentStartAST(node);

		LinkedListToken tok = node.getStartToken();
		outer: while (true)
		{
			switch (tok.getType())
			{
			case AS3Parser.WS:
//			case AS3Parser.EOL:
				tok = tok.getNext();
				break;
			default:
				break outer;
			}
		}
		return tok;
	}
}
