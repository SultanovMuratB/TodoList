package com.sultanov.todolist.domain.usecases

import com.sultanov.todolist.domain.entity.TodoItem

internal interface DeleteItemUseCase {

    suspend fun deleteItem(todoItem: TodoItem)
}