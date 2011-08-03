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

package org.as3commons.asblocks;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASFile;
import org.as3commons.asblocks.dom.IResourceRoot;
import org.as3commons.asblocks.dom.Visibility;

/**
 * The <code>IASProject</code> API creates a root for a project 
 * dealing with actionscript source files and resources.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public interface IASProject
{
	//----------------------------------
	//  compilationUnits
	//----------------------------------

	/**
	 * The <code>List</code> of <code>IASCompilationUnit</code>.
	 * 
	 * @see #addCompilationUnit(IASCompilationUnit)
	 * @see #removeCompilationUnit(IASCompilationUnit)
	 * 
	 * @since 1.0
	 */
	public List<IASCompilationUnit> getCompilationUnits();

	//----------------------------------
	//  classPathEntries
	//----------------------------------

	/**
	 * The <code>List</code> of <code>String</code>.
	 * 
	 * @see #addClassPath(String)
	 * @see #removeClassPath(String)
	 * 
	 * @since 1.0
	 */
	public List<String> getClassPathEntries();

	/**
	 * The <code>List</code> of <code>IResourceRoot</code>.
	 * 
	 * @see #addClassPath(String)
	 * @see #removeClassPath(String)
	 * 
	 * @since 1.0
	 */
	public Collection<IResourceRoot> getClassPathResourceRoots();

	//----------------------------------
	//  sourcePathEntries
	//----------------------------------

	/**
	 * The <code>List</code> of <code>String</code> source path entries.
	 * 
	 * @see #addSourcePath(String)
	 * @see #removeSourcePath(String)
	 * 
	 * @since 1.0
	 */
	public List<String> getSourcePathEntries();

	/**
	 * The <code>List</code> of <code>IResourceRoot</code> source path roots.
	 * 
	 * @see #addSourcePath(String)
	 * @see #removeSourcePath(String)
	 * @see #getSourcePathEntries()
	 * 
	 * @since 1.0
	 */
	public Collection<IResourceRoot> getSourcePathResourceRoots();

	//----------------------------------
	//  outputLocation
	//----------------------------------

	/**
	 * Attempts to return an <code>IASFile</code> for the <code>File</code>.
	 * 
	 * @param file The location of the <code>IASFile</code>.
	 */
	public IASFile getFile(File file);

	/**
	 * Attempts to return an <code>IASFile</code> for the 
	 * <code>IASCompilationUnit</code>.
	 * 
	 * @param unit The <code>IASCompilationUnit</code> of the <code>IASFile</code>.
	 */
	public IASFile getFileForCompilationUnit(IASCompilationUnit unit);

	/**
	 * The <code>List</code> of <code>IASFile</code> found in the project.
	 * 
	 * @since 1.0
	 */
	public List<IASFile> getASFiles();

	/**
	 * The location where the source files are output.
	 * 
	 * <p>The output location is completely determined by the project and
	 * factories implementation. This could be a native file path or url,
	 * whatever the case, the application domain will know how to interpret
	 * the string location.<p>
	 * 
	 * @since 1.0
	 */
	public String getOutputLocation();

	/**
	 * @see #getOutputLocation()
	 */
	public void setOutputLocation(String value);

	//--------------------------------------------------------------------------
	//
	//  Methods
	//
	//--------------------------------------------------------------------------

	/**
	 * Adds an <code>IASCompilationUnit</code> to the project.
	 * 
	 * <p>If the project contains a reference to the same unit, the method
	 * will return false and short circut.</p>
	 * 
	 * @param unit The <code>IASCompilationUnit</code> to add.
	 * @return A <code>Boolean</code> indicating whether the unit was
	 * added correctly.
	 * 
	 * @see #getCompilationUnits()
	 * @see #removeCompilationUnit(IASCompilationUnit)
	 * 
	 * @since 1.0
	 */
	public boolean addCompilationUnit(IASCompilationUnit unit);

	/**
	 * Removes an <code>IASCompilationUnit</code> from the project.
	 * 
	 * <p>If the project does not contain a reference to the same unit, 
	 * the method will return false and short circut.</p>
	 * 
	 * @param unit The <code>IASCompilationUnit</code> to add.
	 * @return A <code>Boolean</code> indicating whether the unit was
	 * removed correctly.
	 * 
	 * @see #getCompilationUnits()
	 * @see #addCompilationUnit(IASCompilationUnit)
	 * 
	 * @since 1.0
	 */
	public boolean removeCompilationUnit(IASCompilationUnit unit);

	/**
	 * Adds a <code>String</code> class path to the project.
	 * 
	 * <p>A class path is a folder root or swc used for reference, these items 
	 * will not be parsed if <code>readAll()</code> is called.</p>
	 * 
	 * @param classPath A <code>String</code> base path location for resource 
	 * root files or swc.
	 * @return A <code>boolean</code> indicating the success.
	 * 
	 * @see #removeClassPath(String)
	 * 
	 * @since 1.0
	 */
	public boolean addClassPath(String classPath);

	/**
	 * Removes a <code>String</code> class path from the project.
	 * 
	 * @param classPath A <code>String</code> base path location for resource 
	 * root files or swc.
	 * @return A <code>boolean</code> indicating the success.
	 * 
	 * @see #addClassPath(String)
	 * 
	 * @since 1.0
	 */
	public boolean removeClassPath(String classPath);

	/**
	 * Adds a source path to the project.
	 * 
	 * @param sourcePath The <code>String</code> source path.
	 * @return A <code>Boolean</code> indicating success.
	 */
	public boolean addSourcePath(String sourcePath);

	/**
	 * Removes a source path from the project.
	 * 
	 * @param sourcePath The <code>String</code> source path.
	 * @return A <code>Boolean</code> indicating success.
	 */
	public boolean removeSourcePath(String sourcePath);

	/**
	 * Creates and returns a new public <code>class</code> by qualified name.
	 * 
	 * <p>Subclasses should call <code>addCompilationUnit()</code> after the
	 * unit has been created.</p>
	 * 
	 * @param qualifiedName A <code>String</code> qualified name.
	 * @return A new class <code>IASCompilationUnit</code>.
	 * 
	 * @see #addCompilationUnit(IASCompilationUnit)
	 * @see org.as3commons.asblocks.dom.IASCompilationUnit
	 * @see org.as3commons.asblocks.dom.IASClassType
	 * 
	 * @since 1.0
	 */
	public IASCompilationUnit newClass(String qualifiedName);

	/**
	 * Creates and returns a new public <code>interface</code> by qualified name.
	 * 
	 * <p>Subclasses should call <code>addCompilationUnit()</code> after the
	 * unit has been created.</p>
	 * 
	 * @param qualifiedName A <code>String</code> qualified name.
	 * @return A new interface <code>IASCompilationUnit</code>.
	 * 
	 * @see #addCompilationUnit(IASCompilationUnit)
	 * @see org.as3commons.asblocks.dom.IASCompilationUnit
	 * @see org.as3commons.asblocks.dom.IASInterfaceType
	 * 
	 * @since 1.0
	 */
	public IASCompilationUnit newInterface(String qualifiedName);

	/**
	 * Creates and returns a new public <code>function</code> by qualified name.
	 * 
	 * @param qualifiedName A <code>String</code> qualified name.
	 * @param visibility The <code>Visibility</code> of the function.
	 * @param returnType The return type of the function, this will be converted
	 * into a type.
	 * @return A new interface <code>IASCompilationUnit</code>.
	 */
	public IASCompilationUnit newFunction(String qualifiedName,
			Visibility visibility, String returnType);

	/**
	 * Creates and returns a new public <code>namespace</code> by qualified name.
	 * 
	 * @param qualifiedName A <code>String</code> qualified name.
	 * @param uri A <code>String</code> uri for the namespace.
	 * @return A new namespace <code>IASCompilationUnit</code>.
	 */
	public IASCompilationUnit newNamespace(String qualifiedName, String uri);

	/**
	 * Reads all class path entries and creates parsed 
	 * <code>IASCompilationUnit</code>s synchronously.
	 */
	public void readAll();

	/**
	 * Writes all <code>IASCompilationUnit</code>s synchronously.
	 * @throws IOException 
	 */
	public void writeAll() throws IOException;
}
