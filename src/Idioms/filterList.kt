package Idioms

fun filterList() {
    var list = arrayOf(-1, 2, -4, 3, 6, 5, -20)

    val positives = list.filter { x -> x > 0 }
    //or
    val positives2 = list.filter { it > 0 }

    println(positives)
    println(positives2)
}