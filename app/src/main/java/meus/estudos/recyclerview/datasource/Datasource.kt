package meus.estudos.recyclerview.datasource

import meus.estudos.recyclerview.model.Jogo

class Datasource {

    companion object {
        fun getJogos() : ArrayList<Jogo>{
            var jogos = ArrayList<Jogo>()

            jogos.add(Jogo(100, "Resident Evil", 5.0f, "ps4"))
            jogos.add(Jogo(110, "Zombie Army", 4.0f , "PC"))
            jogos.add(Jogo(120, "The Last of US Part II", 5.0f, "PS4"))
            jogos.add(Jogo(130,"GFTO",4.0f,"PC"))
            jogos.add(Jogo(140,"Mario e Sonic",1.0f, "Switch"))
            jogos.add(Jogo(150,"GRID", 3.0f,"PC"))
            jogos.add(Jogo(160,"Concrete Genie",0.0f,"Switch"))
            jogos.add(Jogo(170,"Gears of War 5",2.0f,"XBOX_ONE"))
            jogos.add(Jogo(180,"Blazing Chrome",2.0f, "XBOX-ONE"))
            jogos.add(Jogo(190,"Gato Roboto",5.0f,"PC"))
            jogos.add(Jogo(200, "Castlelvania Anniversary", 4.0f, "XBOX-ONE"))

            return  jogos
        }
    }
}