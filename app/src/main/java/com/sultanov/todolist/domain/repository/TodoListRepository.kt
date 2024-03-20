package com.sultanov.todolist.domain.repository

import com.sultanov.todolist.domain.entity.TodoItem

internal interface TodoListRepository {

    suspend fun getTodoList() : List<TodoItem>?

    suspend fun addItem(todoItem: TodoItem)

    suspend fun deleteItem(todoItem: TodoItem)

    suspend fun insertItem(todoItem: TodoItem)
}