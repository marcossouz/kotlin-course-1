package BasicSyntax

fun coreBasicSyntax() {
    hello()

// Immutable
    val names = arrayOf("Marcos", "José", "Maria", "Pedro")
    myargs(names)

    println(sum(3, 4))

    // A function body can be an expression. Its return type is inferred.
    fun sum2(a: Int, b: Int) = a + b
    println(sum2(1, 2))

    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }
    printSum(10, 10)

    // Unit return type can be omitted.
    fun printSum2(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }
    printSum2(12, 12)

    /** Class */

    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}, color is ${rectangle.color}")

    var a = 1
    // simple name in template:
    val s1 = "a is $a"
    println(s1)

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    // Conditional expressions
    println(maxOf(2, 4))
    println(maxOf2(5, 4))

    //for loop
    forLoop()

    // while loop
    whileLoop()

    //when Expression
    whenExpression()

    println("---- Ranges -------")

    //Ranges
    ranges()

    println("-----------")
    ranges2()

    println("-----------")
    ranges3()

    println("---- Collections -------")
    collections()

    // Nullable values and null checks
    nullableValues()

    // Type checks and automatic casts
    typesChecks()

}