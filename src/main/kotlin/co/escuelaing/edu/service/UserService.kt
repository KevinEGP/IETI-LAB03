package co.escuelaing.edu.service

import co.escuelaing.edu.data.User

interface UserService {
    fun create(user: User): User
    fun findById(id: String): User
    fun getAll(): List<User> 
    fun deleteById(id: User)
    fun update(user: User, userId: String ): User
}