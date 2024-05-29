package com.adso.appluic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adso.appluic.databinding.ActivityCuentacreadaBinding

class ActivityCuentaCreada : AppCompatActivity() {

    private lateinit var binding: ActivityCuentacreadaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuentacreadaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar los eventos de clic para los botones
        binding.buttoninicio.setOnClickListener {
            val intent = Intent(this, HCursosActivity::class.java)
            startActivity(intent)
        }

        binding.buttoncontactanos.setOnClickListener {
            val intent = Intent(this, ActivityContactanos::class.java)
            startActivity(intent)
        }
    }
}
