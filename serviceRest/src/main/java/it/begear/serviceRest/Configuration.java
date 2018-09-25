package it.begear.serviceRest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import it.begear.serviceRest.rest.MenuRestService;

public class Configuration extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(MenuRestService.class);
		return classes;
	}

}
