package com.fwd.shoestoreapp.welcomeScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.fwd.shoestoreapp.R
import com.fwd.shoestoreapp.databinding.FragmentWelcomeScreenBinding


class WelcomeScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding : FragmentWelcomeScreenBinding
        = DataBindingUtil.inflate(inflater,R.layout.fragment_welcome_screen,container,false)

        binding.btnNext.setOnClickListener{
            findNavController().navigate(WelcomeScreenFragmentDirections.actionWelcomeScreenFragmentToInstructionFragment())
        }

        return binding.root
    }


}