package com.sultanov.todolist.domain.usecases

import com.sultanov.todolist.domain.entity.TodoItem
import com.sultanov.todolist.domain.repository.TodoListRepository

internal class GetTodoListUseCaseImpl(
    private val todoListRepository: TodoListRepository
) : GetTodoListUseCase {

    override fun getTodoList(): List<TodoItem> {
        return todoListRepository.getTodoList()
    }
}