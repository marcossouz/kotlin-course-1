package Idioms

import java.util.*

fun String.spaceToCamelCase(): String {
    var s = this.split(" ")
    var ss = ""
    for (word in s) {
        ss += word.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }
    return ss
}
