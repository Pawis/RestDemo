package com.example.RestDemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;


@Component
@Path("/test")
public class TestEndpoint {
    @GET
    @Path("/test")
    @Produces("application/json")
    public Response test () {
        return Response.ok("test").build();
    }
}