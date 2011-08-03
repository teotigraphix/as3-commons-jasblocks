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

import org.as3commons.asblocks.parser.antlr.LinkedListToken;

import junit.framework.TestCase;

public class TestLinkedListToken extends TestCase {
	public void testSetNext() {
		LinkedListToken tok = new LinkedListToken(1, "test");
		tok.setNext(null);  // should ne ok
		try {
			tok.setNext(tok);
			fail("Setting [token].next to [token] should fail, otherwise we get an infinite loop");
		} catch (Exception e) {
			// expected
		}
	}
	public void testSetPrev() {
		LinkedListToken tok = new LinkedListToken(1, "test");
		tok.setPrev(null);  // should ne ok
		try {
			tok.setPrev(tok);
			fail("Setting [token].prev to [token] should fail, otherwise we get an infinite loop");
		} catch (Exception e) {
			// expected
		}
	}
}
