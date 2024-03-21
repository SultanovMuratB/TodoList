package com.sultanov.todolist.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.sultanov.todolist.R
import com.sultanov.todolist.domain.entity.TodoItem
import kotlinx.coroutines.launch

internal class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var todoViewModelFactory: TodoViewModelFactory

    private lateinit var adapter: TodoAdapter

    private val viewModel by lazy {
        ViewModelProvider(this, todoViewModelFactory)[TodoViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.todoList.collect {
                    if (it != null) {
                        doOnGetUsers(it)
                    }
                }
            }
        }
    }

    private fun doOnGetUsers(todoList: List<TodoItem>) {
        adapter.submitList(todoList)
    }
}