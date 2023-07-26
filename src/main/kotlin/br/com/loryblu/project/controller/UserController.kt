package main.kotlin.br.com.loryblu.project.controller

import main.kotlin.br.com.loryblu.project.model.User
import main.kotlin.br.com.loryblu.project.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/login")
class UserController {

    @Autowired
    private lateinit var userService: UserService


    @GetMapping("/{id}")
    fun findById(@PathVariable(value = "id") id: UUID): User {
        return userService.findById(id)
    }

    @PostMapping("/create")
    fun create(@RequestBody()user: User) : User {
        return userService.create(user)
    }

    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun update(@RequestBody()user: User) : User {
        return userService.update(user)
    }

    @DeleteMapping("/{id}",
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun delete(@PathVariable(value = "id") id: UUID) {
        return userService.delete(id)

    }
}