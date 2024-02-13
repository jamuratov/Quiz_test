package com.example.quiz_test.Adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz_test.Data.Test
import com.example.quiz_test.R
import com.example.quiz_test.databinding.FragmentTestBinding

class Test_Adapter : RecyclerView.Adapter<Test_Adapter.TestViewHolder>(){

    inner class TestViewHolder(private val binding: FragmentTestBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(test: Test) {
        }
    }

    var models = listOf<Test>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = models.size

    override fun onBindViewHolder(holder:TestViewHolder, position: Int) {
        holder.bind(models[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.fragment_test,parent,false)
        val binding = FragmentTestBinding.bind(v)
        return TestViewHolder(binding)
    }


}