package com.example.evauacion3.UI.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ec3_limahuaya.Model.Joke
import com.example.ec3_limahuaya.Model.getData

class HomeViewModel: ViewModel() {
    val jokes: MutableLiveData<List<Joke>> = MutableLiveData<List<Joke>>()
    fun getJokes(){
        val allJokes = getData()
        jokes.value = allJokes
    }
}