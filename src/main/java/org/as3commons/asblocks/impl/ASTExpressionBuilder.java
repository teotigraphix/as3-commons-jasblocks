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

import org.as3commons.asblocks.dom.IASArrayAccessExpression;
import org.as3commons.asblocks.dom.IASAssignmentExpression;
import org.as3commons.asblocks.dom.IASBinaryExpression;
import org.as3commons.asblocks.dom.IASConditionalExpression;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASFieldAccessExpression;
import org.as3commons.asblocks.dom.IASInvocationExpression;
import org.as3commons.asblocks.dom.IASNewExpression;
import org.as3commons.asblocks.dom.IASPostfixExpression;
import org.as3commons.asblocks.dom.IASPrefixExpression;
import org.as3commons.asblocks.dom.IASSimpleNameExpression;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTExpressionBuilder
{

	private static String stringifyArgs(List<IASExpression> args)
	{
		String result = "";
		int i = 0;
		for (IASExpression expression : args)
		{
			result += ASTUtils.stringifyNode(ASTUtils.ast(expression));
			if (i < args.size() - 1)
			{
				result += ",";
			}
			i++;
		}
		return result;
	}

	public static IASNewExpression newNewExpression(IASExpression target,
			List<IASExpression> arguments)
	{
		LinkedListTree subExpr = ASTUtils.ast(target);

		String tarStr = ASTUtils.stringifyNode(subExpr);
		String argStr = "";
		if (arguments != null)
		{
			argStr = "(" + stringifyArgs(arguments) + ")";
		}

		LinkedListTree ast = AS3FragmentParser.parseExpression("new " + tarStr
				+ argStr);

		ASTASNewExpression result = new ASTASNewExpression(ast);
		if (arguments != null)
		{
			//			result.setArguments(arguments);
		}

		return result;
		/*
		LinkedListTree ast = ASTUtils.newAST(AS3Parser.NEW, "new");
		ast.appendToken(TokenBuilder.newSpace());
		
		ASTBuilder.assertNoParent("sub-expression", subExpr);
		// TODO: recursively check the given subexpression
		ast.addChildWithTokens(subExpr);
		LinkedListTree args = ASTUtils.newParentheticAST(AS3Parser.ARGUMENTS,
				AS3Parser.LPAREN, "(", AS3Parser.RPAREN, ")");
		ASTASNewExpression result = new ASTASNewExpression(ast);
		result.setArguments(arguments);
		*/

	}

	public static IASNewExpression newNewExpression(IASExpression target)
	{
		return newNewExpression(target, null);
	}

	public static IASArrayAccessExpression newArrayAccessExpression(
			IASExpression target, IASExpression subscript)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.ARRAY_ACCESS);
		LinkedListTree targetExpr = ASTUtils.ast(target);
		ASTBuilder.assertNoParent("target expression", targetExpr);
		// TODO: recursively check the given subexpression
		ast.addChildWithTokens(targetExpr);
		ast.appendToken(TokenBuilder.newLBrack());
		LinkedListTree subscriptExpr = ASTUtils.ast(subscript);
		ASTBuilder.assertNoParent("subscript expression", subscriptExpr);
		ast.addChildWithTokens(subscriptExpr);
		ast.appendToken(TokenBuilder.newRBrack());
		ASTASArrayAccessExpression result = new ASTASArrayAccessExpression(ast);
		return result;
	}

	public static IASFieldAccessExpression newFieldAccessExpression(
			IASExpression target, String name)
	{
		LinkedListTree ast = newFieldAccessExpressionAST(ASTUtils.ast(target), ASTUtils.newAST(AS3Parser.IDENT, name));
		return new ASTASFieldAccessExpression(ast);
	}

	@SuppressWarnings("deprecation")
	public static LinkedListTree newFieldAccessExpressionAST(
			LinkedListTree target, LinkedListTree name)
	{
		LinkedListToken op = TokenBuilder.newDot();
		LinkedListTree ast = ASTUtils.newAST(op);
		ASTBuilder.assertNoParent("target expression", target);
		// don't use addChildWithTokens(); special handling below,
		ast.addChild(target);
		ast.addChild(name);
		target.getStopToken().setNext(op);
		name.getStartToken().setPrev(op);
		ast.setStartToken(target.getStartToken());
		ast.setStopToken(name.getStopToken());
		return ast;
	}

	public static IASExpression newExpression(String expression)
	{
		LinkedListTree ast = AS3FragmentParser.parseExpression(expression);
		// ANTLR creates a 'nil' parent node (in case the result is a
		// list).  We break the link to that parent because we assert
		// the parent is null when child nodes are attached elsewhere
		// in the tree.		
		ast.setParent(null);
		return ExpressionBuilder.build(ast);
	}

	public static IASSimpleNameExpression newSimpleNameExpression(String name)
	{
		LinkedListTree ast = AS3FragmentParser.parseExpression(name);
		return new ASTASSimpleNameExpression(ast);
	}

	public static IASPrefixExpression newPrefixExpression(LinkedListToken op,
			IASExpression sub)
	{
		LinkedListTree ast = ASTUtils.newAST(op);
		LinkedListTree subExpr = ASTUtils.ast(sub);
		ASTBuilder.assertNoParent("sub-expression", subExpr);
		ast.addChildWithTokens(subExpr);
		return new ASTASPrefixExpression(ast);
	}

	@SuppressWarnings("deprecation")
	public static IASPostfixExpression newPostfixExpression(LinkedListToken op,
			IASExpression sub)
	{
		LinkedListTree ast = ASTUtils.newAST(op);
		LinkedListTree subExpr = ASTUtils.ast(sub);
		ASTBuilder.assertNoParent("sub-expression", subExpr);
		ast.addChild(subExpr);
		ast.setStartToken(subExpr.getStartToken());
		subExpr.getStopToken().setNext(op);
		return new ASTASPostfixExpression(ast);
	}

	public static IASInvocationExpression newInvocationExpression(
			IASExpression target, List<IASExpression> arguments)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.FUNCTION_CALL);
		LinkedListTree subExpr = ASTUtils.ast(target);
		ASTBuilder.assertNoParent("sub-expression", subExpr);
		// TODO: recursively check the given subexpression
		ast.addChildWithTokens(subExpr);
		LinkedListTree args = ASTUtils.newParentheticAST(AS3Parser.ARGUMENTS, AS3Parser.LPAREN, "(", AS3Parser.RPAREN, ")");
		ast.addChildWithTokens(args);
		ASTASInvocationExpression result = new ASTASInvocationExpression(ast);
		result.setArguments(arguments);
		return result;
	}

	@SuppressWarnings("deprecation")
	public static IASAssignmentExpression newAssignExpression(
			LinkedListToken op, IASExpression left, IASExpression right)
	{
		LinkedListTree ast = ASTUtils.newAST(op);
		LinkedListTree leftExpr = ((ASTExpression) left).getAST();
		ASTBuilder.assertNoParent("left-hand expression", leftExpr);
		LinkedListTree rightExpr = ((ASTExpression) right).getAST();
		if (ASTBuilder.precidence(ast) < ASTBuilder.precidence(leftExpr))
		{
			leftExpr = ASTBuilder.parenthise(leftExpr);
		}
		if (ASTBuilder.precidence(ast) < ASTBuilder.precidence(rightExpr))
		{
			rightExpr = ASTBuilder.parenthise(rightExpr);
		}
		// don't use addChildWithTokens(); special handling below,
		ast.addChild(leftExpr);
		ast.addChild(rightExpr);
		leftExpr.getStopToken().setNext(op);
		rightExpr.getStartToken().setPrev(op);
		ast.setStartToken(leftExpr.getStartToken());
		ast.setStopToken(rightExpr.getStopToken());
		ASTBuilder.spaceEitherSide(op);
		return new ASTASAssignmentExpression(ast);
	}

	@SuppressWarnings("deprecation")
	public static IASBinaryExpression newBinaryExpression(LinkedListToken op,
			IASExpression left, IASExpression right)
	{
		LinkedListTree ast = ASTUtils.newAST(op);
		LinkedListTree leftExpr = ((ASTExpression) left).getAST();
		ASTBuilder.assertNoParent("left-hand expression", leftExpr);
		LinkedListTree rightExpr = ((ASTExpression) right).getAST();
		if (ASTBuilder.precidence(ast) < ASTBuilder.precidence(leftExpr))
		{
			leftExpr = ASTBuilder.parenthise(leftExpr);
		}
		if (ASTBuilder.precidence(ast) < ASTBuilder.precidence(rightExpr))
		{
			rightExpr = ASTBuilder.parenthise(rightExpr);
		}
		// don't use addChildWithTokens(); special handling below,
		ast.addChild(leftExpr);
		ast.addChild(rightExpr);
		leftExpr.getStopToken().setNext(op);
		rightExpr.getStartToken().setPrev(op);
		ast.setStartToken(leftExpr.getStartToken());
		ast.setStopToken(rightExpr.getStopToken());
		ASTBuilder.spaceEitherSide(op);
		return new ASTASBinaryExpression(ast);
	}

	@SuppressWarnings("deprecation")
	public static IASConditionalExpression newConditionalExpression(
			IASExpression conditionExpression, IASExpression thenExpression,
			IASExpression elseExpression)
	{
		LinkedListTree conditionExpr = ((ASTExpression) conditionExpression).getAST();
		LinkedListTree thenExpr = ((ASTExpression) thenExpression).getAST();
		LinkedListTree elseExpr = ((ASTExpression) elseExpression).getAST();

		LinkedListToken op = TokenBuilder.newQuestion();
		LinkedListToken colon = TokenBuilder.newColon();
		LinkedListTree ast = ASTUtils.newAST(op);
		// don't use addChildWithTokens(); special handling below,
		ast.addChild(conditionExpr);
		conditionExpr.getStopToken().setNext(op);
		ast.addChild(thenExpr);
		thenExpr.getStartToken().setPrev(op);
		thenExpr.getStopToken().setNext(colon);
		ast.addChild(elseExpr);
		elseExpr.getStartToken().setPrev(colon);
		ast.setStartToken(conditionExpr.getStartToken());
		ast.setStopToken(elseExpr.getStopToken());
		ASTBuilder.spaceEitherSide(op);
		ASTBuilder.spaceEitherSide(colon);
		return new ASTASConditionalExpression(ast);
	}
}
