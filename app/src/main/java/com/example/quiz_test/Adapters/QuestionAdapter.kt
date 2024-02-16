package com.example.quiz_test.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.quiz_test.Data.QuestionData
import com.example.quiz_test.R
import com.example.quiz_test.databinding.ListItemBinding

class QuestionAdapter : RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>() {

    inner class QuestionViewHolder(private val binding: ListItemBinding) :
        ViewHolder(binding.root) {
        fun bind(questionData: QuestionData) {
            binding.questionName.text = questionData.name
        }
    }

    var models = listOf<QuestionData>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = models.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        val binding = ListItemBinding.bind(v)
        return QuestionViewHolder(binding)
    }


    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        holder.bind(models[position])
    }
}