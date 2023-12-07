package com.example.zenithrajbhandari_mapd711_assign4.db.pizza
import androidx.room.*
import com.example.zenithrajbhandari_mapd711_assign4.model.Pizza
//The @Dao annotation identifies it as a DAO class for Room
@Dao
interface PizzaDAO{
    //create Pizza
    //using insert which is a special DAO method annotation where you don't have to provide any SQL
    @Insert
    suspend fun insertPizza(pizza: Pizza)

    //read Pizza
    @Query("SELECT * FROM Pizza")
    fun getAllPizza(): List<Pizza>

    //update Pizza
    @Update
    suspend fun updatePizza(pizza: Pizza)

    //delete pizza
    @Delete
    suspend fun deletePizza(pizza: Pizza)

    //deleteAll
    @Query("DELETE FROM Pizza")
    suspend fun deleteAll()
    //Declares a suspend function to delete all the words.
}