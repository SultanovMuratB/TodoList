package com.sultanov.todolist.domain.usecases

import com.sultanov.todolist.domain.entity.TodoItem

internal interface InsertItemUseCase {

    suspend fun insertItem(todoItem: TodoItem)
}