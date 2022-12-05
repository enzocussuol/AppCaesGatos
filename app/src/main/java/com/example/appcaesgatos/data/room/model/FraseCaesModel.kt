package com.example.appcaesgatos.data.room.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "FraseCaes")
class FraseCaesModel {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0

    @ColumnInfo(name = "facts")
    @SerializedName("facts")
    var fatos: List<String> = mutableListOf<String>()

    @ColumnInfo(name = "success")
    @SerializedName("success")
    var sucesso: Boolean = false
}