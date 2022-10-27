package com.example.posta10.fragments

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import androidx.fragment.app.Fragment
import com.example.posta10.R
import com.example.posta10.databinding.FragmentRegistrarseBinding
import com.google.android.material.snackbar.Snackbar


class RegistrarseFragment : Fragment(R.layout.fragment_registrarse) {
    private lateinit var binding: FragmentRegistrarseBinding // Variable de Iniciación de Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRegistrarseBinding.bind(view)

        binding.btnRegistrar.setOnClickListener {
          val esvalido = valIng()
          val mensaje = Snackbar.make(view,"$esvalido", 160 )
          mensaje.show()
        }
    }


    // Función Validar datos de ingreso
    private fun valIng(): Boolean {
        var valOk = true

        // Valida el ingreso del Nombre
        if (TextUtils.isEmpty(binding.editNombre.text.toString())) {
            // Se utiliza propiedad error para dar aviso de campo requerido
            binding.editNombre.error = "Ingresar Nombre"
            valOk = false
        } else binding.editNombre.error = null

        // Valida el ingreso de Apellido
        if (TextUtils.isEmpty(binding.editApellido.text.toString())) {
            // Se utiliza propiedad error para dar aviso de campo requerido
            binding.editApellido.error = "Ingresar Apellido"
            valOk = false
        } else binding.editApellido.error = null

        //Valida el ingreso del Mail
        if (TextUtils.isEmpty(binding.editEmail.text.toString())) {
            // Se utiliza propiedad error para dar aviso de campo requerido
            binding.editEmail.error = "Ingresar Email"
            valOk = false
        } else binding.editEmail.error = null

        //Valida el ingreso de la contraseña
        if (TextUtils.isEmpty(binding.editPassword.text.toString())) {
            // Se utiliza propiedad error para dar aviso de campo requerido
            binding.editPassword.error = "Ingresar Clave"
            valOk = false
        } else binding.editPassword.error = null

        return valOk
    }
}