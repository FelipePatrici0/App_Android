package meus.estudos.recyclerview.model

data class Jogo (
    var id: Int = 0,
    var titulo: String,
    var produtora: String,
    var notaJogo: Float,
    var console: String,
    var zerado: Boolean = false

)
