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

import java.util.List;

import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASNewExpression;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASNewExpression extends ASTInvocation implements
		IASNewExpression
{

	public ASTASNewExpression(LinkedListTree ast)
	{
		super(ast);
	}
	
	private boolean hasArgs()
	{
		return ASTUtils.findChildByType(ast, AS3Parser.ARGUMENTS) != null;
	}
	
	public List<IASExpression> getArguments()
	{
		if (hasArgs())
		{
			return super.getArguments();
		}
		return null;
	}	
	
	public void setArguments(List<IASExpression> args)
	{
		if (hasArgs())
		{
			if (args == null)
			{
				int index = ast.getChildCount() - 1;
				ast.deleteChild(index);
			} else
			{
				super.setArguments(args);
			}
		} else
		{
			if (args != null)
			{
				LinkedListTree argTree = ASTUtils.newParentheticAST(
						AS3Parser.ARGUMENTS, AS3Parser.LPAREN, "(",
						AS3Parser.RPAREN, ")");
				ast.addChildWithTokens(argTree);
				super.setArguments(args);
			}
		}
	}	
	
	
	
/*


	public List<IASExpression> getArguments()
	{
		if (hasArgs())
		{
			return super.getArguments();
		}
		return null;
	}
	
	
	private LinkedListTree getFieldAccess()
	{
		return ast.getFirstChild();
	}
	
	public void setArguments(List<IASExpression> args)
	{
		if (hasArgs())
		{
			if (args == null)
			{
				int index = getFieldAccess().getChildCount() - 1;
				getFieldAccess().deleteChild(index);
			} else
			{
				super.setArguments(args);
			}
		} else
		{
			if (args != null)
			{
				LinkedListTree argTree = ASTUtils.newParentheticAST(
						AS3Parser.ARGUMENTS, AS3Parser.LPAREN, "(",
						AS3Parser.RPAREN, ")");
				getFieldAccess().addChildWithTokens(argTree);
				super.setArguments(args);
			}
		}
	}
	
	
	
		// me
		if (argumentNode == null)
		{
			argumentNode = ASTUtils.newParentheticAST(
					AS3Parser.ARGUMENTS, AS3Parser.LPAREN, "(",
					AS3Parser.RPAREN, ")");
			ast.addChildWithTokens(argumentNode);
		}
		if (value == null)
		{
			int index = ast.getChildCount() - 1;
			ast.deleteChild(index);
			return;
		}
		//	
	
	
	*/
	
	
	
	
}
