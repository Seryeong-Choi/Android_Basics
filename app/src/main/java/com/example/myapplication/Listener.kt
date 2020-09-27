package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        //뷰를 activity로 가져오기
        //1 직접찾기
        //val textView : TextView = findViewById(R.id.hello)
        //2 xml을 import해서 가져오기
        //hello //쓰고 밑에 나오는거 엔터하면 된다

        hello.setOnClickListener {
            Log.d("click", "Click!")
            hello.setText("안녕하세요")
            image.setImageResource(R.drawable.moo)
        }


    }
}