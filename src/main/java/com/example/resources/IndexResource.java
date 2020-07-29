package com.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class IndexResource {

  @GET
  public Response index() {
    return Response.ok("index").build();
  }

}
