package com.tav.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.tav.graphql.entities.UserDetails
import com.tav.graphql.repo.UserDetailsRepository
import org.springframework.stereotype.Component

@Component
class UserDetailsMutation(val userDetailsRepository: UserDetailsRepository) : GraphQLMutationResolver {
    fun saveUserDetails(userDetails: UserDetails) = userDetailsRepository.save(userDetails)

}