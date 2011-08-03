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
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASParameter;
import org.as3commons.asblocks.dom.IDocComment;
import org.as3commons.asblocks.dom.IDocTag;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASParameter extends ASTScriptElement implements IASParameter
{

	public ASTASParameter(LinkedListTree ast)
	{
		super(ast);
	}

	public boolean isRest()
	{
		return ast.getFirstChild().getType() == AS3Parser.REST;
	}

	@Override
	public String getName()
	{
		LinkedListTree name = ASTUtils.findChildByType(ast, AS3Parser.IDENT);
		if (name == null)
		{
			if (isRest())
			{
				return "...";//ASTFunctionCommon.ELLIPSIS;
			}
			throw new IllegalStateException(
					"No parameter name, and not a 'rest' parameter");
		}
		return name.getText();
	}

	@Override
	public void setName(String value)
	{
		// TODO implement ASTASParameter.setName()

	}

	@Override
	public String getType()
	{
		LinkedListTree type = ASTUtils
				.findChildByType(ast, AS3Parser.TYPE_SPEC);
		if (type == null)
			return null;
		return ASTUtils.typeSpecText(type);
	}

	@Override
	public void setType(String value)
	{
		if (isRest())
		{
			throw new ASBlocksSyntaxError(
					"type specification not allowed for 'rest' parameters");
		}
		LinkedListTree type = ASTUtils
				.findChildByType(ast, AS3Parser.TYPE_SPEC);
		if (value == null)
		{
			if (type != null)
			{
				ast.deleteChild(1);
			}
			return;
		}
		LinkedListTree newType = AS3FragmentParser.parseTypeSpec(value);
		if (type == null)
		{
			ast.addChildWithTokens(newType);
		}
		else
		{
			type.setChildWithTokens(0, newType.getFirstChild());
		}
	}

	@Override
	public String getDefaultValue()
	{
		LinkedListTree assign = ASTUtils.findChildByType(ast, AS3Parser.ASSIGN);
		if (assign == null)
			return null;

		return ASTUtils.stringifyNode(assign.getFirstChild());
	}

	@Override
	public void setDefaultValue(String value)
	{
		if (isRest())
		{
			throw new ASBlocksSyntaxError(
					"default value not allowed for 'rest' parameters");
		}
		ASTIterator i = new ASTIterator(ast);
		LinkedListTree assign = i.search(AS3Parser.ASSIGN);
		if (value == null)
		{
			if (assign != null)
			{
				i.remove();
			}
			return;
		}
		LinkedListTree def = AS3FragmentParser.parseParameterDefault(value);
		if (assign == null)
		{
			ast.addChildWithTokens(def);
		}
		else
		{
			assign.setChildWithTokens(0, def.getFirstChild());
		}
	}

	public String toString()
	{
		String type = getType();
		if (type == null)
		{
			return getName();
		}
		return getName() + ":" + type;
	}

	@Override
	public String getDescription()
	{
		IDocComment doc = getMethod().getDocumentation();
		String name = getName();
		IDocTag tag = DocumentationUtils.findParam(doc, name);
		if (tag == null)
		{
			return null;
		}
		return tag.getBody().substring(name.length() + 1);
	}

	@Override
	public void setDescription(String description)
	{
		ASTDocComment doc = (ASTDocComment) getMethod().getDocumentation();
		String name = getName();
		IDocTag tag = DocumentationUtils.findParam(doc, name);
		if (tag == null)
		{
			doc.newDocTag("param", name + " " + description);
		}
		else
		{
			tag.setBody(name + " " + description);
		}
	}

	public IASMethod getMethod()
	{
		return new ASTASMethod(ast.getParent().getParent());
	}

}
