import kotlin.collections.ArrayList
@JsModule("bn.js")
external class BN {
    constructor(number: Number, base: Number = definedExternally, endian: String = definedExternally)
    fun iadd(num: BN)
    fun add(num: BN): BN
}

val arrLength = 3000000

fun main(args : Array<String>)
{
    println("Hello Kotlin!")
    println(BN(10).toString());
    val arr = ArrayList<Int>()
    // val arr = ArrayList<BN>()
    for (i in 1..arrLength-1) {
        arr.add(i)
        // arr.add(BN(i))
    }
    println("Array filled")
    // 3
    // var sum = arr.reduce { x, y -> x.add(y) }
    // 4
    var sum = BN(0)
    for (a in arr) {
        sum.iadd(BN(a))
        // sum = sum.add(BN(a))
    }
    println("Sum = ${sum}")
}

// import kotlin.collections.ArrayList
// @JsModule("big.js")
// external val Big: dynamic

// val arrLength = 3000000

// fun main(args : Array<String>)
// {
//     println("Hello Kotlin!")
//     println(Big(10).toString());
//     val arr = ArrayList<Int>()
//     for (i in 1..arrLength-1) {
//         arr.add(i)
//     }
//     println("Array filled")
//     // 1
//     // var sum = arr.reduce { x, y -> Big(x).plus(y) }
//     // 2
//     var sum = Big(0)
//     for (a in arr) {
//         sum = sum.plus(a)
//     }
//     println("Sum = ${sum}")
// }
