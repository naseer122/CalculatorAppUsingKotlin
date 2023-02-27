package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var TvInput :TextView? = null
    private var Btn9 : Button? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TvInput = findViewById(R.id.InputTv)
        Btn9 = findViewById(R.id.Btn9)
        Btn9?.setOnClickListener(View.OnClickListener {
            TvInput?.append("9")
        })

    }

    fun OnDigit(view: View) {
        TvInput?.append("1" )
    }
}