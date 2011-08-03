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

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.dom.IASNamespaceType;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASNamespaceType extends ASTASType implements IASNamespaceType
{

	public ASTASNamespaceType(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public boolean isSubType()
	{
		return false;
	}
	
	@Override
	public String getURI()
	{
		ASTIterator i = new ASTIterator(findAssign());
		return ASTUtils.decodeStringLiteral(i.find(AS3Parser.STRING_LITERAL).getText());
	}

	@Override
	public void setURI(String value)
	{
		if (value == null)
		{
			throw new ASBlocksSyntaxError("URI name must not be null");
		}		
		ASTIterator i = new ASTIterator(findAssign());
		
		i.find(AS3Parser.STRING_LITERAL);
		i.replace(ASTUtils.newAST(AS3Parser.STRING_LITERAL, ASTUtils.str(value)));
	}
	
	protected LinkedListTree findAssign()
	{
		return ASTUtils.findChildByType(findDeclaration(), AS3Parser.ASSIGN);
	}
	
	@Override
	protected LinkedListTree findDeclaration()
	{
		return ASTUtils.findChildByType(ast, AS3Parser.VAR_DEC);
	}
}
