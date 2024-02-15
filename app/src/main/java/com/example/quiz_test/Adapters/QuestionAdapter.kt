package com.example.quiz_test.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.quiz_test.Data.QuestionData
import com.example.quiz_test.R
import com.example.quiz_test.databinding.ListItemBinding

class QuestionAdapter : Adapter<QuestionAdapter.QuestionViewHolder>() {

    inner class QuestionViewHolder(private val binding: ListItemBinding) :
        ViewHolder(binding.root) {
        fun bind(text:String) {
            binding.questionName.text = text
        }
    }

    var models = mutableListOf<String>()
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