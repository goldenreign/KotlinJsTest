import Impl1.Impl1
import Impl2.Impl2
import Impl3.Impl3
import Impl4.Impl4

external val process: dynamic // Define Node.js 'process' object

// Note that command line arguments do not work (yet)
fun main(args: Array<String>)
{
    val argv: Array<String> = process.argv
    if (argv.size == 3) {
        when (try { argv[2].toInt() } catch(e: Exception) { 0 }) {
            1 -> Impl1()
            2 -> Impl2()
            3 -> Impl3()
            4 -> Impl4()
            else -> {
                println("No such test")
            }
        }
    }
    else {
        println("Wrong args: ${argv}")
        println("Usage: ${argv[0]} ${argv[1]} <TestIndex>")
    }
}
