package com.javaeeeee.dwstart.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by rammuppidi on 7/30/17.
 */
@Path("/hello")
public class HelloResource {
  @GET
  @Produces(MediaType.TEXT_PLAIN)
    public String getGreetings()
  {
      return "HelloWorld";
  }

}
