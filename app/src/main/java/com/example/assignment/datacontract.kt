package com.example.assignment

import android.provider.BaseColumns

object datacontract {

    class details :BaseColumns{
        companion object{
            val TABLE_NAME = "users"
            val COLUMN_NAME ="name"
            val COLUMN_PHONE="phone"
            val COLUMN_ADD ="add"
        }
    }
}