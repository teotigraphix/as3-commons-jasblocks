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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.runtime.tree.RewriteEmptyStreamException;
import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.IASParser;
import org.as3commons.asblocks.IASProject;
import org.as3commons.asblocks.dom.ASQName;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASFile;
import org.as3commons.asblocks.dom.IResourceRoot;
import org.as3commons.asblocks.dom.Visibility;

//import com.teotigraphix.fxblocks.impl.ASTFXCompilationUnit;
//import com.teotigraphix.fxblocks.impl.ASTFXParser;
//import com.teotigraphix.fxblocks.impl.FXQname;

public class ASTASProject implements IASProject
{
	private ASFactory factory;

	private List<IASCompilationUnit> compilationUnits = new ArrayList<IASCompilationUnit>();

	private List<String> classPaths = new ArrayList<String>();

	private Map<String, IResourceRoot> classPathResourceRoots = new HashMap<String, IResourceRoot>();

	private String outputLocation;

	private List<String> sourcePaths = new ArrayList<String>();

	private Map<String, IResourceRoot> sourcePathResourceRoots = new HashMap<String, IResourceRoot>();

	private Map<String, IASFile> files = new HashMap<String, IASFile>();

	//--------------------------------------------------------------------------
	//
	//  IASProject API :: Properties
	//
	//--------------------------------------------------------------------------

	@Override
	public List<IASCompilationUnit> getCompilationUnits()
	{
		return Collections.unmodifiableList(compilationUnits);
	}

	@Override
	public List<String> getClassPathEntries()
	{
		return Collections.unmodifiableList(classPaths);
	}

	@Override
	public Collection<IResourceRoot> getClassPathResourceRoots()
	{
		return classPathResourceRoots.values();
	}

	@Override
	public List<String> getSourcePathEntries()
	{
		return Collections.unmodifiableList(sourcePaths);
	}

	@Override
	public Collection<IResourceRoot> getSourcePathResourceRoots()
	{
		return classPathResourceRoots.values();
	}

	@Override
	public IASFile getFile(File file)
	{
		return files.get(file.getAbsolutePath());
	}

	@Override
	public IASFile getFileForCompilationUnit(IASCompilationUnit unit)
	{
		for (Entry<String, IASFile> set : files.entrySet())
		{
			IASFile file = set.getValue();
			if (file.getCompilationUnit().equals(unit))
			{
				return file;
			}
		}
		return null;
	}

	@Override
	public List<IASFile> getASFiles()
	{
		return (List<IASFile>) files.values();
	}

	@Override
	public String getOutputLocation()
	{
		return outputLocation;
	}

	@Override
	public void setOutputLocation(String outputLocation)
	{
		this.outputLocation = outputLocation;
	}

	private File getAbsoluteOutputLocation()
	{
		return new File(outputLocation);
	}

	//--------------------------------------------------------------------------
	//
	//  Constructor
	//
	//--------------------------------------------------------------------------

	/**
	 * Constructor, creates a new project with the associated factory.
	 * 
	 * @param factory The <code>ASFactory</code> implementation used with the
	 * project. This instance will be used when creating types.
	 */
	public ASTASProject(ASFactory factory)
	{
		this.factory = factory;
	}

	//--------------------------------------------------------------------------
	//
	//  IASProject API :: Methods
	//
	//--------------------------------------------------------------------------

	@Override
	public boolean addCompilationUnit(IASCompilationUnit unit)
	{
		compilationUnits.add(unit);
		addFileUnit(unit);
		return true;
	}

	@Override
	public boolean removeCompilationUnit(IASCompilationUnit unit)
	{
		compilationUnits.remove(unit);
		//TODO removeFileUnit()
		return true;
	}

	@Override
	public boolean addClassPath(String classpathEntry)
	{
		if (classPaths.contains(classpathEntry))
			return false;

		IResourceRoot root = resourceRootFor(classpathEntry);
		classPathResourceRoots.put(classpathEntry, root);
		classPaths.add(classpathEntry);

		return true;
	}

	@Override
	public boolean removeClassPath(String classPathEntry)
	{
		classPaths.remove(classPathEntry);
		classPathResourceRoots.remove(classPathEntry);
		return true;
	}

	@Override
	public boolean addSourcePath(String sourcePathEntry)
	{
		if (sourcePaths.contains(sourcePathEntry))
			return false;

		IResourceRoot root = resourceRootFor(sourcePathEntry);
		sourcePathResourceRoots.put(sourcePathEntry, root);
		sourcePaths.add(sourcePathEntry);

		return true;
	}

	@Override
	public boolean removeSourcePath(String sourcePathEntry)
	{
		sourcePaths.remove(sourcePathEntry);
		sourcePathResourceRoots.remove(sourcePathEntry);
		return true;
	}

	@Override
	public IASCompilationUnit newClass(String qualifiedClassName)
	{
		IASCompilationUnit unit = factory.newClass(qualifiedClassName);
		addCompilationUnit(unit);
		return unit;
	}

	@Override
	public IASCompilationUnit newInterface(String qualifiedInterfaceName)
	{
		IASCompilationUnit unit = factory.newInterface(qualifiedInterfaceName);
		addCompilationUnit(unit);
		return unit;
	}

