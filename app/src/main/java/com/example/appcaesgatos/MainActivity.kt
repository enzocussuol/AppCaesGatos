package com.example.appcaesgatos

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.appcaesgatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityMainBinding
    private lateinit var sp : Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        sp = Preferences(this)

        if (sp.getString("nome") != "") {
            mudaTela()
        }

        setContentView(binding.root)

//        binding.botaoGuardar.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.botaoGuardar) {
            guardarNome(binding.inputNome.text.toString())
        }
    }

    private fun guardarNome(nome: String) {
        sp.setString("nome", nome)
        mudaTela()
    }

    private fun mudaTela() {
        startActivity(Intent(this, FrasesActivity::class.java))
        finish()
    }
}