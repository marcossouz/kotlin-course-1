package Idioms
class Foo {
    val name = "foo"
}

class Bar {
    val name = "Bar"
}

fun instanceChecks() {

    fun checks(o: Any) {
        when (o) {
            is Foo -> println("is Foo")
            is Bar -> println("is Bar")
            else   -> println("Not Found")
        }
    }

    checks(Foo())
    checks(Bar())
}
