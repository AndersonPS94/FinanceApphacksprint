package com.example.financeapphacksprint.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Conta::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun contaDao(): ContaDao
}
