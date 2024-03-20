package com.sultanov.todolist.domain.entity

internal data class TodoItem(
    val uid: Int,
    val name: String,
    val visible: Boolean,
    val quantity: Int,
)