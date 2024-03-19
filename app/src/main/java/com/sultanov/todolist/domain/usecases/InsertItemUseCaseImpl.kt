package com.sultanov.todolist.domain.usecases

import com.sultanov.todolist.domain.entity.TodoItem
import com.sultanov.todolist.domain.repository.TodoListRepository

internal class InsertItemUseCaseImpl(
    private val repository: TodoListRepository
) : InsertItemUseCase {

    override fun insertItem(todoItem: TodoItem) {
        repository.insertItem(todoItem)
    }
}