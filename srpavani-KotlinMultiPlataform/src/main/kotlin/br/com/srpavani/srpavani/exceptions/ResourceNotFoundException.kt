package br.com.srpavani.srpavani.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.Exception

@ResponseStatus(HttpStatus.NOT_FOUND)
class ResourceNotFoundException(exception: String?): RuntimeException(exception){

}