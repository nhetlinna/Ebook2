package com.example.ebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var page = 3;

    fun invis(){
        a1.visibility = View.INVISIBLE
        a2.visibility = View.INVISIBLE
        a3.visibility = View.INVISIBLE
    }
    fun next(view: View){
        if(page <=3) page +=1 else page = 1
        invis()
        display()
    }
    fun prev(view: View){
        if (page >= 1) page -=1 else page = 3
        invis()
        display()
    }
    fun display(){
        when(page){
            1-> { a1.visibility = View.VISIBLE }
            2->{ a2.visibility = View.VISIBLE }
            3->{ a3.visibility = View.VISIBLE }
        }
    }
}
