package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_open_internet_page.*

class OpenInternetPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_internet_page)

        open.setOnClickListener {
            val address = address_to_open.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }
        //왜 http://해야만 열리는지? (https는 못염)
        address_to_open.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                Log.d("edit", "afterTextChanged : " + p0)
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("edit", "beforeTextChanged : " + p0)
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("edit", "onTextChanged : " + p0)
            }
        })
    }
}