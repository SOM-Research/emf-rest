
package webmapi.service.configuration;

import java.util.HashSet;
import java.util.Set;

@javax.ws.rs.ApplicationPath("app")
public class ApplicationConfiguration extends javax.ws.rs.core.Application {

	public ApplicationConfiguration() {
		ModelEnvironmentManager.getInstance();
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
  		classes.add(webmapi.service.WebApiService.class);
  		classes.add(webmapi.service.ModelWriter.class);			
        return classes;
	}
}