package com.example.msbapp;

import com.example.msblib.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  private HelloService helloService;

  @GetMapping("/")
  public String greeting() {
    return helloService.message();
  }
}
