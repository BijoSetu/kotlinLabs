import models.User
import controllers.UserStore
import ValidationUtility

import io.github.oshai.kotlinlogging.KotlinLogging

//var user = User()
var userStore = UserStore()

private val logger = KotlinLogging.logger {}
fun main() {

    userStore.createUser((User(1, "Homer Simpson", "homer@simpson.com", 178.0, 2.30f, 'M')))
    userStore.createUser((User(2, "Marge Simpson", "marge@simpson.com", 140.0, 1.6f, 'F')))
    userStore.createUser((User(3, "Lisa Simpson", "lisa@simpson.com", 100.0, 1.2f, 'F')))
    userStore.createUser((User(4, "Bart Simpson", "bart@simpson.com", 80.0, 1.0f, 'M')))
    userStore.createUser((User(5, "Maggie Simpson", "maggie@simpson.com", 50.0, 0.7f, 'F')))
//    arrayPrint()
    runApp()
}

fun gettingInput(user: User) {


    println("Enter your name")
    user.name = readLine()
    println("Enter your email")
    user.email = readLine()
//    println("Enter your id")
//    user.id = readLine()?.toIntOrNull() ?: -1
    println("Enter your height")
    user.height = readLine()?.toFloat() ?: 0f
    println("Enter your weight")
    user.weight = readLine()?.toDouble() ?: 0.0
    println("Enter your gender (m for Male, f for Female, o for Other):")
}

fun addUser() {

    val user = User()
    val input: Char
    gettingInput(user)
    ValidationUtility().validationUtility()
//    if (readLine()?.trim()?.get(0) != 'm' || readLine()?.trim()?.get(0) != 'f' || readLine()?.trim()?.get(0) != '0') {
//        println("Invalid input , please select either m,f or o")
//    } else {1
//        user.gender = readLine()?.trim()?.get(0) ?: ' '
//        println("Your gender is ${user.gender}")
//    }

//creating a user
    userStore.createUser(user)

}


fun listUsers() {


    userStore.findAllUsers().forEach { it ->
        println("The name is $it")
    }
}


fun getUsrById(): User? {
    println("Enter the id of the user : ")
    val id = readlnOrNull()?.toIntOrNull() ?: -1

    return userStore.findUserById(id)

}

fun findUserById() {

    listUsers()
    val user = getUsrById()

    if (user == null) {
        logger.info { "User not found" }
    } else {
        println("The user is $user")

    }
}

fun deleteUserById() {
    listUsers()
    var user = getUsrById()
    if (user != null) {
        userStore.deleteUerById(user)
        logger.info { "User deleted successfully" }
    } else {
        logger.info { "User not found" }
    }
}

fun updateUserById() {
    listUsers()
    var userdetails = getUsrById()

    if (userdetails != null) {
        println("Enter the updated details of the user : ")
        gettingInput(userdetails)
//
        if (userStore.update(userdetails)) {
            logger.info { "User updated successfully" }

        } else {
            logger.info { "Could not update user" }
        }

    } else {
        logger.info { "User not found" }
    }


}

fun selectMenu(): Int {
    println(
        """
                 
            Select your menu
    1.Enter 1 for Adding a user
    2.Enter 2 for viewing all users
    3.Enter 3 to Find a user
    4.Enter 4 to delete a user
    5.Update a user
    6.Enter 0 to exit
    
   """
    )
    return readLine()?.toInt() ?: -1
}


fun arrayPrint() {

    val myArray = arrayOf(4, 5, 6, 7)
    println("the array is ${myArray.toList()}")

    val array = Array(6) { i -> i * 3 }
//    val myNullArray = arrayOfNulls<Int>(5)
//    myNullArray[2] = 4
//    myNullArray[4] = 5
//    println(myNullArray.toList())
}

fun runApp() {

    var input: Int

    do {

        input = selectMenu()
        when (input) {
            1 -> addUser()
            2 -> listUsers()
            3 -> findUserById()
            4 -> deleteUserById()
            5 -> updateUserById()
            in (6..10) -> println("Feature coming soon")
            0 -> println("Bye")
            else -> println("Invalid input")
        }


    } while (input != 0)


}

/**
 * This is a documentation comment
 * on multiple lines.
 */
