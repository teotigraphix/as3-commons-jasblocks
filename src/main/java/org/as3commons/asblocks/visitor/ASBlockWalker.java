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

package org.as3commons.asblocks.visitor;

import java.util.Iterator;
import java.util.List;

import org.as3commons.asblocks.dom.IASArrayAccessExpression;
import org.as3commons.asblocks.dom.IASArrayLiteral;
import org.as3commons.asblocks.dom.IASAssignmentExpression;
import org.as3commons.asblocks.dom.IASBinaryExpression;
import org.as3commons.asblocks.dom.IASBlock;
import org.as3commons.asblocks.dom.IASBooleanLiteral;
import org.as3commons.asblocks.dom.IASBreakStatement;
import org.as3commons.asblocks.dom.IASCatchClause;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASConditionalExpression;
import org.as3commons.asblocks.dom.IASContinueStatement;
import org.as3commons.asblocks.dom.IASDeclaration;
import org.as3commons.asblocks.dom.IASDeclarationStatement;
import org.as3commons.asblocks.dom.IASDefaultXMLNamespaceStatement;
import org.as3commons.asblocks.dom.IASDescendantExpression;
import org.as3commons.asblocks.dom.IASDoWhileStatement;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASExpressionAttribute;
import org.as3commons.asblocks.dom.IASExpressionStatement;
import org.as3commons.asblocks.dom.IASField;
import org.as3commons.asblocks.dom.IASFieldAccessExpression;
import org.as3commons.asblocks.dom.IASFilterExpression;
import org.as3commons.asblocks.dom.IASFinallyClause;
import org.as3commons.asblocks.dom.IASForEachInStatement;
import org.as3commons.asblocks.dom.IASForInStatement;
import org.as3commons.asblocks.dom.IASForStatement;
import org.as3commons.asblocks.dom.IASFunctionExpression;
import org.as3commons.asblocks.dom.IASIfStatement;
import org.as3commons.asblocks.dom.IASIntegerLiteral;
import org.as3commons.asblocks.dom.IASInterfaceType;
import org.as3commons.asblocks.dom.IASInvocationExpression;
import org.as3commons.asblocks.dom.IASMetaTag;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASNewExpression;
import org.as3commons.asblocks.dom.IASNullLiteral;
import org.as3commons.asblocks.dom.IASObjectLiteral;
import org.as3commons.asblocks.dom.IASPackage;
import org.as3commons.asblocks.dom.IASParameter;
import org.as3commons.asblocks.dom.IASPostfixExpression;
import org.as3commons.asblocks.dom.IASPrefixExpression;
import org.as3commons.asblocks.dom.IASPropertyAttribute;
import org.as3commons.asblocks.dom.IASPropertyField;
import org.as3commons.asblocks.dom.IASRegexpLiteral;
import org.as3commons.asblocks.dom.IASReturnStatement;
import org.as3commons.asblocks.dom.IASSimpleNameExpression;
import org.as3commons.asblocks.dom.IASStarAttribute;
import org.as3commons.asblocks.dom.IASStatement;
import org.as3commons.asblocks.dom.IASStringLiteral;
import org.as3commons.asblocks.dom.IASSuperStatement;
import org.as3commons.asblocks.dom.IASSwitchCase;
import org.as3commons.asblocks.dom.IASSwitchDefault;
import org.as3commons.asblocks.dom.IASSwitchStatement;
import org.as3commons.asblocks.dom.IASThrowStatement;
import org.as3commons.asblocks.dom.IASTryStatement;
import org.as3commons.asblocks.dom.IASUndefinedLiteral;
import org.as3commons.asblocks.dom.IASWhileStatement;
import org.as3commons.asblocks.dom.IASWithStatement;
import org.as3commons.asblocks.dom.IASXMLLiteral;
import org.as3commons.asblocks.dom.IScriptElement;
import org.as3commons.asblocks.dom.IStatementContainer;

public class ASBlockWalker implements IASBlockVisitor
{
	private IScriptElementStrategy strategy;

	public ASBlockWalker(FilterStrategy strategy)
	{
		this.strategy = strategy;
		strategy.setFiltered(new ScriptElementSwitch(this));
	}

