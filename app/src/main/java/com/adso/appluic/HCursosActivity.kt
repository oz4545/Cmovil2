package com.adso.appluic

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.adso.appluic.databinding.ActivityHcursosBinding

class HCursosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHcursosBinding
    private lateinit var navBarFragment: FragmentNavBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHcursosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar los fragmentos
        navBarFragment = FragmentNavBar()
        supportFragmentManager.commit {
            replace(R.id.fragment_navbar, navBarFragment)
            replace(R.id.fragmentContenedor, FragmentContenedor())
        }

        // Configurar OnClickListener para los elementos del BottomNavigationView
        binding.navmenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.itemHome -> {
                    supportFragmentManager.commit {
                        replace(R.id.fragmentContenedor, FragmentContenedor())
                    }
                    true
                }
                R.id.itemRanking -> {
                    supportFragmentManager.commit {
                        replace(R.id.fragmentContenedor, RankingFragment())
                    }
                    true
                }
                R.id.itemLogros -> {
                    supportFragmentManager.commit {
                        replace(R.id.fragmentContenedor, LogrosFragment())
                    }
                    true
                }
                R.id.itemArticulos -> {
                    supportFragmentManager.commit {
                        replace(R.id.fragmentContenedor, ArticulosFragment())
                    }
                    true
                }
                else -> false
            }
        }

        // Verificar si es la primera vez que se inicia la actividad
        val sharedPref = getPreferences(Context.MODE_PRIVATE)
        val isFirstTime = sharedPref.getBoolean("isFirstTime", true)

        if (isFirstTime) {
            // Mostrar el Toast de bienvenida
            Toast.makeText(this, "Bienvenido (˵ ͡° ͜ʖ ͡°˵)", Toast.LENGTH_LONG).show()

            // Actualizar SharedPreferences para que no vuelva a mostrar el mensaje
            with(sharedPref.edit()) {
                putBoolean("isFirstTime", false)
                apply()
            }
        }

        // Verificar si FragmentNavBar está adjunto y su vista está creada antes de acceder a las vistas
        if (navBarFragment.isAdded && navBarFragment.view != null) {
            // Acceder a las vistas desde la instancia de FragmentNavBar
            val fragmentNavBarBinding = navBarFragment.binding

            fragmentNavBarBinding.imagelogo.setOnClickListener {
                // Acción para el clic en el logo
            }

            fragmentNavBarBinding.imageProfile.setOnClickListener {
                // Acción para el clic en el perfil
            }

            fragmentNavBarBinding.imagenotificaciones.setOnClickListener {
                // Registro para verificar si se presiona la imagen de notificaciones
                Log.d("NotificacionesFragment", "Imagen de notificaciones presionada")
                // Crear una instancia del fragmento NotificacionesFragment
                val fragment = NotificacionesFragment()
                // Reemplazar el fragmento actual con el NotificacionesFragment
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContenedor, fragment)
                    .addToBackStack(null) // Opcional: Agregar la transacción a la pila de retroceso
                    .commit()
            }
        }
    }
}
