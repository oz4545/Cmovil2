package com.adso.appluic

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.adso.appluic.databinding.ActivityOlvidoContraBinding

class ActivityOlvidoContra : AppCompatActivity() {

    private lateinit var binding: ActivityOlvidoContraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOlvidoContraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonEnviarCodigo = binding.buttoninicio
        val buttonIniciarSesion = binding.buttoniniciosesion

        buttonEnviarCodigo.setOnClickListener {
            // Mostrar Toast de "Código Enviado"
            Toast.makeText(this, "Código Enviado (˵ ͡° ͜ʖ ͡°˵)", Toast.LENGTH_SHORT).show()
        }

        buttonIniciarSesion.setOnClickListener {
            // Devolver al usuario a la actividad de inicio de sesión
            onBackPressed()
        }
    }
}
