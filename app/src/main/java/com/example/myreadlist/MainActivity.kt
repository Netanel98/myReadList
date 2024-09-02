package com.example.myreadlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myreadlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Use binding to access your views
        "Updated Text".also { binding.sampleTextView.text = it }
    }
}

    private fun setupReadingList() {
        // Fetch reading lists from repository and display them
        // Setup listeners for adding, removing, and sharing lists
    }
}