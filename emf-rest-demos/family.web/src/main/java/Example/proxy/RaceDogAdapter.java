package Example.proxy;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import Example.RaceDog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import webmapi.service.IdentificationResolver;
import Example.ExampleFactory;

public class RaceDogAdapter extends XmlAdapter<RaceDogProxy,RaceDog>{

	@Override
	public RaceDogProxy marshal(RaceDog arg0) throws Exception {
		
		
		
		RaceDogProxy d = ProxyFactory.createRaceDogProxy(arg0.eClass().getName());
		
		
		
		d.url = getURL(arg0);
		return d;
	}

	@Override
	public RaceDog  unmarshal(RaceDogProxy  arg0) throws Exception {
		ExampleFactory factory =  ExampleFactory.eINSTANCE;
		return ProxyFactory.createRaceDog(arg0);
	}
	
	
	
	
	public String getURL(RaceDog obj){
		Map<EObject,EReference> map = new HashMap<EObject, EReference>();
		String id = IdentificationResolver.getRaceDogId(obj);
		EObject temp = obj;
		while(temp.eContainer()!= null){
			map.put(temp.eContainer(), temp.eContainmentFeature());
			temp = temp.eContainer();
		}
		Set<Entry<EObject, EReference>> set = map.entrySet();
		List<Entry<EObject, EReference>> list = new ArrayList<Map.Entry<EObject,EReference>>(set);
		Collections.reverse(list);
		StringBuffer sb = new StringBuffer();
		for(Entry<EObject,EReference> entry : list){
			sb.append(entry.getValue().getName()+"/");
		}
		sb.append(id);
		return sb.toString();
	}	
}



