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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.dom.IASBlock;
import org.as3commons.asblocks.dom.IASBreakStatement;
import org.as3commons.asblocks.dom.IASConfigStatement;
import org.as3commons.asblocks.dom.IASContinueStatement;
import org.as3commons.asblocks.dom.IASDeclarationStatement;
import org.as3commons.asblocks.dom.IASDefaultXMLNamespaceStatement;
import org.as3commons.asblocks.dom.IASDoWhileStatement;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASExpressionStatement;
import org.as3commons.asblocks.dom.IASForEachInStatement;
import org.as3commons.asblocks.dom.IASForInStatement;
import org.as3commons.asblocks.dom.IASForStatement;
import org.as3commons.asblocks.dom.IASIfStatement;
import org.as3commons.asblocks.dom.IASLabelStatement;
import org.as3commons.asblocks.dom.IASReturnStatement;
import org.as3commons.asblocks.dom.IASStatement;
import org.as3commons.asblocks.dom.IASSwitchStatement;
import org.as3commons.asblocks.dom.IASThrowStatement;
import org.as3commons.asblocks.dom.IASTryStatement;
import org.as3commons.asblocks.dom.IASUseStatement;
import org.as3commons.asblocks.dom.IASWhileStatement;
import org.as3commons.asblocks.dom.IASWithStatement;
import org.as3commons.asblocks.dom.IScriptElement;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

/**
 * Implements the behavior of StatementContainer.  May be managing statements
 * for either be a block, or a switch-statement label.
 */
public class ASTStatementList extends ASTScriptElement implements IASBlock
{

	public ASTStatementList(LinkedListTree ast)
	{
		super(ast);
		assertBlockAST(ast);
	}

	private void assertBlockAST(LinkedListTree ast)
	{
		switch (ast.getType())
		{
		case AS3Parser.BLOCK:
		case AS3Parser.SWITCH_STATEMENT_LIST:
			break;
		default:
			throw new IllegalArgumentException("statement is not a block: "
					+ ASTUtils.tokenNameFromAST(ast));
		}
	}

	@Override
	public boolean hasStatements()
	{
		return ast.getFirstChild() != null;
	}

	@Override
	public List<IASStatement> getStatements()
	{
		List<IASStatement> result = new ArrayList<IASStatement>();
		ASTIterator i = new ASTIterator(ast);
		while (i.hasNext())
		{
			result.add(StatementBuilder.build(i.next()));
		}
		return Collections.unmodifiableList(result);
	}

	@Override
	public void addComment(String text)
	{
		CommentUtils.appendSLCommentAST(ast, text);
	}

	@Override
	public IASStatement addStatement(IASStatement statement)
	{
		if (containsChild(statement))
		{
			throw new ASBlocksSyntaxError("IASStatement contained in list ["
					+ statement + "]");
		}
		LinkedListTree ast = ASTUtils.ast(statement);
		addChildStatement(ast);
		return statement;
	}

	@Override
	public IASStatement parseStatement(String statement)
	{
		LinkedListTree ast = AS3FragmentParser.parseStatement(statement);
		addChildStatement(ast);
		return StatementBuilder.build(ast);
	}

	@Override
	public IASStatement removeStatement(IASStatement statement)
	{
		if (!containsChild(statement))
		{
			throw new ASBlocksSyntaxError(
					"IASStatement not contained in list [" + statement + "]");
		}

		LinkedListTree child = ASTUtils.ast(statement);
		int index = ast.getIndexOfChild(child);
		ast.deleteChild(index);
		return StatementBuilder.build(child);
	}

	@Override
	public IASExpressionStatement parseNewExpressionStatement(String expr)
	{
		LinkedListTree ast = AS3FragmentParser.parseExprStatement(expr);
		addChildStatement(ast);
		return new ASTASExpressionStatement(ast);
	}

	@Override
	public IASExpressionStatement newExpressionStatement(IASExpression expr)
	{
		LinkedListTree ast = ASTStatementBuilder.newExpressionStatementAST(toAST(expr));
		addChildStatement(ast);
		return new ASTASExpressionStatement(ast);
	}

