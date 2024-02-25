package BasicSyntax

fun whenExpression() {

    fun describe(obj: Any): String =
        when (obj) {
            1          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
        }

    println(describe(1))
    println(describe("Hello"))
    println(describe(23873736727))
    println(describe(203))
}
