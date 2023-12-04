package com.example.zenithrajbhandari_mapd711_assign4.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Customer")
data class Customer(
    @PrimaryKey(autoGenerate = true)
    val customerId: Long = 0,
    val userName: String,
    val password: String,
    val firstname: String,
    val lastname: String,
    val address: String,
    val city: String,
    val postalCode: String,
)

