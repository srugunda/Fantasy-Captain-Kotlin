package com.solo.fantasycaptainkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var expectedGoals: Double =2.2

        player_name_2.text("Sadio Mane")
        ExpectedGoals_2.text (expectedGoals.toString())
    }
}

private operator fun CharSequence.invoke(s: String) {

}
