package com.example.gmlib;

import jakarta.inject.Singleton;

@Singleton
public class HelloService {

  public String greeting() {
    return "Hello World";
  }
}
