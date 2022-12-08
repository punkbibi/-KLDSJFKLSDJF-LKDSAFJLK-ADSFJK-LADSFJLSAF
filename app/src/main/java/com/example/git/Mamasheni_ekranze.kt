package com.example.git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class mamasheni_ekranze : AppCompatActivity() {
    lateinit var saxeli : TextView
    lateinit var  gvari : TextView
    lateinit var  xo_ra : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mamasheni_ekranze)
        saxeli = findViewById(R.id.textView)
        gvari = findViewById(R.id.textView2)
        xo_ra = findViewById(R.id.textView4)
        val intent = getIntent()
        val saxelii = intent.getStringExtra("saxeli")
        val gvarii = intent.getStringExtra("gvari")
        val xora = intent.getStringExtra("dabereba")

        saxeli.text = "$saxelii"
        gvari.text = "$gvarii"
        xo_ra.text = "$xora"

    }
}