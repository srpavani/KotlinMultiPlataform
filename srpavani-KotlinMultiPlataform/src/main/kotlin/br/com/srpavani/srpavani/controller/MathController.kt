package br.com.srpavani.srpavani.controller

import br.com.srpavani.srpavani.converters.NumberConverter
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MathController {


    // Mapeia o endpoint para "/sum/{name}"
    @RequestMapping(value=["/sum/{numberOne}/{number2}"])
    fun sum(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "number2") number2: String?
    ): Double {
        if(!NumberConverter.isNummeric(numberOne) || !NumberConverter.isNummeric(number2))
            throw UnsupportedOperationException("please insert a numeric value")
            return NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(number2)
    }


    @RequestMapping(value=["/div/{numberOne}/{number2}"])
    fun div(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "number2") number2: String?
    ): Double {
        if(!NumberConverter.isNummeric(numberOne) || !NumberConverter.isNummeric(number2))
            throw UnsupportedOperationException("please insert a numeric value")
        return NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(number2)
    }



    @RequestMapping(value=["/sub/{numberOne}/{number2}"])
    fun sub(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "number2") number2: String?
    ): Double {
        if(!NumberConverter.isNummeric(numberOne) || !NumberConverter.isNummeric(number2))
            throw UnsupportedOperationException("please insert a numeric value")
        return NumberConverter.convertToDouble(numberOne) - NumberConverter.convertToDouble(number2)
    }


    @RequestMapping(value=["/mult/{numberOne}/{number2}"])
    fun multi(@PathVariable(value = "numberOne") numberOne: String?,
              @PathVariable(value = "number2") number2: String?
    ): Double {
        if(!NumberConverter.isNummeric(numberOne) || !NumberConverter.isNummeric(number2))
            throw UnsupportedOperationException("please insert a numeric value")
        return NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(number2)
    }







}