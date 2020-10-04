package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        changeactivity.setOnClickListener {
//            val intent = Notetaking(this@Intent1, Intent2::class.java) //앞에는 this나 this@Intent1 둘다 되지만 this@Intent1로 꼭 쓰기 안그러면 크래시될때있음 class.java꼭 써야됨
//            //key value 방식(딕셔너리)
//            intent.putExtra("number1",1)
//            intent.putExtra("number2",2)
//            startActivity(intent)

            ///이렇게하길 ↓↓↓
            val intent2 = Intent(this@Intent1, Intent2::class.java)
            //apply로 블럭을 묶으면 intent2에 한 작업은 여기밖에 없다는 뜻이므로 찾기 쉬움
            intent2.apply {
                this.putExtra("number1", 1)
                this.putExtra("number2", 1)
            }
            //startActivity(intent2)//보내기만함
            startActivityForResult(intent2, 200)//결과받음

//            val intent = Notetaking(Notetaking.ACTION_VIEW, Uri.parse("http://m.naver.com"))
//            startActivity(intent)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 200) {
            Log.d("number", "" + requestCode)
            Log.d("number", "" + resultCode)
            val result = data?.getIntExtra("result", 0)
            Log.d("number", "" + result)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}