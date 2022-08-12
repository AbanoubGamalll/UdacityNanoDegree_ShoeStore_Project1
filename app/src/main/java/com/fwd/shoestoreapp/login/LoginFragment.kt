package com.fwd.shoestoreapp.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.fwd.shoestoreapp.R
import com.fwd.shoestoreapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentLoginBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        with(binding)
        {
            txtSignup.setOnClickListener { goToWelcome() }
            btnLogin.setOnClickListener { goToWelcome() }
        }
        return binding.root
    }

    private fun goToWelcome() = findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeScreenFragment())


}