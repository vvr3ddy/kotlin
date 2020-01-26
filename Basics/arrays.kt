import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*



fun main(args: Array<String>){
    val n : Int=(readLine()!!.toInt())
    val arrayStr = readLine()!!.split(' ') // dont care about the type of nullability
    for (i in arrayStr.size -1 downTo 0){
        print("${arrayStr[i]} ")
    }
}
