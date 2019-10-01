package com.example.quizapp

import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_score.*

class ScoreActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        var name:String?=intent.getStringExtra("name").toString()
        var score:String?=intent.getStringExtra("score")
        var correct:String=score.toString()
        var incorrect:String=(2-correct.toInt()).toString()
        var points:String=(correct.toInt()*100).toString()
        val rating:String=intent.getStringExtra("rating")
        val ratingBarr=findViewById<RatingBar>(R.id.ratingBar2)

        val r:Float=rating.toFloat()
        textViewPointsValue.setText(points)
        textViewCorrectValue.setText(correct)
        textViewIncorrectValue.setText(incorrect)
        textViewAns1.setText("Hey $name !")
        textViewAns2.setText("You rated us $rating /5")
        ratingBarr.setRating(r)
    }
}