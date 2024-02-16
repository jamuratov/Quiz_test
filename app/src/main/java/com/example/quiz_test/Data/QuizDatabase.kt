package com.example.quiz_test.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.quiz_test.Dao.QuestionDao

@Database(entities = [QuestionData::class], version = 2)
abstract class QuizDatabase : RoomDatabase() {

    companion object {
        private var INSTANCE: QuizDatabase? = null

        fun getInstance(context: Context): QuizDatabase {
            INSTANCE?.let {
                return it
            }

            val db = Room.databaseBuilder(
                context, QuizDatabase::class.java, "question.db"
            )
                .createFromAsset("question.db")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build()

            INSTANCE = db
            return db
        }
    }

    abstract fun getQuestionsDao(): QuestionDao
}