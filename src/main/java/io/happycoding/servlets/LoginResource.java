package io.happycoding.servlets;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/login")
public class LoginResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getLogin() {
        return "Login endpoint: Please provide credentials.";
    }
}