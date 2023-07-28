package com.example.evauacion3.UI.data.retrofit.repository

import com.example.ec3_limahuaya.Model.Joke
import com.example.evauacion3.UI.data.RetrofitHelper

class JokeRepository {
    fun getJokes(): List<Joke>{
        val response = RetrofitHelper.jokeInstance.getAllJokes()
        return response.peliculas
    }
}