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

import org.as3commons.asblocks.dom.ASQName;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASField;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASField extends ASTASMember implements IASField
{
	@Override
	public ASQName getQName()
	{
		ASQName name = ASQName.create(getParent().getQualifiedName() + "#"
				+ getName());
		return name;
	}

	private static int INDEX_DEF = 2;

	private static int INDEX_DECL = 3;

	public ASTASField(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public boolean isConstant()
	{
		return ast.getChild(INDEX_DEF).getType() == AS3Parser.CONST;
	}

	@Override
	public void setConstant(boolean value)
	{
		if (isConstant() == value)
		{
			return;
		}
		LinkedListToken node;
		if (value)
		{
			node = TokenBuilder.newConst();
		}
		else
		{
			node = TokenBuilder.newVar();
		}
		ast.setChildWithTokens(INDEX_DEF, ASTUtils.newAST(node));
	}

	@Override
	public boolean isNamespace()
	{
		return ast.getChild(INDEX_DEF).getType() == AS3Parser.NAMESPACE;
	}

	@Override
	public void setNamespace(boolean value)
	{
		if (isNamespace() == value)
		{
			return;
		}
		LinkedListToken node;
		if (value)
		{
			node = TokenBuilder.newNamespace();
		}
		else
		{
			node = TokenBuilder.newVar();
		}
		ast.setChildWithTokens(INDEX_DEF, ASTUtils.newAST(node));
	}

	@Override
	public IASExpression getInitializer()
	{
		LinkedListTree decl = findDecl();
		LinkedListTree init = ASTUtils.findChildByType(decl, AS3Parser.ASSIGN);
		if (init == null)
			return null;
		return ExpressionBuilder.build(init.getFirstChild());
	}

	@Override
	public void setInitializer(IASExpression expr)
	{
		if (expr == null)
		{
			removeInitializer();
		}
		else
		{
			setInitAST(toAST(expr));
		}
	}

	private void setInitAST(LinkedListTree exp)
	{
		LinkedListTree decl = findDecl();
		LinkedListTree init = ASTUtils.findChildByType(decl, AS3Parser.ASSIGN);
		if (init == null)
		{
			init = ASTUtils.newAST(AS3Parser.ASSIGN, "=");
			init.prependToken(TokenBuilder.newSpace());
			init.appendToken(TokenBuilder.newSpace());
			decl.addChildWithTokens(init);
		}
		else
		{
			init.deleteChild(0);
		}
		init.addChildWithTokens(exp);
	}

	private void removeInitializer()
	{
		LinkedListTree decl = findDecl();
		ASTIterator i = new ASTIterator(decl);
		if (i.search(AS3Parser.ASSIGN) != null)
		{
			i.remove();
		}
	}

	private LinkedListTree findDecl()
	{
		return (LinkedListTree) ast.getChild(INDEX_DECL);
	}

}