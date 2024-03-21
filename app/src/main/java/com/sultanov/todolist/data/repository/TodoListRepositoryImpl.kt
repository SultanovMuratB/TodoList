package com.sultanov.todolist.data.repository

import android.app.Application
import com.sultanov.todolist.data.database.AppDatabase
import com.sultanov.todolist.data.mapper.MapDaoToItem
import com.sultanov.todolist.domain.entity.TodoItem
import com.sultanov.todolist.domain.repository.TodoListRepository

internal class TodoListRepositoryImpl(
    private val map: MapDaoToItem,
    private val application: Application,
) : TodoListRepository {

    private val appDatabase = AppDatabase.getInstance(application)

    override suspend fun getTodoList(): List<TodoItem>? {
        val listItem = appDatabase?.todoDao?.getAll()
        return listItem?.let { map.mapListDaoToListItem(it) }
    }

    override suspend fun addItem(todoItem: TodoItem) {
        val todoDao = map.mapItemToDao(todoItem)
        appDatabase?.todoDao?.insert(todoDao)
    }

    override suspend fun deleteItem(todoItem: TodoItem) {
        val itemDao = map.mapItemToDao(todoItem)
        appDatabase?.todoDao?.delete(itemDao)
    }
}
//    override suspend fun insertItem(todoItem: TodoItem) {
//        val itemDao = map.mapItemToDao(todoItem)
//        _todoList.add(itemDao)
//        map.mapListDaoToListItem(_todoList)
//    }
