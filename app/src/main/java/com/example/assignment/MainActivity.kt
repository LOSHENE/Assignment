package com.example.assignment

import android.content.Intent

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.mainpage.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage)

// set on-click listener for ImageView
        imageViewSkinRoutine.setOnClickListener{

            val intent: Intent = Intent(
                this,skinRoutine::class.java)
            startActivity(intent)



        }
        imageViewSkinType.setOnClickListener {

            val intent: Intent = Intent(
                this,skintype::class.java)
            startActivity(intent)
        }
        imageViewSkinAge.setOnClickListener {

            val intent: Intent = Intent(
                this,skinproduct::class.java)
            startActivity(intent)

        }
        imageViewFacialTutorial.setOnClickListener {

            val intent: Intent = Intent(
                this,facialtutorial::class.java)
            startActivity(intent)

        }
    }
}





