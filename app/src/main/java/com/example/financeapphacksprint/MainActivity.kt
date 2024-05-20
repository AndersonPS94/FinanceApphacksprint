package com.example.financeapphacksprint


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

//Utilizar API 34 ou superior
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val adapterList: RecyclerView = findViewById(R.id.tv_tittle)

        val list = listOf<String>("Title 1", "Title 2", "Title 3")
        val adapter = AdapterList(list)

        adapterList.adapter = adapter
    }
}