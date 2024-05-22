package com.example.financeapphacksprint.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.financeapphacksprint.R

class IconSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_icon_selection)


        val botaoVolta = findViewById<ImageButton>(R.id.btn_volta_color_selection)
        val intent = Intent(this, ColorSelection::class.java)
        botaoVolta.setOnClickListener {
            startActivity(intent)
        }
    }
}