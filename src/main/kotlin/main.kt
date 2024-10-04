import models.User
import models.users
import ValidationUtility

var user = User()

fun main() {

    runApp()

}

fun addUser() {

    val input: Char
    println("Enter your name")
    user.name = readLine()
    println("Enter your email")
    user.email = readLine()
    println("Enter your id")
    user.id = readLine()?.toIntOrNull() ?: -1
    println("Enter your height")
    user.height = readLine()?.toFloat() ?: 0f
    println("Enter your weight")
    user.weight = readLine()?.toDouble() ?: 0.0
    println("Enter your gender (m for Male, f for Female, o for Other):")
    ValidationUtility().validationUtility()
//    if (readLine()?.trim()?.get(0) != 'm' || readLine()?.trim()?.get(0) != 'f' || readLine()?.trim()?.get(0) != '0') {
//        println("Invalid input , please select either m,f or o")
//    } else {1
//        user.gender = readLine()?.trim()?.get(0) ?: ' '
//        println("Your gender is ${user.gender}")
//    }


}


fun readUser() {
    println("The name is ${user.name}")
}


fun selectMenu(): Int {
    println(
        """Select your menu
    1.Enter 1 for Adding a user
    2.Enter 2 for viewing the user
    3.Enter 0 to exit"""
    )
    return readLine()?.toInt() ?: -1
}

fun runApp() {

    var input: Int

    do {

        input = selectMenu()
        when (input) {
            1 -> addUser()
            2 -> readUser()
            in (3..6) -> println("Feature coming soon")
            0 -> println("Bye")
            else -> println("Invalid input")
        }


    } while (input != 0)


}

/**
 * This is a documentation comment
 * on multiple lines.
 */
