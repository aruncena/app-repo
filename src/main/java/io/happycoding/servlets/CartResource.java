package io.happycoding.servlets;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/cart")
public class CartResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getCart() {
        return "Cart endpoint: Your cart is empty.";
    }
}