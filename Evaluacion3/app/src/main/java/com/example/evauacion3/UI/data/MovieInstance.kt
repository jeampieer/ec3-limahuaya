package com.example.evauacion3.UI.data


import com.example.evauacion3.UI.data.retrofit.repository.response.PeliculaListResponse
import retrofit2.http.GET

interface MovieInstance {
    @GET("/movie/popular?api_key=7be72508776961f3948639fbd796bccd&page=1")
    fun getAllJokes(): PeliculaListResponse
}