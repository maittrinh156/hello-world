package com.acme.hellospring.models.mappers

import com.acme.hellospring.models.Repository
import com.acme.hellospring.models.reponses.RepositoryResponse

class RepositoryMapper {

    companion object {
        fun toRepository(repositoryResponse: RepositoryResponse?): Repository {
            return Repository(
                    repositoryResponse?.owner?.login,
                    repositoryResponse?.name,
                    repositoryResponse?.description,
                    repositoryResponse?.language
            )
        }
    }
}