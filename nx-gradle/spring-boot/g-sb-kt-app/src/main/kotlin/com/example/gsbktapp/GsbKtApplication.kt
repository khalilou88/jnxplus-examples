package com.example.gsbktapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = arrayOf("com.example"))
class GsbKtApplication

fun main(args: Array<String>) {
  runApplication<GsbKtApplication>(*args)
}
