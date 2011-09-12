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

/*
 * ASQName
 * 
 * IASCompilationPackage [singleton]
 *   - localName                       core
 *   - packageName                     my.domain
 *   - qualifiedName                   my.domain.core
 * 
 * IASCompilationUnit
 *   - localName                       MyClass
 *   - packageName                     my.domain.core
 *   - qualifiedName                   my.domain.core.MyClass
 * 
 * IASPackage [foreach IASCompilationUnit]
 *   - localName                       core
 *   - packageName                     my.domain
 *   - qualifiedName                   my.domain.core
 *   
 * IASType
 *   - localName                       MyClass
 *   - packageName                     my.domain.core
 *   - qualifiedName                   my.domain.core.MyClass
 * 
 * IASField
 *   - localName                       myField
 *   - packageName                     my.domain.core
 *   - qualifiedName                   my.domain.core.MyClass#myField
 * 
 * IASMethod
 *   - localName                       myMethod()
 *   - packageName                     my.domain.core
 *   - qualifiedName                   my.domain.core.MyClass#myMethod()
 * 
 * IASMetaTag                          [[[my.domain.core].MyClass]#[[style]:[myStyle]]]
 *   - localName                       myStyle
 *   - packageName                     my.domain.core
 *   - qualifiedName                   my.domain.core.MyClass#style:myStyle
 *   - fragmentName                    style:myStyle
 * 
 */

/**
 * Adds the ability for types to become dynamic.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public class ASQName
{
	private String packageName = null;
	private String localName = null;
	private String fragmentName = null;
	private String fragmentType = null;
	
	private String mClassPath;

	public String getClassPath() {
        return mClassPath;
    }

    public void setClassPath(String value) {
        this.mClassPath = value;
    }

    public ASQName(String qname)
	{
		int pos = qname.lastIndexOf('.');
		if (pos != -1)
		{
			packageName = qname.substring(0, pos);
			parse(qname.substring(pos + 1));
		}
		else
		{
			packageName = null;
			parse(qname);
		}
	}

	private void parse(String data)
	{
		int pos = data.indexOf('#');
		if (pos != -1)
		{
			// next :: MyClass#myVariable
			localName = data.substring(0, pos);
			fragmentName = data.substring(pos + 1);

			pos = fragmentName.indexOf(':');
			if (pos != -1)
			{
				fragmentType = fragmentName.substring(0, pos);
				fragmentName = fragmentName.substring(pos + 1);
			}
		}
		else
		{
			localName = data;
		}
	}

	public ASQName(String packageName, String localName)
	{
		this.packageName = packageName;
		this.localName = localName;
	}

	public ASQName(String packageName, String localName, String fragmentName)
	{
		this.packageName = packageName;
		this.localName = localName;
		this.fragmentName = fragmentName;
	}

	public ASQName(String packageName, String localName, String fragmentType,
			String fragmentName)
	{
		this.packageName = packageName;
		this.localName = localName;
		this.fragmentType = fragmentType;
		this.fragmentName = fragmentName;
	}

	public boolean isQualified()
	{
		return packageName != null;
	}

	public boolean hasFragment()
	{
		return fragmentName != null;
	}

	public boolean hasFragmentType()
	{
		return fragmentType != null;
	}

	public String getLocalName()
	{
		return localName;
	}

	public void setLocalName(String localName)
	{
		this.localName = localName;
	}

	public String getPackageName()
	{
		return packageName;
	}

	public String getFragmentName()
	{
		return fragmentName;
	}

	public String getFragmentType()
	{
		return fragmentType;
	}

	public void setPackageName(String packageName)
	{
		this.packageName = packageName;
	}

	// added
	public String getQualifiedName()
	{
		if (isQualified())
		{
			if (hasFragment())
			{
				if (hasFragmentType())
				{
					return packageName + "." + localName + "#" + fragmentType
							+ ":" + fragmentName;
				}
				else
				{
					return packageName + "." + localName + "#" + fragmentName;
				}
			}
			else
			{
				if ("".equals(packageName))
				{
					return localName;
				}
				else
				{
					return packageName + "." + localName;
				}
			}
		}
		else
		{
			if (hasFragment())
			{
				if (hasFragmentType())
				{
					return localName + "#" + fragmentType + ":" + fragmentName;
				}
				else
				{
					return localName + "#" + fragmentName;
				}
			}
			else
			{
				return localName;
			}
		}
	}

	public String toString()
	{
		return getQualifiedName();
	}

	// eclipse generated
	public int hashCode()
	{
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result
				+ ((localName == null) ? 0 : localName.hashCode());
		result = PRIME * result
				+ ((packageName == null) ? 0 : packageName.hashCode());
		return result;
	}

	// eclipse generated
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final ASQName other = (ASQName) obj;
		if (localName == null)
		{
			if (other.localName != null)
				return false;
		}
		else if (!localName.equals(other.localName))
			return false;
		if (packageName == null)
		{
			if (other.packageName != null)
				return false;
		}
		else if (!packageName.equals(other.packageName))
			return false;
		return true;
	}

	public static ASQName create(String qname)
	{
		return new ASQName(qname);
	}

	public String getFragmentLink()
	{
		if ("style".equals(fragmentType) || "event".equals(fragmentType)
				|| "effect".equals(fragmentType)
				|| "skinstate".equals(fragmentType))
			return getQualifiedName();

		String tail = "";
		if ("method".equals(fragmentType))
			tail = "()";

		StringBuffer sb = new StringBuffer();
		sb.append(packageName);
		sb.append(".");
		sb.append(localName);
		sb.append("#");
		sb.append(fragmentName);
		sb.append(tail);

		return sb.toString();
	}
}