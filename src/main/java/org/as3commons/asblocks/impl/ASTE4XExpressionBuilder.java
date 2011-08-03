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

import org.as3commons.asblocks.dom.IASDescendantExpression;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASExpressionAttribute;
import org.as3commons.asblocks.dom.IASFilterExpression;
import org.as3commons.asblocks.dom.IASPropertyAttribute;
import org.as3commons.asblocks.dom.IASStarAttribute;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTE4XExpressionBuilder
{
	public static IASDescendantExpression newDescendantExpression(
			IASExpression target, IASExpression selector)
	{
		LinkedListTree ast = newDescendantExpressionAST(ASTUtils.ast(target), ASTUtils.ast(selector));
		return new ASTASDescendantExpression(ast);
	}

	public static IASFilterExpression newFilterExpression(IASExpression target,
			IASExpression selector)
	{
		LinkedListTree ast = newFilterExpressionAST(ASTUtils.ast(target), ASTUtils.ast(selector));
		return new ASTASFilterExpression(ast);
	}

	public static IASStarAttribute newStarAttribute()
	{
		LinkedListTree ast = newStarAttributeAST();
		return new ASTASStarAttribute(ast);
	}

	public static IASPropertyAttribute newPropertyAttribute(String propertyName)
	{
		LinkedListTree ast = newPropertyAttributeAST(propertyName);
		return new ASTASPropertyAttribute(ast);
	}

	public static IASExpressionAttribute newExpressionAttribute(
			IASExpression expression)
	{
		LinkedListTree ast = newExpressionAttributeAST(ASTUtils.ast(expression));
		return new ASTASExpressionAttribute(ast);
	}

	@SuppressWarnings("deprecation")
	public static LinkedListTree newDescendantExpressionAST(
			LinkedListTree target, LinkedListTree selector)
	{
		LinkedListToken op = TokenBuilder.newE4XDescendant();
		LinkedListTree ast = ASTUtils.newAST(op);
		ASTBuilder.assertNoParent("left-hand expression", target);
		// TODO: is this needed..?
		if (ASTBuilder.precidence(ast) < ASTBuilder.precidence(target))
		{
			target = ASTBuilder.parenthise(target);
		}
		if (ASTBuilder.precidence(ast) < ASTBuilder.precidence(selector))
		{
			selector = ASTBuilder.parenthise(selector);
		}
		// don't use addChildWithTokens(); special handling below,
		ast.addChild(target);
		ast.addChild(selector);
		target.getStopToken().setNext(op);
		selector.getStartToken().setPrev(op);
		ast.setStartToken(target.getStartToken());
		ast.setStopToken(selector.getStopToken());
		return ast;
	}

	public static LinkedListTree newFilterExpressionAST(LinkedListTree target,
			LinkedListTree selector)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.E4X_FILTER);
		ASTBuilder.assertNoParent("target expression", target);
		ASTBuilder.assertNoParent("query expression", target);
		// don't use addChildWithTokens(); special handling below,
		ast.addChildWithTokens(target);
		ast.appendToken(TokenBuilder.newDot());
		ast.appendToken(TokenBuilder.newLParen());
		ast.addChildWithTokens(selector);
		ast.appendToken(TokenBuilder.newRParen());
		return ast;
	}

	public static LinkedListTree newStarAttributeAST()
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.E4X_ATTRI_STAR);
		ast.appendToken(TokenBuilder.newAt());
		ast.appendToken(TokenBuilder.newStar());
		return ast;
	}

	public static LinkedListTree newPropertyAttributeAST(String propertyName)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.E4X_ATTRI_PROPERTY);
		ast.appendToken(TokenBuilder.newAt());
		LinkedListTree prop = AS3FragmentParser.parseIdent(propertyName);
		ast.addChildWithTokens(prop);
		return ast;
	}

	public static LinkedListTree newExpressionAttributeAST(LinkedListTree expr)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.E4X_ATTRI_EXPR);
		ast.appendToken(TokenBuilder.newAt());
		ast.appendToken(TokenBuilder.newLBrack());
		ast.addChildWithTokens(expr);
		ast.appendToken(TokenBuilder.newRBrack());
		return ast;
	}
}
