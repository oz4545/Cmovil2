package com.adso.appluic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adso.appluic.databinding.ActivityStartBinding


class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonacercade.setOnClickListener {
            val intent = Intent(this, AboutCodenActivity::class.java)
            startActivity(intent)

        }
        // Configurar el listener de clics para el botón "Acceder"
        binding.buttonAC.setOnClickListener {
            // Iniciar la actividad ActivityLogin
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }

        // Botón "Crear Cuenta"
        binding.buttonCR.setOnClickListener {
            val intent = Intent(this, ActivityTerminoyCondiciones::class.java)
            startActivity(intent)
        }
    }
}
