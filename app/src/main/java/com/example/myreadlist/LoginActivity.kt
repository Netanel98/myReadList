package com.example.myreadlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myreadlist.databinding.ActivityLoginBinding
import com.example.myreadlist.dal.repositories.UserRepository

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private val userRepository = UserRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val email = binding.emailEditText.text.toString()
            val password = binding.passwordEditText.text.toString()
            loginUser(email, password)
        }
    }

    private fun loginUser(email: String, password: String) {
        // Call repository to perform login
        // Handle UI updates based on login success/failure
    }
}