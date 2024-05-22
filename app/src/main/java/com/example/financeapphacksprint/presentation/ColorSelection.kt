package com.example.financeapphacksprint.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.financeapphacksprint.R

class ColorSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_color_selection)


        val botaovoltacreate = findViewById<ImageButton>(R.id.btn_volta_create)
        val intent = Intent(this, Create_Outcome::class.java)
        botaovoltacreate.setOnClickListener {
            startActivity(intent)
        }
    }
}
