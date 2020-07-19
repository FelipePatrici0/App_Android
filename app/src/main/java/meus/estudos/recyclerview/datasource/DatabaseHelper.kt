package meus.estudos.recyclerview.datasource

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context , DATABASE_NAME, null, DATABASE_VERSION){
    override fun onCreate(p0: SQLiteDatabase?) {

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

    companion object{
        private const val DATABASE_NAME = "jogo.db"
        private const val DATABASE_VERSION = 1
    }
}