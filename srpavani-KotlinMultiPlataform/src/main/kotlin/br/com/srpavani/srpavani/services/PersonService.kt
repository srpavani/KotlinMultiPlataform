package br.com.srpavani.srpavani.services

import br.com.srpavani.srpavani.exceptions.ResourceNotFoundException
import br.com.srpavani.srpavani.model.Person
import br.com.srpavani.srpavani.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.logging.Logger
import java.util.concurrent.atomic.AtomicLong

@Service
class PersonService {

    @Autowired
    private  lateinit var repository: PersonRepository

    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findById(id: Long): Person {
        logger.info("Finding one person");
        return repository.findById(id)
            .orElseThrow{ ResourceNotFoundException("Resource not found")}
    }

    fun findAll(): List<Person> {
        logger.info("Finding all people");
        return repository.findAll();
    }

    fun create(person :Person): Person{
        return repository.save(person)
        logger.info("Create a person");

    };

    fun update(person: Person): Person{
        val entity = repository.findById(person.id)
            .orElseThrow{ ResourceNotFoundException("Resource not found")}

        entity.firstName = person.firstName
        entity.lastName = person.lastName
        entity.address = person.address
        entity.gender = person.gender
        logger.info("Updating a person");
        return repository.save(entity);
    }

    fun delete(id: Long){
        val entity = repository.findById(id)
            .orElseThrow{ ResourceNotFoundException("Resource not found")}

        repository.delete(entity);

    }



}