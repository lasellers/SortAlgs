package com.intrafoundation.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHelloJson()
    {
        return "Hello World JSON";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHelloHtml()
    {
        return "<h1>Hello World HTML</h2>";
    }

}
