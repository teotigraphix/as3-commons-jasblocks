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

import java.util.List;

import org.as3commons.asblocks.dom.IASBlock;
import org.as3commons.asblocks.dom.IASDeclarationStatement;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASIfStatement;
import org.as3commons.asblocks.dom.IASStatement;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTStatementBuilder
{
	public static IASBlock newBlock()
	{
		LinkedListTree block = ASTBuilder.newBlock();
		return new ASTStatementList(block);
	}

	public static IASStatement newStatement(String statement)
	{
		LinkedListTree ast = AS3FragmentParser.parseStatement(statement);
		ast.setParent(null);
		return StatementBuilder.build(ast);
	}

	public static IASIfStatement newIf(String condition)
	{
		return (IASIfStatement) StatementBuilder.build(ASTStatementBuilder.newIfAST(condition));
	}

	public static IASDeclarationStatement newDeclaration(String declaration)
	{
		LinkedListTree ast = newDeclarationAST(declaration);
		ast.setParent(null);
		// remove the semi
		LinkedListToken end = ast.getStopToken().getPrev();
		ast.setStopToken(end);
		return (IASDeclarationStatement) StatementBuilder.build(ast);
	}

	public static LinkedListTree parseDoWhile(String condition)
	{
		return newDoWhile(AS3FragmentParser.parseExpression(condition));
	}

	public static LinkedListTree newDoWhile(LinkedListTree condition)
	{
		LinkedListTree ast = ASTUtils.newAST(AS3Parser.DO, "do");
		ast.appendToken(TokenBuilder.newSpace());
		LinkedListTree block = newBlock(null);
		ast.addChildWithTokens(block);
		ast.appendToken(TokenBuilder.newSpace());
		ast.appendToken(TokenBuilder.newWhile());
		ast.appendToken(TokenBuilder.newSpace());
		ast.addChildWithTokens(newCondition(condition));
		ast.appendToken(TokenBuilder.newSemi());
		return ast;
	}

	public static LinkedListTree newBlock(Integer type)
	{
		if (type == null)
			return newBlock(AS3Parser.BLOCK);

		LinkedListTree ast = ASTUtils.newParentheticAST(type, AS3Parser.LBRACE, "{", AS3Parser.RBRACE, "}");
		LinkedListToken nl = TokenBuilder.newNewline();
		ast.getInitialInsertionAfter().appendToken(nl);
		ast.setInitialInsertionAfter(nl);
		return ast;
	}

	/**
	 * returns a CONDITION node with the given expression as its child
	 */
	private static LinkedListTree newCondition(LinkedListTree expr)
	{
		LinkedListTree cond = ASTUtils.newParentheticAST(AS3Parser.CONDITION, AS3Parser.LPAREN, "(", AS3Parser.RPAREN, ")");
		cond.addChildWithTokens(expr);
		return cond;
	}

	public static LinkedListTree newDefaultXMLNamespaceAST(
			LinkedListTree namespace)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.DEFAULT_XML_NAMESPACE);
		ast.appendToken(TokenBuilder.newDefault());
		ast.appendToken(TokenBuilder.newSpace());
		ast.appendToken(TokenBuilder.newXml());
		ast.appendToken(TokenBuilder.newSpace());
		ast.appendToken(TokenBuilder.newNamespace());
		ast.appendToken(TokenBuilder.newSpace());
		ast.appendToken(TokenBuilder.newAssign());
		ast.appendToken(TokenBuilder.newSpace());
		ast.addChildWithTokens(namespace);
		ast.appendToken(TokenBuilder.newSemi());
		return ast;
	}

	public static LinkedListTree newStringAST(String value)
	{
		return ASTUtils.newAST(AS3Parser.STRING_LITERAL, ASTUtils.str(value));
	}

	public static LinkedListTree newExpressionStatementAST(LinkedListTree expr)
	{
		LinkedListTree exprStmt = ASTUtils.newImaginaryAST(AS3Parser.EXPR_STMNT);
		exprStmt.addChildWithTokens(expr);
		exprStmt.appendToken(TokenBuilder.newSemi());
		return exprStmt;
	}

	public static LinkedListTree newIfAST(String condition)
	{
		return newIfAST(AS3FragmentParser.parseExpression(condition));
	}

	public static LinkedListTree newIfAST(LinkedListTree condition)
	{
		LinkedListTree ast = ASTUtils.newAST(AS3Parser.IF, "if");
		ast.appendToken(TokenBuilder.newSpace());
		ast.addChildWithTokens(conditionAST(condition));
		ast.appendToken(TokenBuilder.newSpace());
		ast.addChildWithTokens(ASTBuilder.newBlock());
		return ast;
	}

	private static LinkedListTree conditionAST(LinkedListTree expression)
	{
		LinkedListTree ast = ASTUtils.newParentheticAST(AS3Parser.CONDITION, AS3Parser.LPAREN, "(", AS3Parser.RPAREN, ")");
		ast.addChildWithTokens(expression);
		return ast;
	}

	public static LinkedListTree newForAST(String init, String condition,
			String iterate)
	{
		return newForAST(init == null ? null
				: AS3FragmentParser.parseForInit(init), condition == null ? null
				: AS3FragmentParser.parseForCond(condition), iterate == null ? null
				: AS3FragmentParser.parseForIter(iterate));
	}

	public static LinkedListTree newForAST(LinkedListTree init,
			LinkedListTree condition, LinkedListTree iterate)
	{
		LinkedListTree forStmt = ASTUtils.newAST(AS3Parser.FOR, "for");
		forStmt.appendToken(TokenBuilder.newSpace());
		forStmt.appendToken(TokenBuilder.newLParen());
		if (init != null)
		{
			forStmt.addChildWithTokens(init);
		}
		else
		{
			LinkedListTree initStmt = ASTUtils.newPlaceholderAST(AS3Parser.FOR_INIT);
			forStmt.addChildWithTokens(initStmt);
		}
		forStmt.appendToken(TokenBuilder.newSemi());
		forStmt.appendToken(TokenBuilder.newSpace());
		if (condition != null)
		{
			forStmt.addChildWithTokens(condition);
		}
		else
		{
			LinkedListTree condStmt = ASTUtils.newPlaceholderAST(AS3Parser.FOR_CONDITION);
			forStmt.addChildWithTokens(condStmt);
		}
		forStmt.appendToken(TokenBuilder.newSemi());
		forStmt.appendToken(TokenBuilder.newSpace());
		if (iterate != null)
		{
			forStmt.addChildWithTokens(iterate);
		}
		else
		{
			LinkedListTree iterStmt = ASTUtils.newPlaceholderAST(AS3Parser.FOR_ITERATOR);
			forStmt.addChildWithTokens(iterStmt);
		}
		forStmt.appendToken(TokenBuilder.newRParen());
		return forStmt;
	}

	public static LinkedListTree newDeclarationAST(String assignment)
	{
		return newDeclarationAST(AS3FragmentParser.parseVariableDeclarator(assignment));
	}

	public static LinkedListTree newDeclarationAST(LinkedListTree assignment)
	{
		LinkedListTree declStmt = ASTUtils.newAST(AS3Parser.VAR, "var");
		declStmt.appendToken(TokenBuilder.newSpace());
		declStmt.addChildWithTokens(assignment);
		declStmt.appendToken(TokenBuilder.newSemi());
		return declStmt;
	}

	public static LinkedListTree newForInAST(String declaration,
			String expression)
	{
		return newForInAST(AS3FragmentParser.parseForInVar(declaration), AS3FragmentParser.parseExpression(expression));
	}

	public static LinkedListTree newForInAST(LinkedListTree declaration,
			LinkedListTree expression)
	{
		LinkedListTree forStmt = ASTUtils.newAST(AS3Parser.FOR_IN, "for");
		forStmt.appendToken(TokenBuilder.newSpace());
		genForInSetup(forStmt, declaration, expression);
		return forStmt;
	}

	private static void genForInSetup(LinkedListTree forStmt,
			LinkedListTree declaration, LinkedListTree expression)
	{
		forStmt.appendToken(TokenBuilder.newLParen());
		forStmt.addChildWithTokens(declaration);
		forStmt.appendToken(TokenBuilder.newSpace());
		forStmt.appendToken(TokenBuilder.newIn());
		forStmt.appendToken(TokenBuilder.newSpace());
		forStmt.addChildWithTokens(expression);
		forStmt.appendToken(TokenBuilder.newRParen());
	}

	public static LinkedListTree newForEachInAST(String declaration,
			String expression)
	{
		return newForEachInAST(AS3FragmentParser.parseForInVar(declaration), AS3FragmentParser.parseExpression(expression));
	}

	public static LinkedListTree newForEachInAST(LinkedListTree declaration,
			LinkedListTree expression)
	{
		LinkedListTree forStmt = ASTUtils.newAST(AS3Parser.FOR_EACH, "for");
		forStmt.appendToken(TokenBuilder.newSpace());
		forStmt.appendToken(TokenBuilder.newEach());
		genForInSetup(forStmt, declaration, expression);
		return forStmt;
	}

	public static LinkedListTree newWhileAST(String condition)
	{
		return newWhileAST(AS3FragmentParser.parseExpression(condition));
	}

	public static LinkedListTree newWhileAST(LinkedListTree condition)
	{
		LinkedListTree whileStmt = ASTUtils.newAST(AS3Parser.WHILE, "while");
		whileStmt.appendToken(TokenBuilder.newSpace());
		whileStmt.addChildWithTokens(conditionAST(condition));
		return whileStmt;
	}

	public static LinkedListTree newDoWhileAST(String condition)
	{
		return newDoWhile(AS3FragmentParser.parseExpression(condition));
	}

	public static LinkedListTree newDoWhileAST(LinkedListTree condition)
	{
		LinkedListTree doWhileStmt = ASTUtils.newAST(AS3Parser.DO, "do");
		doWhileStmt.appendToken(TokenBuilder.newSpace());
		LinkedListTree block = ASTBuilder.newBlock();
		doWhileStmt.addChildWithTokens(block);
		doWhileStmt.appendToken(TokenBuilder.newSpace());
		doWhileStmt.appendToken(TokenBuilder.newWhile());
		doWhileStmt.appendToken(TokenBuilder.newSpace());
		doWhileStmt.addChildWithTokens(conditionAST(condition));
		doWhileStmt.appendToken(TokenBuilder.newSemi());
		return doWhileStmt;
	}

	public static LinkedListTree newSwitchAST(String condition)
	{
		return newSwitchAST(AS3FragmentParser.parseExpression(condition));
	}

	public static LinkedListTree newSwitchAST(LinkedListTree condition)
	{
		LinkedListTree switchStmt = ASTUtils.newAST(AS3Parser.SWITCH, "switch");
		switchStmt.appendToken(TokenBuilder.newSpace());
		switchStmt.addChildWithTokens(conditionAST(condition));
		switchStmt.appendToken(TokenBuilder.newSpace());
		LinkedListTree block = ASTBuilder.newBlock();
		switchStmt.addChildWithTokens(block);
		return switchStmt;
	}

	public static LinkedListTree newWith(String expr)
	{
		return newWith(AS3FragmentParser.parseExpression(expr));
	}

	public static LinkedListTree newWith(LinkedListTree expr)
	{
		LinkedListTree withStmt = ASTUtils.newAST(AS3Parser.WITH, "with");
		withStmt.appendToken(TokenBuilder.newSpace());
		withStmt.addChildWithTokens(conditionAST(expr));
		return withStmt;
	}

	public static LinkedListTree newReturnAST(String expr)
	{
		return newReturnAST(expr == null ? null
				: AS3FragmentParser.parseExpression(expr));
	}

	public static LinkedListTree newReturnAST(LinkedListTree expr)
	{
		LinkedListTree returnStmt = ASTUtils.newAST(AS3Parser.RETURN, "return");
		if (expr != null)
		{
			returnStmt.appendToken(TokenBuilder.newSpace());
			returnStmt.addChildWithTokens(expr);
		}
		returnStmt.appendToken(TokenBuilder.newSemi());
		return returnStmt;
	}

	public static LinkedListTree newBreakStatementAST()
	{
		return newBreakStatementAST(null);
	}

	public static LinkedListTree newBreakStatementAST(String label)
	{
		LinkedListTree ast = ASTUtils.newAST(AS3Parser.BREAK, "break");
		if (label != null)
		{
			LinkedListTree ident = ASTUtils.newAST(AS3Parser.IDENT, label);
			ident.prependToken(TokenBuilder.newSpace());
			ast.addChildWithTokens(ident);
		}
		ast.appendToken(TokenBuilder.newSemi());
		return ast;
	}

	public static LinkedListTree newTryStatementAST()
	{
		LinkedListTree tryStmt = ASTUtils.newAST(AS3Parser.TRY, "try");
		tryStmt.appendToken(TokenBuilder.newSpace());
		tryStmt.addChildWithTokens(ASTBuilder.newBlock());
		return tryStmt;
	}

	public static LinkedListTree newCatchClauseAST(LinkedListTree nameAST,
			LinkedListTree typeAST)
	{
		LinkedListTree tryStmt = ASTUtils.newAST(AS3Parser.CATCH, "catch");
		tryStmt.appendToken(TokenBuilder.newSpace());
		tryStmt.appendToken(TokenBuilder.newLParen());
		tryStmt.addChildWithTokens(nameAST);
		if (typeAST != null)
		{
			tryStmt.addChildWithTokens(typeAST);
		}
		tryStmt.appendToken(TokenBuilder.newRParen());
		tryStmt.appendToken(TokenBuilder.newSpace());
		tryStmt.addChildWithTokens(ASTBuilder.newBlock());
		return tryStmt;
	}

	public static LinkedListTree newCatchClauseAST(String var, String type)
	{
		LinkedListTree tryStmt = ASTUtils.newAST(AS3Parser.CATCH, "catch");
		tryStmt.appendToken(TokenBuilder.newSpace());
		tryStmt.appendToken(TokenBuilder.newLParen());
		tryStmt.addChildWithTokens(AS3FragmentParser.parseSimpleIdent(var));
		if (type != null)
		{
			tryStmt.addChildWithTokens(AS3FragmentParser.parseTypeSpec(type));
		}
		tryStmt.appendToken(TokenBuilder.newRParen());
		tryStmt.appendToken(TokenBuilder.newSpace());
		tryStmt.addChildWithTokens(ASTBuilder.newBlock());
		return tryStmt;
	}

	public static LinkedListTree newFinallyClauseAST()
	{
		LinkedListTree tryStmt = ASTUtils.newAST(AS3Parser.FINALLY, "finally");
		tryStmt.appendToken(TokenBuilder.newSpace());
		tryStmt.addChildWithTokens(ASTBuilder.newBlock());
		return tryStmt;
	}

	public static LinkedListTree newContinueStatementAST()
	{
		return newContinueStatementAST(null);
	}

	public static LinkedListTree newContinueStatementAST(String label)
	{
		LinkedListTree ast = ASTUtils.newAST(AS3Parser.CONTINUE, "continue");
		if (label != null)
		{
			LinkedListTree ident = ASTUtils.newAST(AS3Parser.IDENT, label);
			ident.prependToken(TokenBuilder.newSpace());
			ast.addChildWithTokens(ident);
		}
		ast.appendToken(TokenBuilder.newSemi());
		return ast;
	}

	public static LinkedListTree newThrowStatementAST(LinkedListTree ast)
	{
		LinkedListTree thrw = ASTUtils.newAST(AS3Parser.THROW, "throw");
		thrw.appendToken(TokenBuilder.newSpace());
		thrw.addChildWithTokens(ast);
		thrw.appendToken(TokenBuilder.newSemi());
		return thrw;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static LinkedListTree newSuperStatementAST(List args)
	{
		LinkedListTree superStmt = ASTUtils.newAST(AS3Parser.SUPER, "super");
		LinkedListTree argumentsNode = ASTUtils.newParentheticAST(AS3Parser.ARGUMENTS, AS3Parser.LPAREN, "(", AS3Parser.RPAREN, ")");
		ArgumentUtils.overwriteArgsWithExpressionList(argumentsNode, args);
		superStmt.addChildWithTokens(argumentsNode);
		superStmt.appendToken(TokenBuilder.newSemi());
		return superStmt;
	}

	public static LinkedListTree newConfigAST(String name)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.COMPILE_CONFIG);
		LinkedListTree dbl = ASTUtils.newImaginaryAST(AS3Parser.DBL_COLON);
		ast.addChildWithTokens(dbl);
		dbl.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, "CONFIG"));
		dbl.appendToken(TokenBuilder.newToken(AS3Parser.DBL_COLON, "::"));
		dbl.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, name));
		dbl.appendToken(TokenBuilder.newSpace());
		ast.addChildWithTokens(newBlock(AS3Parser.BLOCK));
		return ast;
	}

	public static LinkedListTree newConfigAST(IASExpression name)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.COMPILE_CONFIG);
		LinkedListTree dbl = ASTUtils.newImaginaryAST(AS3Parser.DBL_COLON);
		ast.addChildWithTokens(dbl);
		dbl.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, "CONFIG"));
		dbl.appendToken(TokenBuilder.newToken(AS3Parser.DBL_COLON, "::"));
		dbl.addChildWithTokens(ASTUtils.ast(name));
		dbl.appendToken(TokenBuilder.newSpace());
		ast.addChildWithTokens(newBlock(AS3Parser.BLOCK));
		return ast;
	}

	public static LinkedListTree newLabelAST(String name)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.LABEL_STMNT);
		ast.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, name));
		ast.appendToken(TokenBuilder.newColon());
		ast.appendToken(TokenBuilder.newSpace());
		ast.addChildWithTokens(newBlock(AS3Parser.BLOCK));
		return ast;
	}

	public static LinkedListTree newLabelAST(IASExpression name)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.LABEL_STMNT);
		ast.addChildWithTokens(ASTUtils.ast(name));
		ast.appendToken(TokenBuilder.newColon());
		ast.appendToken(TokenBuilder.newSpace());
		ast.addChildWithTokens(newBlock(AS3Parser.BLOCK));
		return ast;
	}

}
