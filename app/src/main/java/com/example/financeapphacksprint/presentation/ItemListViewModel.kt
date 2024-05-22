package com.example.financeapphacksprint.presentation

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.financeapphacksprint.FinanceAppApplication
import com.example.financeapphacksprint.data.Conta
import com.example.financeapphacksprint.data.ContaDao

    class ItemListViewModel (contaDao: ContaDao): ViewModel(){

    val ItemListLiveData = LiveData<List<Conta>> = contaDao.getAll()

    companion object {
        fun create (application: Application): ItemListViewModel {
            val dataBaseInstance =(application as FinanceAppApplication).getAppDataBase()
            val dao = dataBaseInstance.contaDao()
            return ItemListViewModel(dao)
        }
    }
}