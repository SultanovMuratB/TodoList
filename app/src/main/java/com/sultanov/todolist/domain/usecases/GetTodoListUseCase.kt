package com.sultanov.todolist.domain.usecases

import com.sultanov.todolist.domain.entity.TodoItem

internal interface GetTodoListUseCase {

    suspend fun getTodoList(): List<TodoItem>?
}