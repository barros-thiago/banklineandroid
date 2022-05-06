package me.teste.bankline_androi.data.remote

import me.teste.bankline_androi.domain.Movimentacao
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineApi {
    @GET("/movimentacoes/{id}")
    suspend fun findBankStatement(@Path("id") accountHolderId: Int): List<Movimentacao>
}