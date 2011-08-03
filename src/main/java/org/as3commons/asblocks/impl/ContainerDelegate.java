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
import org.as3commons.asblocks.dom.IASIfStatement;
import org.as3commons.asblocks.dom.IASLabelStatement;
import org.as3commons.asblocks.dom.IASReturnStatement;
import org.as3commons.asblocks.dom.IASStatement;
import org.as3commons.asblocks.dom.IASSwitchStatement;
import org.as3commons.asblocks.dom.IASThrowStatement;
import org.as3commons.asblocks.dom.IASTryStatement;
import org.as3commons.asblocks.dom.IASUseStatement;
import org.as3commons.asblocks.dom.IASWhileStatement;
import org.as3commons.asblocks.dom.IASWithStatement;
import org.as3commons.asblocks.dom.IScriptElement;
import org.as3commons.asblocks.dom.IStatementContainer;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

public abstract class ContainerDelegate extends ASTScriptElement implements
		IStatementContainer
{
	protected abstract IStatementContainer getStatementContainer();

	public ContainerDelegate(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public boolean hasStatements()
	{
		return getStatementContainer().hasStatements();
	}

	@Override
	public List<IASStatement> getStatements()
	{
		return getStatementContainer().getStatements();
	}

	@Override
	public void addComment(String text)
	{
		getStatementContainer().addComment(text);
	}

	@Override
	public IASStatement addStatement(IASStatement statement)
	{
		return getStatementContainer().addStatement(statement);
	}

	@Override
	public IASStatement parseStatement(String statement)
	{
		return getStatementContainer().parseStatement(statement);
	}

	@Override
	public IASStatement removeStatement(IASStatement statement)
	{
		return getStatementContainer().removeStatement(statement);
	}

	@Override
	public IASExpressionStatement newExpressionStatement(
			IASExpression expression)
	{
		return getStatementContainer().newExpressionStatement(expression);
	}

	@Override
	public IASExpressionStatement parseNewExpressionStatement(String statement)
	{
		return getStatementContainer().parseNewExpressionStatement(statement);
	}

	@Override
	public IASIfStatement newIf(IASExpression condition)
	{
		return getStatementContainer().newIf(condition);
	}

	@Override
	public IASIfStatement parseNewIf(String condition)
	{
		return getStatementContainer().parseNewIf(condition);
	}

	@Override
	public IASForStatement newFor(IScriptElement initializer,
			IASExpression condition, IASExpression iterater)
	{
		return getStatementContainer().newFor(initializer, condition, iterater);
	}

	@Override
	public IASForStatement parseNewFor(String initializer, String condition,
			String iterater)
	{
		return getStatementContainer().parseNewFor(initializer, condition, iterater);
	}

	@Override
	public IASForInStatement newForIn(IScriptElement declaration,
			IASExpression target)
	{
		return getStatementContainer().newForIn(declaration, target);
	}

	@Override
	public IASForInStatement parseNewForIn(String declaration, String target)
	{
		return getStatementContainer().parseNewForIn(declaration, target);
	}

	@Override
	public IASForEachInStatement newForEachIn(IScriptElement declaration,
			IASExpression target)
	{
		return getStatementContainer().newForEachIn(declaration, target);
	}

	@Override
	public IASForEachInStatement parseNewForEachIn(String declaration,
			String target)
	{
		return getStatementContainer().parseNewForEachIn(declaration, target);
	}

	@Override
	public IASWhileStatement newWhile(IASExpression condition)
	{
		return getStatementContainer().newWhile(condition);
	}

	@Override
	public IASWhileStatement parseNewWhile(String condition)
	{
		return getStatementContainer().parseNewWhile(condition);
	}

	@Override
	public IASDoWhileStatement newDoWhile(IASExpression condition)
	{
		return getStatementContainer().newDoWhile(condition);
	}

	@Override
	public IASDoWhileStatement parseNewDoWhile(String condition)
	{
		return getStatementContainer().parseNewDoWhile(condition);
	}

	@Override
	public IASSwitchStatement newSwitch(IASExpression condition)
	{
		return getStatementContainer().newSwitch(condition);
	}

	@Override
	public IASSwitchStatement parseNewSwitch(String condition)
	{
		return getStatementContainer().parseNewSwitch(condition);
	}

	@Override
	public IASWithStatement newWith(IASExpression scope)
	{
		return getStatementContainer().newWith(scope);
	}

	@Override
	public IASWithStatement parseNewWith(String scope)
	{
		return getStatementContainer().parseNewWith(scope);
	}

	@Override
	public IASDeclarationStatement newDeclaration(IScriptElement declaration)
	{
		return getStatementContainer().newDeclaration(declaration);
	}

	@Override
	public IASDeclarationStatement parseNewDeclaration(String declaration)
	{
		return getStatementContainer().parseNewDeclaration(declaration);
	}

	@Override
	public IASReturnStatement newReturn(IASExpression expression)
	{
		return getStatementContainer().newReturn(expression);
	}

	@Override
	public IASReturnStatement newReturn()
	{
		return getStatementContainer().newReturn();
	}

	@Override
	public IASReturnStatement parseNewReturn(String expression)
	{
		return getStatementContainer().parseNewReturn(expression);
	}

	@Override
	public IASBreakStatement newBreak(String label)
	{
		return getStatementContainer().newBreak(label);
	}

	@Override
	public IASBreakStatement newBreak()
	{
		return getStatementContainer().newBreak();
	}

	@Override
	public IASTryStatement newTryCatch(IASExpression name, IASExpression type)
	{
		return getStatementContainer().newTryCatch(name, type);
	}

	@Override
	public IASTryStatement parseNewTryCatch(String name, String type)
	{
		return getStatementContainer().parseNewTryCatch(name, type);
	}

	@Override
	public IASTryStatement newTryFinally()
	{
		return getStatementContainer().newTryFinally();
	}

	@Override
	public IASContinueStatement newContinue(String label)
	{
		return getStatementContainer().newContinue(label);
	}

	@Override
	public IASContinueStatement newContinue()
	{
		return getStatementContainer().newContinue();
	}

	@Override
	public IASThrowStatement newThrow(IASExpression expression)
	{
		return getStatementContainer().newThrow(expression);
	}

	@Override
	public IASDefaultXMLNamespaceStatement newDefaultXMLNamespace(
			String namespace)
	{
		return getStatementContainer().newDefaultXMLNamespace(namespace);
	}

	@Override
	public IASLabelStatement newLabel(IASExpression name)
	{
		return getStatementContainer().newLabel(name);
	}

	@Override
	public IASLabelStatement parseNewLabel(String name)
	{
		return getStatementContainer().parseNewLabel(name);
	}

	@Override
	public IASConfigStatement newConfig(IASExpression name)
	{
		return getStatementContainer().newConfig(name);
	}

	@Override
	public IASConfigStatement parseNewConfig(String name)
	{
		return getStatementContainer().parseNewConfig(name);
	}

	@Override
	public IASUseStatement newUse(IASExpression name)
	{
		return getStatementContainer().newUse(name);
	}

	@Override
	public IASUseStatement parseNewUse(String name)
	{
		return getStatementContainer().parseNewUse(name);
	}
}
