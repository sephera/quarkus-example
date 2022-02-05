package com.example.resource;

import com.example.config.GreetingProperties;
import com.example.dto.GreetingResponse;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
  @Inject GreetingProperties greetingProperties;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public GreetingResponse hello() {
    return new GreetingResponse(
        this.greetingProperties.getName(), this.greetingProperties.getMessage());
  }
}
