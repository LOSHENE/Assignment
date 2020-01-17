package com.example.assignment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.skinproductnew.*


class skinproduct : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skinproductnew)



        button3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val snackbar: Snackbar = Snackbar
                    .make(myCoordinatorLayout, "Item is added", Snackbar.LENGTH_LONG)
                    .setAction("UNDO", object : View.OnClickListener{
                        override fun onClick(v: View?) {
                            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                        }


                    })
                snackbar.show()
            }
        })
        button6.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val snackbar: Snackbar = Snackbar
                    .make(myCoordinatorLayout, "Item is added", Snackbar.LENGTH_LONG)
                    .setAction("UNDO", object : View.OnClickListener{
                        override fun onClick(v: View?) {
                            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                        }


                    })
                snackbar.show()
            }
        })
        button9.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val snackbar: Snackbar = Snackbar
                    .make(myCoordinatorLayout, "Item is added", Snackbar.LENGTH_LONG)
                    .setAction("UNDO", object : View.OnClickListener{
                        override fun onClick(v: View?) {
                            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                        }


                    })
                snackbar.show()
            }
        })


    }






}