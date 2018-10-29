package com.example.qxw3196.kotlinapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler().postDelayed({
            navigateToNextScreen()
        }, 1000)
    }

    private fun navigateToNextScreen(){
        val intent = Intent(this, FirstActivity::class.java)
        startActivity(intent)
        finish()
    }
}