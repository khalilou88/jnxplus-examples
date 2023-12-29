package com.example.springboot.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class SpringBootSpringBootAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootSpringBootAppApplication.class, args);
  }
}
