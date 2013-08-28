package webmapi.storage;

import java.io.IOException;
import java.util.HashMap;
import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class MemoryStorage implements IModelStorage {

	private final static HashMap store = new HashMap();
	private String modelsPath;

	public MemoryStorage(String modelsPath) {
		this.modelsPath = modelsPath;
	} 

	@Override
	public Object get(String type, String id) {
		String composedId = type + "/" + id;
		if (store.get(composedId) == null) {
			ResourceSet rst = new ResourceSetImpl();
			Resource rs = rst.createResource(URI.createFileURI(modelsPath + File.separator+ id + ".ecore"));  
			try {
				rs.load(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
			store.put(composedId, rs.getContents().get(0));
			return rs.getContents().get(0);
		} else {
			return store.get(composedId);
		}
	}

	@Override
	public void put(String type, String id, Object value) {
	}

	@Override
	public Object remove(String type, String id) {
		return null;
	}

}
