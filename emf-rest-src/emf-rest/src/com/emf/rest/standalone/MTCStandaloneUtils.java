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

import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.osgi.framework.Bundle;

import com.mtcflow.engine.IMTCConsole;
import com.mtcflow.engine.MTCFlow;
import com.mtcflow.engine.core.MTCChoreographer;
import com.mtcflow.engine.core.TransformationExecutorFactory;
import com.mtcflow.engine.eclipse.EclipseConsole;
import com.mtcflow.engine.egl.EGLTechnologyManager;
import com.mtcflow.engine.eol.EOLTechnologyManager;
import com.mtcflow.engine.etl.ETLTechnologyManager;
import com.mtcflow.model.mtc.MTC;
import com.mtcflow.model.mtc.Model;
import com.mtcflow.model.mtc.MtcPackage;
import com.mtcflow.model.mtc.Transformation;

public class MTCStandaloneUtils {

	private static IMTCConsole console = null;

	public MTCStandaloneUtils() {

	}

	public static void initializeRegistry() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mtc", new XMIResourceFactoryImpl());
		MTCFlow.TechnologyManagerRegistry.INSTANCE.put("egl", new EGLTechnologyManager());
		MTCFlow.TechnologyManagerRegistry.INSTANCE.put("etl", new ETLTechnologyManager());
		MTCFlow.TechnologyManagerRegistry.INSTANCE.put("eol", new EOLTechnologyManager());
	}

	public static MTC loadModel(String path) {
		// Initialize the model
		ResourceSet rs = new ResourceSetImpl();
		try {
			if (rs.getPackageRegistry().get(MtcPackage.eNS_URI) == null) {
				EPackage.Registry.INSTANCE.put(MtcPackage.eNS_URI, MtcPackage.eINSTANCE);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		Resource resource = rs.getResource(URI.createFileURI(path), true);
		return (MTC) resource.getContents().get(0);
	}

	public static MTCChoreographer startMTC(IProject project, String bundle, String mtc, HashMap<String, Object> variables) {
		return startMTC(project,bundle, mtc, null, null, null, variables);
	}

	public static MTCChoreographer startMTC(IProject project, String bundle, String mtc, HashMap<String, Object> variables, List<String> tags) {
		return startMTC(project,bundle, mtc, null, null, tags, variables);
	}

	public static MTCChoreographer startMTC(IProject project, String bundleName, String mtcName, Transformation transformation, List<Model> startModels, List<String> tagList, HashMap<String, Object> variables) {
		MTCChoreographer mtcChoreographer = null;
		try {
			final Bundle bundle = Platform.getBundle(bundleName);
			final URL fileURL = bundle.getEntry("mtcs/" + mtcName);
			String mtcPath = FileLocator.toFileURL(fileURL).toString();
			mtcPath = mtcPath.replaceFirst("file:", "");
			final MTC mtc = (MTC) loadModel(mtcPath);
			if (console == null) {
				console = new EclipseConsole(findConsole("EMF - Rest"));
			}
			// show the console
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			String id = IConsoleConstants.ID_CONSOLE_VIEW;
			IConsoleView view = null;
			try {
				view = (IConsoleView) page.showView(id);
			} catch (PartInitException e) {
				e.printStackTrace();
			}
			view.display(findConsole("EMF - Rest"));

			initializeRegistry();
			console.clear();
			mtcChoreographer = new MTCChoreographer(mtcPath, mtc, false, false, console, new PluginResourceLocator(bundleName, mtc, project), new TransformationExecutorFactory(), new EclipseModelEnvironmentManager(), tagList);
			mtcChoreographer.setVariables(variables);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return mtcChoreographer;
	}

	private static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

}
