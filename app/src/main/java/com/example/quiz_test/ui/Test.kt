package com.example.quiz_test.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.quiz_test.Data.QuizTestDatabase
import com.example.quiz_test.R
import com.example.quiz_test.databinding.FragmentTestBinding

class Test : Fragment() {

    private lateinit var binding: FragmentTestBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTestBinding.inflate(inflater, container, false)

        binding.durisJuwaplardiKoriw.setOnClickListener(){
            it.findNavController().navigate(R.id.action_test_to_duris_juwaplar)
        }
        return binding.root
    }
}