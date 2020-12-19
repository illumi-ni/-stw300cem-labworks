package com.ujjallamichhane.labworks.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.ujjallamichhane.labworks.R
import java.util.logging.LogManager

class Lab2Question3Activity : AppCompatActivity() {
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2_question3)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val userName = etUsername.text.toString()
            val password = etPassword.text.toString()
            if(userName == "admin" && password == "admin"){
                Toast.makeText(this, "You are logged in", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "You are not logged in", Toast.LENGTH_SHORT).show()
            }
        }
    }
}