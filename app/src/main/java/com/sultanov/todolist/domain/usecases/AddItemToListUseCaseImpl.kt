package com.sultanov.todolist.domain.usecases

import com.sultanov.todolist.domain.entity.TodoItem
import com.sultanov.todolist.domain.repository.TodoListRepository

internal class AddItemToListUseCaseImpl(
    private val repository: TodoListRepository
) : AddItemToListUseCase {

    override fun addToList(todoItem: TodoItem) {
        repository.addItem(todoItem)
    }
}