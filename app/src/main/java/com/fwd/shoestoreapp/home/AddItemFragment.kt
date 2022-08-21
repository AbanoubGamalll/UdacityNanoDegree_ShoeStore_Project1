package com.fwd.shoestoreapp.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.fwd.shoestoreapp.R
import com.fwd.shoestoreapp.databinding.FragmentAddItemBinding


class AddItemFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentAddItemBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_add_item, container, false)
         val viewModel: ShoListViewModel by activityViewModels()

        binding.btnSave.setOnClickListener {
            binding.apply {
                viewModel.addItem(
                    ShoeModel(
                        edtName.text.toString(),
                        edtCompany.text.toString(),
                        edtSize.text.toString(),
                        edtDescription.text.toString()
                    )
                )
            }
            nav()
        }

        binding.btnCancel.setOnClickListener {
            nav()
        }

        return binding.root
    }

    fun nav() {
        findNavController().navigate(AddItemFragmentDirections.actionAddItemFragmentToShoeLisFragment())
    }


}