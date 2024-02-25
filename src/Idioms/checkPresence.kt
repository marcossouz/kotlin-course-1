package Idioms

fun checkPresence() {
    var emailsList = arrayOf("john@example.com", "jane@example.com", "mario@example.com")
    if ("john@example.com" in emailsList) {
        println("john is present")
    }
}