	public void walk(List<?> list)
	{
		for (Iterator<?> i = list.iterator(); i.hasNext();)
		{
			walk((IScriptElement) i.next());
		}
	}

	public void walk(IScriptElement e)
	{
		strategy.handle(e);
	}

	public void walkStatementContainer(IStatementContainer container)
	{
		walk(container.getStatements());
	}

	@Override
	public void visitParameter(IASParameter param)
	{
	}

	@Override
	public void visitArrayAccessExpression(IASArrayAccessExpression expression)
	{
		walk(expression.getTarget());
		walk(expression.getSubscript());
	}

	@Override
	public void visitArrayLiteral(IASArrayLiteral literal)
	{
		walk(literal.getEntries());
	}

	@Override
	public void visitAssignmentExpression(IASAssignmentExpression expression)
	{
		walk(expression.getLeftExpression());
		walk(expression.getRightExpression());
	}

	@Override
	public void visitBinaryExpression(IASBinaryExpression expression)
	{
		walk(expression.getLeftExpression());
		walk(expression.getRightExpression());
	}

	@Override
	public void visitBlockStatement(IASBlock statement)
	{
		walkStatementContainer(statement);
	}

	@Override
	public void visitBooleanLiteral(IASBooleanLiteral literal)
	{
	}

	@Override
	public void visitBreakStatement(IASBreakStatement statement)
	{
	}

	@Override
	public void visitCatchClause(IASCatchClause catchClause)
	{
		walkStatementContainer(catchClause);
	}

	@Override
	public void visitClassType(IASClassType type)
	{
		walk(type.getFields());
		walk(type.getMethods());
	}

	@Override
	public void visitCompilationUnit(IASCompilationUnit unit)
	{
		walk(unit.getPackage());
	}

	@Override
	public void visitConditionalExpression(IASConditionalExpression expression)
	{
		walk(expression.getCondition());
		walk(expression.getThenExpression());
		walk(expression.getElseExpression());
	}

	@Override
	public void visitContinueStatement(IASContinueStatement statement)
	{
	}

	@Override
	public void visitDeclarationStatement(IASDeclarationStatement statement)
	{
		walk(statement.getDeclarations());
	}

	@Override
	public void visitDefaultXMLNamespaceStatement(
			IASDefaultXMLNamespaceStatement statement)
	{
	}

	@Override
	public void visitDoWhileStatement(IASDoWhileStatement statement)
	{
		walk(statement.getCondition());
		walkStatementContainer(statement);
	}

	@Override
	public void visitDescendantExpression(IASDescendantExpression expression)
	{
		walk(expression.getTarget());
		walk(expression.getQuery());
	}

	@Override
	public void visitExpressionAttribute(IASExpressionAttribute expression)
	{
		walk(expression.getExpression());
	}

	@Override
	public void visitExpressionStatement(IASExpressionStatement statement)
	{
		walk(statement.getExpression());
	}

	@Override
	public void visitField(IASField field)
	{
		walk(field.getMetaTags());
	}

	@Override
	public void visitFieldAccessExpression(IASFieldAccessExpression expression)
	{
		walk(expression.getTarget());
	}

	@Override
	public void visitFilterExpression(IASFilterExpression expression)
	{
		walk(expression.getTarget());
		walk(expression.getQuery());
	}

	@Override
	public void visitFinallyClause(IASFinallyClause statement)
	{
		walkStatementContainer(statement);
	}

	@Override
	public void visitForEachInStatement(IASForEachInStatement statement)
	{
		walk(statement.getInitializer());
		walk(statement.getIterator());
		walkStatementContainer(statement);
	}

	@Override
	public void visitForInStatement(IASForInStatement statement)
	{
		walk(statement.getInitializer());
		walk(statement.getIterator());
		walkStatementContainer(statement);
	}

	@Override
	public void visitForStatement(IASForStatement statement)
	{
		IScriptElement initializer = statement.getInitializer();
		if (initializer != null)
		{
			walk(initializer);
		}
		IASExpression condition = statement.getCondition();
		if (condition != null)
		{
			walk(condition);
		}
		IASExpression update = statement.getIterator();
		if (update != null)
		{
			walk(update);
		}
		walkStatementContainer(statement);
	}

	@Override
	public void visitFunctionExpression(IASFunctionExpression expression)
	{
		walk(expression.getParameters());
		walkStatementContainer((expression));
	}

