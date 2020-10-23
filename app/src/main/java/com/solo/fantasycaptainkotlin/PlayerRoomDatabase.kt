package com.solo.fantasycaptainkotlin

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

// Annotates class to be a Room Database with a table (entity) of the Word class
@Database(entities = arrayOf(Player::class), version = 1, exportSchema = false)
public abstract class PlayerRoomDatabase : RoomDatabase() {

    abstract fun playerDao(): PlayerDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: PlayerRoomDatabase? = null

        fun getDatabase(context: Context): PlayerRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PlayerRoomDatabase::class.java,
                    "player_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}