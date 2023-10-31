package com.acme.hellospring.controllers

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.hamcrest.Matchers.containsString
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content


@SpringBootTest
@AutoConfigureMockMvc
class GreetingControllerTest {
        @Autowired
        lateinit var mockMvc: MockMvc;

        @Test
        fun greetingShouldReturnDefaultMessage() {
                this.mockMvc.perform(
                    get("/v1/hello/world")
                ).andExpect(
                    status().isOk()
                ).andExpect(
                    content().string(containsString("hello world"))
                );
        }

        @Test
        fun greetingShouldReturnSpecificMessage() {
                this.mockMvc.perform(
                    get("/v1/hello/world").param("name", "Trinh")
                ).andExpect(
                    status().isOk()
                ).andExpect(
                    content().string(containsString("hello Trinh"))
                );
        }
}
