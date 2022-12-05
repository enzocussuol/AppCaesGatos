package com.example.appcaesgatos.utils

import android.content.Context
import android.content.SharedPreferences

class Preferences(context: Context) {
    private val sp : SharedPreferences = context.getSharedPreferences("CHAVE_ACESSO", Context.MODE_PRIVATE)

    fun setString(key: String, str: String) {
        sp.edit().putString(key, str).apply()
    }

    fun getString(key: String): String {
        return sp.getString(key, "") ?: ""
    }
}