package com.example.ukl

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveActivity : AppCompatActivity() {
    private lateinit var receive: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        receive = findViewById(R.id.data_received)
        val intent = intent
        val str = intent.getStringExtra("message_key")
        receive.text = str
    }
}