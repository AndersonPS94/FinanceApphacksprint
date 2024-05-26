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

        val btnFood = findViewById<ImageButton>(R.id.icon_food)
        val btnHouse = findViewById<ImageButton>(R.id.icon_house)
        val btnWifi = findViewById<ImageButton>(R.id.icon_wifi)
        val btnCar = findViewById<ImageButton>(R.id.icon_car)
        val btnEletric = findViewById<ImageButton>(R.id.icon_eletric)
        val btnWater = findViewById<ImageButton>(R.id.icon_water)

        val intent2 = Intent(this, MainActivity::class.java)
        btnFood.setOnClickListener {
            startActivity(intent2)
        }
        btnHouse.setOnClickListener {
            startActivity(intent2)
        }
        btnWifi.setOnClickListener {
            startActivity(intent2)
        }
        btnCar.setOnClickListener {
            startActivity(intent2)
        }
        btnEletric.setOnClickListener {
            startActivity(intent2)
        }
        btnWater.setOnClickListener {
            startActivity(intent2)
        }
    }
}