package com.sultanov.todolist.domain.usecases

import com.sultanov.todolist.domain.entity.TodoItem
import com.sultanov.todolist.domain.repository.TodoListRepository

internal class DeleteItemUseCaseImpl(
    private val repository: TodoListRepository
) : DeleteItemUseCase {

    override fun deleteItem(todoItem: TodoItem) {
        repository.deleteItem(todoItem)
    }
}