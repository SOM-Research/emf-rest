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
package com.emf.rest.standalone;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.Bundle;

import com.mtcflow.engine.IResourceLocator;
import com.mtcflow.engine.core.ExecutionData;
import com.mtcflow.engine.core.utils.FilenameUtils;
import com.mtcflow.model.mtc.HOTransformation;
import com.mtcflow.model.mtc.Library;
import com.mtcflow.model.mtc.M2MTransformation;
import com.mtcflow.model.mtc.M2TTransformation;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.MTCResource;
import com.mtcflow.model.mtc.MTCTransformation;
import com.mtcflow.model.mtc.Metamodel;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.Validation;

public class PluginResourceLocator implements IResourceLocator {

	private final Bundle bundle;
	private final MTC mtc;
	private File workingDirectory;

	public PluginResourceLocator(String bundleName, MTC mtc) {
		this.bundle = Platform.getBundle(bundleName);
		this.mtc = mtc;
		File tempFile = null;
		try {
			tempFile = File.createTempFile("mtc", "wdir");
		} catch (IOException e) {
			e.printStackTrace();
		}
		tempFile.delete();
		tempFile.mkdir();
		workingDirectory = tempFile;
	}

	public File findFile(String path) {
		try {
			URL fileURL = bundle.getEntry(path);
			return new File(FileLocator.toFileURL(fileURL).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getAbsolutFilePath(MTCResource resource) {
		final File f = getFile(resource);
		if (f == null) {
			return null;
		} else {
			return f.getAbsolutePath();
		}
	}

	public String getDefaultResourceExtension(MTCResource resource) {
		// TODO Auto-generated method stub
		return null;
	}

	public URI getEMFURI(MTCResource resource) {
		return URI.createFileURI(getPath(resource));
	}

	public File getFile(MTCResource resource) {
		String path = getPath(resource);
		if (path == null)
			return null;
		else
			return new File(path);
	}

	public InputStream getInputStream(MTCResource resource) {
		try {
			return getFile(resource).toURI().toURL().openStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getPath(MTCResource resource) {
		boolean workspace = false;
		try {
			if (resource.getExecutionInformation() != null && (Boolean) resource.getExecutionInformation().get(ExecutionData.GENERATED_IN_WORKSPACE)) {
				workspace = true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		String path = null;
		String baseFolder;
		//if (workspace) {
		//	baseFolder = workingDirectory.getAbsolutePath() + "/";
		//} else {
			baseFolder = getFolder(resource);
		//}
		if (resource.getFile() != null && !resource.getFile().trim().isEmpty()) {
			// If the model doesn't have a default Factory put the
			// XMIResourceFactoryImpl as default
			if (resource instanceof Model) {
				try {
					String extension = FilenameUtils.getExtension(resource.getName());
					if (Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(extension) == null) {
						Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(extension, new XMIResourceFactoryImpl());
					}
				} catch (Exception ex) {

				}
			}
			path = baseFolder + resource.getFile();
		} else if (resource.getURI() != null && !resource.getURI().trim().isEmpty()) {
			// Load using URI
			return resource.getURI();
		} else {
			// Load using name
			path = baseFolder + resource.getName() + getDefaultResourceExtension(resource);
		}
		while (path.contains("//")) {
			path = path.replaceAll("//", "/");
		}

		String entryPath = getEntryPath(path);
		if (entryPath == null) {
			return resource.getFile();
		} else {
			return entryPath;
		}
	}

	private String getEntryPath(String path) {
		URL fileURL = bundle.getEntry(path);
		try {
			String fileStringUrl = FileLocator.toFileURL(fileURL).toString();
			fileStringUrl = fileStringUrl.replaceFirst("file:", "");
			return new File(fileStringUrl).getAbsolutePath();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return null;
	}

	public <T> T getResourceAs(Class<T> resource, MTCResource arg1) {
		System.out.println("getResourceAs");
		return null;
	}

	public String getResourceExtension(MTCResource resource) {
		File f = getFile(resource);
		if (f == null)
			return "";
		String[] nameParts = f.getName().split("[.]");
		return nameParts[nameParts.length - 1];
	}

	public <T> T getResourceSourceAs(Class<T> resource, MTCResource arg1) {
		System.out.println("getResourceSourceAs");
		return null;
	}

	public File getTarget(M2TTransformation resource) {
		return new File(resource.getTarget());
	}

	public String getWorkingFolder() {
		return workingDirectory.getAbsolutePath();
	}

	public boolean isURIBased(MTCResource resource) {
		return resource.getURI() != null && !resource.getURI().trim().isEmpty();
	}

	public String getFolder(MTCResource resource) {
		String path = null;
		if (resource instanceof Metamodel) {
			path = mtc.getMetamodelsFolder();
		} else if (resource instanceof HOTransformation) {
			path = mtc.getHOTransformationsFolder();
		} else if (resource instanceof MTCTransformation) {
			path = "/mtcs/";
		} else if (resource instanceof Model) {
			path = mtc.getModelsFolder();
		} else if (resource instanceof M2MTransformation) {
			path = mtc.getM2MTransformationsFolder();
		} else if (resource instanceof HOTransformation) {
			path = mtc.getHOTransformationsFolder();
		} else if (resource instanceof M2TTransformation) {
			path = mtc.getM2TTransformationsFolder();
		} else if (resource instanceof Validation) {
			path = mtc.getValidationsFolder();
		} else if (resource instanceof Library) {
			path = mtc.getLibrariesFolder();
		} else {
			path = "";
		}
		return (path.endsWith("/") ? path : path + "/");
	}

}
