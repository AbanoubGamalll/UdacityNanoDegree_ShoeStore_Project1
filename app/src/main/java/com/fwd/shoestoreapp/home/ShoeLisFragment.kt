package com.fwd.shoestoreapp.home

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.fwd.shoestoreapp.R
import com.fwd.shoestoreapp.databinding.FragmentShoeLisBinding

class ShoeLisFragment : Fragment() {
    private lateinit var binding: FragmentShoeLisBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_lis, container, false)
        binding.btnAddItem.setOnClickListener{
            findNavController().navigate(ShoeLisFragmentDirections.actionShoeLisFragmentToAddItemFragment())
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (R.id.login == item.itemId )
        {
            findNavController().navigate(ShoeLisFragmentDirections.actionShoeLisFragmentToLoginFragment())
        }
        return super.onOptionsItemSelected(item)
    }
}