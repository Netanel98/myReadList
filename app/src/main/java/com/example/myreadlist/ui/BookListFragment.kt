package com.example.myreadlist.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myreadlist.databinding.FragmentReadingListBinding
import com.example.myreadlist.models.ReadingList

class ReadingListFragment : Fragment() {

    private var _binding: FragmentReadingListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentReadingListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val readingLists = listOf<ReadingList>() // Assume data is fetched here
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ReadingListAdapter(readingLists)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}