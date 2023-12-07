package com.example.zenithrajbhandari_mapd711_assign4.db.order

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.zenithrajbhandari_mapd711_assign4.model.Order


@Database(entities = [Order::class], version = 1)
abstract class OrderDatabase : RoomDatabase() {
    abstract fun orderDao(): OrderDAO

    companion object {
        private var INSTANCE: OrderDatabase? = null

        fun getDatabaseInstance(context: Context): OrderDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    OrderDatabase::class.java,
                    "user_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
