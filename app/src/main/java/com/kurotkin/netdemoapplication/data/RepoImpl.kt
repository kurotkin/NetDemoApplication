package com.kurotkin.netdemoapplication.data

import com.kurotkin.netdemo.data.products.Product
import com.kurotkin.netdemo.data.products.ProductCart
import com.kurotkin.netdemoapplication.domain.Repo

// TODO: 12. Реализация репозитория с данными
class RepoImpl(private val apiService: ApiService): Repo {

    override suspend fun getAllProducts(): NetResource<ProductCart> {
        return RemoteBaseDataSource(apiService).getProductCart()
    }

    override suspend fun getProduct(id: Int): NetResource<Product> {
        return RemoteBaseDataSource(apiService).getProductById(id)
    }

}