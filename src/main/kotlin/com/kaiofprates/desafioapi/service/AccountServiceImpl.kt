package com.kaiofprates.desafioapi.service

import com.kaiofprates.desafioapi.model.Account
import com.kaiofprates.desafioapi.repository.AccountRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.lang.RuntimeException
import java.util.*

@Service
class AccountServiceImpl(private val repository: AccountRepository): AccountService {
    override fun delete(id: Long) {
        repository.findById(id).map {
            repository.delete(it)
        }.orElseThrow{ throw  RuntimeException("Id not found $id")}

    }

    override fun create(account: Account): Account {
        return repository.save(account)
    }

    override fun getAll(): List<Account> {
    return repository.findAll()
    }

    override fun getbyId(id: Long): Optional<Account> {
    return repository.findById(id)
    }

    override fun update(id: Long, account: Account): Optional<Account> {
        val optional = getbyId(id)
        if(optional.isEmpty) Optional.empty<Account>()
        return optional.map{
            val accountToUpdate = it.copy(
                name = account.name,
                document = account.document,
                phone = account.phone
            )
            repository.save(accountToUpdate)
        }
    }
}