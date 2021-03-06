package com.udacity.shoestore.views

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )
        binding.loginButton.setOnClickListener { view: View ->
            view.findNavController().navigate(
                LoginFragmentDirections.actionLoginFragmentToWelcomeFragment()
            )
        }

        binding.newLoginButton.setOnClickListener { view: View ->
            view.findNavController().navigate(
                LoginFragmentDirections.actionLoginFragmentToWelcomeFragment()
            )
        }

        return binding.root
    }
}