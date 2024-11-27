package br.com.srpavani.srpavani.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties
data class JwtProperties(
    val key: String,
    val acessTokenExpiration: Long,
    val refreshTokenExpiration: Long,
)

