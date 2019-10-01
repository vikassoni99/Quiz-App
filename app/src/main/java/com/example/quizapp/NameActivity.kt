package com.example.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NameActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        var score:String=intent.getStringExtra("score")

    }
}