package com.example.assignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.skintype.*

class skinidentify3: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skinidentify3)

        imageView8.setOnClickListener {

            val intent: Intent = Intent(
                this, skinIdentify::class.java
            )
            startActivity(intent)
        }

    }
}