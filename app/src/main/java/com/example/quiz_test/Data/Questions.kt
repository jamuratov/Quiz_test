package com.example.quiz_test.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quiz_test")
data class Questions(
    @PrimaryKey val id: Int,
    val name: String
)
