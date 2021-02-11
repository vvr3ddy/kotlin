import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    var num = read.nextInt()
    var count = 0
    while (num > 0) {
        num /= 10
        count++
    }
    println("No. of Digits in Number is $count")
}
