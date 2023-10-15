package com.rhinno.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewFilmeActivity : AppCompatActivity() {

    private lateinit var rv_lista_filme : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_filme)

        val filmes = listOf<Filme>(
            Filme("Luna"),
            Filme("piratas do caribe"),
            Filme("Madagascar"),
            Filme("planta dos macacos kkkkkk se tu ta maluco dododooooooo"),
            Filme("transformers"),
            Filme("ximpanze"),
        )

        rv_lista_filme = findViewById(R.id.rv_lista_filme)
        rv_lista_filme.adapter = FilmeAdapter(filmes)


        /*rv_lista_filme.layoutManager = GridLayoutManager(
            this,
            3,
            GridLayoutManager.VERTICAL,
            false
        )*/

//        rv_lista_filme.layoutManager = LinearLayoutManager(
//            this,
//            RecyclerView.VERTICAL,
//            false
//        )
    }
}