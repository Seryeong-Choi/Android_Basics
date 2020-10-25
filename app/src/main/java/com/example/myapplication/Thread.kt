package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Thread

class Thread : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        val runnable: Runnable = object : Runnable{
            override fun run() {
                Log.d("thread-1", "Thread is made")
            }
        }
        val thread : Thread = Thread(runnable)
        thread.start()
        //이렇게 해도 됨
        Thread(object:Runnable{
            override fun run(){

            }
        }).start()
        runOnUiThread {

        }
    }
}