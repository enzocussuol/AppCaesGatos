package com.example.appcaesgatos.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.appcaesgatos.data.room.dao.FraseCaesDAO
import com.example.appcaesgatos.data.room.dao.FraseGatosDAO
import com.example.appcaesgatos.data.room.model.FraseCaesModel
import com.example.appcaesgatos.data.room.model.FraseGatosModel

@Database(entities = [
    FraseCaesModel::class,
    FraseGatosModel::class], version = 1)
abstract class RoomClient(): RoomDatabase() {
    companion object {
        private lateinit var INSTANCE: RoomClient

        fun getRoomClient(context: Context): RoomClient {
            if (!::INSTANCE.isInitialized) {
                synchronized(RoomClient::class) {
                    INSTANCE = Room.databaseBuilder(context, RoomClient::class.java,
                        "mydatabase.db")
                        .allowMainThreadQueries()
                        .build()
                }
            }

            return INSTANCE
        }
    }

    abstract fun FraseCaesDAO(): FraseCaesDAO
    abstract fun FraseGatosDAO(): FraseGatosDAO
}