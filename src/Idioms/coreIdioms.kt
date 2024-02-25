package Idioms

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


}

