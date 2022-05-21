package com.example.datapicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = findViewById<DatePicker>(R.id.datapick) as DatePicker
        val calender:Calendar = Calendar.getInstance()

        data.init(calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH),{view,year,monthOfYear,dayOfMonth->
            Toast.makeText(applicationContext,"#"+data.dayOfMonth +"-"+ data.dayOfMonth +"-"+ data.year+"#",Toast.LENGTH_SHORT).show()
        })

    }
}