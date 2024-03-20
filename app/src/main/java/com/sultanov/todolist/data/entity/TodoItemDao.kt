package com.sultanov.todolist.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
internal data class TodoItemDao(
    @PrimaryKey
    val uid: Int,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "visible")
    val visible: Boolean,
    @ColumnInfo(name = "quantity")
    val quantity: Int,
)
