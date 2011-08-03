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

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.dom.IASAccessor;
import org.as3commons.asblocks.dom.IASMember;
import org.as3commons.asblocks.dom.IASMetaTag;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASType;
import org.as3commons.asblocks.dom.IDocComment;
import org.as3commons.asblocks.dom.Visibility;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public abstract class ASTASMember extends ASTScriptElement implements IASMember
{
	@SuppressWarnings("unused")
	private static final int INDEX_DEF = 2;

	private static final int INDEX_DECL = 3;

	public ASTASMember(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public IASType getParent()
	{
		return TypeBuilder.build(ast.getParent().getParent());
	}

	@Override
	public String getPackageName()
	{
		return getParent().getPackageName();
	}

	@Override
	public String getQualifiedName()
	{
		String tail = "";
		if (this instanceof IASMethod)
		{
			if (!(this instanceof IASAccessor))
				tail += "()";
		}
		return getParent().getQualifiedName() + "#" + getName() + tail;
	}

	@Override
	public String getName()
	{
		return findIdent().getText();
	}

	@Override
	public void setName(String value)
	{
		if (value.indexOf('.') != -1)
		{
			throw new ASBlocksSyntaxError("field name must not contain '.'");
		}
		findIdent().token.setText(value);
	}

	@Override
	public String getType()
	{
		//LinkedListTree decl = findDeclaration();
		LinkedListTree typeSpec = findType();
		if (typeSpec == null)
			return null;
		return ASTUtils.typeSpecText(typeSpec);
	}

	@Override
	public void setType(String typeName)
	{
		LinkedListTree decl = findDeclaration();
		LinkedListTree typeSpec = ASTUtils.findChildByType(decl, AS3Parser.TYPE_SPEC);
		if (typeSpec == null)
		{
			if (typeName != null)
			{
				decl.addChildWithTokens(AS3FragmentParser.parseTypeSpec(typeName));
			}
		}
		else
		{
			if (typeName == null)
			{
				decl.deleteChild(1);
			}
			else
			{
				decl.setChildWithTokens(1, AS3FragmentParser.parseTypeSpec(typeName));
			}
		}
	}

	@Override
	public List<String> getModifiers()
	{
		return ModifierUtils.getModifiers(findModifiers());
	}

	@Override
	public boolean hasModifier(String modifier)
	{
		return ModifierUtils.hasModifier(findModifiers(), modifier);
	}

	@Override
	public Visibility getVisibility()
	{
		return ModifierUtils.getVisibility(findModifiers());
	}

	public void setVisibility(Visibility protection)
	{
		ModifierUtils.setVisibility(findModifiers(), protection);
	}

	@Override
	public boolean hasNamespaceVisibility()
	{
		LinkedListTree modifiers = findModifiers();
		return ASTUtils.findChildByType(modifiers, AS3Parser.IDENT) != null;
	}

	@Override
	public void setNamespaceVisibility(String namespace)
	{
		ModifierUtils.setNamespace(findModifiers(), namespace);
	}

	@Override
	public String getNamespaceVisibility()
	{
		return ModifierUtils.getNamespace(findModifiers());
	}

	@Override
	public boolean isStatic()
	{
		LinkedListTree modifiers = findModifiers();
		return ASTUtils.findChildByType(modifiers, AS3Parser.STATIC) != null;
	}

	@Override
	public void setStatic(boolean s)
	{
		for (ASTIterator i = modifierIterator(); i.hasNext();)
		{
			LinkedListTree mod = i.next();
			if (mod.getType() == AS3Parser.STATIC)
			{
				if (!s)
				{
					i.remove();
				}
				return;
			}
		}
		if (s)
		{
			LinkedListTree modifiers = findModifiers();
			LinkedListTree modStatic = ASTUtils.newAST(AS3Parser.STATIC, "static");
			modStatic.appendToken(TokenBuilder.newSpace());
			modifiers.addChildWithTokens(modStatic);
		}
	}

	@Override
	public List<IASMetaTag> getMetaTags()
	{
		return MetaTagUtils.getAllMetaTags(ast);
	}

	@Override
	public IASMetaTag newMetaTag(String name)
	{
		return MetaTagUtils.newMetaTag(ast, name);
	}

	@Override
	public IASMetaTag getMetaTag(String name)
	{
		return MetaTagUtils.getFirstMetaTag(ast, name);
	}

	@Override
	public List<IASMetaTag> getAllMetaTags(String name)
	{
		return MetaTagUtils.getMetaTagWithName(ast, name);
	}

	@Override
	public boolean hasMetaTag(String name)
	{
		return MetaTagUtils.hasMetaTag(ast, name);
	}

	@Override
	public boolean removeMetaTag(IASMetaTag metaTag)
	{
		return MetaTagUtils.removeMetaTag(((ASTASMetaTag) metaTag).getAST());
	}

	@Override
	public String getDescription()
	{
		return getDocumentation().getDescription();
	}

	@Override
	public void setDescription(String description)
	{
		getDocumentation().setDescription(description);
	}

	@Override
	public IDocComment getDocumentation()
	{
		return DocumentationUtils.createDocComment(ast);
	}

	private LinkedListTree findDeclaration()
	{
		return (LinkedListTree) ast.getChild(INDEX_DECL);
	}

	protected LinkedListTree findIdent()
	{
		return findDeclaration().getFirstChild();
	}

	private LinkedListTree findType()
	{
		return (LinkedListTree) findDeclaration().getChild(1);
	}

	protected LinkedListTree findModifiers()
	{
		return ASTUtils.findChildByType(ast, AS3Parser.MODIFIERS);
	}

	private ASTIterator modifierIterator()
	{
		return new ASTIterator(findModifiers());
	}

}