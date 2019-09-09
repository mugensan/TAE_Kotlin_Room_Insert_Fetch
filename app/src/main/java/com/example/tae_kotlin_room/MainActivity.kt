package com.example.tae_kotlin_room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var db = Room.databaseBuilder(applicationContext,AppDB::class.java,"EmployerDB").build()

        var emp = Emp_Entity()
        emp.emp_id =1
        emp.emp_name = "KEVIN"
        emp.emp_post = "Senior Android Developer"

        db.empDAO().saveEmp(emp)
    }
}
