package com.example.gmktlib

import jakarta.inject.Singleton

@Singleton
class HelloService  {

  fun greeting():String {
    return "Hello World"
  }
}
