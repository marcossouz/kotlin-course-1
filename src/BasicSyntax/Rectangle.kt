package BasicSyntax

//class Rectangle(val height: Double, val length: Double) {
//    val perimeter = (height + length) * 2
//}


// Inheritance between classes is declared by a colon (:). Classes are final by default; to make a class inheritable, mark it as open

class Rectangle(val height: Double, val length: Double): Shape() {
    val perimeter = (height + length) * 2
}