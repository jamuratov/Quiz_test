package com.example.quiz_test.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.quiz_test.Dao.Dao
import com.example.quiz_test.ui.Sorawlar


@Database(entities = [Questions::class], version = 1)

abstract class QuizTestDatabase : RoomDatabase() {
    companion object {
        private var INTANCE: QuizTestDatabase? = null
        fun getInstance(context: Context): QuizTestDatabase {
            INTANCE?.let {
                return it
            }

            val db = Room.databaseBuilder(
                context, QuizTestDatabase::class.java, "Quiz_test.db"
            ).createFromAsset("Quiz_test.db")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build()

            INTANCE = db
            return db
        }
    }
    abstract fun getDao():Dao
}

