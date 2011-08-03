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

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.as3commons.asblocks.dom.IASInterfaceType;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.Visibility;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASInterfaceType extends ASTASType implements IASInterfaceType
{
	private static final int EXTENDS_INDEX = 2;

	public ASTASInterfaceType(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public boolean isSubType()
	{
		return getSuperInterfaces().size() > 0;
	}

	@Override
	public List<IASMethod> getMethods()
	{
		return MethodAwareUtils.getMethods(ast);
	}

	@Override
	public IASMethod newMethod(String name, Visibility visibility,
			String returnType)
	{
		IASMethod method = ASTTypeBuilder.newInterfaceMethod(name, visibility, returnType);
		addMethod(method);
		return method;
	}

	@Override
	public IASMethod newMethod(String name, Visibility visibility)
	{
		return newMethod(name, visibility, null);
	}

	@Override
	public IASMethod newMethod(String name)
	{
		return newMethod(name, Visibility.PUBLIC, null);
	}
	
	public void addMethod(IASMethod method)
	{
		ASTUtils.addChildWithIndentation(findTypeBlock(), ((ASTScriptElement) method).getAST());
	}

	@Override
	public IASMethod getMethod(String name)
	{
		return MethodAwareUtils.getMethod(ast, name);
	}

	@Override
	public IASMethod removeMethod(String name)
	{
		return MethodAwareUtils.removeMethod(ast, name);
	}

	@Override
	public List<String> getSuperInterfaces()
	{
		List<String> results = new LinkedList<String>();
		LinkedListTree impls = ASTUtils.findChildByType(ast, AS3Parser.EXTENDS);
		if (impls != null)
		{
			for (ASTIterator i = new ASTIterator(impls); i.hasNext();)
			{
				results.add(ASTUtils.typeText(i.next()));
			}
		}
		return Collections.unmodifiableList(results);
	}

	@Override
	public boolean addSuperInterface(String name)
	{
		LinkedListTree iface = AS3FragmentParser.parseType(name);
		LinkedListTree ext = ASTUtils.findChildByType(ast, AS3Parser.EXTENDS);
		if (ext == null)
		{
			ext = ASTUtils.newAST(AS3Parser.EXTENDS, "extends");
			//ext.appendToken(TokenBuilder.newSpace());
			// hack a space in at the right point,
			LinkedListToken sp = TokenBuilder.newSpace();
			ext.getStartToken().prependToken(sp);
			ext.setStartToken(sp);
			ast.addChildAtWithTokens(EXTENDS_INDEX, ext);
		}
		else
		{
			ext.appendToken(TokenBuilder.newComma());
		}
		ext.appendToken(TokenBuilder.newSpace());
		ext.addChildWithTokens(iface);
		return true;
	}

	@Override
	public boolean removeSuperInterface(String name)
	{
		LinkedListTree impls = ASTUtils.findChildByType(ast, AS3Parser.EXTENDS);
		int count = 0;
		for (ASTIterator i = new ASTIterator(impls); i.hasNext();)
		{
			LinkedListTree iface = i.next();
			String iname = ASTUtils.typeText(iface);
			if (iname.equals(name))
			{
				if (i.hasNext())
				{
					ASTUtils.removeTrailingWhitespaceAndComma(iface.getStopToken());
				}
				else if (count == 0)
				{
					// no interfaces left, so remove the
					// 'implements' clause completely,
					ast.deleteChild(ast.getIndexOfChild(impls));
					break;
				}
				i.remove();
				if (i.hasNext())
				{
					count++;
				}
				break;
			}
			count++;
		}
		return true;
	}
}
