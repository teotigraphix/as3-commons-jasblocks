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
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IScriptElement;
import org.as3commons.asblocks.parser.antlr.BasicListUpdateDelegate;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTokenSource;
import org.as3commons.asblocks.parser.antlr.LinkedListTokenStream;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.LinkedListTreeAdaptor;
import org.as3commons.asblocks.parser.antlr.TreeTokenListUpdateDelegate;
import org.as3commons.asblocks.parser.antlr.as3.AS3Lexer;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

/**
 * A collection of helper methods for dealing with AST nodes.
 */
public class ASTUtils
{

	public static final LinkedListTreeAdaptor TREE_ADAPTOR = new LinkedListTreeAdaptor();

	static
	{
		TREE_ADAPTOR.setFactory(new LinkedListTreeAdaptor.Factory() {
			private BasicListUpdateDelegate basicDelegate = new BasicListUpdateDelegate();
			private ParentheticListUpdateDelegate blockDelegate = new ParentheticListUpdateDelegate(
					AS3Parser.LBRACE, AS3Parser.RBRACE);
			private ParentheticListUpdateDelegate metadataTagDelegate = new ParentheticListUpdateDelegate(
					AS3Parser.LBRACK, AS3Parser.RBRACK);
			private ParentheticListUpdateDelegate paramsDelegate = new ParentheticListUpdateDelegate(
					AS3Parser.LPAREN, AS3Parser.RPAREN);

			public TreeTokenListUpdateDelegate create(LinkedListTree payload)
			{
				if (payload.isNil())
				{
					return basicDelegate;
				}
				switch (payload.getType())
				{
				case AS3Parser.BLOCK:
				case AS3Parser.TYPE_BLOCK:
				case AS3Parser.OBJECT_LITERAL:
					return blockDelegate;
				case AS3Parser.METATAG:
				case AS3Parser.ARRAY_LITERAL:
					return metadataTagDelegate;
				case AS3Parser.PARAMS:
				case AS3Parser.METATAG_PARAMS:
				case AS3Parser.ARGUMENTS:
				case AS3Parser.ENCPS_EXPR:
				case AS3Parser.CONDITION:
					return paramsDelegate;
				default:
					return basicDelegate;
				}
			}
		});
	}

	/**
	 * Stringifies the given IDENT node.
	 */
	public static String iText(LinkedListTree ast)
	{
		if (ast.getType() != AS3Parser.TYPE_SPEC)
		{
			throw new IllegalArgumentException(
					"expected TYPE_SPEC, but token was a " + tokenNameFromAST(ast));
		}

		if (ast.getChildCount() == 1)
			return ast.getFirstChild().getText();

		return stringifyIAux(ast);
	}

	private static String stringifyIAux(LinkedListTree ast)
	{
		StringBuffer result = new StringBuffer();
		for (ASTIterator i = new ASTIterator(ast); i.hasNext();)
		{
			LinkedListTree child = i.next();

			if (child.getType() == AS3Parser.DBL_COLON)
			{
				result.append(child.getFirstChild());
				result.append("::");
				result.append(child.getLastChild());
			}

			result.append(child);
			if (i.hasNext())
				result.append(".");
		}

		return result.toString();
	}

	/**
	 * Stringifies the given TYPE node.
	 */
	public static String typeText(LinkedListTree ast)
	{
		if (ast.getType() != AS3Parser.TYPE)
		{
			throw new IllegalArgumentException(
					"expected TYPE, but token was a " + tokenNameFromAST(ast));
		}

		if (ast.getChildCount() == 2
				&& ast.getChild(1).getType() == AS3Parser.TYPE_POSTFIX)
		{
			// Vector
			String ident = ast.getChild(0).getText();
			ident += postFixText((LinkedListTree) ast.getChild(1));
			return ident;
		}

		LinkedListTree child = (LinkedListTree) ast.getChild(0);

		if (child.getType() == AS3Parser.IDENT)
			return stringifyIAux(ast);

		// handle e.g. "void", "*"
		return child.getText();
	}

	/**
	 * Stringifies the given IDENTIFIER node.
	 */
	public static String identText(LinkedListTree ast)
	{
		if (ast.getType() != AS3Parser.IDENT)
		{
			throw new IllegalArgumentException(
					"expected IDENT, but token was a " + tokenNameFromAST(ast));
		}
		return ast.getText();
	}

