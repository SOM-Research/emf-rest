package com.emf.rest.codegen;

import java.util.List;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;

import com.emf.rest.EMFRestPlugin;

public class GenClassEMFRestPackageGeneratorAdapter extends GenBaseGeneratorAdapter {
	 protected static final int FACTORY_ID = 0;

	  protected static final JETEmitterDescriptor[] JET_EMITTER_DESCRIPTORS =
	  {
	    new JETEmitterDescriptor("model/Factory.javajet", "emf-rest.templates.model.ProxyFactory"),
	 
	  };

	  protected JETEmitterDescriptor[] getJETEmitterDescriptors()
	  {
	    return JET_EMITTER_DESCRIPTORS;
	  }

	  public GenClassEMFRestPackageGeneratorAdapter()
	  {
	    super();
	  }

	  public GenClassEMFRestPackageGeneratorAdapter(GeneratorAdapterFactory generatorAdapterFactory)
	  {
	    super(generatorAdapterFactory);
	  }

	  @Override
	  public boolean canGenerate(Object object, Object projectType)
	  {
	    return MODEL_PROJECT_TYPE.equals(projectType) ? super.canGenerate(object, projectType) : false;
	  }

	  @Override
	  protected Diagnostic generateModel(Object object, Monitor monitor)
	  {
	    GenPackage genPackage = (GenPackage)object;

	    monitor.beginTask("", 2);
	    monitor.subTask(message);

	    GenModel genModel = genPackage.getGenModel();
	    ensureProjectExists
	      (genModel.getModelDirectory(), genPackage, MODEL_PROJECT_TYPE, genModel.isUpdateClasspath(), createMonitor(monitor, 1));


	    
	    generateJava
	    (genModel.getModelDirectory(),
	    		genPackage.getInterfacePackageName() + ".proxy", 
	    		"ProxyFactory",
	    		
	     getJETEmitter(getJETEmitterDescriptors(), FACTORY_ID),
	     null,
	     createMonitor(monitor, 1)); 
	    
	  

	    return Diagnostic.OK_INSTANCE;
	  }

	  @Override
	  protected void addBaseTemplatePathEntries(List<String> templatePath)
	  {
	    templatePath.add(EMFRestPlugin.INSTANCE.getBaseURL().toString() + "templates");
	    super.addBaseTemplatePathEntries(templatePath);
	  }

}
