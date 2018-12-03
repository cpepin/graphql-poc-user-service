package com.example.restService

import org.springframework.http.HttpMethod
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(
        private val userDao: UserDao
) {
    @GetMapping
    fun getAllUsers() = userDao.getAllUsers()

    @PostMapping
    fun createUser(@RequestBody user: User) = userDao.createUser(user.name, user.customerId)

    @GetMapping("/{id}")
    fun getUserById(@PathVariable("id") id: String) = userDao.getUserById(id)
}