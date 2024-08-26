package com.example.myreadlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BookListFragment : Fragment() {

    private lateinit var bookRecyclerView: RecyclerView
    private lateinit var bookAdapter: BookAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_book_list, container, false)

        // Initialize RecyclerView
        bookRecyclerView = view.findViewById(R.id.recycler_view_books)
        bookRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Set up Adapter
        bookAdapter = BookAdapter(getBooks()) // Assume getBooks() fetches book data
        bookRecyclerView.adapter = bookAdapter

        return view
    }

    // Dummy data fetching function
    private fun getBooks(): List<Book> {
        return listOf(
            Book("Title 1", "Author 1", "Description 1", "https://example.com/image1.jpg"),
            Book("Title 2", "Author 2", "Description 2", "https://example.com/image2.jpg"),
        )
    }
}

data class Book(
    val title: String,
    val author: String,
    val description: String,
    val imageUrl: String
)