/*
// Copyrights (C) VVR 2020.
// Learning Kotlin by Programming OTG
// File Name           : factorial.kt
// Author              : Vishnuvardhan Reddy
// Description of File : This program explains the usage of recursive functions.
                         Here we write the code for the working of a factorial program.
                         If the number is a negative integer, return -1 to the variable.
                         Else Check for various possibilities.
                         
*/


fun main (args : Array<String>){

    println("Enter a non negative number :")
    val number : Int = Integer.valueOf(readLine())
    val factorial : Int = factor(number)
    if(factorial == -1){
        println("Enter a positive Number")
    }
    else
    println("The Factorial of $number is $factorial")
}

fun factor(num : Int): Int{

    if(num>0) {
        if (num == 0) {
            return 1
        }
        if (num == 1) {
            return num
        } else
            return num * factor(num - 1)
    }
    else return -1
}
