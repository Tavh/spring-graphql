package com.tav.graphql.entities

import javax.persistence.*

@Entity
@Table(name = "user_details")
class UserDetails (
    @Id
    @GeneratedValue
    val id: Long? = null,
    @Column(name = "name")
    val name: String? = null
    ) {
}