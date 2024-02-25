package BasicSyntax

fun typesChecks() {
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            return obj.length
        }

        // `obj` is still of type `Any` outside of the type-checked branch
        return null
    }

    println("-------- Types Checks --------")
    println(getStringLength(3))
    println(getStringLength("Marcos Souza"))

    fun getStringLength2(obj: Any): Int? {
        if (obj !is String) return null

        // `obj` is automatically cast to `String` in this branch
        return obj.length

    }

    println("-------- Types Checks 2 --------")
    println(getStringLength2(3))
    println(getStringLength2("Marcos Souza"))

    fun getStringLength3(obj: Any): Int? {
        // `obj` is automatically cast to `String` on the right-hand side of `&&`
        if (obj is String && obj.length > 0) {
            return obj.length
        }

        return null
    }

    println("-------- Types Checks 3 --------")
    println(getStringLength3(3))
    println(getStringLength3("Marcos Souza"))


}