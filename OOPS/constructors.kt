/*
// Copyrights (C) VVR 2020.
// Learning Kotlin by Programming OTG
// File Name           : OOPS/constructors.kt
// Author              : Vishnuvardhan Reddy
// Description of File : This program explains the usage of constructors in Kotlin.
			 Kotlin comprises of two types of constructors :
				1. Primary Constructor (a part of the class header)
				2. Secondary Constructor (used to initialize additional properties)
*/

class MyClass(val firstName : String, var age : Int){ // Primary constructor 
		//empty class
}

fun main(args : Array<String>){
    val myObj  = MyClass("VVR", 20)  // initialize the properties firstName and age
                                                   // note that firstName is immutable while age is mutable
    println("First Name : ${myObj.firstName}, Age : ${myObj.age}")
}
