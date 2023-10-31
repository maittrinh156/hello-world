package com.acme.hellospring.controllers

import com.acme.hellospring.models.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController() {
    @GetMapping("/v1")
    fun greeting(): Greeting {
        return Greeting("hello world")
    }
}