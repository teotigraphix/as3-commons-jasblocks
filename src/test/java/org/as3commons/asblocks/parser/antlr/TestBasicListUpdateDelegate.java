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

package org.as3commons.asblocks.parser.antlr;

import org.as3commons.asblocks.impl.AS3FragmentParser;
import org.as3commons.asblocks.impl.ASTUtils;
import org.as3commons.asblocks.impl.TokenBuilder;
import org.as3commons.asblocks.parser.antlr.BasicListUpdateDelegate;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;
import org.junit.Test;

import junit.framework.TestCase;

public class TestBasicListUpdateDelegate extends TestCase
{

	@Test
	public void test_replacedChild()
	{
		BasicListUpdateDelegate delegate = new BasicListUpdateDelegate();
		LinkedListTree parent = ASTUtils.newImaginaryAST(AS3Parser.TYPE_SPEC);
		int index = 0;
		LinkedListTree oldChild = ASTUtils.newAST(AS3Parser.IDENT, "foo");
		parent.addChildWithTokens(oldChild);
		LinkedListToken space = TokenBuilder.newSpace();
		parent.addToken(0, space);
		LinkedListToken semi = TokenBuilder.newSemi();
		parent.appendToken(semi);
		// check preconditions,
		assertEquals(space, parent.getStartToken());
		assertEquals(semi, parent.getStopToken());

		LinkedListTree child = AS3FragmentParser.parseTypeSpec("void")
				.getFirstChild();

		// make the change,
		delegate.replacedChild(parent, index, child, oldChild);

		// check postconditions,
		assertEquals(space, parent.getStartToken());
		assertEquals(semi, parent.getStopToken());
		assertNotNull(space.getNext());
		assertEquals("void", space.getNext().getText());
		assertSame(semi, space.getNext().getNext());
	}

}
