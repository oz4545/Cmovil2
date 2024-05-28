package com.adso.appluic

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.adso.appluic.databinding.ActivityRegistroBinding

class ActivityRegistro : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttoncrear.setOnClickListener {
            val nombre = binding.editTextNombre.text.toString()
            val email = binding.editTextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()
            val confirmarPassword = binding.editTextConfirmarPassword.text.toString()

            if (nombre.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && confirmarPassword.isNotEmpty()) {
                if (password == confirmarPassword) {
                    val intent = Intent(this,HCursosActivity::class.java)
                    intent.putExtra("nombre", nombre)
                    intent.putExtra("email", email)
                    intent.putExtra("password", password)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
            }
        }

        binding.toggleButtonShowPassword.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.editTextPassword.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            } else {
                binding.editTextPassword.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
            binding.editTextPassword.setSelection(binding.editTextPassword.text.length)
        }

        binding.toggleButtonShowConfirmarPassword.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.editTextConfirmarPassword.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            } else {
                binding.editTextConfirmarPassword.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
            binding.editTextConfirmarPassword.setSelection(binding.editTextConfirmarPassword.text.length)
        }

        binding.buttonRegistrar.setOnClickListener {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }
    }
}
