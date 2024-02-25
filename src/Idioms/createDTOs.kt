package Idioms

fun createDTOs() {
    var s = Customer("Marcos", "marcos@example.com")
    var ss = Customer("Marcos", "marcos@example.com")
    var w = Customer("Junior", "junior@example.com")
    var wCopy = w.copy()

    /** getters (and setters in case of vars) for all properties
    equals()
    hashCode()
    toString()
    copy()
    component1(), component2(), ..., for all properties (see Data classes)
    https://kotlinlang.org/docs/data-classes.html
     */

    println("----- equals() -------")

    println(s.equals(ss))
    println(w.equals(wCopy))

    println(s == ss)
    println(w == wCopy)

    println("----- hashCode() -------")

    println(s.hashCode())
    println(s.hashCode() == ss.hashCode())
    println(w.hashCode())

    println("----- toString() -------")

    println(s.toString())
    println(w.toString())

    println("----- copy() -------")

    println(w.toString())
    println(wCopy.toString())
}