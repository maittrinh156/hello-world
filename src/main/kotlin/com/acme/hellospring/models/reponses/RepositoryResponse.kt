package com.acme.hellospring.models.reponses

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

data class RepositoryOwnerResponse (val login: String,)

@JsonIgnoreProperties(ignoreUnknown = true)
data class RepositoryResponse (
        val owner: RepositoryOwnerResponse?,
        val name: String?,
        val description: String?,
        val language: String?,
)

