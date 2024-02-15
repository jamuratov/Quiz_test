package com.example.quiz_test.Dao

import androidx.room.Dao
import com.example.quiz_test.Data.Questions

@Dao()
interface Dao {
    @androidx.room.Query("SELECT * FROM quiz_test")
    suspend fun getAllQuestion(): List<Questions>
}