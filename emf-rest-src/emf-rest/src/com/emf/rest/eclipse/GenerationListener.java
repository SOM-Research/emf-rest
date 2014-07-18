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
package com.emf.rest.eclipse;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.osgi.framework.Bundle;

import com.mtcflow.engine.ExecutionListener;
import com.mtcflow.engine.IExecutionEnvironment;
import com.mtcflow.model.mtc.MTC;

public class GenerationListener extends ExecutionListener {

	final IProject project;
	final Bundle bundle;
	final boolean copyLibraries;

	public GenerationListener(final IProject project, final Bundle bundle, final boolean copyLibraries) {
		this.bundle = bundle;
		this.project = project;
		this.copyLibraries = copyLibraries;
	}

	@Override
	public void afterFinishExecution(MTC mtc, String modelPath, IExecutionEnvironment executionEnvironment) {
		if (copyLibraries) {
			try {
				// look for web project
				IFolder webWebInfDir = project.getFolder("WebContent/WEB-INF/lib");
				String copyDir = "lib";
				if (webWebInfDir.exists()) {
					copyDir = "WebContent/WEB-INF/lib";
				}
				copyJar(project, copyDir, "activation-1.1.jar");
				copyJar(project, copyDir, "async-http-servlet-3.0-3.0.7.Final.jar");
				copyJar(project, copyDir, "commons-codec-1.6.jar");
				copyJar(project, copyDir, "commons-io-2.1.jar");
				copyJar(project, copyDir, "commons-logging-1.1.1.jar");
				copyJar(project, copyDir, "httpclient-4.2.1.jar");
				copyJar(project, copyDir, "httpcore-4.2.1.jar");
				copyJar(project, copyDir, "jaxrs-api-3.0.7.Final.jar");
				copyJar(project, copyDir, "jcip-annotations-1.0.jar");
				copyJar(project, copyDir, "jettison-1.3.5.jar");
				copyJar(project, copyDir, "org.eclipse.emf.common-2.9.2-v20131212-0545.jar");
				copyJar(project, copyDir, "org.eclipse.emf.ecore-2.9.2-v20131212-0545.jar");
				copyJar(project, copyDir, "org.eclipse.emf.ecore.xmi-2.9.1-v20131212-0545.jar");
				copyJar(project, copyDir, "resteasy-client-3.0.7.Final.jar");
				copyJar(project, copyDir, "resteasy-jaxb-provider-3.0.7.Final.jar");
				copyJar(project, copyDir, "resteasy-jaxrs-3.0.7.Final.jar");
				copyJar(project, copyDir, "jboss-annotations-api_1.1_spec-1.0.1.Final.jar");
				copyJar(project, copyDir, "resteasy-jettison-provider-3.0.7.Final.jar");
				copyJar(project, copyDir, "resteasy-servlet-initializer-3.0.7.Final.jar");
				copyJar(project, copyDir, "stax-api-1.0.1.jar");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {

		}
	}

	private void copyJar(IProject project, String baseDir, String jarName) throws CoreException, IOException {
		IFolder baseDirFile = project.getFolder(baseDir);
		if (!baseDirFile.exists()) {
			baseDirFile.create(true, true, null);
		}
		IFile f = project.getFile(baseDir + "/" + jarName);
		if (!f.exists()) {
			URL commonJar = bundle.getEntry("copy_libs/" + jarName);
			f.create(commonJar.openStream(), true, null);
		}
	}

}
