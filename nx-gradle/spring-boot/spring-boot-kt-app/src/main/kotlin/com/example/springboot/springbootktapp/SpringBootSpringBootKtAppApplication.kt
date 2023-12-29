package com.example.springboot.springbootktapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = arrayOf("com.example"))
class SpringBootSpringBootKtAppApplication

fun main(args: Array<String>) {
  runApplication<SpringBootSpringBootKtAppApplication>(*args)
}


