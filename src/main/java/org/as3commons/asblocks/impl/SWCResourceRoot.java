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
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.as3commons.asblocks.dom.ASQName;
import org.as3commons.asblocks.dom.IResourceRoot;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class SWCResourceRoot implements IResourceRoot
{
	private List<ASQName> qnames = null;

	private static final String CATALOG_FILENAME = "catalog.xml";
	
	private File path;
	
	public SWCResourceRoot(File path) throws IOException
	{
		this.path = path;
		
		ZipFile zip = new ZipFile(path.getAbsolutePath());
		try
		{
			ZipEntry entry = zip.getEntry(CATALOG_FILENAME);
			if (entry == null)
			{
				throw new IllegalArgumentException("No " + CATALOG_FILENAME
						+ " in swc: " + path.getAbsolutePath());
			}
			qnames = readCatalog(zip.getInputStream(entry));
		}
		catch (ParserConfigurationException e)
		{
			throw new IOException(e.toString());
		}
		catch (SAXException e)
		{
			throw new IOException(e.toString());
		}
		catch (XPathExpressionException e)
		{
			throw new IOException(e.toString());
		}
		finally
		{
			zip.close();
		}
	}

	private List<ASQName> readCatalog(InputStream in)
			throws ParserConfigurationException, SAXException, IOException,
			XPathExpressionException
	{
		Document doc = loadDoc(in);
		XPathFactory fact = XPathFactory.newInstance();
		XPath xpath = fact.newXPath();
		// TODO: work out how to provide namespace
		// "http://www.adobe.com/flash/swccatalog/9" to the xpath
		NodeList list = (NodeList) xpath.evaluate(
				"/swc/libraries/library/script/def", doc,
				XPathConstants.NODESET);
		List<ASQName> result = new ArrayList<ASQName>();
		for (int i = 0; i < list.getLength(); i++)
		{
			Element def = (Element) list.item(i);
			String defined = def.getAttribute("id");
			result.add(toQName(defined));
		}
		return result;
	}

	private ASQName toQName(String def)
	{
		int pos = def.indexOf(':');
		if (pos > 0)
		{
			return new ASQName(def.substring(0, pos), def.substring(pos + 1));
		}
		return new ASQName(null, def);
	}

	private Document loadDoc(InputStream in)
			throws ParserConfigurationException, SAXException, IOException
	{
		DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = fact.newDocumentBuilder();
		InputSource is = new InputSource(in);
		is.setSystemId(CATALOG_FILENAME);
		return builder.parse(is);
	}

	public List<ASQName> getDefinitionQNames()
	{
		return qnames;
	}

	@Override
	public File getPath()
	{
		return path;
	}
}
