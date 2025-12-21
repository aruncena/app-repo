package io.happycoding.servlets;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("")
public class RestApplication extends ResourceConfig {
    public RestApplication() {
        packages("io.happycoding.servlets");
    }
}