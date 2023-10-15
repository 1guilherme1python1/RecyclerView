package com.rhinno.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista: List<Mensagem>
) : Adapter<MensagemAdapter.MensagemViewHolder>() {

    inner class MensagemViewHolder(
        val itemView: View
    ) : ViewHolder(itemView){
        val textNome: TextView = itemView.findViewById(R.id.text_nome)
        val textUltimaMensagem: TextView = itemView.findViewById(R.id.text_ultima)
        val textHorario: TextView = itemView.findViewById(R.id.text_horario)
    }

    // Ao criar o View Holder -> criar a visualizacao
    //Ele e responsavel por criar uma nova instancia de MensagemViewHolder. Isso e feito sempre
    //que um novo item da lista precisa ser exibido na recyclerView

    //O resultado e uma instacia de view chamada itemView, que representa o layout do item da lista e sera
    //usada posterriormente para criar o ViewHolder associado a esse item.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )

        //1) Este e um recurso XML que define o layout de um item da lista.
        // Cada item da lista sera criado com base nesse layout

        //2) parent: Este é o ViewGroup pai ao qual o layout do item da lista está potencialmente associado.
        // Em muitos casos, você deseja que o parent seja o RecyclerView onde os itens da lista serão exibidos.
        // O parent é usado para determinar os parâmetros de layout do item da lista, como largura e altura,
        // com base nas configurações do RecyclerView pai. Isso é importante para garantir que o item da lista
        // seja exibido corretamente na RecyclerView.

        //3) false: Este é um valor booleano que indica se o layout inflado deve ser imediatamente anexado ao parent.
        // Quando definido como false, o layout inflado não é anexado ao parent imediatamente.
        // Isso é importante no contexto de uma RecyclerView, porque os itens da lista são gerenciados
        // pela própria RecyclerView, que irá anexá-los quando necessário. Definir como false é uma prática comum
        // para evitar anexar prematuramente os itens à RecyclerView.

        val itemView = layoutInflater.inflate(
            R.layout.item_lista,
            parent,
            false
        )

        return MensagemViewHolder(itemView)

    }

    // recupera a quantidade de itens
    override fun getItemCount(): Int {
        return lista.size
    }

    // ao vincular os dados para vinculacao
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {

        val mensagem = lista[position]
        holder.textNome.text = mensagem.nome
        holder.textUltimaMensagem.text = mensagem.ultima
        holder.textHorario.text = mensagem.horario
    }

}