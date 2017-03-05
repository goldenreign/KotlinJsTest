package Impl3

import kotlin.collections.ArrayList
@JsModule("big.js")
external val Big: dynamic

val arrLength = 3000000

// big.js, array of Ints and loop
fun Impl3()
{
    println("Hello Kotlin!")
    val arr = ArrayList<Int>()
    for (i in 1..arrLength-1) {
        arr.add(i)
    }
    println("Array filled")
    var sum = Big(0)
    for (a in arr) {
        sum = sum.plus(a)
    }
    println("Sum = ${sum}")
}