	@Override
	public IASIfStatement newIf(IASExpression condition)
	{
		LinkedListTree ifStmt = ASTStatementBuilder.newIfAST(toAST(condition));
		addChildStatement(ifStmt);
		return new ASTASIfStatement(ifStmt);
	}

	@Override
	public IASIfStatement parseNewIf(String condition)
	{
		LinkedListTree ifStmt = ASTStatementBuilder.newIfAST(condition);
		addChildStatement(ifStmt);
		return new ASTASIfStatement(ifStmt);
	}

	@Override
	public IASForStatement newFor(IScriptElement init, IASExpression condition,
			IASExpression iterate)
	{
		LinkedListTree initAST = (init != null) ? toAST(init) : null;
		LinkedListTree conditionAST = (init != null) ? toAST(condition) : null;
		LinkedListTree iteratorAST = (init != null) ? toAST(iterate) : null;

		LinkedListTree forStmt = ASTStatementBuilder.newForAST(initAST, conditionAST, iteratorAST);
		appendBlock(forStmt);
		addChildStatement(forStmt);
		return new ASTASForStatement(forStmt);
	}

	@Override
	public IASForStatement parseNewFor(String init, String condition,
			String iterate)
	{
		LinkedListTree forStmt = ASTStatementBuilder.newForAST(init, condition, iterate);
		appendBlock(forStmt);
		addChildStatement(forStmt);
		return new ASTASForStatement(forStmt);
	}

	@Override
	public IASForInStatement parseNewForIn(String declaration, String expression)
	{
		LinkedListTree forStmt = ASTStatementBuilder.newForInAST(declaration, expression);
		appendBlock(forStmt);
		addChildStatement(forStmt);
		return new ASTASForInStatement(forStmt);
	}

	@Override
	public IASForInStatement newForIn(IScriptElement declaration,
			IASExpression expression)
	{
		LinkedListTree forStmt = ASTStatementBuilder.newForInAST(toAST(declaration), toAST(expression));
		appendBlock(forStmt);
		addChildStatement(forStmt);
		return new ASTASForInStatement(forStmt);
	}

	@Override
	public IASForEachInStatement newForEachIn(IScriptElement declaration,
			IASExpression expression)
	{
		LinkedListTree forStmt = ASTStatementBuilder.newForEachInAST(toAST(declaration), toAST(expression));
		appendBlock(forStmt);
		addChildStatement(forStmt);
		return new ASTASForEachInStatement(forStmt);
	}

	@Override
	public IASForEachInStatement parseNewForEachIn(String declaration,
			String expression)
	{
		LinkedListTree forStmt = ASTStatementBuilder.newForEachInAST(declaration, expression);
		appendBlock(forStmt);
		addChildStatement(forStmt);
		return new ASTASForEachInStatement(forStmt);
	}

	@Override
	public IASWhileStatement newWhile(IASExpression condition)
	{
		LinkedListTree whileStmt = ASTStatementBuilder.newWhileAST(ASTUtils.ast(condition));
		appendBlock(whileStmt);
		addChildStatement(whileStmt);
		return new ASTASWhileStatement(whileStmt);
	}

	@Override
	public IASWhileStatement parseNewWhile(String condition)
	{
		LinkedListTree whileStmt = ASTStatementBuilder.newWhileAST(condition);
		appendBlock(whileStmt);
		addChildStatement(whileStmt);
		return new ASTASWhileStatement(whileStmt);
	}

	@Override
	public IASDoWhileStatement newDoWhile(IASExpression condition)
	{
		LinkedListTree doWhileStmt = ASTStatementBuilder.newDoWhileAST(toAST(condition));
		addChildStatement(doWhileStmt);
		return new ASTASDoWhileStatement(doWhileStmt);
	}

	@Override
	public IASDoWhileStatement parseNewDoWhile(String condition)
	{
		LinkedListTree doWhileStmt = ASTStatementBuilder.newDoWhileAST(condition);
		addChildStatement(doWhileStmt);
		return new ASTASDoWhileStatement(doWhileStmt);
	}

	@Override
	public IASSwitchStatement newSwitch(IASExpression condition)
	{
		LinkedListTree switchStmt = ASTStatementBuilder.newSwitchAST(toAST(condition));
		addChildStatement(switchStmt);
		return new ASTASSwitchStatement(switchStmt);
	}

