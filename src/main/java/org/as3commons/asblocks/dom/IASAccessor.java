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

import org.as3commons.asblocks.dom.IASMethod;

/**
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public interface IASAccessor extends IASMethod
{
	public IASAccessor getSibling();

	public void setSibling(IASAccessor sibling);

	/**
	 * Tests whether the property is <strong>read-write</strong>.
	 * 
	 * @return A boolean.
	 */
	public boolean isReadWrite();

	/**
	 * Tests whether the property is <strong>read-only</strong>.
	 * 
	 * @return A boolean.
	 */
	public boolean isReadOnly();

	/**
	 * Tests whether the property is <strong>write-only</strong>.
	 * 
	 * @return A boolean.
	 */
	public boolean isWriteOnly();
}
