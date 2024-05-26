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

        val btnPreto = findViewById<ImageButton>(R.id.btn_preto)
        val btnVermelho = findViewById<ImageButton>(R.id.btn_vermelho)
        val btnVerde = findViewById<ImageButton>(R.id.btn_verde)
        val btnAzul = findViewById<ImageButton>(R.id.btn_azul)
        val btnAmarelo = findViewById<ImageButton>(R.id.btn_amarelo)
        val btnBranco = findViewById<ImageButton>(R.id.btn_branco)

        val intent3 = Intent(this, IconSelection::class.java)

        btnPreto.setOnClickListener {
            startActivity(intent3)
        }
        btnVermelho.setOnClickListener {
            startActivity(intent3)
        }
        btnVerde.setOnClickListener {
            startActivity(intent3)
        }
        btnAzul.setOnClickListener {
            startActivity(intent3)
        }
        btnAmarelo.setOnClickListener {
            startActivity(intent3)
        }
        btnBranco.setOnClickListener {
            startActivity(intent3)
        }
    }
}
