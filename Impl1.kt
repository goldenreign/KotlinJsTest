package Impl1

import kotlin.collections.ArrayList
@JsModule("bn.js")
external class BN {
    constructor(number: Number, base: Number = definedExternally, endian: String = definedExternally)
    fun iadd(num: BN)
    fun add(num: BN): BN
}

val arrLength = 3000000

// bn.js, array of Ints and loop
fun Impl1() {
    println("Hello Kotlin!")
    val arr = ArrayList<Int>()
    for (i in 1..arrLength-1) {
        arr.add(i)
    }
    println("Array filled")
    var sum = BN(0)
    for (a in arr) {
        sum.iadd(BN(a))
    }
    println("Sum = ${sum}")
}
