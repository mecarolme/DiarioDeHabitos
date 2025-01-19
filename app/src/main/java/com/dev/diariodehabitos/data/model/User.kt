package com.dev.diariodehabitos.data.model

data class User(
    val id: Long,
    val nome: String,
    val email: String,
    val listaDeHabitos: List<Habit> = emptyList(),
    val localizacaoAtual: Location? = null
)