package meus.estudos.recyclerview.datasource

import meus.estudos.recyclerview.model.Jogo

class Datasource {

    companion object {
        fun getJogos() : ArrayList<Jogo>{
            var jogos = ArrayList<Jogo>()

            jogos.add(Jogo(100, "Resident Evil","", 5.0f, "ps4"))
            jogos.add(Jogo(110, "Zombie Army","", 4.0f , "PC"))

            return  jogos
        }
    }
}