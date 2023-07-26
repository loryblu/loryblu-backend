package main.kotlin.br.com.loryblu.project.service

import main.kotlin.br.com.loryblu.project.model.User
import main.kotlin.br.com.loryblu.project.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import java.util.logging.Logger

@Service
class UserService{

    @Autowired
    private lateinit var userRepository: UserRepository

    private val logger = Logger.getLogger(UserService::class.java.name)

    fun findById(id: UUID): User {
        logger.info("Finding a person...")
        return userRepository.findById(id)
            .orElseThrow { Exception("No records found for this ID.") }
    }

    fun create(user: User) : User {
        logger.info("Creating a person with name ${user.name}...")
        return userRepository.save(user)
    }

    fun update(user: User) : User {
         val user : User = userRepository.getReferenceById(user.id!!)
            userRepository.save(user)
        return user
    }

    fun delete(id: UUID) {
        logger.info("Deleting a user with id ${id}...")
        userRepository.deleteById(id)

    }

}