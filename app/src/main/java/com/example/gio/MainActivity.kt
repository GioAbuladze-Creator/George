package com.example.gio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        val GenerateRundomMumberButton = findViewById<Button>(R.id.GenerateRundomMumberButton)
        val randomNumberTextView = findViewById<TextView>(R.id.randomNumberTextView)
        val yesOrNo = findViewById<TextView>(R.id.yesOrNo)
        GenerateRundomMumberButton.setOnClickListener {
            val number:Int = randomNumber()
            d("generateNumber", "This is a random number ${devidedByFive(number)}")
            randomNumberTextView.text = devidedByFive(number)

        }
    }

    private fun randomNumber() =(-100..101).random()


    fun devidedByFive(randomNumber: Int): String{
        if (randomNumber%5==0 && randomNumber/5 > 0) {
            return "Yes"
        }else{
            return "No"
        }
    }



}
