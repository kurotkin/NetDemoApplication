package com.kurotkin.netdemoapplication.data

import com.kurotkin.netdemo.data.products.Product
import com.kurotkin.netdemo.data.products.ProductCart
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ApiService {

    // TODO: 4. Простое описание API
    //@Headers("myHeader: test")
    @GET("/products")
    suspend fun getMyProductCart(): ProductCart

    // TODO: 6. Другие методы
//    @GET("/products/{productId}")
//    suspend fun getMyProduct(@Path("productId") id: Int): Product
//
//    @POST("/products/add")
//    suspend fun addMyProduct(@Body newProduct: Product): Product
//
//    @PUT("/products/{productId}")
//    suspend fun updateMyProduct(@Path("productId") id: Int, @Body product: Product): Product
//
//    @DELETE("/products/{productId}")
//    suspend fun deleteMyProduct(@Path("productId") id: Int): Product

    // TODO: 10. Структурированное описание API
    @GET("/products")
    suspend fun getProductCart(): Response<ProductCart>

    @GET("/products/{productId}")
    suspend fun getProduct(@Path("productId") id: Int): Response<Product>



}