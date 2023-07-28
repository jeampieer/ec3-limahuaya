package com.example.evauacion3.UI.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.evauacion3.model.Movie
import com.example.evauacion3.model.getData

class HomeViewModel: ViewModel() {
    val jokes: MutableLiveData<List<Movie>> = MutableLiveData<List<Movie>>()
    fun getjokes(){
        val alljokes = getData()
        jokes.value = alljokes
    }
}