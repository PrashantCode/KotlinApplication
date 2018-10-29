package com.example.qxw3196.kotlinapplication

import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val carName = "Matrix"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initUI()
        button.setOnClickListener {

            val audioManager = applicationContext.getSystemService(Context.AUDIO_SERVICE) as AudioManager
            audioManager.mode = AudioManager.MODE_NORMAL
            if (audioManager.isMicrophoneMute == false) {
                audioManager.isMicrophoneMute = true
                button.text = "UnMute"
            } else {
                audioManager.isMicrophoneMute = false
                button.text = "Mute"
            }

            /*val mAudioManager = this.getSystemService(Context.AUDIO_SERVICE) as AudioManager
            val setVolume = 0
            mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, setVolume, 0)*/
        }


    }

    /*fun initUI(){
        first_number_textView.setText("10")
        second_number_textView.setText("10")
    }

    fun doCalculation(x:String, y: String):String{
       var result: Int = x.toInt()+y.toInt()
        return result.toString()
    }

    fun printÃnswer(){

        var result:String = doCalculation(first_number_textView.text.toString(),second_number_textView.text.toString())
        third_number_textView.setText(result)
    }*/
}
