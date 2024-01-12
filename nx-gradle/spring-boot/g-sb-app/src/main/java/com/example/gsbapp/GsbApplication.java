package com.example.gsbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class GsbApplication {

  public static void main(String[] args) {
    SpringApplication.run(GsbApplication.class, args);
  }
}
