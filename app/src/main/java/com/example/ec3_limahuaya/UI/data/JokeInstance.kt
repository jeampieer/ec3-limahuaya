package com.example.evauacion3.UI.data


import com.example.evauacion3.UI.data.retrofit.repository.response.JokeListResponse
import retrofit2.http.GET

interface JokeInstance {
    @GET("/jokes/random")
    fun getAllJokes(): JokeListResponse
}