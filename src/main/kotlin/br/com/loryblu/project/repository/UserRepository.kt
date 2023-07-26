package main.kotlin.br.com.loryblu.project.repository

import main.kotlin.br.com.loryblu.project.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface UserRepository : JpaRepository<User, UUID>{

}