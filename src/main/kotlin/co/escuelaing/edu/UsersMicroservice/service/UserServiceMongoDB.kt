package co.escuelaing.edu.UsersMicroservice.service

import co.escuelaing.edu.UsersMicroservice.data.User
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired;
import co.escuelaing.edu.UsersMicroservice.dto.UserDto
// import co.escuelaing.edu.UsersMicroservice.repository

@Service
class UserServiceMongoDB(@Autowired userRepository: UserRepository): UserService {

    private val userRepository: UserRepository;

    override fun  create(user: User ): User {
        return userRepository.put(user.id, user)
    }

    @Override
    fun  findById( id: String ): User {
        return userRepository.get(id)
    }

    override fun  getAll(): List<User> {
        return ArrayList<User?>(userRepository.values)
    }

    override fun  deleteById( id: String ) {
        userRepository.remove(id);
    }

    fun  update( userDto: UserDto, id: String ): User {
        return userRepository.put(id, userDto)
    }

    init {
        this.userRepository = userRepository;
    }
}