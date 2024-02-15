package com.example.quiz_test.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import com.example.quiz_test.Adapters.QuestionAdapter
import com.example.quiz_test.Dao.QuestionDao
import com.example.quiz_test.Data.QuestionDatabase
import com.example.quiz_test.databinding.FragmentSorawlarFragmentBinding

class Sorawlar : Fragment() {
    private lateinit var binding: FragmentSorawlarFragmentBinding
    private val adapter = QuestionAdapter()
    private lateinit var db: QuestionDatabase
    private lateinit var dao: QuestionDao
    private val list = mutableListOf<String>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSorawlarFragmentBinding.bind(view)

        db = QuestionDatabase.getInstance(requireContext())
        dao = db.getAllQuestionDao()

/*        binding.goTest.setOnClickListener {
            findNavController().navigate(R.id.action_sorawlar_to_test)
        }*/

        repeat(50) {
            list.add("What is your name ?")
        }

        Log.d("TTT",list.toString())
        binding.apply {
            recyclerView.adapter = adapter
            adapter.models = list

/*            Log.d("TTT",dao.getAllQuestion().toMutableList().toString())
            adapter.models = dao.getAllQuestion().toMutableList()*/
        }
    }
}