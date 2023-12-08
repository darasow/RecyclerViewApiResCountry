package com.example.recyclerview

data class Country(
    val name: String,
    val flags: Flags
)

data class Flags(
    val svg: String,
    val png : String
)
