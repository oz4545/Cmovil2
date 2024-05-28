package com.adso.appluic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Iniciar la SplashScreen
        val intent = Intent(this, SplashScreen::class.java)
        startActivity(intent)

        // Finalizar la actividad principal para que no se pueda volver a ella desde la SplashScreen
        finish()
    }
}
