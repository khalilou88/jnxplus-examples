package com.example.msblib;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

  public String message() {
    return "Hello World!";
  }
}
