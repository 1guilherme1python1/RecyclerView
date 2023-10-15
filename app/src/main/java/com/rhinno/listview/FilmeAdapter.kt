package com.rhinno.listview

import android.view.LayoutInflater
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
        val textViewFilme : TextView = itemView.findViewById(R.id.textViewFilme)
    }

    //retornar layout criado pela ViewHolder ja inflado em uma view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        // preparo para inflar , ou seja, converter um arquivo XML em uma hierarquia de elementos de interface
        val layoutInflater = LayoutInflater.from(parent.context)

        //preparo a item view
        val itemView = layoutInflater.inflate(
            R.layout.item_lista_filme,
            parent,
            false
        )

        return FilmeViewHolder(itemView)
    }

    //Qauntidade de itens da lista
    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        val filme = lista[position]

        holder.textViewFilme.text = filme.nome
    }
}