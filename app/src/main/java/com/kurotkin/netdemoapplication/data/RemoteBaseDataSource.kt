package com.kurotkin.netdemoapplication.data

// TODO: 11. Удаленный источник данных
class RemoteBaseDataSource(private val apiService: ApiService): BaseDataSource() {

    suspend fun getProductCart() = getResult { apiService.getProductCart() }
    suspend fun getProductById(id: Int) = getResult { apiService.getProduct(id) }

}