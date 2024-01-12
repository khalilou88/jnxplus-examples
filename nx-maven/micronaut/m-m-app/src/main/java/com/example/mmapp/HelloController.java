package com.example.mmapp;

import com.example.mmlib.HelloService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Inject;

@Controller("/hello")
public class HelloController {

  @Inject
  private HelloService helloService;

  @Get
  @Produces(MediaType.TEXT_PLAIN)
  public String index() {
    return helloService.greeting();
  }
}
