package br.com.srpavani.srpavani.services

import br.com.srpavani.srpavani.model.Person
import org.springframework.stereotype.Service
import java.util.logging.Logger
import java.util.concurrent.atomic.AtomicLong

@Service
class PersonService {

    private val counter: AtomicLong = AtomicLong();

    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findById(id: Long): Person {
        logger.info("Finding one person");

        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "diogo"
        person.lastName = "pavani"
        person.address = "paraiba"
        person.gender = "male"
        return person
    }

    fun findAll(): List<Person> {
        logger.info("Finding all people");
        val persons :MutableList<Person> = ArrayList();
        for (i in 0..7){
            val person = mockPerson(i)
            persons.add(person);
        }
        return persons;
    }

    fun create(person :Person): Person = Person();

    fun update(person: Person): Person{
        logger.info("Updating a person");
        return Person();
    }

    fun delete(id: Long){
        logger.info("Deleting a person");
    }


    private fun mockPerson(i: Int): Person {
        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "person name $i"
        person.lastName = "LAstname $i"
        person.address = "address $i"
        person.gender = "gender_$i"
        return person
    }

}