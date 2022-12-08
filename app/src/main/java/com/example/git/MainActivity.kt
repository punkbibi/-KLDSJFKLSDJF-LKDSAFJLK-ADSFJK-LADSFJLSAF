package com.example.git

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var age: Button
    lateinit var age_minus: Button
    lateinit var toss: Button
    lateinit var ekrani: Button
    lateinit var saxeli : EditText
    lateinit var gvari: EditText
    lateinit var cifri: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toss = findViewById(R.id.toss)
        age = findViewById(R.id.age)
        ekrani = findViewById(R.id.ekrani)
        saxeli = findViewById(R.id.editTextTextPersonName)
        gvari = findViewById(R.id.editTextTextPersonName2)
        age_minus = findViewById(R.id.button)
        cifri = findViewById(R.id.textView3)
        toss.setOnClickListener {
            Toast.makeText(this, "put your age with buttons", Toast.LENGTH_LONG).show()
        }
        age.setOnClickListener {
            var numb = cifri.text.toString().toInt()
            numb++
            cifri.text = numb.toString()
        }
        ekrani.setOnClickListener {
            val name = saxeli.text.toString()
            val surname = gvari.text.toString()
            val asaki = cifri.text.toString()
            val intent = Intent(this@MainActivity, mamasheni_ekranze::class.java)
            intent.putExtra("saxeli", name)
            intent.putExtra("gvari", surname)
            intent.putExtra("dabereba", asaki)
            startActivity(intent)
        }
        age_minus.setOnClickListener {
            var numb1 = cifri.text.toString().toInt()
            numb1 = numb1 - 1
            cifri.text = numb1.toString()
        }
    }
}

