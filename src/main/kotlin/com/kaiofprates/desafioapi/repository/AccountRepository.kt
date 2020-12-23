package com.kaiofprates.desafioapi.repository

import com.kaiofprates.desafioapi.model.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository: JpaRepository<Account, Long> {

}