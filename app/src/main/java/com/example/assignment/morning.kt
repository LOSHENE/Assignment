package com.example.assignment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.morning.*
import kotlinx.android.synthetic.main.skinroutine.*

class morning: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.morning)


        textView3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.stylecraze.com/articles/simple-morning-skin-care-tips-for-a-beautiful-you/#gref")
                    )
                )
            }
        })
    }




        }

