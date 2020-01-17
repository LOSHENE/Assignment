package com.example.assignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.skintype.*

class skinIdentify2: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skinidentify2)

        imageView3.setOnClickListener {

            val intent: Intent = Intent(
                this, skinIdentify2::class.java
            )
            startActivity(intent)
        }

    }
    }