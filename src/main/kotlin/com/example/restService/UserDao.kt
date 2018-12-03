package com.example.restService

import org.springframework.stereotype.Component
import java.util.*

@Component
class UserDao {
    private val data = mutableListOf(
            User(id = UUID.randomUUID().toString(), name = "Joe", customerId = "1"),
            User(id = UUID.randomUUID().toString(), name = "John", customerId = "1"),
            User(id = UUID.randomUUID().toString(), name = "Frank", customerId = "2")
    )

    fun getAllUsers() = data
    fun getUserById(id: String) = data.firstOrNull { user -> user.id == id }
    fun createUser(name: String, customerId: String): User {
        val user = User(id = UUID.randomUUID().toString(), name = name, customerId = customerId)
        data.add(user)
        return user
    }
}