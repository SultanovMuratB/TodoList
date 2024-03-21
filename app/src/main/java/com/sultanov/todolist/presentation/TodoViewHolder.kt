package com.sultanov.todolist.presentation

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sultanov.todolist.R

internal class TodoViewHolder(view: View) : RecyclerView.ViewHolder(view){

    val todoName: TextView = view.findViewById(R.id.todo_name)
    val todoCount: TextView = view.findViewById(R.id.todo_count)
}