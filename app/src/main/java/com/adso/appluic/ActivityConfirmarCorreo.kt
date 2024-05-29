package com.adso.appluic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adso.appluic.databinding.ActivityConfirmarCorreoBinding


class ActivityConfirmarCorreo : AppCompatActivity() {

    private lateinit var binding: ActivityConfirmarCorreoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmarCorreoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonInicio = binding.buttoninicio
        val buttonIniciarSesion = binding.buttoniniciosesion

        buttonInicio.setOnClickListener {
            val intent = Intent(this, ActivityCuentaCreada::class.java)
            startActivity(intent)
        }

        buttonIniciarSesion.setOnClickListener {
            val intent = Intent(this, ActivityCuentaCreada::class.java)
            startActivity(intent)
        }
    }
}
