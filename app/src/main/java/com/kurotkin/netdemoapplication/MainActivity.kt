package com.kurotkin.netdemoapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.kurotkin.netdemoapplication.presentation.Note
import com.kurotkin.netdemoapplication.presentation.ui.ProductAdapter
import com.kurotkin.netdemoapplication.presentation.ui.ViewModel

class MainActivity : AppCompatActivity() {

    // TODO: 14. Класс предоставления данных UI
    private lateinit var viewModel: ViewModel

    // TODO: 18. Добавление элементов на экран
    private lateinit var rvList: RecyclerView
    private lateinit var productAdapter: ProductAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: 5.Крайне примитивный способ
        Note().primitive()


        // TODO: 14. Класс предоставления данных UI
        viewModel = ViewModelProvider(this)[ViewModel::class.java]
        viewModel.download()

        // TODO: 18. Добавление элементов на экран
        initViews()

        // TODO: 19. Подписка на скаченные данные
        initObserves()
    }

    // TODO: 18. Добавление элементов на экран
    private fun initViews(){
        rvList = findViewById(R.id.list)
        productAdapter = ProductAdapter()
        rvList.adapter = productAdapter
    }

    // TODO: 19. Подписка на скаченные данные
    private fun initObserves(){
        viewModel.products.observe(this){
            productAdapter.submitList(it)
        }
    }

}