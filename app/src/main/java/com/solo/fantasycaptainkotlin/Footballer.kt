package com.solo.fantasycaptainkotlin

class Footballer (var playerName: String, var expectedGoals: Double, var shotsInTheBox: Double, var totalShots: Double,
                  var expectedAssists: Double, var opponentXGC: Double) {

    var playerRating: Double = 0.0

    fun calculateRating(expectedGoals: Double, expectedAssists: Double, shotsInTheBox: Double,
                  totalShots: Double, opponentXGC: Double): Double {

        playerRating = (expectedGoals*20) + (expectedAssists*15) + (shotsInTheBox*19) + (totalShots*18) + (opponentXGC*17)

        return playerRating
    }
}