package Idioms

abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}

fun instantiateAnAbstractClass() {
    val myObject = object : MyAbstractClass() {
        override fun doSomething() {
            println("doSomething")
        }

        override fun sleep() {
            println("sleep")
        }
    }

    myObject.doSomething()
    myObject.sleep()
}