package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_name.*

class NameActivity:AppCompatActivity() {
    //var name:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        var score:String=intent.getStringExtra("score")
        val editText=findViewById<EditText>(R.id.editTextName)
        val ratingBarr=findViewById<RatingBar>(R.id.ratingBar)

        val name = editTextName.text
        buttonNext.setOnClickListener {
            var intent:Intent=Intent(this@NameActivity,ScoreActivity::class.java);
            intent.putExtra("score",score)
            intent.putExtra("name",name.toString())
            intent.putExtra("rating",ratingBarr.rating.toString())
            startActivity(intent);
        }
    }
}