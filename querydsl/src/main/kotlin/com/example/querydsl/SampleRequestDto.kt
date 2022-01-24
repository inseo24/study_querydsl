package com.example.querydsl

data class SampleRequestDto (
    val id: Int,
    var name: String? = null,
    var address: String? = null,
    var etc: String? = null
)