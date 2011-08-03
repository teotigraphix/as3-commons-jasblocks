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

import java.util.List;

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.dom.IASBreakStatement;
import org.as3commons.asblocks.dom.IASConfigStatement;
import org.as3commons.asblocks.dom.IASContinueStatement;
import org.as3commons.asblocks.dom.IASDeclarationStatement;
import org.as3commons.asblocks.dom.IASDefaultXMLNamespaceStatement;
import org.as3commons.asblocks.dom.IASDoWhileStatement;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASExpressionStatement;
import org.as3commons.asblocks.dom.IASForEachInStatement;
import org.as3commons.asblocks.dom.IASForInStatement;
import org.as3commons.asblocks.dom.IASForStatement;
import org.as3commons.asblocks.dom.IASFunctionType;
import org.as3commons.asblocks.dom.IASIfStatement;
import org.as3commons.asblocks.dom.IASLabelStatement;
import org.as3commons.asblocks.dom.IASParameter;
import org.as3commons.asblocks.dom.IASReturnStatement;
import org.as3commons.asblocks.dom.IASStatement;
import org.as3commons.asblocks.dom.IASSwitchStatement;
import org.as3commons.asblocks.dom.IASThrowStatement;
import org.as3commons.asblocks.dom.IASTryStatement;
import org.as3commons.asblocks.dom.IASUseStatement;
import org.as3commons.asblocks.dom.IASWhileStatement;
import org.as3commons.asblocks.dom.IASWithStatement;
import org.as3commons.asblocks.dom.IScriptElement;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASFunctionType extends ASTASType implements IASFunctionType
{
	private ASTFunctionCommon functionCommon;

	private ASTStatementList statementList;

	public ASTASFunctionType(LinkedListTree ast)
	{
		super(ast);

		statementList = new ASTStatementList(
				ASTUtils.findChildByType(ast, AS3Parser.BLOCK));
		functionCommon = new ASTFunctionCommon(ast);
	}

	@Override
	public boolean isSubType()
	{
		return false;
	}

	@Override
	public String getName()
	{
		ASTIterator i = new ASTIterator(ast);
		LinkedListTree name = i.find(AS3Parser.IDENT);
		return name.getText();
	}

	@Override
	public void setName(String value)
	{
		if (value == null)
		{
			throw new ASBlocksSyntaxError("Type name must not be null");
		}
		if (value.indexOf('.') != -1)
		{
			throw new ASBlocksSyntaxError("Method name must not contain '.'");
		}
		if (value.indexOf(':') != -1)
		{
			throw new ASBlocksSyntaxError("Method name must not contain ':'");
		}
		ASTIterator i = new ASTIterator(ast);
		i.find(AS3Parser.IDENT);
		LinkedListTree newName = AS3FragmentParser.parseType(value).getFirstChild();
		i.replace(newName);
	}

	@Override
	public List<IASParameter> getParameters()
	{
		return functionCommon.getParameters();
	}

	@Override
	public boolean hasParameters()
	{
		return functionCommon.hasParameters();
	}

	@Override
	public String getType()
	{
		return functionCommon.getType();
	}

	@Override
	public void setType(String value)
	{
		functionCommon.setType(value);
	}

	@Override
	public IASParameter addParameter(String name, String type,
			String defaultValue)
	{
		return functionCommon.addParameter(name, type, defaultValue);
	}

	@Override
	public IASParameter addParameter(String name, String type)
	{
		return functionCommon.addParameter(name, type);
	}

	@Override
	public IASParameter removeParameter(String name)
	{
		return functionCommon.removeParameter(name);
	}

	@Override
	public IASParameter addRestParameter(String name)
	{
		return functionCommon.addRestParameter(name);
	}

	//--------------------------------------------------------------------------
	//
	//  IStatementContainer implementation
	//
	//--------------------------------------------------------------------------

	@Override
	public boolean hasStatements()
	{
		return statementList.hasStatements();
	}

	@Override
	public List<IASStatement> getStatements()
	{
		return statementList.getStatements();
	}

	@Override
	public void addComment(String text)
	{
		statementList.addComment(text);
	}

	@Override
	public IASStatement addStatement(IASStatement statement)
	{
		return statementList.addStatement(statement);
	}

	@Override
	public IASStatement parseStatement(String statement)
	{
		return statementList.parseStatement(statement);
	}

	@Override
	public IASStatement removeStatement(IASStatement statement)
	{
		return statementList.removeStatement(statement);
	}

	@Override
	public IASExpressionStatement newExpressionStatement(
			IASExpression expression)
	{
		return statementList.newExpressionStatement(expression);
	}

	@Override
	public IASExpressionStatement parseNewExpressionStatement(String statement)
	{
		return statementList.parseNewExpressionStatement(statement);
	}

	@Override
	public IASIfStatement newIf(IASExpression condition)
	{
		return statementList.newIf(condition);
	}

	@Override
	public IASIfStatement parseNewIf(String condition)
	{
		return statementList.parseNewIf(condition);
	}

	@Override
	public IASForStatement newFor(IScriptElement initializer,
			IASExpression condition, IASExpression iterater)
	{
		return statementList.newFor(initializer, condition, iterater);
	}

	@Override
	public IASForStatement parseNewFor(String initializer, String condition,
			String iterater)
	{
		return statementList.parseNewFor(initializer, condition, iterater);
	}

	@Override
	public IASForInStatement newForIn(IScriptElement declaration,
			IASExpression target)
	{
		return statementList.newForIn(declaration, target);
	}

	@Override
	public IASForInStatement parseNewForIn(String declaration, String target)
	{
		return statementList.parseNewForIn(declaration, target);
	}

	@Override
	public IASForEachInStatement newForEachIn(IScriptElement declaration,
			IASExpression target)
	{
		return statementList.newForEachIn(declaration, target);
	}

	@Override
	public IASForEachInStatement parseNewForEachIn(String declaration,
			String target)
	{
		return statementList.parseNewForEachIn(declaration, target);
	}

	@Override
	public IASWhileStatement newWhile(IASExpression condition)
	{
		return statementList.newWhile(condition);
	}

	@Override
	public IASWhileStatement parseNewWhile(String condition)
	{
		return statementList.parseNewWhile(condition);
	}

	@Override
	public IASDoWhileStatement newDoWhile(IASExpression condition)
	{
		return statementList.newDoWhile(condition);
	}

	@Override
	public IASDoWhileStatement parseNewDoWhile(String condition)
	{
		return statementList.parseNewDoWhile(condition);
	}

	@Override
	public IASSwitchStatement newSwitch(IASExpression condition)
	{
		return statementList.newSwitch(condition);
	}

	@Override
	public IASSwitchStatement parseNewSwitch(String condition)
	{
		return statementList.parseNewSwitch(condition);
	}

	@Override
	public IASWithStatement newWith(IASExpression scope)
	{
		return statementList.newWith(scope);
	}

	@Override
	public IASWithStatement parseNewWith(String scope)
	{
		return statementList.parseNewWith(scope);
	}

	@Override
	public IASDeclarationStatement newDeclaration(IScriptElement declaration)
	{
		return statementList.newDeclaration(declaration);
	}

	@Override
	public IASDeclarationStatement parseNewDeclaration(String declaration)
	{
		return statementList.parseNewDeclaration(declaration);
	}

	@Override
	public IASReturnStatement newReturn(IASExpression expression)
	{
		return statementList.newReturn(expression);
	}

	@Override
	public IASReturnStatement newReturn()
	{
		return statementList.newReturn();
	}

	@Override
	public IASReturnStatement parseNewReturn(String expression)
	{
		return statementList.parseNewReturn(expression);
	}

	@Override
	public IASBreakStatement newBreak(String label)
	{
		return statementList.newBreak(label);
	}

	@Override
	public IASBreakStatement newBreak()
	{
		return statementList.newBreak();
	}

	@Override
	public IASTryStatement newTryCatch(IASExpression name, IASExpression type)
	{
		return statementList.newTryCatch(name, type);
	}

	@Override
	public IASTryStatement parseNewTryCatch(String name, String type)
	{
		return statementList.parseNewTryCatch(name, type);
	}

	@Override
	public IASTryStatement newTryFinally()
	{
		return statementList.newTryFinally();
	}

	@Override
	public IASContinueStatement newContinue(String label)
	{
		return statementList.newContinue(label);
	}

	@Override
	public IASContinueStatement newContinue()
	{
		return statementList.newContinue();
	}

	@Override
	public IASThrowStatement newThrow(IASExpression expression)
	{
		return statementList.newThrow(expression);
	}

	@Override
	public IASDefaultXMLNamespaceStatement newDefaultXMLNamespace(
			String namespace)
	{
		return statementList.newDefaultXMLNamespace(namespace);
	}

	@Override
	public IASLabelStatement newLabel(IASExpression name)
	{
		return statementList.newLabel(name);
	}

	@Override
	public IASLabelStatement parseNewLabel(String name)
	{
		return statementList.parseNewLabel(name);
	}

	@Override
	public IASConfigStatement newConfig(IASExpression name)
	{
		return statementList.newConfig(name);
	}

	@Override
	public IASConfigStatement parseNewConfig(String name)
	{
		return statementList.parseNewConfig(name);
	}

	@Override
	public IASUseStatement newUse(IASExpression name)
	{
		return statementList.newUse(name);
	}

	@Override
	public IASUseStatement parseNewUse(String name)
	{
		return statementList.parseNewUse(name);
	}

	// end IStatementContainer
}
