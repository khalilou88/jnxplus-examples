package com.example.gqlib;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

  public String greeting() {
    return "Hello World!";
  }
}
