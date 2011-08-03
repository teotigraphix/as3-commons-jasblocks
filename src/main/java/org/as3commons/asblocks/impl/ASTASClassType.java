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

import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASField;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.Visibility;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASClassType extends ASTASType implements IASClassType
{
	private static final int EXTENDS_INDEX = 2;

	public ASTASClassType(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public boolean isSubType()
	{
		return getSuperClass() != null;
	}

	@Override
	public boolean isDynamic()
	{
		return ModifierUtils.isDynamic(findModifiers());
	}

	@Override
	public void setDynamic(boolean value)
	{
		ModifierUtils.setDynamic(findModifiers(), value);
	}

	@Override
	public boolean isFinal()
	{
		return ModifierUtils.isFinal(findModifiers());
	}

	@Override
	public void setFinal(boolean value)
	{
		ModifierUtils.setFinal(findModifiers(), value);
	}

	@Override
	public String getSuperClass()
	{
		LinkedListTree ext = ASTUtils.findChildByType(ast, AS3Parser.EXTENDS);
		if (ext == null)
			return null;
		return ASTUtils.typeText(ext.getFirstChild());
	}

	@Override
	public void setSuperClass(String value)
	{
		if (value == null)
		{
			removeExtendsClause();
			return;
		}
		LinkedListTree extendsAST = ASTUtils.findChildByType(ast, AS3Parser.EXTENDS);
		LinkedListTree superType = AS3FragmentParser.parseType(value);
		if (extendsAST == null)
		{
			extendsAST = ASTUtils.newAST(AS3Parser.EXTENDS, "extends");
			// add the space in front of the 'extends' keyword
			extendsAST.appendToken(TokenBuilder.newSpace());

			LinkedListToken spaceTok = TokenBuilder.newSpace();

			extendsAST.getStartToken().prependToken(spaceTok);
			// reset the extends start token to the space so that when the
			// key word is removed, the space dies with it
			extendsAST.setStartToken(spaceTok);
			// add the extends node to the CLASS_DEF node
			ast.addChildAtWithTokens(EXTENDS_INDEX, extendsAST);
			extendsAST.addChildWithTokens(superType);
			// add a space after the identifier, this automatically gets
			// set as the nodes stop token, dies with it
			//extendsAST.appendToken(TokenBuilder.newSpace());
		}
		else
		{
			// replace the existing type node
			extendsAST.setChildWithTokens(0, superType);
		}
	}

	@Override
	public List<String> getImplementedInterfaces()
	{
		List<String> results = new LinkedList<String>();
		LinkedListTree impls = ASTUtils.findChildByType(ast, AS3Parser.IMPLEMENTS);
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
	public boolean hasImplementations()
	{
		return ASTUtils.findChildByType(ast, AS3Parser.IMPLEMENTS) != null;
	}

	@Override
	public boolean addImplementedInterface(String interfaceName)
	{
		LinkedListTree iface = AS3FragmentParser.parseType(interfaceName);
		LinkedListTree impls = ASTUtils.findChildByType(ast, AS3Parser.IMPLEMENTS);
		if (impls == null)
		{
			ASTIterator i = new ASTIterator(ast);
			i.find(AS3Parser.TYPE_BLOCK);
			impls = ASTUtils.newAST(AS3Parser.IMPLEMENTS, "implements");
			i.insertBeforeCurrent(impls);
			LinkedListToken sp = TokenBuilder.newSpace();
			impls.getStartToken().prependToken(sp);
		}
		else
		{
			impls.appendToken(TokenBuilder.newComma());
		}
		impls.appendToken(TokenBuilder.newSpace());
		impls.addChildWithTokens(iface);
		return true;
	}

	@Override
	public boolean removeImplementedInterface(String interfaceName)
	{
		LinkedListTree impls = ASTUtils.findChildByType(ast, AS3Parser.IMPLEMENTS);
		int count = 0;
		for (ASTIterator i = new ASTIterator(impls); i.hasNext();)
		{
			LinkedListTree iface = i.next();
			String name = ASTUtils.typeText(iface);
			if (name.equals(interfaceName))
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

	@Override
	public List<IASMethod> getMethods()
	{
		return MethodAwareUtils.getMethods(ast);
	}

	@Override
	public IASMethod newMethod(String name, Visibility visibility,
			String returnType)
	{
		IASMethod method = ASTTypeBuilder.newClassMethod(name, visibility, returnType);
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
		return newMethod(name, Visibility.DEFAULT, null);
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
	public List<IASField> getFields()
	{
		List<IASField> results = new LinkedList<IASField>();
		for (ASTIterator i = blockIterator(); i.hasNext();)
		{
			LinkedListTree member = i.next();
			if (member.getType() == AS3Parser.FIELD_DEF)
			{
				results.add(new ASTASField(member));
			}
		}
		return Collections.unmodifiableList(results);
	}

	@Override
	public IASField newField(String name, Visibility visibility, String type)
	{
		IASField field = ASTTypeBuilder.newField(name, visibility, type);
		addField(field);
		return field;
	}

	@Override
	public IASField newField(String name, Visibility visibility)
	{
		return newField(name, visibility, null);
	}

	@Override
	public IASField newField(String name)
	{
		return newField(name, Visibility.DEFAULT, null);
	}

	public void addField(IASField field)
	{
		ASTUtils.addChildWithIndentation(findTypeBlock(), ((ASTScriptElement) field).getAST());
	}

	@Override
	public IASField getField(String name)
	{
		for (ASTIterator i = blockIterator(); i.hasNext();)
		{
			LinkedListTree member = i.next();
			if (member.getType() == AS3Parser.FIELD_DEF)
			{
				IASField field = new ASTASField(member);
				if (field.getName().equals(name))
				{
					return field;
				}
			}
		}
		return null;
	}

	@Override
	public IASField removeField(String name)
	{
		for (ASTIterator i = blockIterator(); i.hasNext();)
		{
			LinkedListTree member = i.next();
			if (member.getType() == AS3Parser.FIELD_DEF)
			{
				IASField field = new ASTASField(member);
				if (field.getName().equals(name))
				{
					i.remove();
					return field;
				}
			}
		}
		return null;
	}

	private void removeExtendsClause()
	{
		for (ASTIterator i = new ASTIterator(ast); i.hasNext();)
		{
			LinkedListTree node = i.next();
			if (node.getType() == AS3Parser.EXTENDS)
			{
				i.remove();
				break;
			}
		}
	}
}
