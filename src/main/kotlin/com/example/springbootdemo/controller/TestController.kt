package com.example.springbootdemo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController {

    @RequestMapping("/hello")
    fun hello(): Any {
        return mapOf(
            "hello" to "world"
        )
    }
}