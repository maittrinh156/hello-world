package com.acme.hellospring

import com.acme.hellospring.controllers.GreetingController
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class HelloSpringApplicationTests {

	@Autowired
	private var greetingController: GreetingController? = null

	@Test
	fun contextLoads() {
		assertThat(greetingController).isNotNull()
	}

}
