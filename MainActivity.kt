package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber=findViewById<EditText>(R.id.ageNumber)
        val btnGenerate=findViewById<Button>(R.id.btnGenerate)
        val btnCancel=findViewById<Button>(R.id.btnCancel)
        val txtResult=findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener{
              val age=ageNumber.text.toString().toIntOrNull()
              if (age !=null) {
                  val result=when(age){
                      in 0..20->"Pop Smoke"
                      in 21..30->"King Von"
                      in 31..40->"Nipsey Hussle"
                      in 41..50->"Kobe Bryant"
                      in 51..60->"Steve Jobs"
                      in 61..70->"Wilt Chamberlin"
                      in 71..80->"Muhammed Ali"
                      in 81..90->"Pele"
                      in 91..95->"Nelson Mandela"
                      in 96..100->"Queen Elizabeth II"
                      else -> "Senior"
                  }
                  txtResult.text="Age:$age\n${ 
                      when(result) {
                          "Pop Smoke"->"Pop Smoke died at the age of 20."
                          "King Von"->"King Von died at the age of 26."
                          "Nipsey Hussle"->"Nipsey Hussle died at the age of 33."
                          "Kobe Bryant"->"Kobe Bryant died at the age of 41."
                          "Steve Jobs"->"Steve Jobs died at the age of 56."
                          "Wilt Chamberlin"->"Wilt Chamberlin died at the age of 63."
                          "Muhammed Ali"->"Muhammed Ali died at the age of 74."
                          "Pele"->"Pele died at the age of 82"
                          "Nelson Mandela"->"Nelson Mandela died at the age of 95."
                          "Queen Elizabeth II"->"Queen Elizabeth died at the age of 96."
                          else->"You are a Senior."
                      }
                  }"

              } else {
                  txtResult.text="Please enter a valid age."
              }
          }
      btnCancel.setOnClickListener{
          ageNumber.text.clear()
          txtResult.text=""
      }
    }
}