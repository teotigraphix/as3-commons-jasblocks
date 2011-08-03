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

/**
 * Function accessor <strong>NORMAL</strong>, <strong>GETTER</strong> and
 * <strong>SETTER</strong> roles.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 * 
 * @see org.as3commons.asblocks.dom.IASMethod#getAccessorRole()
 * @see org.as3commons.asblocks.dom.IASMethod#setAccessorRole(AccessorRole)
 */
public enum AccessorRole
{
	/**
	 * A function using the normal <code>function</code> keyword.
	 */
	NORMAL("normal"),

	/**
	 * A function using the normal <code>function [get]</code> keyword.
	 */
	GETTER("getter"),

	/**
	 * A function using the normal <code>function [set]</code> keyword.
	 */
	SETTER("setter");

	/**
	 * @private
	 */
	private final String name;

	/**
	 * @private
	 */
	AccessorRole(String name)
	{
		this.name = name;
	}

	/**
	 * The role name; either <strong>normal</strong>, <strong>getter</strong> or
	 * <strong>setter</strong>.
	 */
	public String getName()
	{
		return name;
	}
}
