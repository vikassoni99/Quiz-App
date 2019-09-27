package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R.layout.ques2
import kotlinx.android.synthetic.main.ques2.*

class Act2:AppCompatActivity() {
    var a:Int=0
    var chId:RadioButton?=null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(ques2)

            radioGrp.setOnCheckedChangeListener { group, checkedId ->
                chId=findViewById(checkedId) }

            submit_button.setOnClickListener {
                when(chId){
                    radio_ans->a=1
                    else->a=0
                }
                Toast.makeText(this@Act2,"Score is : "+a,Toast.LENGTH_SHORT).show()

                startActivity(Intent(this@Act2,Score::class.java))
            }




        }
    }