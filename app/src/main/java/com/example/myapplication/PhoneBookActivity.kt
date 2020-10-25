package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import org.w3c.dom.Text

class PhoneBookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book)

        val phoneBook = createFakePhoneBook()
        createPhoneBookList(phoneBook)
    }
    fun createFakePhoneBook(fakeNumber : Int = 10, phoneBook: PhoneBook = PhoneBook()) : PhoneBook{
        for (i in 0 until fakeNumber){
            phoneBook.addPerson(Person("" + i + "번째 사람", "" + i + "번째 사람의 전화번호"))
        }
        return phoneBook
    }

    fun createPhoneBookList(phoneBook : PhoneBook){
        val layoutInflater = LayoutInflater.from(this@PhoneBookActivity)
        val container = findViewById<LinearLayout>(R.id.phonebook_list_container)
        for (i in 0 until phoneBook.friendList.size){
            val view = layoutInflater.inflate(R.layout.phonebook_item, null)
            val personNameView = view.findViewById<TextView>(R.id.friend_name)
            personNameView.setText(phoneBook.friendList.get(i).name)
            addSetOnClickListener(phoneBook.friendList.get(i), view)
            container.addView(view)
        }
    }

    fun addSetOnClickListener(person: Person, view: View){
        view.setOnClickListener {
            val intent = Intent(this, PhoneBookDetailActivity::class.java)
            intent.putExtra("name", person.name)
            intent.putExtra("number", person.number)
            startActivity(intent)
        }
    }
}

class PhoneBook(){
    val friendList = ArrayList<Person>()
    fun addPerson(person: Person){
        friendList.add(person)
    }
}

class Person(val name: String, var number: String){

}