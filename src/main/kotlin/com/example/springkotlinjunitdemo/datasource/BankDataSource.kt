package com.example.springkotlinjunitdemo.datasource

import com.example.springkotlinjunitdemo.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
//    fun deleteBank(bank: Bank): Bank
}