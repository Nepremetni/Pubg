package com.example.pubg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class gans : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gans)
    }
    fun vihod(view: View){
        val b: Button = findViewById(R.id.button)
        when(b?.id){
            R.id.button -> finish()
        }
    }
}