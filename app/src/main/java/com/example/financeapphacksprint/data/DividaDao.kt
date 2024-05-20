package com.example.financeapphacksprint.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface DividaDao {

    @Query("SELECT * FROM divida")
    fun getAll(): LiveData<List<Divida>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(divida: Divida)

    @Update
    suspend fun update(divida: Divida)

    @Query("DELETE FROM divida WHERE id = :id")
    suspend fun delete(id: Int)

    @Query("SELECT * FROM divida WHERE id = :id")
    suspend fun getById(id: Int): Divida?

    @Query("SELECT * FROM divida WHERE nome = :nome")
    suspend fun getByNome(nome: String): Divida?


}