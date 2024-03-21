package com.sultanov.todolist.presentation

import androidx.recyclerview.widget.DiffUtil
import com.sultanov.todolist.domain.entity.TodoItem

internal class TodoDiffCallback : DiffUtil.ItemCallback<TodoItem>() {

    override fun areItemsTheSame(oldItem: TodoItem, newItem: TodoItem): Boolean {
        return oldItem.uid == newItem.uid
    }

    override fun areContentsTheSame(oldItem: TodoItem, newItem: TodoItem): Boolean {
        return oldItem == newItem
    }
}