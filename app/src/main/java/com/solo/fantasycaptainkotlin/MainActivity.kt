package com.solo.fantasycaptainkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val PlayerName: TextView = findViewById(R.id.player_name)
    val ExpectedGoals: TextView = findViewById(R.id.ExpectedGoals)
    val ShotsInTheBox: TextView = findViewById(R.id.ShotsInTheBox)
    val TotalShots: TextView = findViewById(R.id.TotalShots)
    val ExpectedAssists: TextView = findViewById(R.id.ExpectedAssists)
    val OpponentXGC: TextView = findViewById(R.id.OpponentXGC)
    val PlayerRating: TextView = findViewById(R.id.player_score)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**Use Kotlin Extentions to avoid findviewbyid
        player_name.text("abc")
        ExpectedGoals.text(footballer.expectedGoals) */

        //create sample data
         val footballer = Footballer("Sadio Mane",1.2, 2.2, 3.4, 1.5, 2.0)

        PlayerName.text = footballer.playerName
        ExpectedGoals.text = (footballer.expectedGoals).toString()
        ShotsInTheBox.text = (footballer.shotsInTheBox).toString()
        TotalShots.text = (footballer.totalShots).toString()
        ExpectedAssists.text = (footballer.expectedAssists).toString()
        OpponentXGC.text = (footballer.opponentXGC).toString()

         val playerRating = footballer.calculateRating(footballer.expectedGoals, footballer.expectedAssists, footballer.shotsInTheBox,
                        footballer.totalShots, footballer.opponentXGC)

        PlayerRating.text = playerRating.toString()

    /*
        var result = getCaptainScore(xG, sInB, bigChances)
        Log.d("MainActivity", result.toString())
        //calculations.text=result.toString()
     */

    }

    fun getCaptainScore(xg: Double, sinb: Double, bigChances: Double): Double {

        var captainScore = (xg + bigChances + sinb)/3
        return captainScore
    }
}
