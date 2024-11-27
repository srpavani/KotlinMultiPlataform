package br.com.srpavani.srpavani.controller.article

import br.com.srpavani.srpavani.model.Article
import br.com.srpavani.srpavani.services.ArticleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/article"])
class ArticleController(

    private val articleService: ArticleService
){
    @GetMapping
    fun findAll(): List<ArticleResponse> =
        articleService.findAll()
            .map { it.toResponse()}

    private fun Article.toResponse(): ArticleResponse =
        ArticleResponse(
            id = this.id,
            title = this.title,
            content = this.content
        )
}