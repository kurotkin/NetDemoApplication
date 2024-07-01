package com.kurotkin.netdemoapplication.presentation.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kurotkin.netdemoapplication.R

// TODO: 15. Работа с элементом списка
class ProductHolder(private val view: View) : RecyclerView.ViewHolder(view){
    val productId = view.findViewById<TextView>(R.id.productId)
    val productName = view.findViewById<TextView>(R.id.productName)
}