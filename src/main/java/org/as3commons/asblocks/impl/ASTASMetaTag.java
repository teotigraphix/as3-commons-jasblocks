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

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.dom.IASMetaTag;
import org.as3commons.asblocks.dom.IDocComment;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASMetaTag extends ASTScriptElement implements IASMetaTag
{
	public ASTASMetaTag(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public String getDescription()
	{
		return getDocumentation().getDescription();
	}

	@Override
	public void setDescription(String value)
	{
		getDocumentation().setDescription(value);
	}

	@Override
	public IDocComment getDocumentation()
	{
		return DocumentationUtils.createDocComment(ast);
	}

	@Override
	public String getName()
	{
		return ast.getFirstChild().getText();
	}

	@Override
	public String getPackageName()
	{
		// TODO implememtn ASTASMetaTag.getPackageName()
		return "TODO";
	}

	@Override
	public String getQualifiedName()
	{
		// TODO implememtn ASTASMetaTag.getQualifiedName()
		return "TODO";
	}

	@Override
	public List<Object> getParameters()
	{
		LinkedListTree params = findParams();
		if (params == null)
		{
			return Collections.emptyList();
		}
		List<Object> result = new ArrayList<Object>();
		for (ASTIterator i = new ASTIterator(params); i.hasNext();)
		{
			LinkedListTree param = i.next();
			result.add(toParamValue(param));
		}
		return result;
	}

	@Override
	public Object getParameterValue(String name)
	{
		LinkedListTree params = findParams();
		if (params == null)
		{
			return null;
		}
		for (ASTIterator i = new ASTIterator(params); i.hasNext();)
		{
			LinkedListTree child = i.next();
			if (child.getType() == AS3Parser.ASSIGN)
			{
				if (child.getFirstChild().getText().equals(name))
				{
					return toParamValue(child.getLastChild());
				}
			}
		}
		return null;
	}

	@Override
	public void addStringParam(String value, String name)
	{
		addParam(name, toAST(value));
	}

	@Override
	public void addStringParam(String value)
	{
		addParamAST(toAST(value));
	}

	@Override
	public void addIntParam(int value, String name)
	{
		addParam(name, toAST(value));
	}

	@Override
	public void addIntParam(int value)
	{
		addParamAST(toAST(value));
	}

	@Override
	public void addBooleanParam(Boolean value, String name)
	{
		addParam(name, toAST(value));
	}

	@Override
	public void addBooleanParam(Boolean value)
	{
		addParamAST(toAST(value));
	}

	private void addParamAST(LinkedListTree str)
	{
		LinkedListTree params = findOrAddParams();
		if (params.getChildCount() > 0)
		{
			params.appendToken(TokenBuilder.newComma());
			params.appendToken(TokenBuilder.newSpace());
		}
		params.addChildWithTokens(str);
	}

	private void addParam(String name, LinkedListTree val)
	{
		LinkedListTree assign = ASTUtils.newImaginaryAST(AS3Parser.ASSIGN);
		LinkedListTree ident = ASTUtils.newAST(AS3Parser.IDENT, name);
		assign.addChildWithTokens(ident);
		LinkedListToken assignToken = new LinkedListToken(AS3Parser.ASSIGN, "=");
		assign.appendToken(assignToken);
		assign.token = assignToken;
		assign.addChildWithTokens(val);

		addParamAST(assign);
	}

	private static Object toParamValue(LinkedListTree child)
	{
		switch (child.getType())
		{
		case AS3Parser.STRING_LITERAL:
			return ASTUtils.decodeStringLiteral(child.getText());
		case AS3Parser.TRUE:
			return Boolean.TRUE;
		case AS3Parser.FALSE:
			return Boolean.FALSE;
		case AS3Parser.DECIMAL_LITERAL:
			return Integer.valueOf(child.getText());
		case AS3Parser.ASSIGN:
			return new ASTASParameter(child);
		default:
			throw new ASBlocksSyntaxError("Unexpected type "
					+ ASTUtils.tokenNameFromAST(child));
		}
	}

	private LinkedListTree findOrAddParams()
	{
		LinkedListTree params = findParams();
		if (params == null)
		{
			params = ASTUtils.newParentheticAST(AS3Parser.METATAG_PARAMS, AS3Parser.LPAREN, "(", AS3Parser.RPAREN, ")");
			ast.addChildWithTokens(params);
		}
		return params;
	}

	private LinkedListTree findParams()
	{
		return ASTUtils.findChildByType(ast, AS3Parser.METATAG_PARAMS);
	}

	private LinkedListTree toAST(int constant)
	{
		return ASTUtils.newAST(AS3Parser.DECIMAL_LITERAL, String.valueOf(constant));
	}

	private LinkedListTree toAST(boolean constant)
	{
		LinkedListTree str;
		if (constant)
		{
			str = ASTUtils.newAST(AS3Parser.TRUE, "true");
		}
		else
		{
			str = ASTUtils.newAST(AS3Parser.FALSE, "false");
		}
		return str;
	}

	private LinkedListTree toAST(String constant)
	{
		return ASTUtils.newAST(AS3Parser.STRING_LITERAL, ASTUtils.str(constant));
	}

}
