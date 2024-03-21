package com.sultanov.todolist.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sultanov.todolist.domain.usecases.GetTodoListUseCaseImpl

internal class TodoViewModelFactory(
    private val getTodoListUseCaseImpl: GetTodoListUseCaseImpl
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass == TodoViewModel::class.java) {
            return TodoViewModel(getTodoListUseCaseImpl) as T
        } else throw IllegalArgumentException("Unknown ViewModel class")
    }
}