package Impl2

import kotlin.collections.ArrayList
@JsModule("bn.js")
external class BN {
    constructor(number: Number, base: Number = definedExternally, endian: String = definedExternally)
    fun iadd(num: BN)
    fun add(num: BN): BN
}

val arrLength = 3000000

// bn.js, array of BNs and reduce
fun Impl2() {
    println("Hello Kotlin!")
    val arr = ArrayList<BN>()
    for (i in 1..arrLength-1) {
        arr.add(BN(i))
    }
    println("Array filled")
    var sum = arr.reduce { x, y -> x.add(y) }
    println("Sum = ${sum}")
}
