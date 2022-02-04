package com.example.resource;

import com.example.dto.GreetingResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public GreetingResponse hello() {
    final var res = new GreetingResponse();
    res.setName("Hello");
    return res;
  }
}
