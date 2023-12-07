package com.example.zenithrajbhandari_mapd711_assign4.db.Customer

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.zenithrajbhandari_mapd711_assign4.model.Customer


@Database(entities = [Customer::class], version = 1)
abstract class CustomerDatabase : RoomDatabase() {
    abstract fun customerDao(): CustomerDAO

    companion object {
        private var INSTANCE: CustomerDatabase? = null

        fun getDatabaseInstance(context: Context): CustomerDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CustomerDatabase::class.java,
                    "user_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
