

package webmapi.service.configuration;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;





public final class ModelEnvironmentManager {

	private static  ModelEnvironmentManager instance = null;
	private  Resource resource;


	private ModelEnvironmentManager() {

	}
		
	public final static ModelEnvironmentManager getInstance(String modelsPath) {
		
		if(instance == null){
			instance = new ModelEnvironmentManager();
			 synchronized(ModelEnvironmentManager.class){
				 Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
				 Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
				EPackage.Registry.INSTANCE.put("http://emf-rest.com/Example",Example.ExamplePackage.eINSTANCE);
		
				 ResourceSet rst = new ResourceSetImpl();
			instance.resource = null;
			instance.resource = rst.getResource(URI.createURI(new File(modelsPath + File.separator+"Simpsons.xmi").toURI().toString()),true);
			System.out.println(instance.resource);  	}}
		return instance;
	}
	public Resource getResource(){
		return resource;
	} 
	
	

}
