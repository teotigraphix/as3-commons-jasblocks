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

import java.io.PrintWriter;
import java.io.Writer;

import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

public class ASTPrinter
{

	PrintWriter out;

	public ASTPrinter(Writer out)
	{
		this.out = new PrintWriter(out);
	}

	public void print(LinkedListTree ast)
	{
		for (LinkedListToken tok = findStart(ast); tok != null; tok = tok
				.getNext())
		{
			print(tok);
		}
	}

	private LinkedListToken findStart(LinkedListTree ast)
	{
		LinkedListToken result = null;
		for (LinkedListToken tok = ast.getStartToken(); viable(tok); tok = tok
				.getPrev())
		{
			result = tok;
		}
		return result;
	}

	private boolean viable(LinkedListToken tok)
	{
		return tok != null && tok.getType() != -1/*LinkedListToken.EOF*/;
	}

	private void print(LinkedListToken tok)
	{
		// XXX the  && tok.getType() != -1 was added by me, find out why
		// there are 2 EOF at the end of the parse AST
		if (tok.getText() != null && tok.getType() != -1)
		{
			out.write(tok.getText());
		}
	}
}