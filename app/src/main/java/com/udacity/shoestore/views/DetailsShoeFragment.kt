package com.udacity.shoestore.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentDetailsShoeBinding
import com.udacity.shoestore.viewmodels.ShoeViewModel

class DetailsShoeFragment : Fragment() {

    private val shoeViewModel: ShoeViewModel by activityViewModels()
    private lateinit var binding: FragmentDetailsShoeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_details_shoe, container, false
        )

        binding.saveButton.setOnClickListener {view: View ->
            shoeViewModel.addShoe(
                name = binding.nameText.text.toString(),
                company = binding.companyText.text.toString(),
                size = binding.sizeText.text.toString(),
                description = binding.descriptionText.text.toString()
            )
            view.findNavController().navigate(
                DetailsShoeFragmentDirections.actionDetailsShoeFragmentToShoeListFragment()
            )

        }

        binding.cancelButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                DetailsShoeFragmentDirections.actionDetailsShoeFragmentToShoeListFragment()
            )
        )
        return binding.root
    }
}