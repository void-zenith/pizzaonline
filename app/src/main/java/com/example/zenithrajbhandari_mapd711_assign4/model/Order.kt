package com.example.zenithrajbhandari_mapd711_assign4.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Order")
data class Order(
    @PrimaryKey(autoGenerate = true)
    val orderId: Long = 0,
    val customerId: Long = 0,
    val productId: Long = 0,
    val employeeId: Long = 0,
    val orderDate: String,
    val quantity: String,
    val status: String,
)