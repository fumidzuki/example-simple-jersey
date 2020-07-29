package com.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.example.dto.Person;

@Path("/person")
public class PersonResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response person() {
    Person person = new Person();
    person.setName("山田太郎");
    person.setAge(20);
    person.setCity("東京都");
    return Response.ok(person).build();
  }

}
