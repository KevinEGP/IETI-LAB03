package co.escuelaing.edu.dto

import co.escuelaing.edu.data.User

class UserDto {

    var name: String? = null,
    var email: String? = null, 
    var lastname: String? = null

	fun getName(): String? {
		return name;
	}

    fun getEmail(): String? {
		return email;
    }
    
    fun getLastname(): String? {
		return lastname;
    }
    
    fun setName(name: String?) {
		this.name = name
	}


    fun setEmail(email: String) {
		this.email = email
    }
    
    fun setLastname(lastname: String) {
		this.name = lastname
	}
}