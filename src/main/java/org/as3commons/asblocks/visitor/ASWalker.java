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

package org.as3commons.asblocks.visitor;

import org.as3commons.asblocks.IASProject;
import org.as3commons.asblocks.IASVisitor;
import org.as3commons.asblocks.IASWalker;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASField;
import org.as3commons.asblocks.dom.IASFunctionType;
import org.as3commons.asblocks.dom.IASInterfaceType;
import org.as3commons.asblocks.dom.IASMember;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASNamespaceType;
import org.as3commons.asblocks.dom.IASPackage;
import org.as3commons.asblocks.dom.IASType;

/**
 * Default implementation of the <code>IASWalker</code> API.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public class ASWalker implements IASWalker
{
	//--------------------------------------------------------------------------
	//
	//  Protected :: Variables
	//
	//--------------------------------------------------------------------------
	
	/**
	 * @private
	 */
	protected IASVisitor visitor;
	
	//--------------------------------------------------------------------------
	//
	//  Constructor
	//
	//--------------------------------------------------------------------------
	
	/**
	 * Constructor.
	 */
	public ASWalker(IASVisitor visitor)
	{
		this.visitor = visitor;
	}
	
	//--------------------------------------------------------------------------
	//
	//  IASWalker API :: Methods
	//
	//--------------------------------------------------------------------------
	
	/**
	 * @see org.as3commons.asblocks.IASWalker#walkProject(IASProject)
	 */
	public void walkProject(IASProject element)
	{
		visitor.visitProject(element);
		
		for (IASCompilationUnit unit : element.getCompilationUnits())
		{
			walkCompilationUnit(unit);
		}
	}
	
	/**
	 * @see org.as3commons.asblocks.IASWalker#walkCompilationUnit(IASCompilationUnit)
	 */
	public void walkCompilationUnit(IASCompilationUnit element)
	{
		visitor.visitCompilationUnit(element);
		walkPackage(element.getPackage());
	}
	
	/**
	 * @see org.as3commons.asblocks.IASWalker#walkPackage(IASPackage)
	 */
	public void walkPackage(IASPackage element)
	{
		visitor.visitPackage(element);
		walkType(element.getType());
	}
	
	/**
	 * @see org.as3commons.asblocks.IASWalker#walkType(IASType)
	 */
	public void walkType(IASType element)
	{
		visitor.visitType(element);
		if (element instanceof IASClassType)
		{
			walkClass((IASClassType)element);
		}
		else if (element instanceof IASInterfaceType)
		{
			walkInterface((IASInterfaceType)element);
		}
		else if (element instanceof IASFunctionType)
		{
			walkFunction((IASFunctionType)element);
		}
		else if (element instanceof IASNamespaceType)
		{
			walkNamespace((IASNamespaceType)element);
		}
	}
	
	/**
	 * @see org.as3commons.asblocks.IASWalker#walkClass(IASClassType)
	 */
	public void walkClass(IASClassType element)
	{
		visitor.visitClass(element);
		
		for (IASField field : element.getFields())
		{
			walkMember(field);
			walkField(field);
		}
		
		for (IASMethod method : element.getMethods())
		{
			walkMember(method);
			walkMethod(method);
		}
	}
	
	/**
	 * @see org.as3commons.asblocks.IASWalker#walkInterface(IASInterfaceType)
	 */
	public void walkInterface(IASInterfaceType element)
	{
		visitor.visitInterface(element);
		
		for (IASMethod method : element.getMethods())
		{
			walkMember(method);
			walkMethod(method);
		}
	}
	
	/**
	 * @see org.as3commons.asblocks.IASWalker#walkFunction(IASFunctionType)
	 */
	public void walkFunction(IASFunctionType element)
	{
		visitor.visitFunction(element);
	}
	
	/**
	 * @see org.as3commons.asblocks.IASWalker#walkNamespace(IASNamespaceType)
	 */
	public void walkNamespace(IASNamespaceType element)
	{
		visitor.visitNamespace(element);
	}
	
	/**
	 * @see org.as3commons.asblocks.IASWalker#visitMember(IASMember)
	 */
	public void walkMember(IASMember element)
	{
		visitor.visitMember(element);
	}
	
	/**
	 * @see org.as3commons.asblocks.IASWalker#visitMethod(IASMethod)
	 */
	public void walkMethod(IASMethod element)
	{
		visitor.visitMethod(element);
	}
	
	/**
	 * @see org.as3commons.asblocks.IASWalker#walkField(IASField)
	 */
	public void walkField(IASField element)
	{
		visitor.visitField(element);
	}
}
