package com.solo.fantasycaptainkotlin

import androidx.lifecycle.LiveData

// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
class PlayerRepository(private val playerDao: PlayerDao) {

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allPlayers: LiveData<List<Player>> = playerDao.getAlphabetizedPlayers()

    suspend fun insert(player: Player) {
        playerDao.insert(player)
    }
}


