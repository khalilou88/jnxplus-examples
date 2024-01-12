package com.example.mqktlib

import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {
  fun greeting(): String {
    return "Hello World!"
  }
}
