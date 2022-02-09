package co.escuelaing.edu.UsersMicroservice.data

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

class User (
    @Id
    var id: String,
    var name: String,
    @Indexed( unique = true )
    var email: String, 
    var lastname: String,
    var createdAt: String,
)