	private static String stringifyIdentAux(LinkedListTree ast)
	{
		StringBuffer result = new StringBuffer();
		if (ast.getType() == AS3Parser.DBL_COLON)
		{
			result.append(ast.getFirstChild());
			result.append("::");
			result.append(ast.getLastChild());
		}
		else if (ast.getType() == AS3Parser.TYPE
				|| ast.getType() == AS3Parser.DOT)
		{
			result.append(stringifyIdentAux(ast.getFirstChild()));
			result.append(".");
			result.append(stringifyIdentAux(ast.getLastChild()));
		}
		else
		{
			result.append(ast.getText());
		}
		return result.toString();
	}

	public static String qualifiedIdentText(LinkedListTree ast)
	{
		if (ast.getType() == AS3Parser.DBL_COLON)
		{
			return ast.getFirstChild() + "::" + ast.getLastChild();
		}
		return ast.getText();
	}

	public static String importText(LinkedListTree ast)
	{
		if (ast.getType() != AS3Parser.IMPORT)
		{
			throw new IllegalArgumentException(
					"expected IMPORT, but token was a " + tokenNameFromAST(ast));
		}
		LinkedListTree child = ast.getFirstChild();
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < child.getChildCount(); i++)
		{
			LinkedListTree part = (LinkedListTree) child.getChild(i);
			if (result.length() > 0)
			{
				result.append(".");
			}
			result.append(part.getText());
		}
		LinkedListTree star = (LinkedListTree) ast.getChild(1);
		if (star != null)
		{
			result.append(".");
			result.append("*");
		}
		return result.toString();
	}

	/**
	 * Stringifies the type name from the given TYPE_SPEC node.
	 */
	public static String typeSpecText(LinkedListTree ast)
	{
		if (ast.getType() != AS3Parser.TYPE_SPEC)
		{
			throw new IllegalArgumentException(
					"expected TYPE_SPEC, but token was a " + tokenNameFromAST(ast));
		}

		if (ast.getChildCount() == 2
				&& ast.getChild(1).getType() == AS3Parser.TYPE_POSTFIX)
		{
			// Vector
			String ident = ast.getChild(0).getText();
			ident += postFixText((LinkedListTree) ast.getChild(1));
			return ident;
		}

		// first child is now TYPE
		// this will eventually have to accommodate the postfix expression
		LinkedListTree type = ast.getFirstChild();
		if (type.getType() == AS3Parser.TYPE)
			return typeText(type); // pass the TYPE_SPEC

		// handle e.g. "void",
		return type.getText();
	}

	private static String postFixText(LinkedListTree ast)
	{
		if (ast.getType() != AS3Parser.TYPE_POSTFIX)
		{
			throw new IllegalArgumentException(
					"expected TYPE_POSTFIX, but token was a " + tokenNameFromAST(ast));
		}

		String ident = "";
		LinkedListTree child = (LinkedListTree) ast.getChild(0);
		LinkedListTree post = (LinkedListTree) ast.getChild(1);
		ident += ".<";
		if (child.getType() == AS3Parser.IDENT)
		{
			ident += stringifyIdentAux(child);
		}

		if (post != null && post.getType() == AS3Parser.TYPE_POSTFIX)
		{
			ident += postFixText(post);
		}

		ident += ">";

		return ident;
	}

	/**
	 * Helper for constructing error messages
	 */
	public static String tokenNameFromAST(LinkedListTree ast)
	{
		return tokenName(ast.getType());
	}

	/**
	 * Helper for constructing error messages
	 */
	public static String tokenName(int type)
	{
		if (type == -1)
		{
			return "<EOF>";
		}
		return AS3Parser.tokenNames[type];
	}

	private static String tokenName(AS3Parser parser, int type)
	{
		if (type == -1)
		{
			return "<end-of-file>";
		}
		return parser.getTokenNames()[type];
	}

	/**
	 * Returns the first child of the given AST node which has the given
	 * type, or null, if no such node exists.
	 */
	public static LinkedListTree findChildByType(LinkedListTree ast, int type)
	{
		return (LinkedListTree) ast.getFirstChildWithType(type);
	}

	/**
	 * Returns an ActionScript3 parser which will recognise input from the
	 * given string.
	 */
	public static AS3Parser parse(String text)
	{
		return parse(new StringReader(text));
	}

	/**
	 * Returns an ActionScript3 parser which will recognise input from the
	 * given reader.
	 */
	public static AS3Parser parse(Reader in)
	{
		ANTLRReaderStream cs;
		try
		{
			cs = new ANTLRReaderStream(in);
		}
		catch (IOException e)
		{
			throw new ASBlocksSyntaxError(e);
		}
		AS3Lexer lexer = new AS3Lexer(cs);
		LinkedListTokenSource linker = new LinkedListTokenSource(lexer);
		LinkedListTokenStream tokenStream = new LinkedListTokenStream(linker);
		// TODO if this ever gets changed to a cached parser, make sure
		// highleveParse gets set back to false
		AS3Parser parser = new AS3Parser(tokenStream);
		parser.setInput(lexer, cs);
		parser.setTreeAdaptor(TREE_ADAPTOR);
		return parser;
	}

	public static ASBlocksSyntaxError buildSyntaxException(String statement,
			AS3Parser parser, RecognitionException e)
	{
		String msg;
		if (e instanceof NoViableAltException)
		{
			NoViableAltException ex = (NoViableAltException) e;
			msg = "Unexpected token "
					+ tokenName(parser, ex.getUnexpectedType());
			if (statement != null)
			{
				msg += " in " + ASTUtils.str(statement);
			}
		}
		else if (e instanceof MismatchedTokenException)
		{
			MismatchedTokenException ex = (MismatchedTokenException) e;
			msg = "Unexpected token "
					+ tokenName(parser, ex.getUnexpectedType())
					+ " (expecting " + tokenName(parser, ex.expecting) + ")";
			if (statement != null)
			{
				msg += " in " + ASTUtils.str(statement);
			}
		}
		else
		{
			if (statement == null)
			{
				msg = "";
			}
			else
			{
				msg = "Problem parsing " + ASTUtils.str(statement);
			}
		}
		msg += " at line " + e.line;
		return new ASBlocksSyntaxError(msg, e);
	}

	/**
	 * Constructs a new AST of the given type, initialized to contain
	 * text matching the token's name (use for non-literals only).
	 * @deprecated
	 */
	public static LinkedListTree newAST(int type)
	{
		return newImaginaryAST(type);
	}

	/**
	 * Constructs a new AST of the given type, initialized to contain
	 * text matching the token's name (use for non-literals only).
	 */
	public static LinkedListTree newImaginaryAST(int type)
	{
		return (LinkedListTree) TREE_ADAPTOR.create(type, tokenName(type));
	}

	public static LinkedListTree newPlaceholderAST(int type)
	{
		LinkedListTree node = newImaginaryAST(type);
		@SuppressWarnings("unused")
		LinkedListToken placeholder = TokenBuilder.newPlaceholder(node);
		return node;
	}

	/**
	 * Constructs a new AST of the given type, initialized to contain the
	 * given text.
	 */
	public static LinkedListTree newAST(int type, String text)
	{
		LinkedListToken tok = TokenBuilder.newToken(type, text);
		LinkedListTree ast = (LinkedListTree) TREE_ADAPTOR.create(tok);
		return ast;
	}

	public static LinkedListTree newAST(LinkedListToken tok)
	{
		return (LinkedListTree) TREE_ADAPTOR.create(tok);
	}

	public static LinkedListTree newParentheticAST(int type, int startType,
			String startText, int endType, String endText)
	{
		LinkedListTree ast = newImaginaryAST(type);
		LinkedListToken start = TokenBuilder.newToken(startType, startText);
		ast.setStartToken(start);
		LinkedListToken stop = TokenBuilder.newToken(endType, endText);
		ast.setStopToken(stop);
		start.setNext(stop);
		ast.setInitialInsertionAfter(start);
		return ast;
	}

	public static void increaseIndent(LinkedListTree node, String indent)
	{
		LinkedListToken newStart = increaseIndentAt(node.getStartToken(), indent);
		node.setStartToken(newStart);
		increaseIndentAfterFirstLine(node, indent);
	}

	public static void increaseIndentAfterFirstLine(LinkedListTree node,
			String indent)
	{
		for (LinkedListToken tok = node.getStartToken(); tok != node.getStopToken(); tok = tok.getNext())
		{
			switch (tok.getType())
			{
			case AS3Parser.EOL:
				tok = increaseIndentAt(tok.getNext(), indent);
				break;
			case AS3Parser.ML_COMMENT:
				DocumentationUtils.increaseCommentIndent(tok, indent);
				break;
			}
		}
	}

	private static LinkedListToken increaseIndentAt(LinkedListToken tok,
			String indentStr)
	{
		if (tok.getType() == AS3Parser.WS)
		{
			tok.setText(indentStr + tok.getText());
			return tok;
		}
		LinkedListToken indent = TokenBuilder.newWhiteSpace(indentStr);
		tok.prependToken(indent);
		return indent;
	}

	/**
	 * Inspects the whitespace preceeding the given tree node to try and
	 * determine its level of indentation.  Scans backwards from the
	 * startToken and returns the contents of the first whitespace token
	 * following a newline token, or the empty string if no such pattern
	 * is found.
	 */
	public static String findIndent(LinkedListTree node)
	{
		LinkedListToken tok = node.getStartToken();
		if (tok == null)
		{
			return findIndent(node.getParent());
		}
		// the start-token of this AST node is actually whitespace, so
		// scan forward until we hit a non-WS token,
		while (tok.getType() == AS3Parser.EOL || tok.getType() == AS3Parser.WS)
		{
			if (tok.getNext() == null)
			{
				break;
			}
			tok = tok.getNext();
		}
		// search backwards though the tokens, looking for the start of
		// the line,
		for (; tok.getPrev() != null; tok = tok.getPrev())
		{
			if (tok.getType() == AS3Parser.EOL)
			{
				break;
			}
		}
		if (tok.getType() == AS3Parser.WS)
		{
			return tok.getText();
		}
		if (tok.getType() != AS3Parser.EOL)
		{
			return "";
		}
		LinkedListToken startOfLine = tok.getNext();
		if (startOfLine.getType() == AS3Parser.WS)
		{
			return startOfLine.getText();
		}
		return "";
	}

	public static void addChildWithIndentation(LinkedListTree ast,
			LinkedListTree stmt)
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
		ASTUtils.increaseIndent(stmt, indent);
		stmt.addToken(0, TokenBuilder.newNewline());
		ast.addChildWithTokens(stmt);
	}

	public static void addParenChildWithIndentation(LinkedListTree ast,
			LinkedListTree stmt)
	{
		// using this for the IASType metadata insertion, the parenthetic
		// tokens messed up original algorithm
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
		ASTUtils.increaseIndent(stmt, indent);

		LinkedListToken next = stmt.getStartToken();
		stmt.setStartToken(TokenBuilder.newNewline());
		stmt.getStartToken().setNext(next);
		ast.addChildWithTokens(stmt);
	}

	public static void addChildWithIndentation(LinkedListTree ast, int index,
			LinkedListTree stmt)
	{
		LinkedListTree last = (LinkedListTree) ast.getChild(index);
		String indent;
		if (last == null)
		{
			indent = "\t" + ASTUtils.findIndent(ast);
		}
		else
		{
			indent = ASTUtils.findIndent(last);
		}
		ASTUtils.increaseIndent(stmt, indent);
		stmt.addToken(0, TokenBuilder.newNewline());
		ast.addChildAtWithTokens(index, stmt);
	}

	public static String decodeStringLiteral(String str)
	{
		StringBuffer result = new StringBuffer();
		char[] s = str.toCharArray();
		int end = s.length - 1;
		if (s[0] != '"' && s[0] != '\'')
		{
			throw new ASBlocksSyntaxError("Invalid delimiter at position 0: "
					+ s[0]);
		}
		char delimiter = s[0];
		for (int i = 1; i < end; i++)
		{
			char c = s[i];
			switch (c)
			{
			case '\\':
				c = s[++i];
				switch (c)
				{
				case 'n':
					result.append('\n');
					break;
				case 't':
					result.append('\t');
					break;
				case '\\':
					result.append('\\');
					break;
				default:
					result.append(c);
				}
				break;
			default:
				result.append(c);
			}
		}
		if (s[end] != delimiter)
		{
			throw new ASBlocksSyntaxError("End delimiter doesn't match "
					+ delimiter + " at position " + end);
		}
		return result.toString();
	}

	public static LinkedListToken newStringLiteral(String constant)
	{
		return new LinkedListToken(AS3Parser.STRING_LITERAL,
				ASTUtils.str(constant));
	}

	/**
	 * Deletes any whitespace tokens following (but not including) the given
	 * token up to a comma token, and then deletes the comma token too.
	 * 
	 * Used when removing elements from comma-separated lists.
	 */
	public static void removeTrailingWhitespaceAndComma(
			LinkedListToken stopToken)
	{
		for (LinkedListToken tok = stopToken.getNext(); tok != null; tok = tok.getNext())
		{
			if (tok.getChannel() == AS3Parser.HIDDEN)
			{
				// TODO: this might be incorrect (but never called?) see code in removePreceeding...
				tok.deleteToken();
			}
			else if (tok.getType() == AS3Parser.COMMA)
			{
				tok.deleteToken();
				break;
			}
			else
			{
				throw new ASBlocksSyntaxError("Unexpected token: " + tok);
			}
		}
	}

	public static void removePreceedingWhitespaceAndComma(
			LinkedListToken startToken)
	{
		for (LinkedListToken tok = startToken.getPrev(); tok != null; tok = tok.getPrev())
		{
			if (tok.getChannel() == AS3Parser.HIDDEN)
			{
				LinkedListToken del = tok;
				tok = tok.getNext();
				del.deleteToken();
				continue;
			}
			else if (tok.getType() == AS3Parser.COMMA)
			{
				tok.deleteToken();
				break;
			}
			else
			{
				throw new ASBlocksSyntaxError("Unexpected token: " + tok);
			}
		}
	}

	public static void assertAS3TokenTypeIs(int expected, int actual)
	{
		if (expected != actual)
		{
			throw new ASBlocksSyntaxError("Expected " + tokenName(expected)
					+ ", got " + tokenName(actual));
		}
	}

	public static void assertAS3TokenTypeIs(String msg, int expected, int actual)
	{
		if (expected != actual)
		{
			throw new ASBlocksSyntaxError(msg + " Expected "
					+ tokenName(expected) + ", got " + tokenName(actual));
		}
	}

	public static String stringifyNode(LinkedListTree ast)
	{
		StringBuffer result = new StringBuffer();
		for (LinkedListToken tok = ast.getStartToken(); tok != null
				&& tok.getType() != -1; tok = tok.getNext())
		{
			result.append(tok.getText());
			if (tok == ast.getStopToken())
			{
				break;
			}
		}
		return result.toString();
	}

	public static void deleteAllChildren(LinkedListTree ast)
	{
		while (ast.getChildCount() > 0)
		{
			ast.deleteChild(0);
		}
	}

	public static void deleteAllChildrenTo(LinkedListTree ast,
			LinkedListTree first)
	{
		while (ast.getChildCount() > 0)
		{
			LinkedListTree next = ast.getLastChild();
			if (first == next)
				break;
			ast.deleteChild(ast.getChildCount() - 1);
		}
	}

	public static LinkedListTree ast(IScriptElement element)
	{
		return ((ASTScriptElement) element).getAST();
	}

	/**
	 * Converts an <code>LinkedListTree</code> into a flat XML String.
	 * 
	 * @param ast The <code>LinkedListTree</code> to convert.
	 * @return A String XML representation of the <code>LinkedListTree</code>.
	 */
	public static String convert(LinkedListTree ast, boolean location)
	{
		return visitNodes(ast, "", 0, location);
	}

	/**
	 * @private
	 */
	private static String visitNodes(LinkedListTree ast, String result,
			int level, boolean location)
	{
		if (location)
		{
			result += "<" + tokenName(ast.getType()) + " line=\""
					+ ast.getLine() + "\">";

			//			result += "<" + tokenName(ast.type) + " line=\"" + 
			//				ast.line + "\" column=\"" + ast.charPositionInLine + "\">";
		}
		else
		{
			result += "<" + tokenName(ast.getType()) + ">";
		}

		int numChildren = ast.getChildCount();
		if (numChildren > 0)
		{
			for (int i = 0; i < numChildren; i++)
			{
				result = visitNodes((LinkedListTree) ast.getChild(i), result, level + 1, location);
			}
		}
		else if (ast.getText() != null)
		{
			result += escapeEntities(ast.getText());
		}

		result += "</" + tokenName(ast.getType()) + ">";

		return result;
	}

	/**
	 * @private
	 */
	private static String escapeEntities(String stringToEscape)
	{
		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < stringToEscape.length(); i++)
		{
			char currentCharacter = stringToEscape.charAt(i);

			if (currentCharacter == '<')
			{
				buffer.append("&lt;");
			}
			else if (currentCharacter == '>')
			{
				buffer.append("&gt;");
			}
			else
			{
				buffer.append(currentCharacter);
			}
		}
		return buffer.toString();
	}

	/**
	 * Escape the given String and place within double quotes so that it
	 * will be a valid ActionScript string literal.
	 */
	public static String str(String str)
	{
		StringBuffer result = new StringBuffer("\"");
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			switch (c)
			{
			case '\n':
				result.append("\\n");
				break;
			case '\t':
				result.append("\\t");
				break;
			case '\r':
				result.append("\\r");
				break;
			case '"':
				result.append("\\\"");
				break;
			case '\\':
				result.append("\\\\");
				break;
			default:
				result.append(c);
			}
		}
		result.append('"');
		return result.toString();
	}

	public static LinkedListTree findAncestor(LinkedListTree ast, int type)
	{
		return (LinkedListTree) ast.getAncestor(type);
	}

	public static String print(IASCompilationUnit unit)
	{
		StringWriter writer = new StringWriter();
		try
		{
			new ASFactory().newWriter().write(writer, unit);
		}
		catch (IOException e)
		{

		}
		return writer.toString();
	}

	public static boolean isType(IScriptElement element, int type)
	{
		return ((ASTScriptElement) element).getAST().getType() == type;
	}
}