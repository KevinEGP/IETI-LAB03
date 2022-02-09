package co.escuelaing.edu.UsersMicroservice.service

import co.escuelaing.edu.UsersMicroservice.data.User
import org.springframework.stereotype.Service

@Service
class UserServiceHashMap : UserService {
    private val usersHashMap: HashMap<String, User> = HashMap()

    override fun create(user: User): User? {
        return usersHashMap.put(user.id, user)
    }
    
    override fun findById(id: String): User? {
        return usersHashMap.get(id)
    }
    
    override fun getAll(): List<User?> {
        return ArrayList<User?>(usersHashMap.values)
    }

    override fun deleteById(id: String) {
        usersHashMap.remove(id)
    }

    override fun update(user: User, userId: String): User? {
        return usersHashMap.put(userId, user)
    }
}