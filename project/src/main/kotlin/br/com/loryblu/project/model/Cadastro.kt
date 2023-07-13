package br.com.loryblu.project.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID


@Entity
@Table(name = "cadastro")
data class Cadastro (
    val nome: String,
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID
)



