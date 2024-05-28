package com.adso.appluic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adso.appluic.databinding.AcercadeBinding

class AboutCodenActivity : AppCompatActivity() {
    private lateinit var binding: AcercadeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AcercadeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el listener de clics para el botón "Regresar"
        binding.buttonregresar.setOnClickListener {
            // Iniciar la actividad StartActivity
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            // Cerrar esta actividad
            finish()
        }
    }
}
