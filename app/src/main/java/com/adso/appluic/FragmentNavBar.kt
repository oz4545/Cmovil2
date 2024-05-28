package com.adso.appluic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.adso.appluic.databinding.FragmentNavbarBinding

class FragmentNavBar : Fragment() {
    private var _binding: FragmentNavbarBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNavbarBinding.inflate(inflater, container, false)

        // Establecer listener de clic para la ImageView ajustes
        binding.iconajuste.setOnClickListener {
            parentFragmentManager.commit {
                replace<AjustesFragment>(R.id.fragmentContenedor)
                addToBackStack(null)
            }
        }

        // Establecer listener de clic para la imageview notificaciones
        binding.imagenotificaciones.setOnClickListener {
            parentFragmentManager.commit {
                replace<NotificacionesFragment>(R.id.fragmentContenedor)
                addToBackStack(null)
            }
        }

        // Establecer listener de clic para la Imageview perfil
        binding.imageProfile.setOnClickListener {
            parentFragmentManager.commit {
                replace<PerfilFragment>(R.id.fragmentContenedor)
                addToBackStack(null)
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
