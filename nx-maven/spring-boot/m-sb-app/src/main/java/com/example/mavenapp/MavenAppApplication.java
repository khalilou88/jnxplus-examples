package com.example.mavenapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class MavenAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(MavenAppApplication.class, args);
  }
}
