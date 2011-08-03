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
import org.as3commons.asblocks.dom.IASForStatement;
import org.as3commons.asblocks.dom.IScriptElement;
import org.as3commons.asblocks.dom.IStatementContainer;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASForStatement extends ContainerDelegate implements
		IASForStatement
{
	private static final int INDEX_INIT = 0;
	
	private static final int INDEX_CONDITION = 1;
	
	private static final int INDEX_UPDATE = 2;
	
	private static final int INDEX_STATEMENT = 3;

	public ASTASForStatement(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public IScriptElement getInitializer()
	{
		if (!hasInit())
			return null;
		LinkedListTree init = findInit().getFirstChild();
		switch (init.getType())
		{
		case AS3Parser.VAR:
		case AS3Parser.CONST:
			return new ASTASDeclarationStatement(init);
		default:
			return ExpressionBuilder.build(init);
		}
	}

	@Override
	public void setInitializer(IScriptElement value)
	{
		if (value == null)
		{
			deleteAnyChild(findInit());
		}
		else
		{
			setFirstChild(findInit(), toAST(value));
		}
	}

	@Override
	public IASExpression getCondition()
	{
		if (!hasCondition())
			return null;
		return ExpressionBuilder.build(findCondition().getFirstChild());
	}

	@Override
	public void setCondition(IASExpression value)
	{
		LinkedListTree cond = findCondition();
		if (value == null)
		{
			deleteAnyChild(cond);
		}
		else
		{
			setFirstChild(cond, toAST(value));
		}
	}

	@Override
	public IASExpression getIterator()
	{
		if (!hasIterator())
			return null;
		return ExpressionBuilder.build(findIterator().getFirstChild());
	}

	@Override
	public void setIterator(IASExpression value)
	{
		if (value == null)
		{
			deleteAnyChild(findIterator());
		}
		else
		{
			setFirstChild(findIterator(), toAST(value));
		}
	}

	@Override
	public String getInitializerString()
	{
		if (!hasInit())
			return null;
		return ASTUtils.stringifyNode(findInit());
	}

	@Override
	public String getConditionString()
	{
		if (!hasCondition())
			return null;
		return ASTUtils.stringifyNode(findCondition().getFirstChild());
	}

	@Override
	public String getIteratorString()
	{
		if (!hasIterator())
			return null;
		return ASTUtils.stringifyNode(findIterator().getFirstChild());
	}

	@Override
	protected IStatementContainer getStatementContainer()
	{
		return new ASTStatementList(getChild(INDEX_STATEMENT));
	}

	private boolean hasCondition()
	{
		return findCondition().getChildCount() > 0;
	}

	private boolean hasInit()
	{
		return findInit().getChildCount() > 0;
	}

	private boolean hasIterator()
	{
		return findIterator().getChildCount() > 0;
	}

	private LinkedListTree getChild(int index)
	{
		return (LinkedListTree) ast.getChild(index);
	}

	private LinkedListTree findInit()
	{
		return getChild(INDEX_INIT);
	}

	private LinkedListTree findCondition()
	{
		return getChild(INDEX_CONDITION);
	}

	private LinkedListTree findIterator()
	{
		return getChild(INDEX_UPDATE);
	}

	private void deleteAnyChild(LinkedListTree tree)
	{
		if (tree.getChildCount() > 0)
		{
			tree.deleteChild(0);
		}
	}

	private static void setFirstChild(LinkedListTree parent,
			LinkedListTree child)
	{
		if (parent.getChildCount() == 0)
		{
			parent.addChildWithTokens(child);
		}
		else
		{
			parent.setChildWithTokens(0, child);
		}
	}
}
