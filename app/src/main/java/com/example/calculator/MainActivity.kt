package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var TvInput :TextView? = null
    private var Btn9 : Button? = null
    var LasDigit : Boolean = false
    var isDot : Boolean =false
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TvInput = findViewById(R.id.InputTv)
        Btn9 = findViewById(R.id.Btn9)
        //Secon Method For adding click on Button to display their relevent number
//        Btn9?.setOnClickListener(View.OnClickListener {
//            TvInput?.append("9")
//        })

    }

    fun OnDigit(view: View) {
        TvInput?.append((view as Button).text )
        LasDigit = true
    }

    fun onClear(view: View) {
        TvInput?.text = ""

    }

    fun onDecimalPoint(view: View) {
       if (LasDigit && !isDot){
           TvInput?.append((view as Button).text)
           isDot = true
       }
        else{
            Toast.makeText(this,"Already have do in the statementn",Toast.LENGTH_SHORT).show()
       }
    }

    //TODO: Task 1 in this module add starting dot as  "0."

    }
