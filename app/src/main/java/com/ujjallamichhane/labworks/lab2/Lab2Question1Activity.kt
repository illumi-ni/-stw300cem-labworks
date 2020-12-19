package com.ujjallamichhane.labworks.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.ujjallamichhane.labworks.R

class Lab2Question1Activity : AppCompatActivity() {
    private lateinit var tvValue: TextView
    private lateinit var btnIncrease: Button
    private var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2_question1)

        tvValue = findViewById(R.id.tvValue)
        btnIncrease = findViewById(R.id.btnIncrease)

        tvValue.text = counter.toString()

        btnIncrease.setOnClickListener {
            counter += 1
            tvValue.text = counter.toString()
        }
    }
}