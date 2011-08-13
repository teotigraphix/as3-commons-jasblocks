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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.as3commons.asblocks.dom.IDocComment;
import org.as3commons.asblocks.dom.IDocTag;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.asdoc.ASDocParser;

public class ASTDocComment extends ASTScriptElement implements IDocComment
{

	private LinkedListTree _asdoc;

	public ASTDocComment(LinkedListTree ast)
	{
		super(ast);
		_asdoc = DocumentationUtils.buildASDoc(ast);
	}

	@Override
	public String getDescription()
	{
		return DocumentationUtils.getDescriptionString(ast);
	}

	@Override
	public void setDescription(String description)
	{
		DocumentationUtils.setDescriptionString(ast, description);
		_asdoc = DocumentationUtils.buildASDoc(ast);
	}

	@Override
	public String getShortDescription()
	{
		return DocumentationUtils.getShortDescriptionString(ast);
	}

	@Override
	public String getLongDescription()
	{
		return DocumentationUtils.getLongDescriptionString(ast);
	}

	@Override
	public IDocTag newDocTag(String name, String body)
	{
		DocumentationUtils.assertValidContent(body);
		String newline = DocumentationUtils.getNewlineText(ast, _asdoc);
		String tagname = tagName(name);
		if (_asdoc == null)
		{
			DocumentationUtils.setDocComment(ast, "\n" + tagname + " " + body + "\n");
			_asdoc = DocumentationUtils.buildASDoc(ast);
		}
		else
		{
			body = body.replaceAll("\n", newline);
			LinkedListTree lastChild = _asdoc.getLastChild();
			LinkedListTree para = DocumentationUtils.parseParaTag(tagname + " "
					+ body);
			_asdoc.addChildWithTokens(para);
			// the final NL token doesn't usually have a '*' in it
			// (as the end-of-comment provides on) so lets make
			// sure we find that and re-insert it at the new end
			// of the comment
			LinkedListTree trainingNL = null;
			int lastChildLast = lastChild.getChildCount() - 1;
			lastChild.addChildWithTokens(ASTUtils.newAST(ASDocParser.NL, newline));
			if (lastChild.getChild(lastChildLast).getType() == ASDocParser.NL)
			{
				trainingNL = (LinkedListTree) lastChild.deleteChild(lastChildLast);
			}
			if (trainingNL != null)
			{
				para.addChildWithTokens(trainingNL);
			}
			commitModifiedAST();
			return new ASTDocTag(new ASTDocComment(_asdoc), para);
		}
		return null;
	}

	@Override
	public IDocTag newDocTag(String name)
	{
		return newDocTag(name, "");
	}
	
	@Override
	public IDocTag newDocTagAt(int index, String name, String body)
	{
		DocumentationUtils.assertValidContent(body);
		String newline = DocumentationUtils.getNewlineText(ast, _asdoc);
		String tagname = tagName(name);
		
		// have to adjust for the fact the description will always be 0
		index = Math.max(1, index + 1);
		
		if (_asdoc == null)
		{
			DocumentationUtils.setDocComment(ast, "\n" + tagname + " " + body + "\n");
			_asdoc = DocumentationUtils.buildASDoc(ast);
		}
		else
		{
			if (_asdoc.getChildCount() == 1 || index == _asdoc.getChildCount())
				return newDocTag(name, body);			
			
			body = body.replaceAll("\n", newline);
			// create the new AST for the doc tag
			LinkedListTree tag = DocumentationUtils.parseParaTag(tagname + " "	+ body);
			tag.addChildWithTokens(ASTUtils.newAST(ASDocParser.NL, newline));
			_asdoc.addChildAtWithTokens(index, tag);
			commitModifiedAST();
			return null;
		}
		return null;
	}

	@Override
	public IDocTag newDocTagAt(int index, String name) {
		return newDocTagAt(index, name, "");
	}
	
	@Override
	public boolean hasDocTag(String name)
	{
		if (_asdoc == null)
			return false;

		String tagname = tagName(name);
		ASTIterator i = new ASTIterator(_asdoc);
		LinkedListTree para;
		while ((para = i.search(ASDocParser.PARA_TAG)) != null)
		{
			LinkedListTree tag = para.getFirstChild();
			if (tag.getText().equals(tagname))
				return true;

		}
		return false;
	}
	
	public List<IDocTag> getAllTags()
	{
		if (_asdoc == null)
		{
			return new ArrayList<IDocTag>();
		}
		ArrayList<IDocTag> tags = new ArrayList<IDocTag>();
		ASTIterator i = new ASTIterator(_asdoc);
		LinkedListTree para;
		while ((para = i.search(ASDocParser.PARA_TAG)) != null)
		{
			//LinkedListTree tag = para.getFirstChild();
			tags.add(new ASTDocTag(this, para));
		}
		return tags;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Iterator<IDocTag> getTags(String name)
	{
		if (_asdoc == null)
		{
			return Collections.EMPTY_LIST.iterator();
		}
		String tagname = tagName(name);
		LinkedList<IDocTag> tags = new LinkedList<IDocTag>();
		ASTIterator i = new ASTIterator(_asdoc);
		LinkedListTree para;
		while ((para = i.search(ASDocParser.PARA_TAG)) != null)
		{
			LinkedListTree tag = para.getFirstChild();
			if (tag.getText().equals(tagname))
			{
				tags.add(new ASTDocTag(this, para));
			}
		}
		return tags.iterator();
	}

	@Override
	public IDocTag findFirstTag(String name)
	{
		if (_asdoc == null)
			return null;

		String tagname = tagName(name);
		ASTIterator i = new ASTIterator(_asdoc);
		LinkedListTree para;
		while ((para = i.search(ASDocParser.PARA_TAG)) != null)
		{
			LinkedListTree tag = para.getFirstChild();
			if (tag.getText().equals(tagname))
			{
				return new ASTDocTag(this, para);
			}
		}
		return null;
	}

	@Override
	public boolean removeDocTag(IDocTag tag)
	{
		LinkedListTree tagAST = ((ASTDocTag) tag).getAST();
		LinkedListToken start = tagAST.getStartToken().getPrev();

		int index = _asdoc.getIndexOfChild(tagAST);
		
		// this chop has to happen on the last tag
		// if there is any tags BEFORE this tag, don't chop
		if (index == _asdoc.getChildCount() - 1)
		{
			start.setText(start.getText().replace(" *", ""));
		}

		_asdoc.deleteChild(index);

		commitModifiedAST();
		return true;
	}

	/**
	 * Stores modifications to the asdoc comment's AST back into the
	 * comment token in the containing ActionScript AST.
	 */
	public void commitModifiedAST()
	{
		LinkedListToken doc = DocumentationUtils.findDocCommentToken(ast);
		String result = ASTUtils.stringifyNode(_asdoc);
		doc.setText("/**" + result + "*/");
	}

	private static String tagName(String name)
	{
		return "@" + name;
	}

}