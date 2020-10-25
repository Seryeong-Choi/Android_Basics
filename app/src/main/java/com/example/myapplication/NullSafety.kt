package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NullSafety : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number1 : Int? = null
        val number2 : Int = 10
        val number3 = number1?.plus(number2)

        val number4 = number1 ?: 10
    }
}