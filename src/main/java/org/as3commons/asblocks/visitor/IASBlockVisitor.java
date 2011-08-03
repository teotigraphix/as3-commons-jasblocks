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

public interface IASBlockVisitor
{
	public void visitParameter(IASParameter param);

	public void visitArrayAccessExpression(IASArrayAccessExpression expression);

	public void visitArrayLiteral(IASArrayLiteral literal);

	public void visitAssignmentExpression(IASAssignmentExpression expression);

	public void visitBinaryExpression(IASBinaryExpression expression);

	public void visitBlockStatement(IASBlock statement);

	public void visitBooleanLiteral(IASBooleanLiteral literal);

	public void visitBreakStatement(IASBreakStatement statement);

	public void visitCatchClause(IASCatchClause catchClause);

	public void visitClassType(IASClassType type);

	public void visitCompilationUnit(IASCompilationUnit unit);

	public void visitConditionalExpression(IASConditionalExpression expression);

	public void visitContinueStatement(IASContinueStatement statement);

	public void visitDeclarationStatement(IASDeclarationStatement statement);

	public void visitDefaultXMLNamespaceStatement(IASDefaultXMLNamespaceStatement statement);

	public void visitDoWhileStatement(IASDoWhileStatement statement);

	public void visitDescendantExpression(IASDescendantExpression expression);

	public void visitExpressionAttribute(IASExpressionAttribute expression);

	public void visitExpressionStatement(IASExpressionStatement statement);

	public void visitField(IASField field);

	public void visitFieldAccessExpression(IASFieldAccessExpression expression);

	public void visitFilterExpression(IASFilterExpression expression);

	public void visitFinallyClause(IASFinallyClause fin);

	public void visitForEachInStatement(IASForEachInStatement statement);

	public void visitForInStatement(IASForInStatement statement);

	public void visitForStatement(IASForStatement statement);

	public void visitFunctionExpression(IASFunctionExpression e);

	public void visitIfStatement(IASIfStatement statement);

	public void visitIntegerLiteral(IASIntegerLiteral literal);

	public void visitInterfaceType(IASInterfaceType type);

	public void visitInvocationExpression(IASInvocationExpression expression);

	public void visitMetaTag(IASMetaTag tag);

	public void visitMethod(IASMethod method);

	public void visitNewExpression(IASNewExpression expression);

	public void visitNullLiteral(IASNullLiteral literal);

	public void visitObjectPropertyField(IASPropertyField field);

	public void visitObjectLiteral(IASObjectLiteral literal);

	public void visitPackage(IASPackage pkg);

	public void visitPostfixExpression(IASPostfixExpression expression);

	public void visitPrefixExpression(IASPrefixExpression expression);

	public void visitPropertyAttribute(IASPropertyAttribute expression);

	public void visitRegexpLiteral(IASRegexpLiteral expression);

	public void visitReturnStatement(IASReturnStatement statement);

	public void visitSimpleNameExpression(IASSimpleNameExpression expression);

	public void visitStringLiteral(IASStringLiteral literal);

	public void visitStarAttribute(IASStarAttribute expression);

	public void visitSuperStatement(IASSuperStatement statement);

	public void visitSwitchCase(IASSwitchCase label);

	public void visitSwitchDefault(IASSwitchDefault label);

	public void visitSwitchStatement(IASSwitchStatement statement);

	public void visitThrowStatement(IASThrowStatement statement);

	public void visitTryStatement(IASTryStatement statement);

	public void visitUndefinedLiteral(IASUndefinedLiteral literal);

	public void visitDeclaration(IASDeclaration var);

	public void visitWhileStatement(IASWhileStatement statement);

	public void visitWithStatement(IASWithStatement statement);

	public void visitXMLLiteral(IASXMLLiteral literal);
}
