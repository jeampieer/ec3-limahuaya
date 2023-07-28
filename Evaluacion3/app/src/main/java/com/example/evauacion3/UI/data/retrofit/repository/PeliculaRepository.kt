package com.example.evauacion3.UI.data.retrofit.repository

import com.example.evauacion3.UI.data.RetrofitHelper
import com.example.evauacion3.model.Movie

class PeliculaRepository {
    fun getJokes(): List<Movie>{
        val response = RetrofitHelper.storeInstance.getAllJokes()
        return response.peliculas
    }
}