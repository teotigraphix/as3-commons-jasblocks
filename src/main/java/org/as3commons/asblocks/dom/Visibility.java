////////////////////////////////////////////////////////////////////////////////
// Copyright 2010 Michael Schmalle - Teoti Graphix, LLC
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
 * Member visibility modifiers.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public enum Visibility
{
	/**
	 * The default visibility (which is INTERNAL).
	 */
	DEFAULT("[default]"),
	
	/**
	 * A namespace visibility.
	 */
	NAMESPACE("namespace"),
	
	/**
	 * The <code>internal</code> visibility.
	 */
	INTERNAL("internal"),
	
	/**
	 * The <code>private</code> visibility.
	 */	
	PRIVATE("private"),
	
	/**
	 * The <code>protected</code> visibility.
	 */	
	PROTECTED("protected"),
	
	/**
	 * The <code>public</code> visibility.
	 */
	PUBLIC("public");

	private final String name;

	Visibility(String name)
	{
		this.name = name;
	}
	
	/**
	 * The name of the visibility.
	 * 
	 * @return The <code>String</code> name.
	 */
	public String getName()
	{
		return name;
	}
}