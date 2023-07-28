package com.example.ec3_limahuaya.Model

data class Joke(
    val id: String,
    val created_at: String,
    val value: String,
)
fun getData(): List<Joke> = listOf(
    Joke("VIT-Am-RSOSOH8TnyOIYxg", "2020-01-05 13:42:29.569033", "The saying \"You win some, you lose some\" was disproven by Chuck Norris.")
)