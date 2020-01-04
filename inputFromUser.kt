//Copyrights VVR
import java.util.Scanner
fun main(args : Array<String>) {
    // Make an object of Scanner to read inputs
    val read = Scanner(System.`in`)


    println("Enter an integer")
    val int1 = read.nextInt()

    println("Enter a Float value")
    val float1 = read.nextFloat()

    println("Enter a byte")
    val char1 =  read.nextByte()

    println("The value of integer is "+int1)
    println("The value of float is "+float1)
    println("The value of Byte is "+char1)
}
