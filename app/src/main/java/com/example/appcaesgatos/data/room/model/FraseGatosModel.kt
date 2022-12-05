package com.example.appcaesgatos.data.room.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "FraseGatos")
class FraseGatosModel {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0

    @ColumnInfo(name = "fact")
    var fato: String = ""

    @ColumnInfo(name = "length")
    var tamanho: Int = 0
}