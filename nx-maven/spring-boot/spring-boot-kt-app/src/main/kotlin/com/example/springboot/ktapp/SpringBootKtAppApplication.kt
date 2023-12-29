package com.example.springboot.ktapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = arrayOf("com.example"))
class SpringBootKtAppApplication

fun main(args: Array<String>) {
  runApplication<SpringBootKtAppApplication>(*args)
}
