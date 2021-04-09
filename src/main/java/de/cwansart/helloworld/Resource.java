package de.cwansart.helloworld;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("res")
@Produces(MediaType.TEXT_PLAIN)
public class Resource {

    @GET
    public String getRes() {
        return "Hello World";
    }
}
