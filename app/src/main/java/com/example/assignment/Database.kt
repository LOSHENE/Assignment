package com.example.assignment

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteConstraintException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import java.util.ArrayList


class Database (context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES)
        onCreate(db)
    }

    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        onUpgrade(db, oldVersion, newVersion)
    }

    @Throws(SQLiteConstraintException::class)
    fun insertUser(user: product): Boolean {
        // Gets the data repository in write mode
        val db = writableDatabase

        // Create a new map of values, where column names are the keys
        val values = ContentValues()
        values.put(datacontract.details.COLUMN_NAME, user.name)
        values.put(datacontract.details.COLUMN_PHONE,user.phone)
        values.put(datacontract.details.COLUMN_ADD,user.add)


        // Insert the new row, returning the primary key value of the new row
        val newRowId = db.insert(datacontract.details.TABLE_NAME, null, values)

        return true
    }

    @Throws(SQLiteConstraintException::class)
    fun deleteUser(name: String): Boolean {
        // Gets the data repository in write mode
        val db = writableDatabase
        // Define 'where' part of query.
        val selection = datacontract.details.COLUMN_NAME + " LIKE ?"
        // Specify arguments in placeholder order.
        val selectionArgs = arrayOf(name)
        // Issue SQL statement.
        db.delete(datacontract.details.TABLE_NAME, selection, selectionArgs)

        return true
    }

    fun readUser(add: String): ArrayList<product> {
        val users = ArrayList<product>()
        val db = writableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery("select * from " + datacontract.details.TABLE_NAME + " WHERE " + datacontract.details.COLUMN_ADD + "='" + add + "'", null)
        } catch (e: SQLiteException) {
            // if table not yet present, create it
            db.execSQL(SQL_CREATE_ENTRIES)
            return ArrayList()
        }


        var name: String
        var phone : String
        var add : String
        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
                name = cursor.getString(cursor.getColumnIndex(datacontract.details.COLUMN_NAME))
                phone = cursor.getString(cursor.getColumnIndex(datacontract.details.COLUMN_PHONE))
                add = cursor.getString(cursor.getColumnIndex(datacontract.details.COLUMN_ADD))
                users.add(product(name, phone, add))
                cursor.moveToNext()
            }
        }
        return users
    }

    fun readAllUsers(): ArrayList<product> {
        val users = ArrayList<product>()
        val db = writableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery("select * from " + datacontract.details.TABLE_NAME, null)
        } catch (e: SQLiteException) {
            db.execSQL(SQL_CREATE_ENTRIES)
            return ArrayList()
        }

        var name: String
        var phone: String
        var add: String
        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
                name = cursor.getString(cursor.getColumnIndex(datacontract.details.COLUMN_NAME))
                phone = cursor.getString(cursor.getColumnIndex(datacontract.details.COLUMN_PHONE))
                add = cursor.getString(cursor.getColumnIndex(datacontract.details.COLUMN_ADD))

                users.add(product(name,phone,add))
                cursor.moveToNext()
            }
        }
        return users
    }



    companion object {
        // If you change the database schema, you must increment the database version.
        val DATABASE_VERSION = 102
        val DATABASE_NAME = "FeedReader.db"

        private val SQL_CREATE_ENTRIES =
            "CREATE TABLE " +datacontract.details.TABLE_NAME + " (" +
                    datacontract.details.COLUMN_NAME + " TEXT PRIMARY KEY," +
                    datacontract.details.COLUMN_PHONE + " TEXT ," +
                    datacontract.details.COLUMN_ADD + " TEXT )"

        private val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + datacontract.details.TABLE_NAME
    }

}