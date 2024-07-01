package com.kurotkin.netdemoapplication.presentation.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.kurotkin.netdemo.data.products.Product
import com.kurotkin.netdemoapplication.App
import com.kurotkin.netdemoapplication.data.NetResource
import com.kurotkin.netdemoapplication.data.RepoImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// TODO: 14. Класс предоставления данных UI
class ViewModel(private val app: Application): AndroidViewModel(app) {

    private val _products = MutableLiveData<List<Product>>()
    val products : LiveData<List<Product>>
        get() = _products

    private val _errorStatus= MutableLiveData<String>()
    val errorStatus : LiveData<String>
        get() = _errorStatus


    fun download() {
        viewModelScope.launch(Dispatchers.IO) {
            val apiService = (app as App).apiService
            val result = RepoImpl(apiService).getAllProducts()
            when(result.status){
                NetResource.Status.SUCCESS -> {
                    _products.postValue(result.data?.products)
                }
                NetResource.Status.ERROR -> {
                    _errorStatus.postValue(result.message ?: "Unknown error")
                }
            }
        }
    }

}