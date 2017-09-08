package com.showmyage.maged.age

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* buResult.setOnClickListener {
        }*/
    }
    fun getResult(view: View){
        val name=etEnterName.text.toString()
        val age=etEnterAge.text.toString().toInt()
        tvShowMyName.text=name.toString()
        tvShowMyAge.text= age.toString()

    }
}
