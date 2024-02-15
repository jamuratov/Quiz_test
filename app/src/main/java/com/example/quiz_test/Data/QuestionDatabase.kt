package com.example.quiz_test.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.quiz_test.Dao.QuestionDao

@Database(entities = [QuestionData::class], version = 1)
abstract class QuestionDatabase : RoomDatabase() {

    companion object {
        private var instance : QuestionDatabase? = null

        fun getInstance(context: Context) : QuestionDatabase {
            instance?.let {
                return it
            }

            val db = Room.databaseBuilder(context, QuestionDatabase::class.java,"question.db")
                .createFromAsset("question.db")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build()

            instance = db
            return db
        }
    }

    abstract fun getAllQuestionDao() : QuestionDao

}