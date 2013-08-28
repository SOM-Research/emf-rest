/*******************************************************************************
 * Copyright (c) 2013 EMF-REST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Camilo Alvarez (cadorca@gmail.com)  - initial API and implementation
 ******************************************************************************/
package com.emf.rest;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.epsilon.common.util.UriUtil;

public class Start {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws Exception {
		URI u = UriUtil.resolve("serialization/modelSerializer.egl", new URI("file:/C:/Documents%20and%20Settings/Administrador/workspace-development/emf-rest/transformations/M2T/"),new URI("file:/C:/Documents%20and%20Settings/Administrador/runtime-EclipseApplication/SDFSDF/src/"));
		System.out.println(u);
		u.toURL();
	}

}
