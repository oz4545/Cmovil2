package com.adso.appluic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adso.appluic.databinding.ActivityTerminoycondicionesBinding

class ActivityTerminoyCondiciones : AppCompatActivity() {

    private lateinit var binding: ActivityTerminoycondicionesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerminoycondicionesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el botón Aceptar
        binding.buttonaceptar.setOnClickListener {
            // Iniciar ActivityRegistro cuando se hace clic en "Aceptar"
            val intent = Intent(this, ActivityRegistro::class.java)
            startActivity(intent)
        }

        // Configurar el botón Rechazar
        binding.buttonrechazar.setOnClickListener {
            // Devolver al usuario a la actividad StartActivity
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish() // Finalizar esta actividad
        }
    }
}
