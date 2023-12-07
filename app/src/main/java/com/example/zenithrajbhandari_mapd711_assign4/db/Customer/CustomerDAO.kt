package com.example.zenithrajbhandari_mapd711_assign4.db.Customer
import androidx.room.*
import com.example.zenithrajbhandari_mapd711_assign4.model.Customer

//The @Dao annotation identifies it as a DAO class for Room
@Dao
interface CustomerDAO {
    //create customer
    //using insert which is a special DAO method annotation where you don't have to provide any SQL
    @Insert
    suspend fun insertCustomer(customer: Customer)

    //read customer
    @Query("SELECT * FROM Customer")
    fun getAllCustomer(): List<Customer>

    //update customer
    @Update
    suspend fun updateCustomer(customer: Customer)

    //delete customer
    @Delete
    suspend fun deleteCustomer(customer: Customer)

    //deleteAll
    @Query("DELETE FROM Customer")
    suspend fun deleteAll()
    //Declares a suspend function to delete all the words.
}