package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentTwo : Fragment() {
    override fun onCreateView( //fragment가 인터페이스 처음 그릴 때 호출됨
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflater는 view를 그림
        //container는 부모뷰
        Log.d("life_cycle", "F onCreateView")
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

}

