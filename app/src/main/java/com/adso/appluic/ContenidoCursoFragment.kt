package com.adso.appluic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.adso.appluic.databinding.FragmentContenidocursoBinding

class ContenidoCursoFragment : Fragment() {
    private var _binding: FragmentContenidocursoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContenidocursoBinding.inflate(inflater, container, false)

        // Obtener referencias a las vistas
        val radioGroup = binding.radioGroup
        val buttonRegistrar = binding.buttonRegistrar

        // Establecer listener de clic para el botón
        buttonRegistrar.setOnClickListener {
            // Obtener el ID del RadioButton seleccionado
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId

            // Obtener la referencia al RadioButton seleccionado
            val selectedRadioButton = view?.findViewById<RadioButton>(selectedRadioButtonId)

            // Verificar la respuesta seleccionada
            if (selectedRadioButton != null && selectedRadioButton.id == R.id.answer3) {
                // Respuesta correcta
                Toast.makeText(context, "¡Felicitaciones!", Toast.LENGTH_SHORT).show()

                // Navegar a FragmentContenedor
                parentFragmentManager.commit {
                    replace<FragmentContenedor>(R.id.fragmentContenedor)
                    addToBackStack(null)
                }
            } else {
                // Respuesta incorrecta
                Toast.makeText(context, "Incorrecta", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
