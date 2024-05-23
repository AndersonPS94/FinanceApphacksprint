package com.example.financeapphacksprint.presentation

import android.app.Application
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.financeapphacksprint.data.Conta
import com.example.financeapphacksprint.data.ContaDao
import kotlin.concurrent.timerTask


/*
class ItemDetailViewModel (
   private val contaDao: ContaDao,
   ): ViewModel() {


      fun execute (itemAction: ItemAction){
           when(itemAction.actionType) {
               ItemActionType.DELETE.name -> deleteById(itemAction.conta!!.id)
               ItemActionType.CREATE.name -> InsertToDataBase(itemAction.conta!!)
               ItemActionType.UPDATE.name -> updateToDataBase(itemAction.conta!!)
               }
           }

       private fun deleteById(id: Int) {
           viewModelScope.launch {
               contaDao.deleteById(id)
       }
   }

   companion object {
       fun getVMFactory(application: Application ): ViewModelProvider.Factory {
           val dataBaseInstance = (application as FinanceApplication).getAppDataBase()
           val dao = dataBaseInstance.contaDao()

           val factory = object ViewModelProvider.Factory {
               override fun <T : ViewModel> create(modelClass: Class<T>): T {
                   return ItemDetailViewModel(dao) as T
               }
           }
           return factory
       }
   }
}
*/