package com.sultanov.todolist.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sultanov.todolist.domain.entity.TodoItem
import com.sultanov.todolist.domain.usecases.AddItemToListUseCaseImpl
import com.sultanov.todolist.domain.usecases.DeleteItemUseCaseImpl
import com.sultanov.todolist.domain.usecases.GetTodoListUseCaseImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

internal class TodoViewModel(
    private val getTodoListUseCaseImpl: GetTodoListUseCaseImpl,
) : ViewModel() {

    private val mutableTodoList = MutableStateFlow<List<TodoItem>?>(listOf())
    val todoList = mutableTodoList.asStateFlow()

    init {
        viewModelScope.launch {
            mutableTodoList.value = getTodoListUseCaseImpl.getTodoList()
        }
    }
}