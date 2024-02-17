package com.example.quiz_test.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quiz_test")
data class QuestionData(
    @PrimaryKey val id: Int,
    val name: String,
    val answer1: String,
    val answer2: String,
    val answer3: String,
    val answer4: String
)
