package com.example.assignment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat.startActivityForResult
import kotlinx.android.synthetic.main.mainpage.*
import kotlinx.android.synthetic.main.skinroutine.*

class skinRoutine: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skinroutine)


        buttonMorg.setOnClickListener {

            val intent: Intent = Intent(
                this, morning::class.java
            )
            startActivity(intent)
        }

        buttonNight.setOnClickListener {

            val intent: Intent = Intent(
                this, night::class.java
            )
            startActivity(intent)


        }
    }
}







