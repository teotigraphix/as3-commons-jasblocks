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
 * A default null visitor implementation that can be subclassed.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public class NullASVisitor implements IASVisitor
{
	public NullASVisitor()
	{
	}

	@Override
	public void visitProject(IASProject element)
	{
	}

	@Override
	public void visitCompilationUnit(IASCompilationUnit element)
	{
	}

	@Override
	public void visitPackage(IASPackage element)
	{
	}

	@Override
	public void visitType(IASType element)
	{
	}

	@Override
	public void visitClass(IASClassType element)
	{
	}

	@Override
	public void visitInterface(IASInterfaceType element)
	{
	}

	@Override
	public void visitFunction(IASFunctionType element)
	{
	}

	@Override
	public void visitNamespace(IASNamespaceType element)
	{
	}

	@Override
	public void visitMember(IASMember element)
	{
	}

	@Override
	public void visitMethod(IASMethod element)
	{
	}

	@Override
	public void visitField(IASField element)
	{
	}
}
