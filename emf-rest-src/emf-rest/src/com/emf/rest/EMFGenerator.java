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

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;

import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;
import com.mtcflow.model.mtc.File;

public class EMFGenerator extends TransformationExecutor {

	public void executeTransformation(IExecutionInformation executionInformation) throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(locator.getEMFURI(inputModels.get(0).getModel()));
		resource.load(null);
		EcoreUtil.resolveAll(resourceSet);
		GenModel genModel = (GenModel) resource.getContents().get(0);
		genModel.setCanGenerate(true);
		// generate the code
		Generator generator = new Generator();
		generator.setInput(genModel);
		generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new BasicMonitor.Printing(System.err));
		for (File file : outputFiles) {
			executionEnvironment.fileReady(file, transformation);
		}
	}

}
