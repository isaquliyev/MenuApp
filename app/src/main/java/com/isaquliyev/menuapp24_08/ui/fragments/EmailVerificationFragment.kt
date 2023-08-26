package com.isaquliyev.menuapp24_08.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.isaquliyev.menuapp24_08.R
import com.isaquliyev.menuapp24_08.databinding.FragmentEmailVerificationBinding


class EmailVerificationFragment : Fragment() {

    private lateinit var binding : FragmentEmailVerificationBinding
    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEmailVerificationBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_emailVerificationFragment_to_createAccountFragment)


    }
}