package com.example.evauacion3.UI.fragments

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.evauacion3.R
import com.example.evauacion3.databinding.ItemJokeBinding
import com.example.evauacion3.model.Movie


class RVJokeAdapter(var jokes: List<Movie>): RecyclerView.Adapter<JokeVH>() {
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
    fun bind(movie : Movie) {
        b.txtNomPelicula.text = movie.original_title
    }
}