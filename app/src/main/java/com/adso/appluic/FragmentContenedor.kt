package com.adso.appluic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class FragmentContenedor : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el diseño del fragmento
        val view = inflater.inflate(R.layout.fragment_fragmentcontenedor, container, false)

        // Obtener la referencia de la imagen
        val imageView2 = view.findViewById<ImageView>(R.id.imageView2)

        // Configurar el OnClickListener para la imagen
        imageView2.setOnClickListener {
            // Navegar al fragmento ContIntroduccionFragment
            val fragment = ContIntroduccionFragment()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContenedor, fragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
