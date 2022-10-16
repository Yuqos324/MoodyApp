package com.example.moodyapp


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var judul : TextView
    lateinit var isiNama : EditText
    lateinit var h2 : TextView
    lateinit var happy : ImageButton
    lateinit var sad : ImageButton
    lateinit var mad : ImageButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        judul = findViewById(R.id.label_header)
        h2 = findViewById(R.id.subHeader)
        isiNama = findViewById(R.id.et_name)
        happy = findViewById(R.id.imgHappy)
        sad = findViewById(R.id.imgSad)
        mad = findViewById(R.id.imgMad)

        happy.setOnClickListener(){
            if(isiNama.text.isEmpty()){
                Toast.makeText(
                    this,
                    "Please input your name!",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(
                this,
                "Hi "+isiNama.text+", You are happy today.",
                Toast.LENGTH_SHORT
            ).show()
        }

        sad.setOnClickListener(){
            if(isiNama.text.isEmpty()){
                Toast.makeText(
                    this,
                    "Please input your name!",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(
                this,
                "Hi "+isiNama.text+", You are sad today.",
                Toast.LENGTH_SHORT
            ).show()
        }

        mad.setOnClickListener(){
            if(isiNama.text.isEmpty()){
                Toast.makeText(
                    this,
                    "Please input your name!",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(
                this,
                "Hi "+isiNama.text+", You are mad today.",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}

