/**
 * Copyrights (C) VVR 2020.
 * Learning Kotlin by Programming OTG
 * File Name           : secondaryConstructor.kt
 * Author              : Vishnuvardhan Reddy
 * Description         : This file describes the working of constructors in Kotlin.
 *                       It specifically points at the working of and implementation
 *                       of secondary constructors.
 *
 */

//class must be open to be able to inherit its properties
open class MyClass{
    var age : Int = 0
    var name : String = ""

    constructor(_pName : String){}

    constructor(_pName : String, _pAge : Int){
        name = _pName
        age = _pAge
        println("$name : $age years old")
    }

}

//child class
class MyClass2: MyClass{
    constructor(_cName : String) : this("From Parent Class" + _cName, 10){

    }
    constructor(_cName : String, _cAge : Int ) : super(_cName, _cAge){

    }
}

//main function
fun main(args: Array<String>){

    val p1 =  MyClass2("VVR", 20)
}
