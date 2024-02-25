package BasicSyntax

import java.lang.Integer.parseInt

fun nullableValues() {

    // Return null if str does not hold an integer:
    fun myParseInt(str: String): Int? {
        try {
            return parseInt(str)
        } catch (e: Exception) {
            return null
        }
    }

    println(myParseInt("3"))
    print(myParseInt("a"))

    println("----- Case Two")
    fun printProduct(arg1: String, arg2: String) {
        val x = myParseInt(arg1)
        val y = myParseInt(arg2)

        // Using `x * y` yields error because they may hold nulls.
        if (x != null && y != null) {
            // x and y are automatically cast to non-nullable after null check
            println(x * y)
        }
        else {
            println("'$arg1' or '$arg2' is not a number")
        }
    }

    printProduct("3", "4")
    printProduct("3", "a")
    printProduct("a", "b")

    println("----- Case Three")
    fun printProduct2(arg1: String, arg2: String) {
        val x = myParseInt(arg1)
        val y = myParseInt(arg2)

        if (x == null) {
            println("Wrong number format in arg1: '$arg1'")
            return
        }
        if (y == null) {
            println("Wrong number format in arg2: '$arg2'")
            return
        }

    // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }

    printProduct2("3", "4")
    printProduct2("3", "a")
    printProduct2("a", "b")

}
