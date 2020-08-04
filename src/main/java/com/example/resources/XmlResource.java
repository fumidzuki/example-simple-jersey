package com.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.example.dto.Customer;

@Path("/xml")
public class XmlResource {

  @GET
  @Produces(MediaType.APPLICATION_XML)
  public Response json() {
    Customer e = new Customer();
    e.setName("山田太郎");
    e.setAge(20);
    return Response.ok(e).build();
  }

}
