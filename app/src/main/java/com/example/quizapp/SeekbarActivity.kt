package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_seekbar.*

class SeekbarActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seekbar)

        var score=intent.getStringExtra("activity_score")

        seekBar?.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                var x:Int?=seekBar?.progress?.toInt()
                Toast.makeText(this@SeekbarActivity,when(x){
                    in 50..70->"Hey Human !"
                    else->"Hey Bot"
                },Toast.LENGTH_SHORT).show()
                if(x in 50..70){
                    var intent:Intent=Intent(this@SeekbarActivity,NameActivity::class.java);
                    intent.putExtra("activity_score",score)
                    startActivity(intent);
                }
            }
        })
    }
}