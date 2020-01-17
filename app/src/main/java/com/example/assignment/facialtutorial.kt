package com.example.assignment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.facialtutorial.*


class facialtutorial : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.facialtutorial)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=bzSTpdcs-EI")
                    )
                )
            }
        })
    }




    }