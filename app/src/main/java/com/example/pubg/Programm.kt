package com.example.pubg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Programm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programm)
    }
    fun back(view: View) {
        val but: Button = findViewById(R.id.button)
        when (but?.id) {
            R.id.button -> finish()
        }
    }
}