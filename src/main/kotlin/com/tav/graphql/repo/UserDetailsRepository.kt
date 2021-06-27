package com.tav.graphql.repo

import com.tav.graphql.entities.UserDetails
import org.springframework.data.jpa.repository.JpaRepository

interface UserDetailsRepository : JpaRepository<UserDetails?, Long>