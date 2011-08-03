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
import java.util.List;

import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASObjectLiteral;
import org.as3commons.asblocks.dom.IASPropertyField;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASObjectLiteral extends ASTLiteral implements IASObjectLiteral
{

	public ASTASObjectLiteral(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public List<IASPropertyField> getFields()
	{
		List<IASPropertyField> fields = new ArrayList<IASPropertyField>();
		ASTIterator i = new ASTIterator(ast);
		while (i.hasNext())
		{
			fields.add(buildField(i.next()));
		}
		return Collections.unmodifiableList(fields);
	}

	@Override
	public IASPropertyField newField(String name, IASExpression expression)
	{
		LinkedListTree field = ASTLiteralBuilder.newObjectFieldAST(name, toAST(expression));
		String indent = ASTUtils.findIndent(ast) + "\t";
		ASTUtils.increaseIndent(field, indent);
		if (ast.getChildCount() > 0)
		{
			ast.appendToken(TokenBuilder.newComma());
		}
		ast.appendToken(TokenBuilder.newNewline());
		ast.addChildWithTokens(field);
		return new ASTASPropertyField(field);
	}

	private ASTASPropertyField buildField(LinkedListTree field)
	{
		ASTUtils.assertAS3TokenTypeIs(AS3Parser.OBJECT_FIELD, field.getType());
		return new ASTASPropertyField(field);
	}
}
