package com.kurotkin.netdemoapplication.presentation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.kurotkin.netdemo.data.products.Product
import com.kurotkin.netdemoapplication.R

// TODO: 17. Работа со списком элеметов
class ProductAdapter : ListAdapter<Product, ProductHolder>(ProductDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val item = getItem(position)
        holder.productId.text = item.id.toString()
        holder.productName.text = item.title
    }
}