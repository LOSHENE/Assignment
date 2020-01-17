package com.example.assignment

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.buynow.*

class buynow : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buynow)




        button2.setOnClickListener {

            val intent: Intent= Intent(
                this, buynow::class.java
            )
            startActivity(intent)
        }





        button2.setOnClickListener {
        if (editText.text.isEmpty()) {
            editText.setError("name required")
            return@setOnClickListener
        }

        if (editText2.text.isEmpty()) {
            editText2.setError("phone number required")
            return@setOnClickListener
        }

        if (editText3.text.isEmpty()) {
            editText3.setError("address required")
            return@setOnClickListener
        }


    }

}}