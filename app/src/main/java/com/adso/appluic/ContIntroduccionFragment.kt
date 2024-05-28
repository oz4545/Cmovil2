package com.adso.appluic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.adso.appluic.databinding.FragmentContintroduccionBinding

class ContIntroduccionFragment : Fragment() {
    private var _binding: FragmentContintroduccionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContintroduccionBinding.inflate(inflater, container, false)

        // Establecer listener de clic para el TextView (actuando como un botón)
        binding.Continuar.setOnClickListener {
            parentFragmentManager.commit {
                replace<ContenidoCursoFragment>(R.id.fragmentContenedor)
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