package br.com.srpavani.srpavani.repository
import br.com.srpavani.srpavani.model.User
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class UserRepository {

    private val users = mutableListOf(
        User(
            id = UUID.randomUUID(),
            email = "test@test.com",
            password = "test",
            role = User.Role.USER,
            ),
        User(
            id = UUID.randomUUID(),
            email = "tes1t@test.com",
            password = "test1",
            role = User.Role.USER,
        ),
        User(
            id = UUID.randomUUID(),
            email = "test2@test.com",
            password = "test2",
            role = User.Role.ADMIN,
        ),
    )

    fun save(user: User): Boolean =
        users.add(user)

    fun findByEmail(email: String): User?=
        users
            .firstOrNull { it.email == email }

    fun findAll(): List<User> =
        users

    fun findByUUID(uuid: UUID): User?=
        users
            .firstOrNull{ it.id == uuid }


    fun deleteByUUID(uuid: UUID): Boolean{
        val foundUser = findByUUID(uuid)
        return foundUser?.let {
            users.remove(it)
        }?: false

    }

}