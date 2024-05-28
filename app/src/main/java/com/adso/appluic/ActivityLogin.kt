package com.adso.appluic

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.appcompat.app.AppCompatActivity
import com.adso.appluic.databinding.ActivityLoginBinding

class ActivityLogin : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Toggle de mostrar/ocultar contraseña
        binding.toggleButtonShowPassword.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Mostrar la contraseña
                binding.editTextPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
            } else {
                // Ocultar la contraseña
                binding.editTextPassword.transformationMethod = PasswordTransformationMethod.getInstance()
            }
            // Mueve el cursor al final del texto
            binding.editTextPassword.setSelection(binding.editTextPassword.text.length)
        }

        // Botón Iniciar Sesión
        binding.buttoninicio.setOnClickListener {
            val email = binding.editTextEmail.text.toString().trim()
            val password = binding.editTextPassword.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, ActivityConfirmarCorreo::class.java)
                startActivity(intent)
            } else {
                // Mostrar un mensaje de error o hacer algo si los campos están vacíos
                // Toast.makeText(this, "Por favor complete ambos campos", Toast.LENGTH_SHORT).show()
            }
        }

        // Botón ¿No tienes cuenta? Regístrate
        binding.buttonRegistrar.setOnClickListener {
            val intent = Intent(this, ActivityRegistro::class.java)
            startActivity(intent)
        }

        // Botón ¿Olvidaste tu contraseña?
        binding.buttonRecuperar.setOnClickListener {
            val intent = Intent(this, ActivityOlvidoContra::class.java)
            startActivity(intent)
        }
    }
}
