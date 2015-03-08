package webmapi.storage;

import org.eclipse.emf.ecore.EObject;

public interface IModelStorage {

    public Object get(String type, String id);


	public void save();
    public Object remove(String type, String id);
 	public Object remove(String id);

	void put(String type, String id, EObject value);


	void put(String id, EObject value);
}
