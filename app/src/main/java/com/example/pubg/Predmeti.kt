package com.example.pubg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Predmeti : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_predmeti)
    }
    fun p1 (view: View){
        val b1 : ImageView = findViewById(R.id.imageView8)
        val intent : Intent = Intent(this, Iashiki::class.java)
        startActivity(intent)
    }
    fun p2 (view: View){
        val b1 : ImageView = findViewById(R.id.imageView9)
        val intent : Intent = Intent(this, Rashodniki::class.java)
        startActivity(intent)
    }
}