package com.example.zenithrajbhandari_mapd711_assign4.db.admin
import Admin
import androidx.room.*
//The @Dao annotation identifies it as a DAO class for Room
@Dao
interface AdminDAO {
    //create Admin
    //using insert which is a special DAO method annotation where you don't have to provide any SQL
    @Insert
    suspend fun insertAdmin(admin: Admin)

    //read admin
    @Query("SELECT * FROM Admin")
    fun getAllAdmin(): List<Admin>

    //update admin
    @Update
    suspend fun updateAdmin(admin: Admin)

    //delete admin
    @Delete
    suspend fun deleteAdmin(admin: Admin)

    //deleteAll
    @Query("DELETE FROM Admin")
    suspend fun deleteAll()
    //Declares a suspend function to delete all the words.
}