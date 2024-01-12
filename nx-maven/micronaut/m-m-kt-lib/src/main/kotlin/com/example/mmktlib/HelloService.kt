package com.example.mmktlib

import jakarta.inject.Singleton

@Singleton
class HelloService {
  fun greeting(): String {
    return "Hello World"
  }
}
