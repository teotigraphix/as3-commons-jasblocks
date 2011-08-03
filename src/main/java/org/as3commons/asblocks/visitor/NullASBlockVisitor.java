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

public class NullASBlockVisitor implements IASBlockVisitor
{

	@Override
	public void visitParameter(IASParameter param)
	{

	}

	@Override
	public void visitArrayAccessExpression(IASArrayAccessExpression expr)
	{

	}

	@Override
	public void visitArrayLiteral(IASArrayLiteral lit)
	{

	}

	@Override
	public void visitAssignmentExpression(IASAssignmentExpression expr)
	{

	}

	@Override
	public void visitBinaryExpression(IASBinaryExpression expr)
	{

	}

	@Override
	public void visitBlockStatement(IASBlock stmt)
	{

	}

	@Override
	public void visitBooleanLiteral(IASBooleanLiteral lit)
	{

	}

	@Override
	public void visitBreakStatement(IASBreakStatement stmt)
	{

	}

	@Override
	public void visitCatchClause(IASCatchClause catchClause)
	{

	}

	@Override
	public void visitClassType(IASClassType type)
	{

	}

	@Override
	public void visitCompilationUnit(IASCompilationUnit unit)
	{

	}

	@Override
	public void visitConditionalExpression(IASConditionalExpression expr)
	{

	}

	@Override
	public void visitContinueStatement(IASContinueStatement stmt)
	{

	}

	@Override
	public void visitDeclarationStatement(IASDeclarationStatement stmt)
	{

	}

	@Override
	public void visitDefaultXMLNamespaceStatement(
			IASDefaultXMLNamespaceStatement stmt)
	{

	}

	@Override
	public void visitDoWhileStatement(IASDoWhileStatement stmt)
	{

	}

	@Override
	public void visitDescendantExpression(IASDescendantExpression expr)
	{

	}

	@Override
	public void visitExpressionAttribute(IASExpressionAttribute expr)
	{

	}

	@Override
	public void visitExpressionStatement(IASExpressionStatement stmt)
	{

	}

	@Override
	public void visitField(IASField field)
	{

	}

	@Override
	public void visitFieldAccessExpression(IASFieldAccessExpression expr)
	{

	}

	@Override
	public void visitFilterExpression(IASFilterExpression expr)
	{

	}

	@Override
	public void visitFinallyClause(IASFinallyClause fin)
	{

	}

	@Override
	public void visitForEachInStatement(IASForEachInStatement stmt)
	{

	}

	@Override
	public void visitForInStatement(IASForInStatement stmt)
	{

	}

	@Override
	public void visitForStatement(IASForStatement stmt)
	{

	}

	@Override
	public void visitFunctionExpression(IASFunctionExpression e)
	{

	}

	@Override
	public void visitIfStatement(IASIfStatement stmt)
	{

	}

	@Override
	public void visitIntegerLiteral(IASIntegerLiteral lit)
	{

	}

	@Override
	public void visitInterfaceType(IASInterfaceType type)
	{

	}

	@Override
	public void visitInvocationExpression(IASInvocationExpression expr)
	{

	}

	@Override
	public void visitMetaTag(IASMetaTag tag)
	{

	}

	@Override
	public void visitMethod(IASMethod method)
	{

	}

	@Override
	public void visitNewExpression(IASNewExpression expr)
	{

	}

	@Override
	public void visitNullLiteral(IASNullLiteral lit)
	{

	}

	@Override
	public void visitObjectPropertyField(IASPropertyField field)
	{

	}

	@Override
	public void visitObjectLiteral(IASObjectLiteral lit)
	{

	}

	@Override
	public void visitPackage(IASPackage pkg)
	{

	}

	@Override
	public void visitPostfixExpression(IASPostfixExpression expr)
	{

	}

	@Override
	public void visitPrefixExpression(IASPrefixExpression expr)
	{

	}

	@Override
	public void visitPropertyAttribute(IASPropertyAttribute expr)
	{

	}

	@Override
	public void visitRegexpLiteral(IASRegexpLiteral e)
	{

	}

	@Override
	public void visitReturnStatement(IASReturnStatement stmt)
	{

	}

	@Override
	public void visitSimpleNameExpression(IASSimpleNameExpression e)
	{

	}

	@Override
	public void visitStringLiteral(IASStringLiteral lit)
	{

	}

	@Override
	public void visitStarAttribute(IASStarAttribute expr)
	{

	}

	@Override
	public void visitSuperStatement(IASSuperStatement stmt)
	{

	}

	@Override
	public void visitSwitchCase(IASSwitchCase lab)
	{

	}

	@Override
	public void visitSwitchDefault(IASSwitchDefault lab)
	{

	}

	@Override
	public void visitSwitchStatement(IASSwitchStatement stmt)
	{

	}

	@Override
	public void visitThrowStatement(IASThrowStatement stmt)
	{

	}

	@Override
	public void visitTryStatement(IASTryStatement stmt)
	{

	}

	@Override
	public void visitUndefinedLiteral(IASUndefinedLiteral lit)
	{

	}

	@Override
	public void visitDeclaration(IASDeclaration var)
	{

	}

	@Override
	public void visitWhileStatement(IASWhileStatement stmt)
	{

	}

	@Override
	public void visitWithStatement(IASWithStatement stmt)
	{

	}

	@Override
	public void visitXMLLiteral(IASXMLLiteral lit)
	{

	}

}
