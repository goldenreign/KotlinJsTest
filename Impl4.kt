package Impl4

import kotlin.collections.ArrayList
@JsModule("big.js")
external val Big: dynamic

val arrLength = 3000000

// big.js, array of Ints and reduce
fun Impl4()
{
    println("Hello Kotlin!")
    val arr = ArrayList<Int>()
    for (i in 1..arrLength-1) {
        arr.add(i)
    }
    println("Array filled")
    var sum = arr.reduce { x, y -> Big(x).plus(y) }
    println("Sum = ${sum}")
}
