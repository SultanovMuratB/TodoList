package com.sultanov.todolist.domain.repository

import com.sultanov.todolist.domain.entity.TodoItem

internal interface TodoListRepository {

    fun getTodoList() : List<TodoItem>

    fun addItem(todoItem: TodoItem)

    fun deleteItem(todoItem: TodoItem)

    fun insertItem(todoItem: TodoItem)
}