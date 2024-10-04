package models

data class User(
    var id: Int? = -1,
    var name: String? = "No name",
    var email: String? = "No email yet",
    var weight: Double? = 0.0,
    var height: Float = 0f,
    var gender: Char? = ' '
)


class users {
    var id: Int? = 0;
    var name: String? = "";
    var email: String? = "";

    constructor(id: Int?, name: String?, email: String?) {
        this.id = id;
        this.name = name; this.email = email;
    }
}