	@Override
	public void visitIfStatement(IASIfStatement statement)
	{
		walk(statement.getCondition());
		walk(statement.getThenStatement());
		IASStatement elseStmt = statement.getElseStatement();
		if (elseStmt != null)
		{
			walk(elseStmt);
		}
	}

	@Override
	public void visitIntegerLiteral(IASIntegerLiteral literal)
	{
	}

	@Override
	public void visitInterfaceType(IASInterfaceType type)
	{
		walk(type.getMethods());
	}

	@Override
	public void visitInvocationExpression(IASInvocationExpression expression)
	{
		walk(expression.getTarget());
		walk(expression.getArguments());
	}

	@Override
	public void visitMetaTag(IASMetaTag tag)
	{
	}

	@Override
	public void visitMethod(IASMethod method)
	{
		walk(method.getMetaTags());
		walk(method.getParameters());
		walkStatementContainer(method);
	}

	@Override
	public void visitNewExpression(IASNewExpression expression)
	{
		//		walk(expression.getTarget());
		//		walk(expression.getArguments());
	}

	@Override
	public void visitNullLiteral(IASNullLiteral literal)
	{
	}

	@Override
	public void visitObjectPropertyField(IASPropertyField field)
	{
		walk(field.getValue());
	}

	@Override
	public void visitObjectLiteral(IASObjectLiteral literal)
	{
		walk(literal.getFields());
	}

	@Override
	public void visitPackage(IASPackage pkg)
	{
		walk(pkg.getMetaTags());
		walk(pkg.getType());
	}

	@Override
	public void visitPostfixExpression(IASPostfixExpression expression)
	{
		walk(expression.getExpression());
	}

	@Override
	public void visitPrefixExpression(IASPrefixExpression expression)
	{
		walk(expression.getExpression());
	}

	@Override
	public void visitPropertyAttribute(IASPropertyAttribute expression)
	{
	}

	@Override
	public void visitRegexpLiteral(IASRegexpLiteral e)
	{
	}

	@Override
	public void visitReturnStatement(IASReturnStatement statement)
	{
		IASExpression expression = statement.getExpression();
		if (expression != null)
		{
			walk(expression);
		}
	}

	@Override
	public void visitSimpleNameExpression(IASSimpleNameExpression e)
	{
	}

	@Override
	public void visitStringLiteral(IASStringLiteral literal)
	{
	}

	@Override
	public void visitStarAttribute(IASStarAttribute expression)
	{
	}

	@Override
	public void visitSuperStatement(IASSuperStatement statement)
	{
		//		walk(statement.getArguments());
	}

	@Override
	public void visitSwitchCase(IASSwitchCase statement)
	{
		walk(statement.getLabel());
		walkStatementContainer(statement);
	}

	@Override
	public void visitSwitchDefault(IASSwitchDefault statement)
	{
		walkStatementContainer(statement);
	}

	@Override
	public void visitSwitchStatement(IASSwitchStatement statement)
	{
		walk(statement.getCondition());
		walk(statement.getLabels());
	}

	@Override
	public void visitThrowStatement(IASThrowStatement statement)
	{
		walk(statement.getExpression());
	}

	@Override
	public void visitTryStatement(IASTryStatement statement)
	{
		walkStatementContainer(statement);
		List<IASCatchClause> catchClauses = statement.getCatchClauses();
		if (!catchClauses.isEmpty())
		{
			walk(catchClauses);
		}
		IASFinallyClause fin = statement.getFinallyClause();
		if (fin != null)
		{
			walk(fin);
		}
	}

	@Override
	public void visitUndefinedLiteral(IASUndefinedLiteral literal)
	{
	}

	@Override
	public void visitDeclaration(IASDeclaration var)
	{
		IASExpression initializer = var.getInitializer();
		if (initializer != null)
		{
			walk(initializer);
		}
	}

	@Override
	public void visitWhileStatement(IASWhileStatement statement)
	{
		walk(statement.getCondition());
		walk(statement.getBody());
	}

	@Override
	public void visitWithStatement(IASWithStatement statement)
	{
		walk(statement.getScope());
		walk(statement.getBody());
	}

	@Override
	public void visitXMLLiteral(IASXMLLiteral literal)
	{
	}
}
