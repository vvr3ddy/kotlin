import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    val num = read.nextInt()
    val res = if(num%2==0) "Even" else "Odd"
    println("Entered num $num is : $res ")

}
