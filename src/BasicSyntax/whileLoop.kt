package BasicSyntax

fun whileLoop() {

    println("-------While loop-------")

    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    println("--------------")
}
