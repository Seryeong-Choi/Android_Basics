package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity(), FragmentOne.OnDataPassListener {
    override fun onDataPass(data: String?) {
        Log.d("pass", "" + data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("life_cycle", "onCreate")

        val fragmentOne: FragmentOne = FragmentOne()
        //프래그먼트에 데이터 넣으려면 번들을 만들어야 한다
        val bundle: Bundle = Bundle()
        bundle.putString("hello", "hello")
        fragmentOne.arguments = bundle
        button.setOnClickListener {
            //동적 프래그먼트
            //프래그먼트 붙이는 방법 replace와 add
            val fragmentManager: FragmentManager = supportFragmentManager
            //23강 설명 꼭 듣기
            //transaction //작업의 단위로 시작과 끝이 있다다
            val fragmentTranction = fragmentManager.beginTransaction()
            fragmentTranction.replace(R.id.containter, fragmentOne) //resourse id랑 프래그먼트를 바꿔줌
            fragmentTranction.commit()
            //commit은 시간 될 떄 해, commitnow는 지금 해
            //commit을 쓰는 게 더 안정적이다 실행되는거 별차이안남
        }

        button2.setOnClickListener {
            //프래그먼트 떼는 방법 remove와 detach //remove는 나중에 다시 붙일 수 있고 detach는 못붙임 //그러나 대부분 다시 붙일 일은 없다
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.detach(fragmentOne)
            fragmentTransaction.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle", "Destroy")
    }
}