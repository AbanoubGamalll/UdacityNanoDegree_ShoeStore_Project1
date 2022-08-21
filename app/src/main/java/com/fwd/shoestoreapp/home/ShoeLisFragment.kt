package com.fwd.shoestoreapp.home

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil.inflate
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.fwd.shoestoreapp.R
import com.fwd.shoestoreapp.databinding.FragmentShoeLisBinding
import com.fwd.shoestoreapp.databinding.ListModelBinding


class ShoeLisFragment : Fragment() {

    private lateinit var binding: FragmentShoeLisBinding
    private val viewModel: ShoListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = inflate(inflater, R.layout.fragment_shoe_lis, container, false)

        binding.btnAddItem.setOnClickListener {
            findNavController().navigate(ShoeLisFragmentDirections.actionShoeLisFragmentToAddItemFragment())
        }

        viewModel.items.observe(requireActivity()) { addItemToView(inflater, container) }
        setHasOptionsMenu(true)
        return binding.root
    }

    private fun addItemToView(inflater: LayoutInflater, container: ViewGroup?) {
        val b: ListModelBinding = inflate(inflater, R.layout.list_model, container, false)
        b.shoeItem = viewModel.lastItem()
        binding.linearLayoutt.addView(b.root)
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


