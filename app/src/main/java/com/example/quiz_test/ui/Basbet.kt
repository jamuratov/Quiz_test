package com.example.quiz_test.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.quiz_test.R
import com.example.quiz_test.databinding.FragmentBasbetFragmentBinding

class Basbet : Fragment() {
    private lateinit var binding: FragmentBasbetFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBasbetFragmentBinding.inflate(inflater, container, false)

        binding.testtBaslaw.setOnClickListener(){
            findNavController().navigate(R.id.action_basbet_to_sorawlar)
        }
        return binding.root
    }
}