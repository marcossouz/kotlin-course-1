package Idioms

import java.io.File
import java.math.BigDecimal

fun coreIdioms() {
    createDTOs()

    defaultParams()

    filterList()

    // Check the presence of an element in a collection
    checkPresence()

    instanceChecks()

    // Read-only list
    val list = listOf("a", "b", "c")
    println(list)

    //Read-only map
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map)

    // Access a map entry
    val map2 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    println(map2["a"])

    map2["a"] = 3
    println(map2["a"])

    // Traverse a map or a list of pairs
    for ((k, v) in map) {
        println("$k -> $v")
    }

    // Iterate over a range
    for (i in 1..100) { if(i % 13 == 0) print("$i ") }  // closed-ended range: includes 100
    println()
    for (i in 1..< 100) { if(i % 50 == 0) print("$i ") } // open-ended range: does not include 100
    println()
    for (x in 2..10 step 2) { print("$x ") }
    println()
    for (x in 10 downTo 1) { print("$x ") }
    println()
    (1..5).forEach { print("| *-* |") }


    // Lazy property
    val p: String by lazy {
        // the value is computed only on first access
        // compute the string
        "Lazy"
    }
    println("p value first: $p") // the value is computed only on first access
    println("p value second: $p") // use
    println("p value third: $p") // use
    val c = "Convert this to camelcase".spaceToCamelCase()
    println(c)
    val cc = "other phrase"
    println(cc.spaceToCamelCase())

    singleton()

    instantiateAnAbstractClass()

    // If-not-null shorthand
    val files = File("Test").listFiles()
    println(files?.size) // size is printed if files is not null

    // If-not-null-else shorthand
    val files2 = File("Test").listFiles()
    // For simple fallback values:
    println(files2?.size ?: "empty") // if files is null, this prints "empty"

    // To calculate a more complicated fallback value in a code block, use `run`
    val filesSize = files?.size ?: run {
        val someSize = getSomeSize()
        someSize * 2
    }
    println(filesSize)

    // Execute a statement if null
    val values = mutableMapOf("email" to "marcos@example.com", "name" to "Marcos Souza")
    val email = values["email"] ?: throw IllegalStateException("Email is missing!")
    println(email)

    // Get first item of a possibly empty collection
    val emails = arrayOf("fulano@example.com", "beltrano@example.com") // might be empty
    val mainEmail = emails.firstOrNull() ?: ""
    println(mainEmail)

    //Execute if not null
    val value = null

    value?.let {
        println("Not null") // execute this block if not null
    }

    // Map nullable value if not null
    val value2 = mutableMapOf("name" to "marcos")

    val mapped = value2?.let { transformValue(it) } ?: "Default Value"
    // defaultValue is returned if the value or the transform result is null.
    println(mapped)

    //Return on when statement
    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("Invalid color param value")
        }
    }

    println(transform("Blue"))

    fun count(): Int {
        return 10
    }

    // try-catch expression
    fun test() {
        val result = try {
            count()
        } catch (e: ArithmeticException) {
            throw IllegalStateException(e)
        }

        println(result)
        // Working with result
    }

    test()

    // if expression
    val x = 1
    val y = if (x == 1) {
        "one"
    } else if (x == 2) {
        "two"
    } else {
        "other"
    }

    println(y)

    //Builder-style usage of methods that return Unit
    fun arrayOfMinusOnes(size: Int): IntArray {
        return IntArray(size).apply { fill(-1) }
    }

    println(arrayOfMinusOnes(5).forEach { print("$it ") })
    println()

    // Single-expression functions
    fun theAnswer() = 42

    println(theAnswer())

    // This is equivalent to
    /*
        fun theAnswer(): Int {
            return 42
        }
    */

    // Call multiple methods on an object instance (with)
    // multiplesMethods()

    // Configure properties of an object (apply)
    val myRectangle = Rectangle().apply {
        length = 4
        breadth = 5
        color = 0xFAFAFA
    }

    println(myRectangle.toString())

    // Swap two variables
    var a = 1
    var b = 2
    a = b.also { b = a }

    println("$a e $b")

    // Mark code as incomplete (TODO)
    fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")

}

fun transformValue(it: MutableMap<String, String>): MutableMap<String, String> {
    it["name"] += "++"
    return it
}

fun getSomeSize(): Double {
    return 1.0
}
