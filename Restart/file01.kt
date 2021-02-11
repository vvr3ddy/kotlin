import java.util.*;

fun main() {
    val read = Scanner(System.`in`)
    var x = read.nextInt()
    var y = read.nextInt()

    x += y
    y = x - y
    x -= y
    println(x)
    println(y)
}
