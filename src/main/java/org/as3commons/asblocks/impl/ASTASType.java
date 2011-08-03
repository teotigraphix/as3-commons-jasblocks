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
import org.as3commons.asblocks.dom.ASQName;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASImportStatement;
import org.as3commons.asblocks.dom.IASIncludeStatement;
import org.as3commons.asblocks.dom.IASPackage;
import org.as3commons.asblocks.dom.IASType;
import org.as3commons.asblocks.dom.IASUseStatement;
import org.as3commons.asblocks.dom.IDocComment;
import org.as3commons.asblocks.dom.Visibility;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public abstract class ASTASType extends ASTScriptElement implements IASType
{
	//--------------------------------------------------------------------------
	//
	//  IASType API
	//
	//--------------------------------------------------------------------------

	@Override
	public IASPackage getParent()
	{
		return new ASTASPackage(
				(LinkedListTree) ast.getAncestor(AS3Parser.PACKAGE));
	}

	@Override
	public String getQualifiedName()
	{
		return getQName().getQualifiedName();
	}

	// XXX figure out if this really should do this
	@Override
	public String getPackageName()
	{
		String name = getParent().getName();
		if (name != null)
			return name;
		return "toplevel";
	}

	@Override
	public ASQName getQName()
	{
		IASPackage pkg = getParent();
		return new ASQName(pkg.getName(), getName());
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

	@Override
	public void setVisibility(Visibility value)
	{
		ModifierUtils.setVisibility(findModifiers(), value);
	}

	@Override
	public String getName()
	{
		ASTIterator i = new ASTIterator(findDeclaration());
		return i.find(AS3Parser.IDENT).getText();
	}

	@Override
	public void setName(String value)
	{
		if (value == null)
		{
			throw new ASBlocksSyntaxError("Type name must not be null");
		}
		ASTIterator i = new ASTIterator(findDeclaration());
		i.find(AS3Parser.IDENT);
		i.replace(ASTUtils.newAST(AS3Parser.IDENT, value));
	}
	
	protected LinkedListTree findDeclaration()
	{
		return ast;
	}
	
	//--------------------------------------------------------------------------
	//
	//  IDocCommentAware API
	//
	//--------------------------------------------------------------------------

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

	//--------------------------------------------------------------------------
	//
	//  IImportAware API
	//
	//--------------------------------------------------------------------------

	@Override
	public IASImportStatement newImport(IASExpression target)
	{
		return ImportUtils.newImport(target);
	}

	@Override
	public IASImportStatement parseImport(String target)
	{
		return ImportUtils.parseImport(findTypeBlock(), target);
	}

	@Override
	public IASImportStatement removeImport(String target)
	{
		return ImportUtils.removeImport(findTypeBlock(), target);
	}

	@Override
	public List<IASImportStatement> getImports()
	{
		return ImportUtils.getImports(findTypeBlock());
	}

	//--------------------------------------------------------------------------
	//
	//  IIncludeAware API
	//
	//--------------------------------------------------------------------------

	@Override
	public IASIncludeStatement newInclude(IASExpression path)
	{
		return IncludeUtils.newInclude(findTypeBlock(), path);
	}

	@Override
	public IASIncludeStatement parseInclude(String path)
	{
		return IncludeUtils.parseInclude(findTypeBlock(), path);
	}

	@Override
	public IASIncludeStatement removeInclude(String path)
	{
		return IncludeUtils.removeInclude(findTypeBlock(), path);
	}

	@Override
	public List<IASIncludeStatement> getIncludes()
	{
		return IncludeUtils.getIncludes(findTypeBlock());
	}

	//--------------------------------------------------------------------------
	//
	//  IUseAware API
	//
	//--------------------------------------------------------------------------

	@Override
	public IASUseStatement newUse(IASExpression name)
	{
		return UseUtils.newUse(findTypeBlock(), name);
	}

	@Override
	public IASUseStatement parseUse(String name)
	{
		return UseUtils.parseUse(findTypeBlock(), name);
	}

	@Override
	public IASUseStatement removeUse(String name)
	{
		return UseUtils.removeUse(findTypeBlock(), name);
	}

	@Override
	public List<IASUseStatement> getUses()
	{
		return UseUtils.getUses(findTypeBlock());
	}

	//--------------------------------------------------------------------------
	//
	//  Constructor
	//
	//--------------------------------------------------------------------------

	/**
	 * Constructor.
	 * 
	 * COMPILATION_UNIT/PACKAGE/BLOCK/CLASS_DEF
	 */
	public ASTASType(LinkedListTree ast)
	{
		super(ast);
	}

	protected ASTIterator blockIterator()
	{
		return new ASTIterator(findTypeBlock());
	}

	protected LinkedListTree findTypeBlock()
	{
		return ASTUtils.findChildByType(ast, AS3Parser.TYPE_BLOCK);
	}

	protected LinkedListTree findModifiers()
	{
		return ASTUtils.findChildByType(ast, AS3Parser.MODIFIERS);
	}
}
