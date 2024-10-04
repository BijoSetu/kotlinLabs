//fun validationUtility() {
//
//    val input: Char
//
//    input = readLine()?.getOrNull(0) ?: ' '
//    when (input.uppercaseChar()) {
//
//        'F', 'M', 'O' -> println("Your gender is ${input}")
//        else -> println("Invalid gender input")
//    }
//}

class ValidationUtility {

    fun validationUtility() {

        val input: Char

        input = readLine()?.getOrNull(0) ?: ' '
        when (input.uppercaseChar()) {

            'F', 'M', 'O' -> println("Your gender is ${input}")
            else -> println("Invalid gender input")
        }
    }
}