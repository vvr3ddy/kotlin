import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    var rem: Int
    var count: Int
    val size = read.nextInt()
    val numbers = IntArray(size) { read.nextInt() }
    numbers.forEach {
        count = 1
        rem = 1
        while (rem > 0) {
            count++
            rem = it % count
        }
        val prime = if (count == it) "Prime" else "Not Prime"
        if (prime == "Prime")
            println("$it is $prime")
        else
            println("Smallest divisor of $it is $count")
    }
}
