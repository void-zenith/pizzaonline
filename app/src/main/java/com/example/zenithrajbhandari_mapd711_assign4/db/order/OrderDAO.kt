
package com.example.zenithrajbhandari_mapd711_assign4.db.order
import androidx.room.*
import com.example.zenithrajbhandari_mapd711_assign4.model.Order
//The @Dao annotation identifies it as a DAO class for Room
@Dao
interface OrderDAO {
    //create order
    //using insert which is a special DAO method annotation where you don't have to provide any SQL
    @Insert
    suspend fun insertOrder(order: Order)

    //read order
    @Query("SELECT * FROM `Order`")
    fun getAllOrder(): List<Order>

    //update order
    @Update
    suspend fun updateOrder(order: Order)

    //delete order
    @Delete
    suspend fun deleteOrder(order: Order)

    //deleteAll
    @Query("DELETE FROM `Order`")
    suspend fun deleteAll()
    //Declares a suspend function to delete all the words.
}