package com.example.micronaut.micronautlib;

import jakarta.inject.Singleton;

@Singleton
public class HelloService {

  public String greeting() {
    return "Hello World";
  }
}
