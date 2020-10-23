package com.solo.fantasycaptainkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var xG = 3.4;
        var sInB = 4.3;
        var bigChances = 4.2;

        var result = getCaptainScore(xG, sInB, bigChances)
        Log.d("MainActivity", result.toString())
        //calculations.text=result.toString()

    }

    fun getCaptainScore(xg: Double, sinb: Double, bigChances: Double): Double {

        var captainScore = (xg + bigChances + sinb)/3
        return captainScore
    }
}
