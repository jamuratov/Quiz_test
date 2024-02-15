package com.example.quiz_test.Dao

import androidx.room.Query
import com.example.quiz_test.Data.QuestionData

@androidx.room.Dao()
interface QuestionDao {

    @Query("SELECT * FROM quiz_test")
    fun getAllQuestion(): List<QuestionData>
}