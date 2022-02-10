package co.escuelaing.edu.UsersMicroservice.repository 

import org.springframework.data.mongodb.repository.MongoRepository;
import co.escuelaing.edu.UsersMicroservice.data.User;
import java.util.Optional;


interface UserRepository: MongoRepository<User, String>
{
    fun create(user: User): User?
    override fun findById(id: String): Optional<User!>
    fun getAll(): List<User?>
    override fun deleteById(id: String)
    fun update(user: User, userId: String ): User?
}