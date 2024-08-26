package com.example.myreadlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class BookAdapter(private val bookList: List<Book>) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.text_view_title)
        val authorTextView: TextView = view.findViewById(R.id.text_view_author)
        val coverImageView: ImageView = view.findViewById(R.id.image_view_cover)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[position]
        holder.titleTextView.text = book.title
        holder.authorTextView.text = book.author
        // Load image with Glide or similar library
        Glide.with(holder.itemView.context)
            .load(book.coverImageUrl)
            .into(holder.coverImageView)
    }

    override fun getItemCount(): Int = bookList.size
}