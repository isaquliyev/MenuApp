package com.isaquliyev.menuapp24_08.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.indices
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.viewpager.widget.ViewPager
import com.google.android.material.progressindicator.LinearProgressIndicator
import com.isaquliyev.menuapp24_08.R
import com.isaquliyev.menuapp24_08.databinding.FragmentOnboardingBinding
import com.isaquliyev.menuapp24_08.ui.adapter.ViewAdapter
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator


class OnboardingFragment : Fragment() {

    private lateinit var binding : FragmentOnboardingBinding
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboardingBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val indicator : DotsIndicator = binding.indicator
        val viewAdapter : ViewAdapter = ViewAdapter(requireContext())
        val viewPager : ViewPager = binding.viewPager

        viewPager.adapter = viewAdapter
        indicator.setViewPager(viewPager)

        navController = Navigation.findNavController(view)

        binding.getStartedButton.setOnClickListener {
            navController.navigate(R.id.action_onboardingFragment_to_authenticationFragment)
        }
    }

}