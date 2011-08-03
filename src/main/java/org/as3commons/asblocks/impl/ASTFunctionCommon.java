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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.as3commons.asblocks.dom.IASParameter;
import org.as3commons.asblocks.dom.IFunctionCommon;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTFunctionCommon implements IFunctionCommon
{
	public static final String ELLIPSIS = "...";

	private LinkedListTree ast;

	public ASTFunctionCommon(LinkedListTree ast)
	{
		this.ast = ast;
	}

	@Override
	public List<IASParameter> getParameters()
	{
		List<IASParameter> results = new ArrayList<IASParameter>();
		LinkedListTree params = ASTUtils.findChildByType(ast, AS3Parser.PARAMS);
		for (ASTIterator i = new ASTIterator(params); i.hasNext();)
		{
			results.add(new ASTASParameter(i.next()));
		}
		return Collections.unmodifiableList(results);
	}

	@Override
	public String getType()
	{
		LinkedListTree typeSpec = ASTUtils.findChildByType(ast, AS3Parser.TYPE_SPEC);
		if (typeSpec == null)
			return null;
		return ASTUtils.typeSpecText(typeSpec);
	}

	@Override
	public void setType(String value)
	{
		LinkedListTree type = ASTUtils.findChildByType(ast, AS3Parser.TYPE_SPEC);
		if (value == null)
		{
			if (type != null)
			{
				ast.deleteChild(ast.getIndexOfChild(type));
			}
			return;
		}
		LinkedListTree newType = AS3FragmentParser.parseTypeSpec(value);
		if (type == null)
		{
			ast.addChildAtWithTokens(ast.getChildCount() - 1, newType);
		}
		else
		{
			int index = ast.getIndexOfChild(type);
			ast.setChildWithTokens(index, newType);
		}
	}

	@Override
	public IASParameter addParameter(String name, String type,
			String defaultValue)
	{
		LinkedListTree paramAST = ASTUtils.newImaginaryAST(AS3Parser.PARAM);
		paramAST.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, name));
		if (type != null)
		{
			paramAST.addChildWithTokens(AS3FragmentParser.parseTypeSpec(type));
		}

		IASParameter p = param(paramAST);

		if (defaultValue != null)
		{
			p.setDefaultValue(defaultValue);
		}

		return p;
	}

	@Override
	public IASParameter addParameter(String name, String type)
	{
		LinkedListTree paramAST = ASTUtils.newImaginaryAST(AS3Parser.PARAM);
		paramAST.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, name));
		if (type != null)
		{
			paramAST.addChildWithTokens(AS3FragmentParser.parseTypeSpec(type));
		}
		return param(paramAST);
	}

	private IASParameter param(LinkedListTree param)
	{
		LinkedListTree params = findParams();
		if (params.getChildCount() > 0)
		{
			params.appendToken(TokenBuilder.newComma());
			params.appendToken(TokenBuilder.newSpace());
		}
		params.addChildWithTokens(param);
		return new ASTASParameter(param);
	}

	@Override
	public IASParameter removeParameter(String name)
	{
		LinkedListTree params = ASTUtils.findChildByType(ast, AS3Parser.PARAMS);
		int count = 0;
		for (ASTIterator i = new ASTIterator(params); i.hasNext();)
		{
			LinkedListTree ast = i.next();
			ASTASParameter arg = new ASTASParameter(ast);
			if (arg.getName().equals(name))
			{
				if (i.hasNext())
				{
					ASTUtils.removeTrailingWhitespaceAndComma(ast.getStopToken());
				}
				else if (count > 0)
				{
					ASTUtils.removePreceedingWhitespaceAndComma(ast.getStartToken());
				}
				i.remove();
				return arg;
			}
			count++;
		}
		return null;
	}

	@Override
	public IASParameter addRestParameter(String name)
	{
		if (ELLIPSIS.equals(name))
		{
			return addAnonRestParam();
		}
		return addNamedRestParam(name);
	}

	@Override
	public boolean hasParameters()
	{
		return getParameters().size() > 0;
	}

	private IASParameter addAnonRestParam()
	{
		LinkedListTree paramAST = ASTUtils.newImaginaryAST(AS3Parser.PARAM);
		paramAST.addChildWithTokens(ASTUtils.newAST(AS3Parser.REST, ELLIPSIS));
		return param(paramAST);
	}

	private IASParameter addNamedRestParam(String name)
	{
		LinkedListTree paramAST = ASTUtils.newImaginaryAST(AS3Parser.PARAM);
		paramAST.addChildWithTokens(ASTUtils.newAST(AS3Parser.REST, ELLIPSIS));
		paramAST.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, name));
		return param(paramAST);
	}

	private LinkedListTree findParams()
	{
		return ASTUtils.findChildByType(ast, AS3Parser.PARAMS);
	}

}
