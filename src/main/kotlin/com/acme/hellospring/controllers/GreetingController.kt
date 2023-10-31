package com.acme.hellospring.controllers

import com.acme.hellospring.models.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController() {
    @GetMapping("/v1/hello/world")
    fun greeting(@RequestParam("name") name: String?): Greeting {
        return Greeting("hello ${(name ?: "world")}")
    }

}