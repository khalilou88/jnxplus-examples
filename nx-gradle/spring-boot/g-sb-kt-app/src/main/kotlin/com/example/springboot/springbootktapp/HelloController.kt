package com.example.springboot.springbootktapp

import com.example.springboot.springbootktlib.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
  @Autowired val helloService: HelloService,
) {

    @GetMapping("/")
    fun greeting():String = helloService.message()

}
