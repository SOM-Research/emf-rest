package webmapi.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;


import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.jboss.vfs.VirtualFile;

@Startup
@Singleton
public class ResourceLoader {

	private Resource resource;

	@PostConstruct
	public void applicationStartup() {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"xmi", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put("http://emf-rest.com/Example",Example.ExamplePackage.eINSTANCE);
		ResourceSet rst = new ResourceSetImpl();
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			URLConnection conn = new URL(classLoader.getResource("Simpsons.xmi").toString()).openConnection();
			VirtualFile vf = (VirtualFile)conn.getContent();
			File contentsFile = vf.getPhysicalFile();
			resource = rst.getResource(
			URI.createURI(contentsFile.toString()),true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

}

