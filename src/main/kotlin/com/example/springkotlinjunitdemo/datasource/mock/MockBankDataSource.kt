package com.example.springkotlinjunitdemo.datasource.mock

import com.example.springkotlinjunitdemo.datasource.BankDataSource
import com.example.springkotlinjunitdemo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = mutableListOf<Bank>(
        Bank("1234", 3.14, 17),
        Bank("1235", 17.0, 0),
        Bank("1236", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank =
        banks.firstOrNull { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exists.")
        }
        banks.add(bank)

        return bank
    }

    override fun updateBank(bank: Bank): Bank {
        val currentBank = banks.firstOrNull { it.accountNumber == bank.accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number ${bank.accountNumber}")

        // replace, not update; no respect to index
        banks.remove(currentBank)
        banks.add(bank)

        return bank
    }

    override fun deleteBank(accountNumber: String) {
        val currentBank = banks.firstOrNull { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")

        banks.remove(currentBank)
    }
}