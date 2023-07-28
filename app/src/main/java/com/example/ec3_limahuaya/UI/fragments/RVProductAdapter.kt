package com.example.evauacion3.UI.fragments

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.ec3_limahuaya.Model.Joke
import com.example.ec3_limahuaya.databinding.ItemJokeBinding


class RVJokeAdapter(var jokes: List<Joke>): RecyclerView.Adapter<JokeVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeVH {
        val b = ItemJokeBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return JokeVH(b)
    }

    override fun getItemCount(): Int = jokes.size

    override fun onBindViewHolder(holder: JokeVH, position: Int) {
        holder.bind(jokes[position])
    }
}

class JokeVH(private val b: ItemJokeBinding):RecyclerView.ViewHolder(b.root){
    fun bind(joke : Joke) {
        b.txtNomJoke.text = joke.value
    }
}