	@Override
	public IASCompilationUnit newFunction(String qualifiedName,
			Visibility visibility, String returnType)
	{
		IASCompilationUnit unit = factory.newFunction(qualifiedName, returnType);
		addCompilationUnit(unit);
		return unit;
	}

	@Override
	public IASCompilationUnit newNamespace(String name, String uri)
	{
		IASCompilationUnit unit = factory.newNamespace(name, uri);
		addCompilationUnit(unit);
		return unit;
	}

	@Override
	public void readAll()
	{
		List<String> failedFiles = new ArrayList<String>();

		for (IResourceRoot root : sourcePathResourceRoots.values())
		{
			List<ASQName> qnames = root.getDefinitionQNames();
			for (ASQName qname : qnames)
			{
				System.out.println(qname);
				IASParser asparser = factory.newParser();
//				IASParser fxparser = new ASTFXParser();

				File file = toSourceFile(root.getPath(), qname);

				FileInputStream in;
				IASCompilationUnit unit;
				try
				{
					if (file.getAbsolutePath().endsWith(".as"))
					{
						in = new FileInputStream(file);
						unit = asparser.parseHighlevelIn(new InputStreamReader(
								in));
						addCompilationUnit(unit);
					}
					else if (file.getAbsolutePath().endsWith(".mxml"))
					{
//						in = new FileInputStream(file);
//						unit = fxparser.parseIn(new InputStreamReader(in));
//						((ASTFXCompilationUnit) unit).setQName((FXQname) qname);
//						addCompilationUnit(unit);
					}

					//addFile(file, unit);
				}
				catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
				catch (ASBlocksSyntaxError e)
				{
					String error = file.getAbsolutePath() + "\n" + "-"
							+ e.getMessage();

					System.err.println(error);

					failedFiles.add(error);
				}
				catch (RewriteEmptyStreamException e)
				{
					String error = file.getAbsolutePath() + "\n" + "-"
							+ e.getMessage();

					System.err.println(error);

					failedFiles.add(error);
				}
				//InputStream in = getClass().getClassLoader().getResourceAsStream("AllSyntax.as");
				//ActionScriptParser parser = fact.newParser();
				//ASCompilationUnit unit = parser.parse(new InputStreamReader(in));				

			}
		}
		System.err.println("done");
	}

	private void addFile(File file, IASCompilationUnit unit)
	{
		files.put(file.getAbsolutePath(), new ASTASFile(file, unit));
	}

	private File toSourceFile(File path, ASQName name)
	{
//		if (name instanceof FXQname)
//		{
//			String base = path.getAbsolutePath();
//			String tail = name.toString().replace(".", File.separator);
//			return new File(base + File.separator + tail + ".mxml");
//		}
//		else
//		{
			String base = path.getAbsolutePath();
			String tail = name.toString().replace(".", File.separator);
			return new File(base + File.separator + tail + ".as");
//		}
	}

	@Override
	public void writeAll() throws IOException
	{
		for (Iterator<IASCompilationUnit> i = compilationUnits.iterator(); i.hasNext();)
		{
			IASCompilationUnit cu = (IASCompilationUnit) i.next();
			write(outputLocation, cu);
		}
	}

	//--------------------------------------------------------------------------
	//
	//  Private :: Methods
	//
	//--------------------------------------------------------------------------

	private IResourceRoot resourceRootFor(String classpathEntry)
	{
		File path = new File(classpathEntry);
		if (path.isDirectory())
		{
			return new SourceFolderResourceRoot(path);
		}
		if (classpathEntry.endsWith(".swc"))
		{
			try
			{
				return new SWCResourceRoot(path);
			}
			catch (IOException e)
			{
				throw new RuntimeException(e);
			}
		}
		throw new IllegalArgumentException("Unknown resorce type: "
				+ classpathEntry);
	}

	public void performAutoImport()
	{
		//AutoImporter autoImporter = new AutoImporter();
		//autoImporter.performAutoImport(this);
	}

	/**
	 * Writes the ActionScript code in the given CompilationUnit to the
	 * given directory, creating any subfolders for package hierarchy as
	 * appropriate, and deriving the filename from the name of the type
	 * defined by the compilation unit.
	 */
	private void write(String destinationDir, IASCompilationUnit cu)
			throws IOException
	{
		String filename = filenameFor(cu);
		File destFile = new File(destinationDir, filename);
		destFile.getParentFile().mkdirs();
		FileOutputStream os = new FileOutputStream(destFile);
		OutputStreamWriter out = new OutputStreamWriter(os);
		factory.newWriter().write(out, cu);
		out.close();
	}

	private static String filenameFor(IASCompilationUnit unit)
	{
		String name;
		String pkg = unit.getPackageName();
		if (pkg == null || pkg.equals(""))
		{
			name = unit.getType().getName();
		}
		else
		{
			name = unit.getPackageName() + "." + unit.getType().getName();
		}
		return name.replace('.', File.separatorChar) + ".as";
	}

	private void addFileUnit(IASCompilationUnit unit)
	{
		File path = getAbsoluteOutputLocation();
		File file = toSourceFile(path, unit.getQName());
		addFile(file, unit);
	}

}