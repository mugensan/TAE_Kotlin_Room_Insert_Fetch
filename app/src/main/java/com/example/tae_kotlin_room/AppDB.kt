package com.example.tae_kotlin_room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database (entities = [(Emp_Entity::class)],version = 1)
abstract class AppDB : RoomDatabase() {

    abstract fun empDAO(): Emp_DAO
}