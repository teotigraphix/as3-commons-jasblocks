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

import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.dom.IDocComment;
import org.as3commons.asblocks.dom.IDocTag;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTokenSource;
import org.as3commons.asblocks.parser.antlr.LinkedListTokenStream;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.LinkedListTreeAdaptor;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;
import org.as3commons.asblocks.parser.antlr.asdoc.ASDocLexer;
import org.as3commons.asblocks.parser.antlr.asdoc.ASDocParser;

/**
 * Helpers for dealing with documentation-comments.
 */
class DocumentationUtils
{
	private static final LinkedListTreeAdaptor TREE_ADAPTOR = new LinkedListTreeAdaptor();

	private DocumentationUtils()
	{
	}

	public static String getDocComment(LinkedListTree node)
	{
		LinkedListToken tok = findDocCommentToken(node);
		if (tok == null)
			return null;
		return commentToString(tok);
	}

	public static LinkedListToken findDocCommentToken(LinkedListTree node)
	{
		node = findCommentStartAST(node);

		LinkedListToken tok = node.getStartToken();
		if (tok == null)
			return null;

		// find the first non-hidden token
		outer: while (true)
		{
			switch (tok.getType())
			{
			case AS3Parser.WS:
			case AS3Parser.EOL:
			case AS3Parser.ML_COMMENT:
			case AS3Parser.SL_COMMENT:
				tok = tok.getNext();
				break;
			default:
				break outer;
			}
		}

		// search backwards from the first non-hidden token until 
		// we reach the first ML_COMMENT
		for (tok = tok.getPrev(); tok != null; tok = tok.getPrev())
		{
			switch (tok.getType())
			{
			case AS3Parser.WS:
			case AS3Parser.EOL:
			case AS3Parser.SL_COMMENT:
			case AS3Parser.VIRTUAL_PLACEHOLDER:
				continue;
			case AS3Parser.ML_COMMENT:
				if (tok.getText().startsWith("/**"))
					return tok;
			default:
				return null;
			}
		}
		return null;
	}

	private static String commentToString(LinkedListToken tok)
	{
		return tok.getText().replaceFirst("\\A/\\*+", "").replaceFirst("(?:(?<=[\n\r])[ \t]+)?\\*+/\\Z", "").replaceAll("([\n\r])\\s*\\*", "$1");
	}

	public static void setDocComment(LinkedListTree node, String text)
	{
		LinkedListToken tok = findDocCommentToken(node);
		if (text == null)
		{
			if (tok != null)
			{
				LinkedListToken next = tok.getNext();
				LinkedListToken prev = tok.getPrev();
				tok.deleteToken();
				// TODO: looks like I didn't finish here,
				if (next.getType() == AS3Parser.EOL)
				{
					next.getNext();
				}
				if (prev.getType() == AS3Parser.WS)
				{
					prev.getPrev();
				}
			}
			return;
		}
		assertValidContent(text);
		String indent = ASTUtils.findIndent(node);
		// XXX this needs rightTrim() applied
		text = "/**" + text.replaceAll("(\n|\r\n|\r)", "$1" + indent + " *");
		if (!text.endsWith("*"))
		{
			text += "*";
		}
		text += "/";
		if (tok == null)
		{
			LinkedListToken comment = TokenBuilder.newMLComment(text);

			insertDocComment(node, indent, comment);
		}
		else
		{
			tok.setText(text);
		}
	}

