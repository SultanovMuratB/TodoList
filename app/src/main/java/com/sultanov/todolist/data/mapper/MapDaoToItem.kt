package com.sultanov.todolist.data.mapper

import com.sultanov.todolist.data.entity.TodoItemDao
import com.sultanov.todolist.domain.entity.TodoItem

internal class MapDaoToItem {

    fun mapDaoToItem(itemDao: TodoItemDao) : TodoItem {
        return TodoItem(
            uid = itemDao.uid,
            name = itemDao.name,
            visible = itemDao.visible,
            quantity = itemDao.quantity,
        )
    }

    fun mapItemToDao(item: TodoItem) : TodoItemDao {
        return TodoItemDao(
            uid = item.uid,
            name = item.name,
            visible = item.visible,
            quantity = item.quantity,
        )
    }

    fun mapListDaoToListItem(list: List<TodoItemDao>) : List<TodoItem> {
        return list.map {
            mapDaoToItem(it)
        }
    }
}