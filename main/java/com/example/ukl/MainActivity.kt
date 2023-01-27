package com.example.ukl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var btnLogin: Button
    private lateinit var email: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin = findViewById(R.id.btn_login)
        email = findViewById(R.id.Email)

        btnLogin.setOnClickListener{
            val estr = email.text.toString()
            val intent = Intent(applicationContext, MoveActivity::class.java)
            intent.putExtra("message_key", estr)
            startActivity(intent)
        }
    }
}

