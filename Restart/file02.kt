import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    var count = 0
    val size = read.nextInt()
    val scores = IntArray(size) { read.nextInt() }
    scores.forEach { if (it > 35) count++ }
    println(count)

}
