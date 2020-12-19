package com.ujjallamichhane.labworks.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.ujjallamichhane.labworks.R

class Lab2Question2Activity : AppCompatActivity() {
    private lateinit var tvGender: TextView
    private lateinit var radioGroup: RadioGroup
    private lateinit var rdoMale: RadioButton
    private lateinit var rdoFemale: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2_question2)

        tvGender = findViewById(R.id.tvGender)
        radioGroup = findViewById(R.id.radioGroup)
        rdoMale = findViewById(R.id.rdoMale)
        rdoFemale = findViewById(R.id.rdoFemale)

        radioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.rdoMale -> {
                    tvGender.text = rdoMale.text
                }
                R.id.rdoFemale -> {
                    tvGender.text = rdoFemale.text
                }
            }
        })
    }
}