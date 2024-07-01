package com.kurotkin.netdemoapplication.presentation.ui

import androidx.recyclerview.widget.DiffUtil
import com.kurotkin.netdemo.data.products.Product


// TODO: 16. Вспомогательный класс для сравнения элементов
class ProductDiffCallback : DiffUtil.ItemCallback<Product>() {

    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem == newItem
    }
}