package controllers

import models.User

class UserStore {
    private val users = mutableListOf<User>()

    private var lastId = 0
    private fun getId() = lastId++

    fun findAllUsers(): List<User> {

        return users
    }

    fun createUser(user: User) {
        user.id = getId()
        users.add(user)
        println("User added")
    }

    fun findUserById(id: Int?): User? {

        return users.find { it.id == id }
    }

    fun deleteUerById(user: User): Boolean {

        return users.remove(user)
    }

    fun update(user: User): Boolean {
        val foundUser = findUserById(user.id)
        if (foundUser != null) {
            foundUser.name = user.name
            foundUser.email = user.email
            foundUser.gender = user.gender
            foundUser.height = user.height
            foundUser.weight = user.weight
            return true
        }
        return false
    }


}


