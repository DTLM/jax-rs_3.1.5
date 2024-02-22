package main.config;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/rest")
public class RestConfig extends ResourceConfig{
	
	public RestConfig() {
		 packages("main.controller");
	}
}
