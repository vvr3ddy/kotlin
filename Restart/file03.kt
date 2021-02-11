import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    var cP = 0
    var cN = 0
    val size = read.nextInt()
    val numbers = IntArray(size) { read.nextInt() }
    numbers.forEach {
        if (it > 0) cP++
        else cN++
    }
    println("Count of Pos Numbers = $cP \nCount of Neg Numbers = $cN")

}
