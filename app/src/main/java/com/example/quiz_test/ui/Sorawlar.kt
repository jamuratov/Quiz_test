package com.example.quiz_test.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.example.quiz_test.Adapters.QuestionAdapter
import com.example.quiz_test.Dao.QuestionDao
import com.example.quiz_test.Data.QuizDatabase
import com.example.quiz_test.R
import com.example.quiz_test.databinding.FragmentSorawlarFragmentBinding
import kotlinx.coroutines.launch

class Sorawlar : Fragment(R.layout.fragment_sorawlar_fragment) {
    private lateinit var binding: FragmentSorawlarFragmentBinding
    private val adapter = QuestionAdapter()
    private lateinit var db: QuizDatabase
    private lateinit var dao: QuestionDao

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSorawlarFragmentBinding.bind(view)

        db = QuizDatabase.getInstance(requireContext())
        dao = db.getQuestionsDao()

        lifecycleScope.launch {
            adapter.models = dao.getQuestions().toMutableList()
        }

        binding.apply {
            recyclerView.adapter = adapter
        }
    }
}