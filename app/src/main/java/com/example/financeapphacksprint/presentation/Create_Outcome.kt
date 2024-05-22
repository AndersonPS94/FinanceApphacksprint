package com.example.financeapphacksprint.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.financeapphacksprint.R
import com.google.android.material.snackbar.Snackbar

class Create_Outcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_outcome)

        val items = listOf("All","House","Car","Food")

        val autoComplete: AutoCompleteTextView = findViewById(R.id.auto_complete)
        val adapter = ArrayAdapter(this, R.layout.list_item, items)

        autoComplete.setAdapter(adapter)

        autoComplete.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            val itemSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this, "Selected: $itemSelected", Toast.LENGTH_SHORT).show()

            }

        val titulo  = findViewById<EditText>(R.id.editTitle)
        val valor = findViewById<EditText>(R.id.editprice)
        val categoria = findViewById<AutoCompleteTextView>(R.id.auto_complete)
        val botaoCreate = findViewById<Button>(R.id.btn_create)

        botaoCreate.setOnClickListener {

            val title: String = titulo.text.toString()
            val price: String = valor.text.toString()
            val category: String = categoria.text.toString()

            if (title == "" || price == "" || category == "") {

                Snackbar.make(
                    titulo,
                    "Por favor, preencha todos os campos corretamente.",
                    Snackbar.LENGTH_SHORT
                ).show()
            } else {
                val intentCreate = Intent(this, ColorSelection::class.java)

                startActivity(intentCreate)
            }
        }

        val botaovoltahome = findViewById<ImageButton>(R.id.btn_volta_home)

        val intentHome = Intent(this, MainActivity::class.java)
        botaovoltahome.setOnClickListener {
            startActivity(intentHome)
        }
    }
}
//teste