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

import java.io.IOException;

import org.as3commons.asblocks.impl.ASTUtils;
import org.as3commons.asblocks.impl.TokenBuilder;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;
import org.junit.Test;

import junit.framework.TestCase;

public class TestAST extends TestCase
{
	@Test
	public void test_ast() throws IOException
	{
		LinkedListTree switchStmt = ASTUtils.newAST(AS3Parser.SWITCH, "switch");
		LinkedListTree defaultStmt1 = ASTUtils.newAST(AS3Parser.DEFAULT,
				"default");
		switchStmt.addChildWithTokens(defaultStmt1);
		LinkedListToken colon = TokenBuilder.newColon();
		defaultStmt1.appendToken(colon);
		LinkedListTree stmtList = ASTUtils
				.newImaginaryAST(AS3Parser.SWITCH_STATEMENT_LIST);
		defaultStmt1.addChildWithTokens(stmtList);
		assertEquals(":", defaultStmt1.getStopToken().getText());
		assertNull(colon.getNext());

		LinkedListTree defaultStmt2 = ASTUtils.newAST(AS3Parser.DEFAULT,
				"default");
		switchStmt.addChildWithTokens(defaultStmt2);
		assertNull(((LinkedListToken) defaultStmt2.token).getNext());

		LinkedListTree semi = ASTUtils.newAST(AS3Parser.SEMI, ";");
		ASTUtils.addChildWithIndentation(stmtList, semi);
		assertEquals(semi.token, defaultStmt1.getStopToken());
		assertEquals(defaultStmt2.getStartToken(),
				((LinkedListToken) semi.token).getNext());
		// SEMI should have been inserted somewhere mid-token-stream
		assertNotNull(((LinkedListToken) semi.token).getNext());
	}
}
