package com.sultanov.todolist.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.sultanov.todolist.data.entity.TodoItemDao

@Dao
internal interface TodoDao {

    @Query("SELECT * FROM todoItemDao")
    suspend fun getAll(): List<TodoItemDao>

    @Delete
    fun delete(todoItemDao: TodoItemDao)

    @Insert
    fun insert(todoItemDao: TodoItemDao)








}