package com.example.qxw3196.kotlinapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        initView()
    }

    /**
     *  initializing view
     */
    private fun initView() {
        header.text = "Header Text"
        first_text.text = "First text will be here"
        second_text.text = "Second text will be here"
        third_text.text = "Third text will be here"
    }
}