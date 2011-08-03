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
import org.as3commons.asblocks.dom.IASWithStatement;
import org.as3commons.asblocks.dom.IStatementContainer;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASWithStatement extends ContainerDelegate implements
		IASWithStatement
{
	private static final int INDEX_CONDITION = 0;

	public ASTASWithStatement(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public IASExpression getScope()
	{
		return ExpressionBuilder.build(findScope().getFirstChild());
	}

	@Override
	public void setScope(IASExpression value)
	{
		findScope().setChildWithTokens(0, toAST(value));
	}

	@Override
	public void parseScope(String value)
	{
		LinkedListTree cond = AS3FragmentParser.parseCondition(value);
		ast.setChildWithTokens(INDEX_CONDITION, cond);
	}

	@Override
	public String getScopeString()
	{
		return ASTUtils.stringifyNode(findScope().getFirstChild());
	}

	@Override
	public IASStatement getBody()
	{
		return StatementBuilder.build(findBody());
	}

	@Override
	protected IStatementContainer getStatementContainer()
	{
		LinkedListTree body = findBody();
		if (body.getType() != AS3Parser.BLOCK)
		{
			throw new ASBlocksSyntaxError("'with' body is not a block");
		}
		return new ASTStatementList(body);
	}

	private LinkedListTree findScope()
	{
		return ast.getFirstChild();
	}

	private LinkedListTree findBody()
	{
		return ast.getLastChild();
	}

}
