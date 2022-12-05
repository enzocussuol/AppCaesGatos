package com.example.appcaesgatos.data.retrofit.service

import com.example.appcaesgatos.data.room.model.FraseGatosModel
import retrofit2.Call
import retrofit2.http.GET

interface FraseGatosService {
    @GET("fact")
    fun getFact(): Call<FraseGatosModel>
}