package com.dev.diariodehabitos.data.model

import java.time.LocalTime
import java.util.Date

data class Habit(
    val id: Long,
    val nome: String,
    val descricao: String,
    val frequencia: Frequencia,
    val dataInicio: Date,
    val progresso: List<Progress> = emptyList(),
    val localizacao: Location? = null,
    val horarioNotificacao: LocalTime? = null,
    val descricaoComplementar: String? = null
)

enum class Frequencia {
    DIARIO,
    SEMANAL,
    MENSAL
}