package br.com.srpavani.srpavani.repository

import br.com.srpavani.srpavani.model.Article
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class ArticleRepository {

    private val articles = listOf(
        Article(id= UUID.randomUUID(), title ="Article 1", content = "Conteudo"),
        Article(id= UUID.randomUUID(), title ="Article 2", content = "Conteudo")
    )

    fun findAll(): List<Article> =
        articles
}