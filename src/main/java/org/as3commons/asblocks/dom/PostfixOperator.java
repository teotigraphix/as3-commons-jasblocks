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

import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

/**
 * A postfix operator.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public enum PostfixOperator
{
	/**
	 * The <code>--</code> postfix.
	 */
	POSTDEC(AS3Parser.POST_DEC, "--"),

	/**
	 * The <code>++</code> postfix.
	 */
	POSTINC(AS3Parser.POST_INC, "++");

	private final int type;

	private final String operator;

	PostfixOperator(int type, String operator)
	{
		this.type = type;
		this.operator = operator;
	}

	/**
	 * The <code>String</code> operator.
	 */
	public String getOperator()
	{
		return operator;
	}

	/**
	 * The <code>AS3Parser</code> type.
	 */
	public int getType()
	{
		return type;
	}
}
