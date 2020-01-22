/*
// Copyrights (C) VVR 2020.
// Learning Kotlin by Programming OTG
// File Name           : loops.kt
// Author              : Vishnuvardhan Reddy
// Description of File : This program explains the usage of control loops available
                         in Kotlin and their usage.
*/

fun main(args : Array<String>){


    // demonstrate a for loop
    println("This is a Demo for a for loop")

    for (i in 0 .. 10){
        println("The current iteration of for loop is : $i")
    }

    // demonstrate a while loop
    println("This is a demo for a while loop")
    var i : Int = 0   // use var instead of val because val cannot be updated while var can be updated
    while(i<10){
        println("Control will exit out of while loop after $i th iteration")
        i++
    }

    // more practical usage of strings with for loop
    var char : String = "Hello World " +
            "This is a Kotlin String"
    for(i in char){
        println("$i")
    }

    // usage of for loop with an array of values
    // initialize an array using constructor
    var arr =  Array(5, {i -> i*i})
    for (i in 0 .. arr.size-1){
            println("Square of $i is $arr[i]")
    }
}
