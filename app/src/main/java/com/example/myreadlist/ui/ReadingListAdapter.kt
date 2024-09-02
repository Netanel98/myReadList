package com.example.myreadlist.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myreadlist.viewbinding.ItemReadingListBinding
import com.example.myreadlist.models.ReadingList

class ReadingListAdapter(private val lists: List<ReadingList>) : RecyclerView.Adapter<ReadingListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemReadingListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(lists[position])
    }

    override fun getItemCount(): Int = lists.size

    class ListViewHolder(private val binding: ItemReadingListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(list: ReadingList) {
            binding.textViewName.text = list.name
            binding.textViewDescription.text = list.description
        }
    }
}