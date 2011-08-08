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

import org.as3commons.asblocks.dom.IDocTag;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.asdoc.ASDocParser;

public class ASTDocTag implements IDocTag
{
	private ASTDocComment comment;
	
	private LinkedListTree ast;

	public ASTDocTag(ASTDocComment comment, LinkedListTree ast)
	{
		this.comment = comment;
		this.ast = ast;
	}

	public LinkedListTree getAST()
	{
		return ast;
	}

	public String getName()
	{
		return ast.getStartToken().getText().substring(1);
	}

	public void setName(String name)
	{
		ast.getStartToken().setText("@" + name);
		comment.commitModifiedAST();
	}
	
	public String getBody()
	{
		StringBuffer result = new StringBuffer();
		for (LinkedListToken tok = ast.getStartToken().getNext(); tok != null
				&& tok.getType() != -1; tok = tok.getNext())
		{
			result.append(stringify(tok));
			if (tok == ast.getStopToken())
			{
				break;
			}
		}
		return result.toString();
	}

	private static String stringify(LinkedListToken tok)
	{
		switch (tok.getType())
		{
		case ASDocParser.NL:
			// TODO: use the original line-ending format
			return "\n";
		default:
			return tok.getText();
		}
	}

	public void setBody(String text)
	{
		int lastIndex = ast.getChildCount() - 1;
		String indentNL = DocumentationUtils.findNewline(ast);
		LinkedListTree trailingNL = null;
		
		if (lastIndex >= 0
				&& ast.getChild(lastIndex).getType() == ASDocParser.NL)
		{
			trailingNL = (LinkedListTree) ast.getChild(lastIndex);
		}
		LinkedListTree tag = DocumentationUtils.parseParaTag(ast.getFirstChild().getText() + " " + text);
		// me : kill the EOFs after the stop token
		tag.getStopToken().setNext(null);
		// replace each NL token's text with the indent newline text
		// this effectively adds the correct * text at the line breaks
		replaceNLs(tag, indentNL);

		LinkedListTree asdocAST = ast.getParent();
		int pos = asdocAST.getIndexOfChild(ast);
		
		asdocAST.setChildWithTokens(pos, tag);

		if (trailingNL != null)
		{
			tag.addChildWithTokens(trailingNL);
		}
		
		comment.commitModifiedAST();
		
		this.ast = tag;
	}

	private void replaceNLs(LinkedListTree tree, String indentNL)
	{
		for (LinkedListToken tok = tree.getStartToken().getNext(); tok != null
				&& tok.getType() != -1; tok = tok.getNext())
		{
			if (tok.getType() == ASDocParser.NL)
			{
				tok.setText(indentNL);
			}
			if (tok == tree.getStopToken())
			{
				break;
			}
		}
	}

}