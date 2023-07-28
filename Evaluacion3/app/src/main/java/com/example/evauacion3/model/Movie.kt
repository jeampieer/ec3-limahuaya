package com.example.evauacion3.model

data class Movie(
    val id: Int,
    val original_title: String,
    val poster_path: String,
)
fun getData(): List<Movie> = listOf(
    Movie(298618,"The Flash","/yF1eOkaYvwiORauRCPWznV9xVvi.jpg"),
)
