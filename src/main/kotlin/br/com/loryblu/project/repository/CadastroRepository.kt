package br.com.loryblu.project.repository

import br.com.loryblu.project.model.Cadastro
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CadastroRepository : JpaRepository<Cadastro, UUID>{

}