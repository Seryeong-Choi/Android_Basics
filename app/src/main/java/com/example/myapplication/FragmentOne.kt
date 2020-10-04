package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentOne:Fragment(){
    override fun onAttach(context: Context) {
        Log.d("life_cycle", "F onCreate")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onCreate")
        super.onCreate(savedInstanceState)
    }

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "F onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("life_cycle", "F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle", "F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle", "F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle", "F onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("life_cycle", "F onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("life_cycle", "F onDetach")
        super.onDetach()
    }
}