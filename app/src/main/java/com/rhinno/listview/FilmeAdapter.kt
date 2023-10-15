package com.rhinno.listview

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FilmeAdapter(
    private val lista: List<Filme>
) : Adapter<FilmeAdapter.FilmeViewHolder>() {

    inner class FilmeViewHolder(
        val itemView : View
    ): ViewHolder(itemView){
        val textView : TextView = itemView.findViewById(R.id.textViewFilme)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}