package com.kurotkin.netdemo.data.products

import com.google.gson.annotations.SerializedName

// TODO: 3. Создаем классы для интерпретации данных из API

data class ProductCart(
    @SerializedName("limit")
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)