	@Override
	public IASSwitchStatement parseNewSwitch(String condition)
	{
		LinkedListTree switchStmt = ASTStatementBuilder.newSwitchAST(condition);
		addChildStatement(switchStmt);
		return new ASTASSwitchStatement(switchStmt);
	}

	@Override
	public IASWithStatement newWith(IASExpression scope)
	{
		LinkedListTree withStmt = ASTStatementBuilder.newWith(toAST(scope));
		appendBlock(withStmt);
		addChildStatement(withStmt);
		return new ASTASWithStatement(withStmt);
	}

	@Override
	public IASWithStatement parseNewWith(String scope)
	{
		LinkedListTree withStmt = ASTStatementBuilder.newWith(scope);
		appendBlock(withStmt);
		addChildStatement(withStmt);
		return new ASTASWithStatement(withStmt);
	}

	@Override
	public IASDeclarationStatement newDeclaration(IScriptElement declaration)
	{
		LinkedListTree ast = ASTStatementBuilder.newDeclarationAST(toAST(declaration));
		addChildStatement(ast);
		return new ASTASDeclarationStatement(ast);
	}

	@Override
	public IASDeclarationStatement parseNewDeclaration(String declaration)
	{
		LinkedListTree ast = ASTStatementBuilder.newDeclarationAST(declaration);
		addChildStatement(ast);
		return new ASTASDeclarationStatement(ast);
	}

	@Override
	public IASReturnStatement newReturn(IASExpression expression)
	{
		LinkedListTree ast = ASTStatementBuilder.newReturnAST(toAST(expression));
		addChildStatement(ast);
		return new ASTASReturnStatement(ast);
	}

	@Override
	public IASReturnStatement newReturn()
	{
		LinkedListTree ast = ASTStatementBuilder.newReturnAST((String) null);
		addChildStatement(ast);
		return new ASTASReturnStatement(ast);
	}

	@Override
	public IASReturnStatement parseNewReturn(String expression)
	{
		LinkedListTree ast = ASTStatementBuilder.newReturnAST(expression);
		addChildStatement(ast);
		return new ASTASReturnStatement(ast);
	}

	//	@Override
	//	public IASSuperStatement newSuper(List<IASExpression> arguments)
	//	{
	//		LinkedListTree ast = ASTStatementBuilder.newSuperStatementAST(arguments);
	//		addChildStatement(ast);
	//		return new ASTASSuperStatement(ast);
	//	}

	//	@Override
	//	public IASSuperStatement newSuper()
	//	{
	//		return newSuper(new ArrayList<IASExpression>());
	//	}

	@Override
	public IASBreakStatement newBreak(String label)
	{
		LinkedListTree ast = ASTStatementBuilder.newBreakStatementAST(label);
		addChildStatement(ast);
		return new ASTASBreakStatement(ast);
	}

	@Override
	public IASBreakStatement newBreak()
	{
		LinkedListTree ast = ASTStatementBuilder.newBreakStatementAST();
		addChildStatement(ast);
		return new ASTASBreakStatement(ast);
	}

	@Override
	public IASTryStatement newTryCatch(IASExpression name, IASExpression type)
	{
		LinkedListTree ast = ASTStatementBuilder.newTryStatementAST();
		ast.appendToken(TokenBuilder.newSpace());
		LinkedListTree nameAST = ASTUtils.ast(name);
		LinkedListTree typeAST = ASTUtils.ast(type);
		ast.addChildWithTokens(ASTStatementBuilder.newCatchClauseAST(nameAST, typeAST));
		addChildStatement(ast);
		return new ASTASTryStatement(ast);
	}
	
	@Override
	public IASTryStatement parseNewTryCatch(String name, String type)
	{
		LinkedListTree ast = ASTStatementBuilder.newTryStatementAST();
		ast.appendToken(TokenBuilder.newSpace());
		ast.addChildWithTokens(ASTStatementBuilder.newCatchClauseAST(name, type));
		addChildStatement(ast);
		return new ASTASTryStatement(ast);
	}

