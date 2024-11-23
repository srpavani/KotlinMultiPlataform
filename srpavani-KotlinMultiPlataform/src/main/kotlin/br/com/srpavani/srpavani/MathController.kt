package br.com.srpavani.srpavani

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class MathController {


    // Mapeia o endpoint para "/sum/{name}"
    @RequestMapping(value=["/sum/{numberOne}/{number2}"])
    fun sum(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "number2") number2: String?
    ): Double {
        if(!isNummeric(numberOne) || !isNummeric(number2))
            throw UnsupportedOperationException("please insert a numeric value")
            return convertToDouble(numberOne) + convertToDouble(number2)
    }

    private fun isNummeric(strNumber: String?): Boolean {
        if(strNumber.isNullOrBlank()) return false
        val number = strNumber.replace(",".toRegex(), ".")
        return number.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())

    }

    private fun convertToDouble(strNumber: String?): Double {
        if(strNumber.isNullOrBlank()) return 0.0
        val number = strNumber.replace(",".toRegex(), ".")
        return if (isNummeric(number)) number.toDouble() else 0.0

    }
}
