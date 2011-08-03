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
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASStatement;
import org.as3commons.asblocks.dom.IASWhileStatement;
import org.as3commons.asblocks.dom.IStatementContainer;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASWhileStatement extends ContainerDelegate implements
		IASWhileStatement
{

	private static final int INDEX_CONDITION = 0;

	private static final int INDEX_STATEMENT = 1;

	public ASTASWhileStatement(LinkedListTree ast)
	{
		super(ast);
		ASTUtils.assertAS3TokenTypeIs(AS3Parser.WHILE, ast.getType());
	}

	@Override
	public IASExpression getCondition()
	{
		return ExpressionBuilder.build(condition().getFirstChild());
	}

	@Override
	public void parseCondition(String value)
	{
		LinkedListTree cond = AS3FragmentParser.parseCondition(value);
		ast.setChildWithTokens(INDEX_CONDITION, cond);
	}

	@Override
	public void setCondition(IASExpression value)
	{
		condition().setChildWithTokens(INDEX_CONDITION, toAST(value));
	}

	@Override
	public String getConditionString()
	{
		return ASTUtils.stringifyNode(condition().getFirstChild());
	}

	@Override
	public IASStatement getBody()
	{
		return StatementBuilder.build(findStatement());
	}

	@Override
	protected IStatementContainer getStatementContainer()
	{
		LinkedListTree stmt = findStatement();
		if (stmt.getType() != AS3Parser.BLOCK)
		{
			throw new ASBlocksSyntaxError("Loop body is not a block");
		}
		return new ASTStatementList(stmt);
	}

	private LinkedListTree condition()
	{
		return ast.getFirstChild();
	}

	private LinkedListTree findStatement()
	{
		return getChild(INDEX_STATEMENT);
	}

	private LinkedListTree getChild(int index)
	{
		return (LinkedListTree) ast.getChild(index);
	}
}
