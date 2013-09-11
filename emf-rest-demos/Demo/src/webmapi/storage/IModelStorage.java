package webmapi.storage;

public interface IModelStorage {

    public Object get(String type, String id);

    public void put(String type, String id, Object value);

    public Object remove(String type, String id);
}
