package br.com.srpavani.srpavani.repository

import br.com.srpavani.srpavani.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository :  JpaRepository<Person, Long?> {

}