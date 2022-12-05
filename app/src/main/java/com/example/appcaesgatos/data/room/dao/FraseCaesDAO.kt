package com.example.appcaesgatos.data.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.appcaesgatos.data.room.model.FraseCaesModel

@Dao
interface FraseCaesDAO {
    @Insert
    fun insert(fraseCaesModel: FraseCaesModel): Long

    @Update
    fun update(fraseCaesModel: FraseCaesModel): Int

    @Delete
    fun delete(fraseCaesModel: FraseCaesModel)

    @Query("SELECT * FROM FraseCaes WHERE id = :id")
    fun getById(id: Int): FraseCaesModel
}