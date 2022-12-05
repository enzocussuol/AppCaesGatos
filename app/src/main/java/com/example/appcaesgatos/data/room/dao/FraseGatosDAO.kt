package com.example.appcaesgatos.data.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.appcaesgatos.data.room.model.FraseGatosModel

@Dao
interface FraseGatosDAO {
    @Insert
    fun insert(fraseGatosModel: FraseGatosModel): Long

    @Update
    fun update(fraseGatosModel: FraseGatosModel): Int

    @Delete
    fun delete(fraseGatosModel: FraseGatosModel)

    @Query("SELECT * FROM FraseGatos WHERE id = :id")
    fun getById(id: Int): FraseGatosModel
}