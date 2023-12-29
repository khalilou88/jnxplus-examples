package com.example.quarkus.ktapp

import com.example.quarkus.ktlib.GreetingService
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
