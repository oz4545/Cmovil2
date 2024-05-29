package com.adso.appluic

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.adso.appluic.databinding.ContactanosCodenBinding

class ActivityContactanos: AppCompatActivity(){

    private lateinit var binding: ContactanosCodenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ContactanosCodenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Configurar los eventos de clic para los botones
        binding.buttoncomenzar.setOnClickListener {
            val intent = Intent(this, HCursosActivity::class.java)
            startActivity(intent)
        }

        binding.buttoncontactar.setOnClickListener {
            // Mostrar Toast de "Código Enviado"
            Toast.makeText(this, "Correo enviado (˵ ͡° ͜ʖ ͡°˵)", Toast.LENGTH_SHORT).show()
        }
    }
}


