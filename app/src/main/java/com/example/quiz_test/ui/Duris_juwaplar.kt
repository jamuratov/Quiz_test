package com.example.quiz_test.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.quiz_test.R
import com.example.quiz_test.databinding.FragmentDurisJuwaplarBinding

class Duris_juwaplar : Fragment() {

    private lateinit var binding: FragmentDurisJuwaplarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDurisJuwaplarBinding.inflate(inflater, container, false)

        binding.BasBetgeQaytiw.setOnClickListener(){
            it.findNavController().navigate(R.id.action_duris_juwaplar_to_basbet)
        }
        return binding.root
    }
}