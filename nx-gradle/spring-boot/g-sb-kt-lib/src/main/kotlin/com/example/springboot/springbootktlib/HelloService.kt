package com.example.springboot.springbootktlib

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun message():String {
        return "Hello World!"
    }
}
