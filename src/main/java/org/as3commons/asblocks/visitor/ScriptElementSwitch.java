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
import org.as3commons.asblocks.dom.IScriptElement;

public class ScriptElementSwitch implements IScriptElementStrategy
{
	private IASBlockVisitor visitor;

	public ScriptElementSwitch(IASBlockVisitor visitor)
	{
		this.visitor = visitor;
	}

	@Override
	public void handle(IScriptElement element)
	{
		System.out.println(element.getClass().getName());

		if (element instanceof IASArrayAccessExpression)
		{
			visitor.visitArrayAccessExpression((IASArrayAccessExpression) element);
		}
		else if (element instanceof IASArrayLiteral)
		{
			visitor.visitArrayLiteral((IASArrayLiteral) element);
		}
		else if (element instanceof IASParameter)
		{
			visitor.visitParameter((IASParameter) element);
		}
		else if (element instanceof IASAssignmentExpression)
		{
			visitor.visitAssignmentExpression((IASAssignmentExpression) element);
		}
		else if (element instanceof IASBinaryExpression)
		{
			visitor.visitBinaryExpression((IASBinaryExpression) element);
		}
		else if (element instanceof IASBooleanLiteral)
		{
			visitor.visitBooleanLiteral((IASBooleanLiteral) element);
		}
		else if (element instanceof IASBlock)
		{
			visitor.visitBlockStatement((IASBlock) element);
		}
		else if (element instanceof IASBreakStatement)
		{
			visitor.visitBreakStatement((IASBreakStatement) element);
		}
		else if (element instanceof IASCatchClause)
		{
			visitor.visitCatchClause((IASCatchClause) element);
		}
		else if (element instanceof IASConditionalExpression)
		{
			visitor.visitConditionalExpression((IASConditionalExpression) element);
		}
		else if (element instanceof IASContinueStatement)
		{
			visitor.visitContinueStatement((IASContinueStatement) element);
		}
		else if (element instanceof IASCompilationUnit)
		{
			visitor.visitCompilationUnit((IASCompilationUnit) element);
		}
		else if (element instanceof IASClassType)
		{
			visitor.visitClassType((IASClassType) element);
		}
		else if (element instanceof IASDeclarationStatement)
		{
			visitor.visitDeclarationStatement((IASDeclarationStatement) element);
		}
		else if (element instanceof IASDefaultXMLNamespaceStatement)
		{
			visitor.visitDefaultXMLNamespaceStatement((IASDefaultXMLNamespaceStatement) element);
		}
		else if (element instanceof IASDoWhileStatement)
		{
			visitor.visitDoWhileStatement((IASDoWhileStatement) element);
		}
		else if (element instanceof IASDescendantExpression)
		{
			visitor.visitDescendantExpression((IASDescendantExpression) element);
		}
		else if (element instanceof IASExpressionAttribute)
		{
			visitor.visitExpressionAttribute((IASExpressionAttribute) element);
		}
		else if (element instanceof IASExpressionStatement)
		{
			visitor.visitExpressionStatement((IASExpressionStatement) element);
		}
		else if (element instanceof IASFieldAccessExpression)
		{
			visitor.visitFieldAccessExpression((IASFieldAccessExpression) element);
		}
		else if (element instanceof IASFilterExpression)
		{
			visitor.visitFilterExpression((IASFilterExpression) element);
		}
		else if (element instanceof IASFinallyClause)
		{
			visitor.visitFinallyClause((IASFinallyClause) element);
		}
		else if (element instanceof IASForEachInStatement)
		{
			visitor.visitForEachInStatement((IASForEachInStatement) element);
		}
		else if (element instanceof IASForInStatement)
		{
			visitor.visitForInStatement((IASForInStatement) element);
		}
		else if (element instanceof IASForStatement)
		{
			visitor.visitForStatement((IASForStatement) element);
		}
		else if (element instanceof IASField)
		{
			visitor.visitField((IASField) element);
		}
		else if (element instanceof IASFunctionExpression)
		{
			visitor.visitFunctionExpression((IASFunctionExpression) element);
		}
		else if (element instanceof IASInvocationExpression)
		{
			visitor.visitInvocationExpression((IASInvocationExpression) element);
		}
		else if (element instanceof IASIfStatement)
		{
			visitor.visitIfStatement((IASIfStatement) element);
		}
		else if (element instanceof IASIntegerLiteral)
		{
			visitor.visitIntegerLiteral((IASIntegerLiteral) element);
		}
		else if (element instanceof IASInterfaceType)
		{
			visitor.visitInterfaceType((IASInterfaceType) element);
		}
		else if (element instanceof IASMetaTag)
		{
			visitor.visitMetaTag((IASMetaTag) element);
		}
		else if (element instanceof IASMethod)
		{
			visitor.visitMethod((IASMethod) element);
		}
		else if (element instanceof IASNewExpression)
		{
			visitor.visitNewExpression((IASNewExpression) element);
		}
		else if (element instanceof IASNullLiteral)
		{
			visitor.visitNullLiteral((IASNullLiteral) element);
		}
		else if (element instanceof IASObjectLiteral)
		{
			visitor.visitObjectLiteral((IASObjectLiteral) element);
		}
		else if (element instanceof IASPropertyField)
		{
			visitor.visitObjectPropertyField((IASPropertyField) element);
		}
		else if (element instanceof IASPackage)
		{
			visitor.visitPackage((IASPackage) element);
		}
		else if (element instanceof IASPostfixExpression)
		{
			visitor.visitPostfixExpression((IASPostfixExpression) element);
		}
		else if (element instanceof IASPrefixExpression)
		{
			visitor.visitPrefixExpression((IASPrefixExpression) element);
		}
		else if (element instanceof IASPropertyAttribute)
		{
			visitor.visitPropertyAttribute((IASPropertyAttribute) element);
		}
		else if (element instanceof IASRegexpLiteral)
		{
			visitor.visitRegexpLiteral((IASRegexpLiteral) element);
		}
		else if (element instanceof IASReturnStatement)
		{
			visitor.visitReturnStatement((IASReturnStatement) element);
		}
		else if (element instanceof IASSimpleNameExpression)
		{
			visitor.visitSimpleNameExpression((IASSimpleNameExpression) element);
		}
		else if (element instanceof IASStarAttribute)
		{
			visitor.visitStarAttribute((IASStarAttribute) element);
		}
		else if (element instanceof IASStringLiteral)
		{
			visitor.visitStringLiteral((IASStringLiteral) element);
		}
		else if (element instanceof IASSwitchCase)
		{
			visitor.visitSwitchCase((IASSwitchCase) element);
		}
		else if (element instanceof IASSwitchDefault)
		{
			visitor.visitSwitchDefault((IASSwitchDefault) element);
		}
		else if (element instanceof IASSwitchStatement)
		{
			visitor.visitSwitchStatement((IASSwitchStatement) element);
		}
		else if (element instanceof IASSuperStatement)
		{
			visitor.visitSuperStatement((IASSuperStatement) element);
		}
		else if (element instanceof IASThrowStatement)
		{
			visitor.visitThrowStatement((IASThrowStatement) element);
		}
		else if (element instanceof IASTryStatement)
		{
			visitor.visitTryStatement((IASTryStatement) element);
		}
		else if (element instanceof IASUndefinedLiteral)
		{
			visitor.visitUndefinedLiteral((IASUndefinedLiteral) element);
		}
		else if (element instanceof IASDeclaration)
		{
			visitor.visitDeclaration((IASDeclaration) element);
		}
		else if (element instanceof IASWhileStatement)
		{
			visitor.visitWhileStatement((IASWhileStatement) element);
		}
		else if (element instanceof IASWithStatement)
		{
			visitor.visitWithStatement((IASWithStatement) element);
		}
		else if (element instanceof IASXMLLiteral)
		{
			visitor.visitXMLLiteral((IASXMLLiteral) element);
		}
		else
		{
			throw new IllegalArgumentException("unhandled IScriptElement "
					+ element.getClass().getName());
		}
	}
}
