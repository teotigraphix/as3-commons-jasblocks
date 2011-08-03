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

import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.BinaryOperator;
import org.as3commons.asblocks.dom.IASBinaryExpression;
import org.as3commons.asblocks.dom.IASExpression;

import junit.framework.TestCase;

public class ParentheticExpressionTests extends TestCase
{
	private ASFactory fact = new ASFactory();

	public void testBasic()
	{
		// pathenthesized expressions control evaluation order, but
		// don't have any other meaning, therefore asblocks doesn't
		// expose them in the DOM, except in their implied effect on
		// the expression tree structure.
		IASExpression expr = fact.newExpression("(1+1)");
		assertTrue(expr instanceof IASBinaryExpression);
		assertEquals(BinaryOperator.ADD,
				((IASBinaryExpression) expr).getOperator());
	}
}
