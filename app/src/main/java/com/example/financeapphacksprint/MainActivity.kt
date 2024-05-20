package com.example.financeapphacksprint


import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

//Utilizar API 34 ou superior
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val adicionar = findViewById<FloatingActionButton>(R.id.btn_add)
        val intent = Intent(this, Create_Outcome::class.java)
        adicionar.setOnClickListener {
            startActivity(intent)
        }
    }
}