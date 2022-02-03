package co.escuelaing.edu.service

import co.escuelaing.edu.data.User
import org.springframework.stereotype.Service
import java.util.ArrayList
import java.util.HashMap
import java.util.List

@Service
class UserServiceHashMap : UserService {
    private val usersHashMap: HashMap<String, User> = HashMap()
    @Override
    fun create(user: User): User {
        return usersHashMap.put(user.getId(), user)
    }

    @Override
    fun findById(id: String?): User {
        return usersHashMap.get(id)
    }

    @Override
    fun all(): List<User> {
        return ArrayList<User>(usersHashMap.values())
    }

    @Override
    fun deleteById(id: String?) {
        usersHashMap.remove(id)
    }

    @Override
    fun update(user: User?, userId: String?): User {
        return usersHashMap.put(userId, user)
    }
}