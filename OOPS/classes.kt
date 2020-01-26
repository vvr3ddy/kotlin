/*
// Copyrights (C) VVR 2020.
// Learning Kotlin by Programming OTG
// File Name           : OOPS/classes.kt
// Author              : Vishnuvardhan Reddy
// Description of File : This program explains the concept of Classes and Objects in Kotlin.
                         We start the OOPS part of Kotlin from this program onwards.
                         
*/

class MyClass{
    private var x:Int = 0

    fun setInt() {
        println("Enter the value of X :")
        x = Integer.valueOf(readLine())
    }

    fun showInt(){
        println("The value of X is : $x")
    }
}

fun main(args : Array<String>){
    val myObj  = MyClass()
    myObj.setInt()
    myObj.showInt()
}
