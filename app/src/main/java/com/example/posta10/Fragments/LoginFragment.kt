package com.example.posta10.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.posta10.R
import com.example.posta10.databinding.FragmentLoginBinding


class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding // variable de inicializacion
    
 
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding=FragmentLoginBinding.bind(view) // Llama a la vista, reemplaza a binding=FragmentLoginBinding.inflate(layoutinflater)

        binding.botonRegistrarse.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registrarseFragment)
        }
        binding.botonIngresar.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_datosPersonalesFragment22)
        }


    }
}