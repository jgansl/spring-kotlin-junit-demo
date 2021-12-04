package com.example.springkotlinjunitdemo.datasource.mock

import com.example.springkotlinjunitdemo.datasource.BankDataSource
import com.example.springkotlinjunitdemo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf(
        Bank("1234", 3.14, 1),
        Bank("1235", 17.0, 2),
        Bank("1236", 0.0, 3),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}