package com.example.myreadlist.dal.repositories

import com.google.firebase.auth.FirebaseAuth
import com.example.myreadlist.models.User
import kotlinx.coroutines.tasks.await

class UserRepository {

    private val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()

    suspend fun registerUser(user: User): Boolean {
        return try {
            user.email?.let { firebaseAuth.createUserWithEmailAndPassword(it, user.password).await() }
            true
        } catch (e: Exception) {
            false
        }
    }

    suspend fun loginUser(email: String, password: String): Boolean {
        return try {
            firebaseAuth.signInWithEmailAndPassword(email, password).await()
            true
        } catch (e: Exception) {
            false
        }
    }
}