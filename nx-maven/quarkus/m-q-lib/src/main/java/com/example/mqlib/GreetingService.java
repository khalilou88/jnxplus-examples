package com.example.mqlib;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

  public String greeting() {
    return "Hello World!";
  }
}
