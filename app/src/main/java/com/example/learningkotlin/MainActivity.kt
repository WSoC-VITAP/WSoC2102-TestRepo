package com.example.learningkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val btnClickMe = findViewById(R.id.button) as Button
        //val myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0
        button.setOnClickListener {
            //timesClicked = timesClicked + 1
            timesClicked += 1
            myTextView./text = timesClicked.toString()
            Toast.makeText(this@MainActivity , "your clicked me !!!" , Toast.LENGTH_SHORT).show()
        }
    }
}