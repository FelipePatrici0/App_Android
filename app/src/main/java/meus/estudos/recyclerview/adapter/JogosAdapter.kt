package meus.estudos.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_lista_jogos.view.*
import meus.estudos.recyclerview.R
import meus.estudos.recyclerview.model.Jogo

class JogosAdapter(var listaJogos: ArrayList<Jogo>) : RecyclerView.Adapter<JogosAdapter.JogoViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        val intemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_lista_jogos, parent, false)

        return JogoViewHolder(intemView)
    }

    override fun getItemCount(): Int {
        return listaJogos.size
    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        val jogo = listaJogos[position]
        holder.bind(jogo)
    }

    class JogoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(jogo: Jogo){
            itemView.textNomeDoJogo.text = jogo.nomeJogo
            itemView.texConsole.text     = jogo.console
            itemView.notaJogo.rating     = jogo.notaJogo
        }
    }
}