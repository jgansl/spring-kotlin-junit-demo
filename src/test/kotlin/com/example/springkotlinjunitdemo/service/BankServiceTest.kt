package com.example.springkotlinjunitdemo.service

import com.example.springkotlinjunitdemo.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

//@Mock
internal class BankServiceTest {

    private val mockDataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(mockDataSource)

    @Test
    fun `should call its data source to retreive banks`() {

        //when
        bankService.getBanks()
        
        //then
        verify(exactly = 1) { mockDataSource.retrieveBanks() }
    }
}