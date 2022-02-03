package edu.escuelaing.ieti.controller

import edu.escuelaing.ieti.data.User
import edu.escuelaing.ieti.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.List

@RestController
@RequestMapping("/v1/user")
class UserController(@Autowired userService: UserService) {
    private val userService: UserService
    @GetMapping
    fun all(): ResponseEntity<List<User>> {
        return ResponseEntity.status(HttpStatus.OK).body(userService.all())
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: String?): ResponseEntity<User> {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id))
    }

    @PostMapping
    fun create(@RequestBody user: User?): ResponseEntity<User> {
        return ResponseEntity.status(HttpStatus.OK).body(userService.create(user))
    }

    @PutMapping("/{id}")
    fun update(@RequestBody user: User?, @PathVariable id: String?): ResponseEntity<User> {
        return ResponseEntity.status(HttpStatus.OK).body(userService.update(user, id))
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String?): ResponseEntity<Boolean> {
        return try {
            userService.deleteById(id)
            ResponseEntity.status(HttpStatus.OK).body(true)
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.ordinal()).body(false)
        }
    }

    init {
        this.userService = userService
    }
}