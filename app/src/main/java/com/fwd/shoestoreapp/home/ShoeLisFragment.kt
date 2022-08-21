package com.fwd.shoestoreapp.home

import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.inflate
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.fwd.shoestoreapp.R
import com.fwd.shoestoreapp.databinding.FragmentShoeLisBinding
import com.fwd.shoestoreapp.databinding.ListModelBinding


class ShoeLisFragment : Fragment() {

    private lateinit var binding: FragmentShoeLisBinding
    private lateinit var viewModel: ShoListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = inflate(inflater, R.layout.fragment_shoe_lis, container, false)

        binding.btnAddItem.setOnClickListener {
            findNavController().navigate(ShoeLisFragmentDirections.actionShoeLisFragmentToAddItemFragment())
        }

        viewModel = ViewModelProvider(requireActivity())[ShoListViewModel::class.java]

        viewModel.items.observe(requireActivity(), Observer {
            addItemToView(inflater,container)
        })

        setHasOptionsMenu(true)
        return binding.root
    }

    private fun addItemToView(inflater: LayoutInflater, container: ViewGroup?) {

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (R.id.login == item.itemId) {
            findNavController().navigate(ShoeLisFragmentDirections.actionShoeLisFragmentToLoginFragment())
        }
        return super.onOptionsItemSelected(item)
    }
}


