package com.example.zenithrajbhandari_mapd711_assign4.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Pizza")
data class Pizza(
    @PrimaryKey(autoGenerate = true)
    val productId: Long = 0,
    val pizzaName: String,
    val price: Int,
    val category: String,

)
