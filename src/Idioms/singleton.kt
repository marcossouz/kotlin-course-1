package Idioms

object Resource {
    const val name = "Name"
}

fun singleton() {
    var r = Resource

    println(r.name)

    var rr = Resource

    println(rr.name)
}


