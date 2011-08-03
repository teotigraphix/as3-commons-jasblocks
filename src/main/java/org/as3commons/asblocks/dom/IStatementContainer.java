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

package org.as3commons.asblocks.dom;

import java.util.List;

import org.as3commons.asblocks.ASBlocksSyntaxError;

/**
 * Clients implement this interface to add block statement api.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 * 
 * @see org.as3commons.asblocks.dom.IASBlock
 */
public interface IStatementContainer
{
	//--------------------------------------------------------------------------
	//
	//  Properties
	//
	//--------------------------------------------------------------------------

	//----------------------------------
	//  hasCode
	//----------------------------------

	/**
	 * Whether the statement container contains child statements.
	 * 
	 * @see #getStatements()
	 */
	public boolean hasStatements();

	//----------------------------------
	//  statements
	//----------------------------------

	/**
	 * A <code>List</code> of <code>IASStatement</code>s contained in this
	 * statement container.
	 */
	public List<IASStatement> getStatements();

	//--------------------------------------------------------------------------
	//
	//  Methods
	//
	//--------------------------------------------------------------------------

	/**
	 * Adds a line of comment text to the statement container.
	 * 
	 * @param comment A <code>String</code> comment.
	 */
	public void addComment(String text);

	/**
	 * Adds (appends) an <code>IASStatement</code> to the container.
	 * 
	 * @param statement The <code>IASStatement</code> to add.
	 * @throws ASBlocksSyntaxError Statement contained in the list (AST).
	 * @return The <code>IASStatement</code> added.
	 */
	public IASStatement addStatement(IASStatement statement);

	/**
	 * Parses and adds (appends) an <code>IASStatement</code> to the container.
	 * 
	 * @param statement The <code>String</code> statement text to add as an 
	 * <code>IASStatement</code>.
	 * @return The <code>IASStatement</code> added.
	 * @throws ASBlocksSyntaxError Statement contained in the list (AST).
	 */
	public IASStatement parseStatement(String statement);

	/**
	 * Removes the <code>IASStatement</code> from the container if the AST was
	 * in the container's children.
	 * 
	 * @param statement The <code>IASStatement</code> to remove.
	 * @return The <code>IASStatement</code> remove.
	 * @throws ASBlocksSyntaxError Statement not contained in the list (AST).
	 */
	public IASStatement removeStatement(IASStatement statement);

	//--------------------------------------------------------------------------
	//
	//  Factory Methods
	//
	//--------------------------------------------------------------------------

	/**
	 * Creates a new <code>expression;</code> statement.
	 * 
	 * @param expression The <code>IASExpression</code> expression statement.
	 * @return A new <code>IExpressionStatement</code>.
	 */
	public IASExpressionStatement newExpressionStatement(
			IASExpression expression);

	/**
	 * @see #newExpressionStatement(IASExpression)
	 */
	public IASExpressionStatement parseNewExpressionStatement(String statement);

	/**
	 * Creates a new <code>if(condition){...} else {...}</code> statement.
	 * 
	 * @param condition The <code>IASExpression</code> condition.
	 * @return A new <code>IASIfStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASIfStatement
	 */
	public IASIfStatement newIf(IASExpression condition);

	/**
	 * @see #newIf(IASExpression)
	 */
	public IASIfStatement parseNewIf(String condition);

	/**
	 * Creates a new <code>for(initializer; condition; iterator){...}</code> statement.
	 * 
	 * @param initializer The <code>IASExpression</code> initializer.
	 * @param initializer The <code>IASExpression</code> condition.
	 * @param initializer The <code>IASExpression</code> iterator.
	 * @return A new <code>IASForStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASForStatement
	 */
	public IASForStatement newFor(IScriptElement initializer,
			IASExpression condition, IASExpression iterater);

	/**
	 * @see #newFor(IScriptElement, IASExpression, IASExpression)
	 */
	public IASForStatement parseNewFor(String initializer, String condition,
			String iterater);

