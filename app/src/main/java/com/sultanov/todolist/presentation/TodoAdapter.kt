package com.sultanov.todolist.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.sultanov.todolist.R
import com.sultanov.todolist.domain.entity.TodoItem

internal class TodoAdapter :  ListAdapter<TodoItem, TodoViewHolder>(TodoDiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val item = getItem(position)
        holder.todoName.text = item.name
        holder.todoCount.text = item.quantity.toString()
    }
}