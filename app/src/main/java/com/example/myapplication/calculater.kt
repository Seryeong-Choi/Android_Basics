package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculater.*

class calculater : AppCompatActivity() {
    var new = "0"
    var old: Int = 0
    var oper = "start"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculater)
    }

    override fun onStart() {
        super.onStart()
        one.setOnClickListener {
            if (new == "0")
                new = "1"
            else
                new += "1"
            result.setText(new)
        }
        two.setOnClickListener {
            if (new == "0")
                new = "2"
            else
                new += "2"
            result.setText(new)
        }
        three.setOnClickListener {
            if (new == "0")
                new = "3"
            else
                new += "3"
            result.setText(new)
        }
        four.setOnClickListener {
            if (new == "0")
                new = "4"
            else
                new += "4"
            result.setText(new)
        }
        five.setOnClickListener {
            if (new == "0")
                new = "5"
            else
                new += "5"
            result.setText(new)
        }
        six.setOnClickListener {
            if (new == "0")
                new = "6"
            else
                new += "6"
            result.setText(new)
        }
        seven.setOnClickListener {
            if (new == "0")
                new = "7"
            else
                new += "7"
            result.setText(new)
        }
        eight.setOnClickListener {
            if (new == "0")
                new = "8"
            else
                new += "8"
            result.setText(new)
        }
        nine.setOnClickListener {
            if (new == "0")
                new = "9"
            else
                new += "9"
            result.setText(new)
        }
        zero.setOnClickListener {
            if (new != "0")
                new += "0"
            result.setText(new)
        }
        CA.setOnClickListener {
            new = "0"
            oper = "start"
            result.setText(new)
        }
        plus.setOnClickListener {
            when (oper) {
                "plus" -> old += new.toInt()
                "minus" -> old -= new.toInt()
                "multiple" -> old *= new.toInt()
                "divide" -> old /= new.toInt()
                "start" -> old = new.toInt()
            }
            new = "0"
            oper = "plus"
        }
        minus.setOnClickListener {
            when (oper) {
                "plus" -> old += new.toInt()
                "minus" -> old -= new.toInt()
                "multiple" -> old *= new.toInt()
                "divide" -> old /= new.toInt()
                "start" -> old = new.toInt()
            }
            new = "0"
            oper = "minus"
        }
        multiple.setOnClickListener {
            when (oper) {
                "plus" -> old += new.toInt()
                "minus" -> old -= new.toInt()
                "multiple" -> old *= new.toInt()
                "divide" -> old /= new.toInt()
                "start" -> old = new.toInt()
            }
            new = "0"
            oper = "multiple"
        }
        divide.setOnClickListener {
            when (oper) {
                "plus" -> old += new.toInt()
                "minus" -> old -= new.toInt()
                "multiple" -> old *= new.toInt()
                "divide" -> old /= new.toInt()
                "start" -> old = new.toInt()
            }
            new = "0"
            oper = "divide"
        }
        showresult.setOnClickListener {
            when (oper) {
                "plus" -> old += new.toInt()
                "minus" -> old -= new.toInt()
                "multiple" -> old *= new.toInt()
                "divide" -> old /= new.toInt()
                "start" -> old = new.toInt()
            }
            new = "0"
            oper = "start"
            result.setText(old.toString())
        }

    }
}