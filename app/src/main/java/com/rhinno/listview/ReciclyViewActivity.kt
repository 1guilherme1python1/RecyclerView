package com.rhinno.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReciclyViewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recicly_view)

        val lista = listOf<Mensagem>(
            Mensagem("Guilherme", "ola tudo bem", "9:12"),
            Mensagem("Fatma", "to mesmo", "9:12"),
            Mensagem("Roberto", "ola tudo bem", "9:12"),
            Mensagem("Romario", "ola tudo bem", "9:12"),
            Mensagem("Vanessa", "ola tudo bem", "9:12"),
            Mensagem("Jicobiloba", "ola tudo bem", "9:12"),
        )

        rvLista = findViewById(R.id.rv_lista)
        rvLista.adapter = MensagemAdapter(lista)
//        rvLista.layoutManager = LinearLayoutManager(this)
    }
}