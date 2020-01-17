package com.example.assignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.skintype.*

class skinidentify4 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skinidentify4)

        imageView9.setOnClickListener {

            val intent: Intent = Intent(
                this, skinIdentify::class.java
            )
            startActivity(intent)
        }

    }
}