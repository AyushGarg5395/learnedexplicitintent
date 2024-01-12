package com.example.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent= findViewById<Button>(R.id.button)
        val btnIntent2= findViewById<Button>(R.id.button3)

        btnIntent.setOnClickListener {
            //open a new activity
            intent= Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }

        btnIntent2.setOnClickListener{
            //open a new activity
            intent= Intent(applicationContext, thirdActivity::class.java)
            startActivity(intent)
        }

    }
}