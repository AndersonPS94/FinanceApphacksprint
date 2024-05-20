package com.example.financeapphacksprint.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface ContaDao {

    @Query("SELECT * FROM Conta")
    fun getAll(): LiveData<List<Conta>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(Conta: Conta)

    @Update
    suspend fun update(Conta: Conta)

    @Query("DELETE FROM Conta WHERE id = :id")
    suspend fun delete(id: Int)

    @Query("SELECT * FROM Conta WHERE id = :id")
    suspend fun getById(id: Int): Conta?

    @Query("SELECT * FROM Conta WHERE nome = :nome")
    suspend fun getByNome(nome: String): Conta?


}