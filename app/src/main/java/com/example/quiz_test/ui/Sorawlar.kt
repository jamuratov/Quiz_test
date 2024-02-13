package com.example.quiz_test.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.example.quiz_test.Adapters.Sorawlar_Adapter
import com.example.quiz_test.Dao.Dao
import com.example.quiz_test.Data.QuizTestDatabase
import com.example.quiz_test.R
import com.example.quiz_test.databinding.FragmentSorawlarFragmentBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class Sorawlar : Fragment() {
    private lateinit var binding: FragmentSorawlarFragmentBinding
    private val adapter = Sorawlar_Adapter()
    private lateinit var Dao: Dao

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSorawlarFragmentBinding.bind(view)
        binding.goTest.setOnClickListener {
            it.findNavController().navigate(R.id.action_sorawlar_to_test)
        }
        Dao = QuizTestDatabase.getInstance(requireContext()).getDao()
        binding.apply {
            lifecycleScope.launch {
                try{
                    val response = Dao.getAllQuestion()
                    withContext(Dispatchers.Main) {
                        adapter.models = response
                    }
                } catch (e: Exception) {
                    Toast.makeText(requireContext(),e.localizedMessage,Toast.LENGTH_SHORT).show()
                }
            }
            resyclerview.adapter = adapter
        }
    }
}