	private static void insertDocComment(LinkedListTree node, String indent,
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

	private static LinkedListTree findCommentStartAST(LinkedListTree ast)
	{
		LinkedListTree mods = ASTUtils.findChildByType(ast, AS3Parser.MODIFIERS);
		if (mods != null)
		{
			ast = mods;
		}
		return ast;
	}

	private static LinkedListToken findTokenToInsertCommentBefore(
			LinkedListTree node)
	{
		node = findCommentStartAST(node);

		LinkedListToken tok = node.getStartToken();
		outer: while (true)
		{
			switch (tok.getType())
			{
			case AS3Parser.WS:
			case AS3Parser.EOL:
				tok = tok.getNext();
				break;
			default:
				break outer;
			}
		}
		return tok;
	}

	public static void assertValidContent(String text)
	{
		int pos = text.indexOf("*/");
		if (pos != -1)
		{
			throw new ASBlocksSyntaxError(
					"End-on-comment marker found at position " + pos);
		}
	}

	public static void increaseCommentIndent(LinkedListToken tok, String indent)
	{
		tok.setText(tok.getText().replaceAll("(\n|\r\n|\r)", "$1" + indent));
	}

	public static String getDescriptionString(LinkedListTree ast)
	{
		LinkedListTree asdoc = buildASDoc(ast);
		if (asdoc == null)
			return null;
		LinkedListTree desc = asdoc.getFirstChild();
		return stringify(desc);
	}

	public static String getShortDescriptionString(LinkedListTree ast)
	{
		LinkedListTree asdoc = buildASDoc(ast);
		if (asdoc == null)
			return null;
		LinkedListTree desc = asdoc.getFirstChild();
		return stringifyShort(desc);
	}

	public static String getLongDescriptionString(LinkedListTree ast)
	{
		LinkedListTree asdoc = buildASDoc(ast);
		if (asdoc == null)
			return null;
		LinkedListTree desc = asdoc.getFirstChild();
		return stringifyLong(desc);
	}

	public static LinkedListTree buildASDoc(LinkedListTree ast)
	{
		LinkedListToken doc = findDocCommentToken(ast);
		if (doc == null)
			return null;
		String body = getCommentBody(doc);
		LinkedListTree asdoc = parse(body);
		return asdoc;
	}

	private static String getCommentBody(LinkedListToken doc)
	{
		String text = doc.getText();
		return text.substring(3, text.length() - 2);
	}

	private static String stringify(LinkedListTree ast)
	{
		StringBuffer result = new StringBuffer();
		for (LinkedListToken tok = ast.getStartToken(); tok != null
				&& tok.getType() != -1; tok = tok.getNext())
		{
			result.append(stringify(tok));
			if (tok == ast.getStopToken())
				break;
		}
		return result.toString();
	}

	private static String stringifyShort(LinkedListTree ast)
	{
		StringBuffer result = new StringBuffer();
		for (LinkedListToken tok = ast.getStartToken(); tok != null
				&& tok.getType() != -1; tok = tok.getNext())
		{
			result.append(stringify(tok));

			if (isShortEnd(tok))
				break;

			if (tok == ast.getStopToken())
				break;
		}
		// short descriptions are always trimmed
		return result.toString().trim();
	}

	private static String stringifyLong(LinkedListTree ast)
	{
		boolean comsume = false;
		StringBuffer result = new StringBuffer();
		for (LinkedListToken tok = ast.getStartToken(); tok != null
				&& tok.getType() != -1; tok = tok.getNext())
		{
			if (comsume)
			{
				result.append(stringify(tok));
			}
			if (!comsume)
			{
				comsume = isShortEnd(tok);
			}
			if (tok == ast.getStopToken())
				break;
		}
		// long descriptions are always trimmed
		return result.toString().trim();
	}

	private static boolean isShortEnd(LinkedListToken tok)
	{
		LinkedListToken next = tok.getNext();
		if (next != null)
		{
			// the period is attached unless there is a space
			if (tok.getText().endsWith(".") && next.getType() == ASDocParser.NL)
				return true;
			if (tok.getText().equals(".") && next.getType() == ASDocParser.NL)
				return true;
		}
		return false;
	}

	private static String stringify(LinkedListToken tok)
	{
		switch (tok.getType())
		{
		case ASDocParser.NL:
			// TODO: use the original line-ending format
			return "\n";
		default:
			return tok.getText();
		}
	}

	public static void setDescriptionString(LinkedListTree ast, String value)
	{
		LinkedListToken commentToken = findDocCommentToken(ast);
		LinkedListTree asdoc = null;
		LinkedListTree descriptionAST = null;

		if (commentToken != null)
		{
			String body = getCommentBody(commentToken);
			//String indent = ASTUtils.findIndent(ast);
			//indent = "\n" + indent;
			//int len = indent.length() + 1;
			//body = body.substring(0, body.length() - len); 
			
			// turn the string back into ASDoc AST
			asdoc = parse(body);
			// take the trailing EOFs off
			trimEOF(asdoc);
			// get the DESCRIPTION node
			descriptionAST = asdoc.getFirstChild();
		}

		// ASDOC/DESCRIPTION/(WS|WORD)*
		// ASDOC/DESCRIPTION/PARA_TAG*
		if (value == null)
		{
			// setting the comment to null will wipe out the doccomment token
			// and remove the AST from the parent
			//doc.delete();
			if (descriptionAST != null)
			{
				// ASTUtils.deleteAllChildren(descriptionAST);
				// leave the first child of the DESCRIPTION
				LinkedListTree first = (LinkedListTree) descriptionAST.getChild(0);
				ASTUtils.deleteAllChildrenTo(descriptionAST, first);

				commentToken.setText("/**" + ASTUtils.stringifyNode(asdoc)
						+ "*/");
			}
			return;
		}

		assertValidContent(value);
		String newline = getNewlineText(ast, asdoc);

		if (!value.startsWith("\n"))
		{
			value = "\n" + value;
		}

		value = value.replaceAll("\n", newline);
		LinkedListTree newDesc = parseDescription(value);

		if (commentToken == null)
		{
			String indent = ASTUtils.findIndent(ast);
			String newComment = ASTUtils.stringifyNode(newDesc) + "\n" + indent;
			newComment = "/**" + newComment + " */";
			commentToken = TokenBuilder.newMLComment(newComment);
			insertDocComment(ast, indent, commentToken);
		}
		else
		{
			String comment = "";
			
			asdoc.setChildWithTokens(0, newDesc);
			
			// if has tags
			if (asdoc.getChildCount() > 1)
			{
				newDesc.appendToken(new LinkedListToken(ASDocParser.NL, newline));
				comment = "/**" + ASTUtils.stringifyNode(asdoc) + "*/";
			}
			else
			{
				newline = newline.replace("* ", "*/");
				newDesc.appendToken(new LinkedListToken(ASDocParser.NL, newline));
				
				comment = "/**" + ASTUtils.stringifyNode(asdoc);
			}
			commentToken.setText(comment);
		}
	}

	public static String getNewlineText(LinkedListTree ast, LinkedListTree asdoc)
	{
		String newline = null;
		if (asdoc != null)
		{
			newline = findNewline(asdoc);
		}
		if (newline == null)
		{
			newline = "\n" + ASTUtils.findIndent(ast) + " * "; // TODO: use document existing end-of-line format
		}
		return newline;
	}

	public static String findNewline(LinkedListTree asdoc)
	{
		LinkedListToken tok = asdoc.getStopToken();
		if (tok.getType() == ASDocParser.NL)
		{
			// Skip the very-last NL, since this will precede the
			// closing-comment marker, and therefore will lack the
			// '*' that should be present at the start of every
			// other line,
			tok = tok.getPrev();
		}
		for (; tok != null; tok = tok.getPrev())
		{
			if (tok.getType() == ASDocParser.NL)
			{
				return tok.getText();
			}
		}
		return null;
	}

	private static LinkedListTree parseDescription(String description)
	{
		try
		{
			ASDocParser parser = parserOn(description);
			LinkedListTree desc = (LinkedListTree) parser.description().getTree();
			LinkedListToken after = (LinkedListToken) parser.getTokenStream().LT(1);
			if (!isEOF(after))
			{
				throw new ASBlocksSyntaxError(
						"trailing content after description: "
								+ ASTUtils.str(after.getText()));
			}
			trimEOF(desc);
			return desc;
		}
		catch (IOException e)
		{
			throw new ASBlocksSyntaxError(e);
		}
		catch (RecognitionException e)
		{
			throw new ASBlocksSyntaxError(e);
		}
	}

	private static boolean isEOF(LinkedListToken after)
	{
		return after.getType() == ASDocParser.EOF;
	}

	/**
	 * removes trailing enf-of-file tokens from the AST
	 */
	private static void trimEOF(LinkedListTree desc)
	{
		LinkedListTree lastChild = desc.getLastChild();
		if (lastChild != null)
		{
			trimEOF(lastChild);
		}
		while (isEOF(desc.getStopToken()))
		{
			LinkedListToken stop = desc.getStopToken();
			LinkedListToken prev = stop.getPrev();
			desc.setStopToken(prev);
			stop.deleteToken();
		}
	}

	private static LinkedListTree parse(String body)
	{
		try
		{
			ASDocParser parser = parserOn(body);
			LinkedListTree result = (LinkedListTree) parser.commentBody().getTree();
			trimEOF(result);
			return result;
		}
		catch (IOException e)
		{
			throw new ASBlocksSyntaxError(e);
		}
		catch (RecognitionException e)
		{
			throw new ASBlocksSyntaxError(e);
		}
	}

	public static LinkedListTree parseParaTag(String text)
	{
		try
		{
			ASDocParser parser = parserOn(text);
			LinkedListTree result = (LinkedListTree) parser.paragraphTag().getTree();
			trimEOF(result);
			return result;
		}
		catch (IOException e)
		{
			throw new ASBlocksSyntaxError(e);
		}
		catch (MismatchedTokenException e)
		{
			throw new ASBlocksSyntaxError("Expexted "
					+ ASDocParser.tokenNames[e.expecting] + " but found "
					+ ASDocParser.tokenNames[e.getUnexpectedType()], e);
		}
		catch (RecognitionException e)
		{
			throw new ASBlocksSyntaxError(e);
		}
	}

	private static ASDocParser parserOn(String text) throws IOException
	{
		StringReader in = new StringReader(text);
		ANTLRReaderStream cs = new ANTLRReaderStream(in);
		ASDocLexer lexer = new ASDocLexer(cs);
		LinkedListTokenSource source = new LinkedListTokenSource(lexer);
		LinkedListTokenStream stream = new LinkedListTokenStream(source);
		ASDocParser parser = new ASDocParser(stream);
		parser.setTreeAdaptor(TREE_ADAPTOR);
		return parser;
	}

	public static ASTDocComment createDocComment(LinkedListTree ast)
	{
		return new ASTDocComment(ast);
	}

	public static IDocTag findParam(IDocComment doc, String name)
	{
		Iterator<IDocTag> params = doc.getTags("param");
		Pattern p = Pattern.compile("\\s*\\Q" + name + "\\E\\b");

		while (params.hasNext())
		{
			IDocTag param = (IDocTag) params.next();
			if (p.matcher(param.getBody()).lookingAt())
			{
				return param;
			}
		}
		return null;
	}
}