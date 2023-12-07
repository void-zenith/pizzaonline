package com.example.zenithrajbhandari_mapd711_assign4.model

import androidx.room.Entity
import androidx.room.PrimaryKey

//Each @Entity class represents a SQLite table.
//Entity corresponds to a table in the associated Room database, and each instance of an entity represents a row of data in the corresponding table.
@Entity(tableName = "Pizza")
data class Pizza(
    //Each Room entity must define a primary key that uniquely identifies each row in the corresponding database table.
    @PrimaryKey(autoGenerate = true)
    val productId: Long = 0,
    val pizzaName: String,
    val price: Int,
    val category: String,

)
