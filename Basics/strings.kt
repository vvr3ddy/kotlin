/*
// Copyrights (C) VVR 2020.
// Learning Kotlin by Programming OTG
// File Name           : strings.kt
// Author              : Vishnuvardhan Reddy
// Description of File : This program explains the usage of strings and methods for string comparision.
*/

fun main(args : Array<String>){
      var str1 = "Hello World"
      var str2 = "hello World"
      var stra = "Hello"
      var strb = "World"
      var str3 = str1 + " " + str2
      
      println("\n String 1 : ${str1}")
      println("\n String 2 : ${str2}")
      println("\n String a : ${stra}")
      println("\n String b : ${strb}")
      println("\n String 3 : ${str3}")
      println("\n String comparision between 1 and 2 : ${str1.equals(str2)}")
      println("\n String comparision between 1 and 3 : ${str1.compareTo(str3)}")
}
