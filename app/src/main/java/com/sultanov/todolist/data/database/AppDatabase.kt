package com.sultanov.todolist.data.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sultanov.todolist.data.entity.TodoItemDao

@Database(entities = [TodoItemDao::class], version = 1, exportSchema = false)
internal abstract class AppDatabase : RoomDatabase() {

    abstract val todoDao: TodoDao

    private var instance: AppDatabase? = null

    companion object {
        private const val DB_NAME = "todo.db"

        fun getInstance(application: Application): AppDatabase? {
            return Room.databaseBuilder(
                application,
                AppDatabase::class.java,
                DB_NAME
            ).build()
        }
    }
}