	@Override
	public IASTryStatement newTryFinally()
	{
		LinkedListTree ast = ASTStatementBuilder.newTryStatementAST();
		ast.appendToken(TokenBuilder.newSpace());
		ast.addChildWithTokens(ASTStatementBuilder.newFinallyClauseAST());
		addChildStatement(ast);
		return new ASTASTryStatement(ast);
	}

	@Override
	public IASContinueStatement newContinue(String label)
	{
		LinkedListTree ast = ASTStatementBuilder.newContinueStatementAST(label);
		addChildStatement(ast);
		return new ASTASContinueStatement(ast);
	}

	@Override
	public IASContinueStatement newContinue()
	{
		LinkedListTree ast = ASTStatementBuilder.newContinueStatementAST();
		addChildStatement(ast);
		return new ASTASContinueStatement(ast);
	}

	@Override
	public IASThrowStatement newThrow(IASExpression expression)
	{
		LinkedListTree ast = ASTStatementBuilder.newThrowStatementAST(toAST(expression));
		addChildStatement(ast);
		return new ASTASThrowStatement(ast);
	}

	@Override
	public IASDefaultXMLNamespaceStatement newDefaultXMLNamespace(
			String namespace)
	{
		LinkedListTree stringAST = ASTStatementBuilder.newStringAST(namespace);
		LinkedListTree ast = ASTStatementBuilder.newDefaultXMLNamespaceAST(stringAST);
		addChildStatement(ast);
		return new ASTASDefaultXMLNamespaceStatement(ast);
	}

	@Override
	public IASLabelStatement newLabel(IASExpression name)
	{
		LinkedListTree ast = ASTStatementBuilder.newLabelAST(name);
		addChildStatement(ast);
		return new ASTASLabelStatement(ast);
	}

	@Override
	public IASLabelStatement parseNewLabel(String name)
	{
		LinkedListTree ast = ASTStatementBuilder.newLabelAST(name);
		addChildStatement(ast);
		return new ASTASLabelStatement(ast);
	}

	@Override
	public IASConfigStatement newConfig(IASExpression name)
	{
		LinkedListTree ast = ASTStatementBuilder.newConfigAST(name);
		addChildStatement(ast);
		return new ASTASConfigStatement(ast);
	}

	@Override
	public IASConfigStatement parseNewConfig(String name)
	{
		LinkedListTree ast = ASTStatementBuilder.newConfigAST(name);
		addChildStatement(ast);
		return new ASTASConfigStatement(ast);
	}

	@Override
	public IASUseStatement newUse(IASExpression name)
	{
		LinkedListTree nameAST = ASTUtils.ast(name);
		LinkedListTree child = AS3FragmentParser.parseUseNamespace(ASTUtils.stringifyNode(nameAST));
		addChildStatement(child);
		return new ASTASUseStatement(child);
	}

	@Override
	public IASUseStatement parseNewUse(String name)
	{
		LinkedListTree child = AS3FragmentParser.parseUseNamespace(name);
		addChildStatement(child);
		return new ASTASUseStatement(child);
	}

	private void addChildStatement(LinkedListTree child)
	{
		ASTUtils.addChildWithIndentation(ast, child);
	}

	public LinkedListTree getAST()
	{
		return ast;
	}

	private boolean containsChild(IASStatement statement)
	{
		if (ast.getChildCount() == 0)
			return false;		
		LinkedListTree child = ASTUtils.ast(statement);
		return (ast.getIndexOfChild(child) != -1);
	}

	/**
	 * Appends a block node as a child of the given node (preceding it
	 * with a space token) and returns a reference to the new block.
	 * 
	 * NB doesn't do indentation properly, so add the block to the statement
	 * before the statement is added to its container.
	 */
	private static LinkedListTree appendBlock(LinkedListTree ast)
	{
		ast.appendToken(TokenBuilder.newSpace());
		LinkedListTree block = ASTBuilder.newBlock();
		ast.addChildWithTokens(block);
		return block;
	}

	/**
	 * Returns the first BLOCK child of the given node
	 */
	@SuppressWarnings("unused")
	private static LinkedListTree findBlock(LinkedListTree ast)
	{
		return (LinkedListTree) ast.getFirstChildWithType(AS3Parser.BLOCK);
	}

}