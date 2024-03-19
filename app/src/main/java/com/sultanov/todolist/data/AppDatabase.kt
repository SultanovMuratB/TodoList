package com.sultanov.todolist.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sultanov.todolist.data.entity.TodoItemDao

@Database(entities = [TodoItemDao::class], version = 1)
internal abstract class AppDatabase : RoomDatabase() {

    abstract fun todoDao() : TodoDao




}