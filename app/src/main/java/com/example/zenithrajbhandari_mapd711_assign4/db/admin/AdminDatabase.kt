package com.example.zenithrajbhandari_mapd711_assign4.db.admin

import Admin
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Admin::class], version = 1)
abstract class AdminDatabase : RoomDatabase() {
    abstract fun AdminDAO(): AdminDAO

    companion object {
        private var INSTANCE: AdminDatabase? = null

        fun getDatabaseInstance(context: Context): AdminDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AdminDatabase::class.java,
                    "user_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
