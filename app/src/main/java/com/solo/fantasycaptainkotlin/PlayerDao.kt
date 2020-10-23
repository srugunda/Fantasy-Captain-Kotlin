package com.solo.fantasycaptainkotlin

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PlayerDao {

    @Query("SELECT * from player_table ORDER BY player ASC")
    fun getAlphabetizedPlayers(): LiveData<List<Player>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(player: Player)

    @Query("DELETE FROM player_table")
    suspend fun deleteAll()
}