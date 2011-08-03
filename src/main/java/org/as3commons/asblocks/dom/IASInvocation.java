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

package org.as3commons.asblocks.dom;

import java.util.List;

/**
 * An invocation expression target( arguments ); <code>super(arg0, arg1)</code>, 
 * <code>new Class(arg)</code>, <code>foo(arg0)</code> etc.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public abstract interface IASInvocation
{
	//--------------------------------------------------------------------------
	//
	//  Properties
	//
	//--------------------------------------------------------------------------
	
	//----------------------------------
	//  target
	//----------------------------------
	
	/**
	 * The target expression of the invocation, before the <code>()</code>.
	 */
	public IASExpression getTarget();
	
	/**
	 * @see #getTarget()
	 * 
	 * @param value The target <code>IASExpression</code>.
	 */
	public void setTarget(IASExpression value);
	
	//----------------------------------
	//  arguments
	//----------------------------------
	
	/**
	 * The <code>List</code> of <code>IASExpression</code> arguments of the 
	 * invocation, found between the <code>(args,...)</code>.
	 */
	public List<IASExpression> getArguments();
	
	/**
	 * @see #getArguments()
	 * 
	 * @param value The <code>List</code> of <code>IASExpression</code> arguments.
	 */
	public void setArguments(List<IASExpression> value);
}
