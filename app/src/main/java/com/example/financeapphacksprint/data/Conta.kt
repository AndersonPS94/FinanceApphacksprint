package com.example.financeapphacksprint.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Conta(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nome: String,
    val valor: Double,
): Serializable
