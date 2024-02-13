package com.example.quiz_test.Adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.quiz_test.Data.Questions
import com.example.quiz_test.R
import com.example.quiz_test.databinding.ListItemBinding

class Sorawlar_Adapter : RecyclerView.Adapter<Sorawlar_Adapter.SorawlarViewHolder>()  {
    inner class SorawlarViewHolder(private val binding: ListItemBinding) :
            ViewHolder(binding.root) {
                fun bind(questions: Questions){
                    binding.RuslanBilaygo.text = questions.name
                }
            }
    var models = listOf<Questions>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    override fun getItemCount(): Int = models.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SorawlarViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        val binding = ListItemBinding.bind(v)
        return SorawlarViewHolder(binding)
    }
    override fun onBindViewHolder(holder: SorawlarViewHolder, position: Int){
        holder.bind(models[position])
    }
}