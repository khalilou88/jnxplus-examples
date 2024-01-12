package com.example.mqktapp

import com.example.mqktlib.GreetingService
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource(private val greetingService: GreetingService) {
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  fun hello() = greetingService.greeting()
}
