package com.isaquliyev.menuapp24_08.ui.fragments

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.chaos.view.PinView
import com.isaquliyev.menuapp24_08.R
import com.isaquliyev.menuapp24_08.databinding.FragmentVerifyCodeBinding


class VerifyCodeFragment : Fragment() {

    private lateinit var binding : FragmentVerifyCodeBinding
    private lateinit var navController: NavController
    private lateinit var pinView : PinView
    private lateinit var inputMethodManager: InputMethodManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentVerifyCodeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        pinView = binding.pinView



        binding.backButton.setOnClickListener {
            navController.navigate(R.id.action_verifyCodeFragment_to_createAccountFragment)
        }

    }

}