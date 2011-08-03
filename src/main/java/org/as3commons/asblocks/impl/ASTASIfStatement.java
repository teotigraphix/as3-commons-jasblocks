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

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.dom.IASBlock;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASIfStatement;
import org.as3commons.asblocks.dom.IASStatement;
import org.as3commons.asblocks.dom.IStatementContainer;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASIfStatement extends ContainerDelegate implements
		IASIfStatement
{
	private static final int THEN_INDEX = 1;
	private static final int ELSE_INDEX = 2;

	public ASTASIfStatement(LinkedListTree ast)
	{
		super(ast);
		ASTUtils.assertAS3TokenTypeIs(AS3Parser.IF, ast.getType());
	}

	@Override
	protected IStatementContainer getStatementContainer()
	{
		LinkedListTree child = thenClause();
		if (AS3Parser.BLOCK != child.getType())
		{
			throw new ASBlocksSyntaxError("statement is not a block");
		}
		return new ASTStatementList(child);
	}

	@Override
	public IASExpression getCondition()
	{
		return ExpressionBuilder.build(condition().getFirstChild());
	}

	@Override
	public String getConditionString()
	{
		return ASTUtils.stringifyNode(condition().getFirstChild());
	}

	@Override
	public void setCondition(IASExpression value)
	{
		//		LinkedListTree cond = AS3FragmentParser.parseCondition(value);
		//		ast.setChildWithTokens(0, cond);
		LinkedListTree condExpr = toAST(value);
		condition().setChildWithTokens(0, condExpr);
	}

	@Override
	public IASStatement getThenStatement()
	{
		return StatementBuilder.build(thenClause());
	}

	@Override
	public void setThen(IASBlock value)
	{
		LinkedListTree theBlock = toAST(value);
		ASTIterator i = new ASTIterator(ast);
		i.next(); // move to condition
		i.next(); // move to then-branch
		i.replace(theBlock);
		String indent = ASTUtils.findIndent(ast);
		ASTUtils.increaseIndentAfterFirstLine(theBlock, indent);
	}

	@Override
	public void setThenStatement(IASStatement statement)
	{
		LinkedListTree thenAST = toAST(statement);
		ast.setChildWithTokens(THEN_INDEX, thenAST);
		if (AS3Parser.BLOCK == thenAST.getType())
		{
			String indent = ASTUtils.findIndent(ast);
			ASTUtils.increaseIndentAfterFirstLine(thenAST, indent);
		}
	}

	@Override
	public IASBlock getElse()
	{
		LinkedListTree elseClause = elseClause();
		if (elseClause == null)
		{
			String indent = ASTUtils.findIndent(ast);
			elseClause = ASTUtils.newAST(AS3Parser.ELSE, "else");
			ast.appendToken(TokenBuilder.newSpace());
			ast.addChildWithTokens(elseClause);
			elseClause.appendToken(TokenBuilder.newSpace());
			LinkedListTree block = ASTBuilder.newBlock();
			elseClause.addChildWithTokens(block);
			ASTUtils.increaseIndentAfterFirstLine(block, indent);
			return new ASTStatementList(block);
		}
		IASStatement statement = StatementBuilder.build(elseClause.getFirstChild());
		if (!(statement instanceof IASBlock))
		{
			throw new ASBlocksSyntaxError("Expected a block, got "
					+ ASTUtils.tokenNameFromAST(elseClause.getFirstChild()));
		}
		return (IASBlock) statement;
	}

	@Override
	public IASStatement getElseStatement()
	{
		// this is the { statement }
		LinkedListTree clause = elseClause();
		if (clause == null)
			return null;
		return StatementBuilder.build(clause.getFirstChild());
	}

	@Override
	public void setElseStatement(IASStatement value)
	{
		@SuppressWarnings("unused")
		IASBlock block = getElse();
		LinkedListTree statement = ASTUtils.ast(value);
		LinkedListTree child = elseClause();
		child.setChildWithTokens(0, statement);
		String indent = ASTUtils.findIndent(ast);
		ASTUtils.increaseIndentAfterFirstLine(statement, indent);
	}

	// NON API methods for now

	private LinkedListTree condition()
	{
		return ast.getFirstChild();
	}

	private LinkedListTree thenClause()
	{
		return (LinkedListTree) ast.getChild(THEN_INDEX);
	}

	private LinkedListTree elseClause()
	{
		return (LinkedListTree) ast.getChild(ELSE_INDEX);
	}
}
