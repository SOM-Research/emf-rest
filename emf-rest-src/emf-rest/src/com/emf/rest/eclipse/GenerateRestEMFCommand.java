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

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.emf.rest.standalone.MTCStandaloneUtils;
import com.mtcflow.engine.core.MTCChoreographer;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Transformation;

public class GenerateRestEMFCommand implements IHandler {

	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		String tag = null;
		boolean copyLibraries = false;
		try {
			copyLibraries = (event.getParameter("emf-rest.copyLibraries") == null ? false : Boolean.valueOf(event.getParameter("emf-rest.copyLibraries")));
			tag = event.getParameter("emf-rest.tagParameter");
		} catch (Exception e) {
			e.printStackTrace();
		}
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
		IResource ecoreResource = (IResource) selection.getFirstElement();
		
		if(tag!=null && tag.equals("None")){
			GenerationListener genlistener = new GenerationListener(ecoreResource.getProject(),  Platform.getBundle("emf-rest"), true);
			genlistener.afterFinishExecution(null, null, null);
			return null;
		}

		
		HashMap<String, Object> variables = new HashMap<String, Object>();
		variables.put("ecore_file", ecoreResource.getLocation().toOSString());
		variables.put("genModel_file", ecoreResource.getLocation().toOSString().replaceFirst(".ecore", ".genmodel"));
		variables.put("output", ecoreResource.getProject().findMember("src").getLocation().toOSString());
		try {
			variables.put("modelDirectory", ecoreResource.getProject().findMember("WebContent/models").getLocation().toOSString());
		} catch (Exception ex) {
			variables.put("modelDirectory", "");
		}
		File scriptDir = new File(ecoreResource.getProject().getLocation().toOSString() + "/WebContent/scripts");
		if (tag == null || tag.equals("javascript")) {
			scriptDir.mkdirs();
		}
		variables.put("output_js", ecoreResource.getProject().getLocation().toOSString() + "/WebContent/scripts");
		HashMap<String, GenPackage> usedGenPackages = new HashMap<String, GenPackage>();

		try {
			ResourceSet eCoreResourceSet = new ResourceSetImpl();
			Resource eCoreResource = eCoreResourceSet.createResource(URI.createFileURI(ecoreResource.getLocation().toOSString()));
			eCoreResource.load(null);
			EPackage ePackage = (EPackage) eCoreResource.getContents().get(0);
			for (EAnnotation eAnnotation : ePackage.getEAnnotations()) {
				if (eAnnotation.getSource().equalsIgnoreCase("emf.gen.usedGenPackage")) {
					ResourceSet genModelResourceSet = new ResourceSetImpl();
					Resource genModelResource = genModelResourceSet.createResource(URI.createURI(eAnnotation.getDetails().get("genModel"), false));
					genModelResource.load(null);
					GenModel genModel = (GenModel) genModelResource.getContents().get(0);
					for (GenPackage genPackage : genModel.getGenPackages()) {
						String usedGenPackageName = eAnnotation.getDetails().get("name");
						if (genPackage.getEcorePackage().getName().equals(usedGenPackageName)) {
							usedGenPackages.put(usedGenPackageName, genPackage);
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}

		variables.put("usedGenPackages", usedGenPackages);
		variables.put("pluginName", ecoreResource.getProject().getName());
		variables.put("foreignModel", ecoreResource.getName());
		MTCChoreographer choreographer = MTCStandaloneUtils.startMTC("emf-rest", "default.mtc", variables, (tag == null ? null : Collections.singletonList(tag)));
		ArrayList<IResource> resourceToRefresh = new ArrayList<IResource>();
		resourceToRefresh.add(ecoreResource.getProject());
		choreographer.addExecutionListener(new GenerationListener(ecoreResource.getProject(), Platform.getBundle("emf-rest"), copyLibraries));
		choreographer.start();
		choreographer.modelReady("Ecore Fully Annotated", null);
		return null;
	}

	public boolean isEnabled() {
		return true;
	}

	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
