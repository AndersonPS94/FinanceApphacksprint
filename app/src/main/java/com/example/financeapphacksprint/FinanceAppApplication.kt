package com.example.financeapphacksprint

import android.app.Application
import androidx.room.Room
import com.example.financeapphacksprint.data.AppDataBase


class FinanceAppApplication : Application() {

    private lateinit var dataBase:AppDataBase

    override fun onCreate() {
        super.onCreate()
        dataBase = Room.databaseBuilder(
            applicationContext,
            AppDataBase::class.java, "finance_app_db"
        ).build()
    }

    fun getAppDataBase(): AppDataBase {
        return dataBase
    }
    // Chamar a função do banco de dados para acessar o banco de dados da aplicação
}