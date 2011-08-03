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

import org.as3commons.asblocks.dom.IASDeclaration;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASDeclaration extends ASTScriptElement implements
		IASDeclaration
{

	public ASTASDeclaration(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public String getName()
	{
		return ast.getFirstChild().getText();
	}

	@Override
	public String getType()
	{
		LinkedListTree type = ASTUtils.findChildByType(ast, AS3Parser.TYPE_SPEC);
		if (type == null)
		{
			return null;
		}
		return ASTUtils.typeSpecText(type);
	}

	@Override
	public IASExpression getInitializer()
	{
		LinkedListTree init = ASTUtils.findChildByType(ast, AS3Parser.ASSIGN);
		if (init == null)
		{
			return null;
		}
		return ExpressionBuilder.build(init.getFirstChild());
	}

	@Override
	public void setName(String value)
	{
		// TODO implement ASTASDeclaration.setName()

	}

	@Override
	public void setType(String value)
	{
		// TODO implement ASTASDeclaration.setType()

	}

	@Override
	public void setInitializer(IASExpression value)
	{
		// TODO implement ASTASDeclaration.setInitializer()

	}

}
