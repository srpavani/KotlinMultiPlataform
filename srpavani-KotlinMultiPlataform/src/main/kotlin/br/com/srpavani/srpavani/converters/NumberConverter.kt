package br.com.srpavani.srpavani.converters

object NumberConverter {

    fun isNummeric(strNumber: String?): Boolean {
        if(strNumber.isNullOrBlank()) return false
        val number = strNumber.replace(",".toRegex(), ".")
        return number.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())

    }

    fun convertToDouble(strNumber: String?): Double {
        if(strNumber.isNullOrBlank()) return 0.0
        val number = strNumber.replace(",".toRegex(), ".")
        return if (isNummeric(number)) number.toDouble() else 0.0
    }

}