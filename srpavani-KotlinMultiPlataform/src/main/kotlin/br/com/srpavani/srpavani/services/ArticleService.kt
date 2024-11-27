package br.com.srpavani.srpavani.services

import br.com.srpavani.srpavani.model.Article
import br.com.srpavani.srpavani.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService (private val articleRepository: ArticleRepository){

    fun findAll(): List<Article> =
        articleRepository.findAll()
}