	/**
	 * Creates a new <code>for(declaration in target){...}</code> statement.
	 * 
	 * @param declaration The <code>IScriptElement</code> declaration.
	 * @param target The <code>IASExpression</code> iteration target.
	 * @return A new <code>IASForInStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASForInStatement
	 */
	public IASForInStatement newForIn(IScriptElement declaration,
			IASExpression target);

	/**
	 * @see #newForIn(IScriptElement, IASExpression)
	 */
	public IASForInStatement parseNewForIn(String declaration, String target);

	/**
	 * Creates a new <code>for each(declaration in target){...}</code> statement.
	 * 
	 * @param declaration The <code>IScriptElement</code> declaration.
	 * @param target The <code>IASExpression</code> iteration target.
	 * @return A new <code>IASForEachInStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASForEachInStatement
	 */
	public IASForEachInStatement newForEachIn(IScriptElement declaration,
			IASExpression target);

	/**
	 * @see #newForEachIn(IScriptElement, IASExpression)
	 */
	public IASForEachInStatement parseNewForEachIn(String declaration,
			String target);

	/**
	 * Creates a new <code>while(condition) {...}</code> statement.
	 * 
	 * @param condition The <code>IASExpression</code> condition.
	 * @return A new <code>IASWhileStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASWhileStatement
	 */
	public IASWhileStatement newWhile(IASExpression condition);

	/**
	 * @see #newWhile(IASExpression)
	 */
	public IASWhileStatement parseNewWhile(String condition);

	/**
	 * Creates a new <code>do {...} while (condition)</code> statement.
	 * 
	 * @param condition The <code>IASExpression</code> while condition.
	 * @return A new <code>IASDoWhileStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASDoWhileStatement
	 */
	public IASDoWhileStatement newDoWhile(IASExpression condition);

	/**
	 * @see #newDoWhile(IASExpression)
	 */
	public IASDoWhileStatement parseNewDoWhile(String condition);

	/**
	 * Creates a new <code>switch(condition){ case label: default: }</code> statement.
	 * 
	 * @param arguments A <code>Vector</code> of <code>IASExpression</code>s.
	 * @return A new <code>IASSwitchStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASSwitchStatement
	 * @see org.as3commons.asblocks.dom.IASSwitchCase
	 * @see org.as3commons.asblocks.dom.IASSwitchDefault
	 */
	public IASSwitchStatement newSwitch(IASExpression condition);

	/**
	 * @see #newSwitch(IASExpression)
	 */
	public IASSwitchStatement parseNewSwitch(String condition);

	/**
	 * Creates a new <code>with(scope) {...}</code> statement.
	 * 
	 * @param scope The <code>IASExpression</code> scope.
	 * @return A new <code>IASWithStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASWithStatement
	 */
	public IASWithStatement newWith(IASExpression scope);

	/**
	 * @see #newWith(IASExpression)
	 */
	public IASWithStatement parseNewWith(String scope);

	/**
	 * Creates a new <code>var foo:int = 0</code> or 
	 * <code>var foo:int = 0, bar:int = 42</code> statement.
	 * 
	 * @param declaration The String variable declaration.
	 * @return A new <code>IASDeclarationStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASDeclarationStatement
	 */
	public IASDeclarationStatement newDeclaration(IScriptElement declaration);

	/**
	 * @see #newDeclaration(IScriptElement)
	 */
	public IASDeclarationStatement parseNewDeclaration(String declaration);

	/**
	 * Creates a new <code>return expression</code> statement.
	 * 
	 * @param expression The <code>IASExpression</code> to return.
	 * @return A new <code>IASReturnStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASReturnStatement
	 */
	public IASReturnStatement newReturn(IASExpression expression);

	/**
	 * @see #newReturn()
	 */
	public IASReturnStatement newReturn();

	/**
	 * @see #newReturn()
	 */
	public IASReturnStatement parseNewReturn(String expression);

