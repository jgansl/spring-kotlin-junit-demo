package com.example.springkotlinjunitdemo.datasource

import com.example.springkotlinjunitdemo.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
}