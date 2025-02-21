package com.kaiofprates.desafioapi.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

// nome da tabela
@Entity(name= "accounts")

data class Account (
    @Id @GeneratedValue
    var id: Long? = null,
    val name: String,
    val document: String,
    val phone: String
)