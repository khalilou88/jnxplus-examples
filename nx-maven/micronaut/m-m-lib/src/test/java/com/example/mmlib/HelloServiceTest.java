package com.example.mmlib;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class HelloServiceTest {

  @Inject
  HelloService service;

  @Test
  public void testGreetingService() {
    Assertions.assertEquals("Hello World", service.greeting());
  }
}
