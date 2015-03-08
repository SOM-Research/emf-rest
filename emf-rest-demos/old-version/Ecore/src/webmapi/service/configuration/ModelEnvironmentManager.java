
package webmapi.service.configuration;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelEnvironmentManager {

	private static final ModelEnvironmentManager instance;

	static {
		instance = new ModelEnvironmentManager();
		start();
	}

	private ModelEnvironmentManager() {

	}
	
	private static void start() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
 
		   EPackage.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore",EcorePackage.eINSTANCE);			
	}
	
	public static ModelEnvironmentManager getInstance() {
		return instance;
	}

}
