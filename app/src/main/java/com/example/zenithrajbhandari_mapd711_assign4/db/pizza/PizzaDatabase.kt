package com.example.zenithrajbhandari_mapd711_assign4.db.pizza

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.zenithrajbhandari_mapd711_assign4.model.Pizza


@Database(entities = [Pizza::class], version = 1)
abstract class PizzaDatabase : RoomDatabase() {
    abstract fun pizzaDao(): PizzaDAO

    companion object {
        private var INSTANCE: PizzaDatabase? = null

        fun getDatabaseInstance(context: Context): PizzaDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PizzaDatabase::class.java,
                    "user_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
