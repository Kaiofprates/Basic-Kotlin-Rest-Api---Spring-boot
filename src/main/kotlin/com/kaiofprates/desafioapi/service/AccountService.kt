package com.kaiofprates.desafioapi.service

import com.kaiofprates.desafioapi.model.Account
import java.util.*

interface AccountService {
    fun create(account: Account): Account
    fun getAll(): List<Account>
    fun getbyId(id: Long): Optional<Account>
    fun update(id: Long,  account: Account): Optional<Account>
    fun delete(id: Long)

}