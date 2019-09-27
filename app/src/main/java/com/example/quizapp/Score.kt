package com.example.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.score.*

class Score: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.score)

        var score:String?=intent.getStringExtra("score")
        var correct:String=score.toString()
        var incorrect:String=(2-correct.toInt()).toString()
        var points:String=(correct.toInt()*100).toString()
        textViewPointsValue.setText(points)
        textViewCorrectValue.setText(correct)
        textViewIncorrectValue.setText(incorrect)
    }
}