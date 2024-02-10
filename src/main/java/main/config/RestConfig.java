package main.config;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class RestConfig extends ResourceConfig{
	public RestConfig() {
		packages("main.controller");
	}
}
