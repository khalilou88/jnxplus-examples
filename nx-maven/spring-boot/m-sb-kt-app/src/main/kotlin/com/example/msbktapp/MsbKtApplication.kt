package com.example.msbktapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = arrayOf("com.example"))
class MsbKtApplication

fun main(args: Array<String>) {
  runApplication<MsbKtApplication>(*args)
}
