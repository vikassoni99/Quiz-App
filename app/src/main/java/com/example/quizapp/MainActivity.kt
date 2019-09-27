package com.example.quizapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    var cId:RadioButton? = null
    var a:Int=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGrp.setOnCheckedChangeListener { group, checkedId ->
            cId = findViewById(checkedId)
        }
        button1.setOnClickListener{
            when(cId){
                radio_ans->a=1
                else->a=0
            }
            Toast.makeText(this@MainActivity,"Score is : "+a,Toast.LENGTH_SHORT).show()
            var intent:Intent= Intent(this@MainActivity,Act2::class.java)
            startActivity(intent)
        }


    }
    fun getans(){
        when(cId){
            radio_ans->a=1
        }
    }


}
