package co.escuelaing.edu.UsersMicroservice.service
   
class UserServiceMongoDB(@Autowired userRepository: UserRepository): UserService {

    private val userRepository: UserRepository;

    override fun  create( User user ): User {
        return null;
    }

    override fun  findById( String id ): User {
        return null;
    }

    override fun  all(): List<User> {
        return null;
    }

    override fun  deleteById( String id ): boolean {
        return false;
    }

    override fun  update( UserDto userDto, String id ): User {
        return null;
    }

    init {
        this.userRepository = userRepository;
    }
}