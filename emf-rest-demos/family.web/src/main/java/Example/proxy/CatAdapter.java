package Example.proxy;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import Example.Cat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import webmapi.service.IdentificationResolver;
import Example.ExampleFactory;

public class CatAdapter extends XmlAdapter<CatProxy, Cat> {
	static Properties config;
	static {
		config = new Properties();
		InputStream inputStream = ProxyFactory.class.getClassLoader().getResourceAsStream("config.properties");
		if (inputStream != null)
			try {
				config.load(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	@Override
	public CatProxy marshal(Cat arg0) throws Exception {

		CatProxy d = ProxyFactory.createCatProxy(arg0.eClass().getName());

		d.uri = getURL(arg0);
		return d;
	}

	@Override
	public Cat unmarshal(CatProxy arg0) throws Exception {
		ExampleFactory factory = ExampleFactory.eINSTANCE;
		return ProxyFactory.createCat(arg0);
	}

	public String getURL(Cat obj) {
		Map<EObject, EReference> map = new HashMap<EObject, EReference>();
		String id = IdentificationResolver.getCatId(obj);
		EObject temp = obj;
		while (temp.eContainer() != null) {
			map.put(temp.eContainer(), temp.eContainmentFeature());
			temp = temp.eContainer();
		}
		Set<Entry<EObject, EReference>> set = map.entrySet();
		List<Entry<EObject, EReference>> list = new ArrayList<Map.Entry<EObject, EReference>>(set);
		Collections.reverse(list);
		StringBuffer sb = new StringBuffer();
		sb.append(config.getProperty("url"));
		sb.append("/rest/");
		sb.append(config.getProperty("model"));
		sb.append("/");
		sb.append(config.getProperty("instance"));
		sb.append("/");
		for (Entry<EObject, EReference> entry : list) {
			sb.append(entry.getValue().getName() + "/");
		}
		if (!list.isEmpty())
			sb.append(id);
		return sb.toString();
	}
}
