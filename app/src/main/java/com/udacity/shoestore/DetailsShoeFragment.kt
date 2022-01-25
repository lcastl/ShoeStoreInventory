package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentDetailsShoeBinding

class DetailsShoeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding: FragmentDetailsShoeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_details_shoe, container, false
        )

        binding.saveButton.setOnClickListener {vie: View ->
            vie.findNavController().navigate(
                DetailsShoeFragmentDirections.actionDetailsShoeFragmentToShoeListFragment())

        }

        binding.cancelButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                DetailsShoeFragmentDirections.actionDetailsShoeFragmentToShoeListFragment())
        )
        return binding.root
    }
}