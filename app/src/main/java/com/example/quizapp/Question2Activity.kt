package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R.layout.activity_ques2
import kotlinx.android.synthetic.main.activity_ques2.*

class Question2Activity:AppCompatActivity() {
    var score:String=""
    var a:Int=0//intent.getStringExtra("activity_score").toInt()
    var chId:RadioButton?=null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(activity_ques2)

            score=intent.getStringExtra("activity_score")
            a=score.toInt()
            radioGrp.setOnCheckedChangeListener { group, checkedId ->
                chId=findViewById(checkedId) }

            submit_button.setOnClickListener {
                when(chId){
                    radio_ans->a+=1
                    else->a+=0
                }
                Toast.makeText(this@Question2Activity,"ScoreActivity is : $a",Toast.LENGTH_SHORT).show()
                //activity_score=a.toString()
                var intent:Intent=Intent(this@Question2Activity,SeekbarActivity::class.java);
                intent.putExtra("score",a.toString())
                startActivity(intent);
            }




        }
    }