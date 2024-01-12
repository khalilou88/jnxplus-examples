package com.example.msbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class MsbApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsbApplication.class, args);
  }
}
