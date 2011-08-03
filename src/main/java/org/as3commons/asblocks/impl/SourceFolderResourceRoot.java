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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.as3commons.asblocks.dom.ASQName;
import org.as3commons.asblocks.dom.FXQname;
import org.as3commons.asblocks.dom.IResourceRoot;

/**
 * A ResourceRoot implementation that finds QNames from ActionScript source
 * files in a source folder hierarchy.
 */
public class SourceFolderResourceRoot implements IResourceRoot
{
	private File path;

	private List<ASQName> qnames = null;

	/**
	 * @param path
	 */
	public SourceFolderResourceRoot(File path)
	{
		this.path = path;
	}

	@Override
	public List<ASQName> getDefinitionQNames()
	{
		if (qnames == null)
		{
			List<String> result = new ArrayList<String>();
			loadQNames("", result);
			qnames = toQNames(result);
		}
		return qnames;
	}

	private List<ASQName> toQNames(List<String> files)
	{
		List<ASQName> result = new ArrayList<ASQName>();
		for (Iterator<String> i = files.iterator(); i.hasNext();)
		{
			String file = (String) i.next();
			result.add(toQName(file));
		}
		return result;
	}

	private ASQName toQName(String file)
	{
		if (file.endsWith(".as"))
		{
			String typeName = file.replace(File.separatorChar, '.').substring(0, file.length() - 3);
			return new ASQName(typeName);
		}
		else if (file.endsWith(".mxml"))
		{
			String typeName = file.replace(File.separatorChar, '.').substring(0, file.length() - 5);
			return new FXQname(typeName, path.getAbsoluteFile());
		}
		throw new IllegalArgumentException("Unkown file type for Resource " + file);
	}

	private void loadQNames(String subfolder, List<String> result)
	{
		File here = new File(path, subfolder);
		File[] list = here.listFiles();
		for (int i = 0; i < list.length; i++)
		{
			File entry = list[i];
			String name = entry.getName();
			String newname;
			if (subfolder.length() == 0)
			{
				newname = name;
			}
			else
			{
				newname = subfolder + File.separator + name;
			}
			if (entry.isDirectory())
			{
				loadQNames(newname, result);
			}
			else
			{
				if (name.endsWith(".as") || name.endsWith(".mxml"))
				{
					result.add(newname);
				}
			}
		}
	}

	@Override
	public File getPath()
	{
		return path;
	}
}