package com.tav.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.tav.graphql.repo.UserDetailsRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import java.util.*

@Component
class UserDetailsQuery(val userDetailsRepository: UserDetailsRepository) : GraphQLQueryResolver {
    fun userDetailsById(id: Long) = userDetailsRepository.findByIdOrNull(id)
}