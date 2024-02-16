package com.example.quiz_test.Dao

import androidx.room.Dao
import androidx.room.Query
import com.example.quiz_test.Data.QuestionData


@Dao()
interface QuestionDao {

    @Query("SELECT * FROM quiz_test")
    suspend fun getQuestions(): List<QuestionData>
}