package com.example.myreadlist.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reading_lists")
data class ReadingList(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val description: String
)