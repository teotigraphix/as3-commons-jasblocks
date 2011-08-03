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

import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IScriptElement;
import org.as3commons.asblocks.dom.IStatementContainer;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

/**
 * Common code implementing 'for-in' and 'for-each-in' loop behavior.
 */
public class ASTForInCommon extends ContainerDelegate
{
	private static final int INDEX_VAR = 0;

	private static final int INDEX_ITERATED = 1;

	private static final int INDEX_STATEMENT = 2;

	public ASTForInCommon(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	protected IStatementContainer getStatementContainer()
	{
		return new ASTStatementList(getChild(INDEX_STATEMENT));
	}

	public IScriptElement getInitializer()
	{
		return StatementBuilder.build(initializer());
	}

	public String getInitializerString()
	{
		return ASTUtils.stringifyNode(getChild(INDEX_VAR));
	}

	public String getIteratorString()
	{
		return ASTUtils.stringifyNode(iterated());
	}

	public IASExpression getIterator()
	{
		return ExpressionBuilder.build(iterated());
	}

	public void parseInitializer(String value)
	{
		LinkedListTree var = AS3FragmentParser.parseForInVar(value);
		ast.setChildWithTokens(INDEX_VAR, var);
	}

	public void setInitializer(IScriptElement value)
	{
		setInit(toAST(value));
	}

	public void parseIterator(String value)
	{
		setIter(AS3FragmentParser.parseForInIterated(value));
	}

	public void setIterator(IASExpression value)
	{
		setIter(toAST(value));
	}

	private LinkedListTree getChild(int index)
	{
		return (LinkedListTree) ast.getChild(index);
	}

	private LinkedListTree initializer()
	{
		return getChild(INDEX_VAR);
	}

	private LinkedListTree iterated()
	{
		return getChild(INDEX_ITERATED);
	}

	private void setInit(LinkedListTree initAST)
	{
		ast.setChildWithTokens(INDEX_VAR, initAST);
	}

	private void setIter(LinkedListTree iterAST)
	{
		ast.setChildWithTokens(INDEX_ITERATED, iterAST);
	}
}
