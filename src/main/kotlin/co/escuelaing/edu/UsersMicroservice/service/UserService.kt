package co.escuelaing.edu.UsersMicroservice.service

import co.escuelaing.edu.UsersMicroservice.data.User

interface UserService {
    fun create(user: User): User?
    fun findById(id: String): User?
    fun getAll(): List<User?>
    fun deleteById(id: String)
    fun update(user: User, userId: String ): User?
}