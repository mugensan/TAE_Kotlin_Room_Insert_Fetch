package com.example.tae_kotlin_room

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface Emp_DAO {

    @Insert
    fun saveEmp(emp:Emp_Entity)
}