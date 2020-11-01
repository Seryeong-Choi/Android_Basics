package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_listview.*

class ListviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        val carList = ArrayList<CarForList>()
        for(i in 0 until 20){
            carList.add(CarForList("" + i + " 번째 자동차","" + i + "순위 엔진"))
        }

        val adapter = ListViewAdapter(carList, LayoutInflater.from(this@ListviewActivity))
        listView.adapter = adapter
        listView.setOnItemClickListener { adapterView, view, i, l ->
            val carName = (adapter.getItem(i) as CarForList).name
            val carEngine = (adapter.getItem(i) as CarForList).engine

            Toast.makeText(this, carName + " " + carEngine, Toast.LENGTH_SHORT).show()
        }
    }
}

class ListViewAdapter(
    val carForList : ArrayList<CarForList>,
    val layoutInflater: LayoutInflater
    ) : BaseAdapter() {

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view: View
        val holder: ViewHolder

        if(p1 == null) {
            view = layoutInflater.inflate(R.layout.item_view, null)
            holder = ViewHolder()

            holder.carName = view.findViewById(R.id.car_name)
            holder.carEngine = view.findViewById(R.id.car_engine)

            view.tag = holder
        }else{
            holder = p1.tag as ViewHolder
            view= p1
        }
        holder.carName?.setText(carForList.get(p0).name)
        holder.carEngine?.setText(carForList.get(p0).engine)

        return view
    }

    override fun getItem(p0: Int): Any {
        //그리려는 아이템 리스트의 하나(포지션에 해당하는)
        return carForList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        //해당 포지션 위치의 아에ㅣ템뷰의 아이디 설정
       return p0.toLong()
    }

    override fun getCount(): Int {
        //그리려는 아이템 리스트의 전체 개수
        return carForList.size
    }
}

class ViewHolder{
    var carName: TextView? = null
    var carEngine: TextView? = null
}