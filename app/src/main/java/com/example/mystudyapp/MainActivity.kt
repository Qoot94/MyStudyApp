package com.example.mystudyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kotlinBt = findViewById<Button>(R.id.btKotlin)
        val androidBt = findViewById<Button>(R.id.btAndroid)

        kotlinBt.setOnClickListener {
          val intent = Intent(this, KotlinActivity::class.java)
            startActivity(intent)
        }

        androidBt.setOnClickListener {
           startActivity(Intent(this, AndroidActivity2::class.java))
        }
    }
}