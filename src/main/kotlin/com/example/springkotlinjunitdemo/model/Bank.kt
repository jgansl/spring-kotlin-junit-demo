package com.example.springkotlinjunitdemo.model

data class Bank( // handles get, set, toString, hashCode, equals - like Records
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
)