package com.example.appcaesgatos.data.retrofit.service

import com.example.appcaesgatos.data.room.model.FraseCaesModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface FraseCaesService {
    @GET("facts/{number}")
    fun getFactsByNumber(@Path("number") number: Int): Call<FraseCaesModel>
}