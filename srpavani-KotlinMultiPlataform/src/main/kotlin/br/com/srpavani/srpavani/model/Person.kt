package br.com.srpavani.srpavani.model
import jakarta.persistence.*

@Entity
@Table(name = "person")
data class Person (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "first_name", nullable = false, length = 80)
    var firstName: String = "d",
    @Column(name = "last_name", nullable = false)
    var lastName: String = "",
    @Column(nullable = false, length = 80)
    var address: String = "",
    @Column(nullable = false, length = 6)
    var gender: String = ""
    )