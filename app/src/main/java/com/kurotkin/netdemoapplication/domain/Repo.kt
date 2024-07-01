package com.kurotkin.netdemoapplication.domain

// TODO: 7. Требования от бизнеса
interface Repo {
    suspend fun getAllProducts(): Any
    suspend fun getProduct(id: Int): Any
}
