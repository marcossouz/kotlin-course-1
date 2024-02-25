package BasicSyntax

fun forLoop() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    println("--------------")

    val items2 = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items2[index]}")
    }

    println("--------------")
}