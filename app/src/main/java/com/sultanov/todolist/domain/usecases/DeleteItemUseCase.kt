package com.sultanov.todolist.domain.usecases

import com.sultanov.todolist.domain.entity.TodoItem

internal interface DeleteItemUseCase {

    fun deleteItem(todoItem: TodoItem)
}