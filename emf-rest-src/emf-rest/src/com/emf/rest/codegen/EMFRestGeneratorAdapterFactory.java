package com.emf.rest.codegen;

import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;

public class EMFRestGeneratorAdapterFactory extends GenModelGeneratorAdapterFactory {

	  private static final boolean DISABLE = "false".equals(System.getProperty("emf-rest"));
	

	  @Override
	  public Adapter createGenPackageAdapter() { return null; }
	  
	  @Override
	  public Adapter createGenEnumAdapter() { return null; }

	  @Override
	  public Adapter createGenModelAdapter()
	  {

		  return null;
	  }

	  @Override
	  public Adapter createGenClassAdapter()
	  {
	    if (genClassGeneratorAdapter == null && !DISABLE)
	    {
	      genClassGeneratorAdapter = new GenClassEMFRestGeneratorAdapter(this);
	    }
	    return genClassGeneratorAdapter;
//		  return null;
	  }

}
