package com.acme.hellospring.controllers

import com.acme.hellospring.models.Repository
import com.acme.hellospring.models.mappers.RepositoryMapper
import com.acme.hellospring.models.reponses.RepositoryResponse
import org.springframework.http.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate


@RestController
class RepositoryController {
    var restTemplate: RestTemplate = RestTemplate()
    @GetMapping("/v1/repository/{owner}/{repository}")
    fun getRepository(
            @PathVariable("owner") owner: String,
            @PathVariable("repository") repository: String
    ) : ResponseEntity<Repository>? {
        val url: String = "https://api.github.com/repos/$owner/$repository"
        var headers: HttpHeaders = HttpHeaders()
        headers.setContentType(MediaType.APPLICATION_JSON)
        return try {
            val result = restTemplate.exchange(url, HttpMethod.GET, (HttpEntity<Any>(headers)), RepositoryResponse::class.java)
            ResponseEntity.ok(RepositoryMapper.toRepository(result.body))
        } catch (error: Exception) {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }

    }
}