	/**
	 * Creates a new <code>super(args...)</code>, <code>super.foo(args...)</code>
	 * op <code>super.bar = expression</code> statement.
	 * 
	 * @param arguments A <code>Vector</code> of <code>IASExpression</code>s.
	 * @return A new <code>IASSuperStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASSuperStatement
	 */
	//	public IASSuperStatement newSuper(List<IASExpression> arguments);

	/**
	 * @see #newSuper(List)
	 */
	//	public IASSuperStatement newSuper();

	/**
	 * @see #newSuper()
	 */
	//	public parseSuper(arguments:String = null):IASSuperStatement;

	/**
	 * Creates a new <code>break label;</code> statement.
	 * 
	 * @param label The simple label name.
	 * @return A new <code>IASBreakStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASBreakStatement
	 */
	public IASBreakStatement newBreak(String label);

	/**
	 * @see #newBreak(String)
	 */
	public IASBreakStatement newBreak();

	/**
	 * Creates a new <code>try {...} catch(name:type) {...}</code> statement.
	 * 
	 * @param name The <code>IASExpression</code> error instance name.
	 * @param type The <code>IASExpression</code> error instance type.
	 * @return A new <code>IASTryStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASTryStatement
	 */
	public IASTryStatement newTryCatch(IASExpression name, IASExpression type);

	/**
	 * Creates a new <code>try {...} catch(name:type) {...}</code> statement.
	 * 
	 * @param name The <code>String</code> error instance name.
	 * @param type The <code>String</code> error instance type.
	 * @return A new <code>IASTryStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASTryStatement
	 */
	public IASTryStatement parseNewTryCatch(String name, String type);

	/**
	 * Creates a new <code>try {...} finally {...}</code> statement.
	 * 
	 * @return A new <code>IASTryStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASTryStatement
	 */
	public IASTryStatement newTryFinally();

	/**
	 * Creates a new <code>continue label;</code> statement.
	 * 
	 * @param label The simple label name.
	 * @return A new <code>IASContinueStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASContinueStatement
	 */
	public IASContinueStatement newContinue(String label);

	/**
	 * @see #newContinue(String)
	 */
	public IASContinueStatement newContinue();

	/**
	 * Creates a new <code>throw new Error(args...)</code> or 
	 * <code>throw e1</code> statement.
	 * 
	 * @param expression The <code>IASExpression</code> access.
	 * @return A new <code>IASThrowStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASThrowStatement
	 */
	public IASThrowStatement newThrow(IASExpression expression);

	/**
	 * @see #newThrow(IASExpression)
	 */
	//	public parseThrow(expression:String):IASThrowsStatement;

	/**
	 * Creates a new <code>default xml namespace = ns1</code> statement.
	 * 
	 * @param namespace The String namespace.
	 * @return A new <code>IASDefaultXMLNamespaceStatement</code>.
	 * 
	 * @see org.as3commons.asblocks.dom.IASDefaultXMLNamespaceStatement
	 */
	public IASDefaultXMLNamespaceStatement newDefaultXMLNamespace(
			String namespace);

	/**
	 * Creates a new label statement.
	 * 
	 * @param name The name of the label.
	 * @return A new <code>IASLabelStatement</code> statement.
	 */
	public IASLabelStatement newLabel(IASExpression name);

	/**
	 * @see #newLabel(IASExpression)
	 */
	public IASLabelStatement parseNewLabel(String name);

	/**
	 * Creates a new CONFIG statement.
	 * 
	 * @param name The name of the config block.
	 * @return A new <code>IASConfigStatement</code> statement.
	 */
	public IASConfigStatement newConfig(IASExpression name);

	/**
	 * @see #newConfig(IASExpression)
	 */
	public IASConfigStatement parseNewConfig(String name);

	/**
	 * Creates a new use namespace statement.
	 * 
	 * @param name The name of the namespace.
	 * @return A new <code>IASUseStatement</code> statement.
	 */
	public IASUseStatement newUse(IASExpression name);

	/**
	 * @see #newUse(IASExpression)
	 */
	public IASUseStatement parseNewUse(String name);
}
