package com.sultanov.todolist.data

import android.app.Application
import com.sultanov.todolist.data.entity.TodoItemDao
import com.sultanov.todolist.data.mapper.MapDaoToItem
import com.sultanov.todolist.domain.entity.TodoItem
import com.sultanov.todolist.domain.repository.TodoListRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

internal class TodoListRepositoryImpl(
    private val map: MapDaoToItem,
    private val appDatabase: AppDatabase,
    private val application: Application,
) : TodoListRepository {

    override suspend fun getTodoList(): List<TodoItem>? {
        val listItem = appDatabase.getInstance(application)?.todoDao?.getAll()
        return listItem?.let { map.mapListDaoToListItem(it) }
    }

    override fun addItem(todoItem: TodoItem) {
        val itemDao = map.mapItemToDao(todoItem)
        map.mapListDaoToListItem(_todoList)
    }

    override fun deleteItem(todoItem: TodoItem) {
        val itemDao = map.mapItemToDao(todoItem)
        _todoList.remove(itemDao)
        map.mapListDaoToListItem(_todoList)
    }

    override fun insertItem(todoItem: TodoItem) {
        val itemDao = map.mapItemToDao(todoItem)
        _todoList.add(itemDao)
        map.mapListDaoToListItem(_todoList)
    }
}