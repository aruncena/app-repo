package io.happycoding.servlets;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/checkout")
public class CheckoutResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getCheckout() {
        return "Checkout endpoint: Proceed to payment.";
    }
}