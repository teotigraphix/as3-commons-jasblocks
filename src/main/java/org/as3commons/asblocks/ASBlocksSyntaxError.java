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

package org.as3commons.asblocks;

/**
 * Thrown when ActionScript code which is syntactically invalid is encountered.
 * 
 * <p>The <code>cause</code>, if defined, may contain further details 
 * describing what syntactic problem was encountered.</p>
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public class ASBlocksSyntaxError extends RuntimeException
{
	private static final long serialVersionUID = 7305782494096145164L;

	/**
	 * Constructs a new ASBlocksSyntaxError with the specified detail message.
	 * 
	 * @param message
	 */
	public ASBlocksSyntaxError(String message)
	{
		super(message);
	}

	/**
	 * Constructs a new ASBlocksSyntaxError with the specified cause.
	 * 
	 * @param e
	 */
	public ASBlocksSyntaxError(Exception e)
	{
		super(e);
	}

	/**
	 * Constructs a new ASBlocksSyntaxError with the specified detail message
	 * and the specified cause.
	 * 
	 * @param message
	 * @param e
	 */
	public ASBlocksSyntaxError(String message, Exception e)
	{
		super(message);
	}
}
