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

import org.as3commons.asblocks.dom.IASDoWhileStatement;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IStatementContainer;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASDoWhileStatement extends ContainerDelegate implements
		IASDoWhileStatement
{
	private static final int INDEX_STATEMENT = 0;

	private static final int INDEX_CONDITION = 1;

	public ASTASDoWhileStatement(LinkedListTree ast)
	{
		super(ast);
		ASTUtils.assertAS3TokenTypeIs(AS3Parser.DO, ast.getType());
	}

	@Override
	public IASExpression getCondition()
	{
		return ExpressionBuilder.build(findCondition().getFirstChild());
	}

	@Override
	public void setCondition(IASExpression value)
	{
		findCondition().setChildWithTokens(0, toAST(value));
	}

	@Override
	public void parseCondition(String value)
	{
		LinkedListTree cond = AS3FragmentParser.parseCondition(value);
		ast.setChildWithTokens(INDEX_CONDITION, cond);
	}

	@Override
	public String getConditionString()
	{
		return ASTUtils.stringifyNode(findCondition().getFirstChild());
	}

	@Override
	protected IStatementContainer getStatementContainer()
	{
		return new ASTStatementList(getChild(INDEX_STATEMENT));
	}

	private LinkedListTree getChild(int index)
	{
		return (LinkedListTree) ast.getChild(index);
	}

	private LinkedListTree findCondition()
	{
		return getChild(INDEX_CONDITION);
	}
}
