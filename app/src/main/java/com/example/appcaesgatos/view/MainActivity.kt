package com.example.appcaesgatos.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.appcaesgatos.utils.Preferences
import com.example.appcaesgatos.R
import com.example.appcaesgatos.databinding.ActivityMainBinding
import com.example.appcaesgatos.viewModel.MainViewModel

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainVM: MainViewModel
    private lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        preferences = Preferences(applicationContext)
        if (preferences.getString("nome") != "") {
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            mainVM = ViewModelProvider(this).get(MainViewModel::class.java)

            binding.botaoGuardar.setOnClickListener(this)
        } else {
            mudaTela()
        }
    }

    override fun onClick(view: View) {
        if (view.id == R.id.botaoGuardar) {
            preferences.setString("nome", binding.inputNome.text.toString())
            mudaTela()
        }
    }

    private fun mudaTela() {
        startActivity(Intent(this, FrasesActivity::class.java))
        finish()
    }
}