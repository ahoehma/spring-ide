/*
 * Copyright 2002-2004 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

package org.springframework.ide.eclipse.beans.core.model;

import java.util.Collection;

import org.springframework.ide.eclipse.core.model.ISourceModelElement;

/**
 * Holds all data of a Spring bean.
 */
public interface IBean extends ISourceModelElement {

	String[] getAliases();

	Collection getConstructorArguments();

	IBeanProperty getProperty(String name);

	Collection getProperties();

	Collection getInnerBeans();

	String getClassName();

	/**
	 * Returns the name of the parent bean (in case of a child bean) or null
	 * (in case of a root bean).
	 */
	String getParentName();

	public boolean isRootBean();

	public boolean isSingleton();

	public boolean isAbstract();

	public boolean isLazyInit();

	public boolean isInnerBean();
}
