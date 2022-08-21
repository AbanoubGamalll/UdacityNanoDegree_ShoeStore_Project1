package com.fwd.shoestoreapp.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.fwd.shoestoreapp.R
import com.fwd.shoestoreapp.databinding.FragmentAddItemBinding


class AddItemFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentAddItemBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_add_item, container, false)
        return binding.root
    }


}