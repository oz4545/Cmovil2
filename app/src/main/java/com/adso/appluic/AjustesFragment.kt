package com.adso.appluic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.adso.appluic.databinding.FragmentAjustesBinding

class AjustesFragment : Fragment() {
    private var _binding: FragmentAjustesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAjustesBinding.inflate(inflater, container, false)

        // Establecer listener de clic para el botón
        binding.buttonpassysegu.setOnClickListener {
            parentFragmentManager.commit {
                replace<AjustesSeguridadFragment>(R.id.fragmentContenedor)
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
