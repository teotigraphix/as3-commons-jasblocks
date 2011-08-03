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

import org.as3commons.asblocks.dom.IASLabelStatement;
import org.as3commons.asblocks.dom.IASStatement;
import org.as3commons.asblocks.dom.IStatementContainer;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

/**
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public class ASTASLabelStatement extends ContainerDelegate implements
		IASLabelStatement
{
	private static final int IDENT_INDEX = 0;
	private static final int STATEMENT_INDEX = 1;

	public ASTASLabelStatement(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public String getLabel()
	{
		return findIdent().getText();
	}

	@Override
	public void setLabel(String value)
	{
		findIdent().getToken().setText(value);
	}

	@Override
	public IASStatement getStatement()
	{
		return StatementBuilder.build(findStatement());
	}

	@Override
	public void setStatement(IASStatement statement)
	{
		LinkedListTree statementAST =  ASTUtils.ast(statement);
		ASTIterator i = new ASTIterator(ast);
		i.next(); // IDENT
		i.next(); // statement
		i.replace(statementAST);
		String indent = ASTUtils.findIndent(ast);
		ASTUtils.increaseIndentAfterFirstLine(statementAST, indent);
	}

	@Override
	protected IStatementContainer getStatementContainer()
	{
		return new ASTStatementList(findStatement());
	}

	private LinkedListTree findIdent()
	{
		return (LinkedListTree) ast.getChild(IDENT_INDEX);
	}

	private LinkedListTree findStatement()
	{
		return (LinkedListTree) ast.getChild(STATEMENT_INDEX);
	}
}
