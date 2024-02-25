package BasicSyntax

fun collections() {
    val items = listOf("apple", "banana", "kiwifruit")

    for (item in items) {
        println(item)
    }

    // Check if a collection contains an object using in operator:
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }


    // Use lambda expressions to filter and map collections:
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
                    fruits
                        .filter { it.startsWith("a") }
                        .sortedBy { it }
                        .map { it.uppercase() }
                        .forEach { println(it) }
}