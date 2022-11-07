package com.example.appcaesgatos

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.appcaesgatos.databinding.ActivityFrasesBinding

class FrasesActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityFrasesBinding
    private lateinit var sp : Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFrasesBinding.inflate(layoutInflater)
        sp = Preferences(this)

        setContentView(binding.root)
    }

    override fun onClick(view: View) {

    }
}