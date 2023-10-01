### **Object-Oriented Programming (OOP) in Kotlin:**
#### **1. Classes and Objects:**
   - **Defining Classes:**
   ```kotlin
   class Car(val make: String, val model: String) {
       fun display() = println("Car: $make $model")
   }
   ```
   - **Creating Objects:**
   ```kotlin
   val car = Car("Toyota", "Camry")
   car.display() // Output: Car: Toyota Camry
   ```

#### **2. Inheritance:**
   - **Open Class (Base Class):**
   ```kotlin
   open class Animal(val name: String) {
       open fun sound() = println("$name makes a sound")
   }
   ```
   - **Derived Class:**
   ```kotlin
   class Dog(name: String) : Animal(name) {
       override fun sound() = println("$name barks")
   }
   ```
   - **Usage:**
   ```kotlin
   val dog = Dog("Buddy")
   dog.sound() // Output: Buddy barks
   ```

#### **3. Interface:**
   - **Defining Interface:**
   ```kotlin
   interface Drivable {
       fun drive()
   }
   ```
   - **Implementing Interface:**
   ```kotlin
   class Bike : Drivable {
       override fun drive() = println("Bike is being driven")
   }
   ```

### **Exception Handling in Kotlin:**
   - **Try-Catch Block:**
   ```kotlin
   try {
       val result = 10 / 0
   } catch (e: ArithmeticException) {
       println(e.message) // Output: / by zero
   } finally {
       println("Finally Block Executed")
   }
   ```

### **Data Classes:**
   - **Defining a Data Class:**
   ```kotlin
   data class Book(val title: String, val author: String)
   ```
   - **Creating and Using Data Class Objects:**
   ```kotlin
   val book = Book("1984", "George Orwell")
   println(book) // Output: Book(title=1984, author=George Orwell)
   ```

### **Collections and Lambdas:**
   - **Collections:**
   ```kotlin
   val list = listOf(1, 2, 3, 4, 5)
   val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")
   ```
   - **Lambdas:**
   ```kotlin
   val doubled = list.map { it * 2 }
   val even = list.filter { it % 2 == 0 }
   ```

### **Scope Functions:**
   - **`let`, `run`, `with`, `apply`, `also`:**
   ```kotlin
   data class Person(var name: String, var age: Int)

   val person = Person("John", 25).apply {
       age = 30
   }.also {
       println(it.age) // Output: 30
   }
   ```

### **Extension Functions:**
   - **Creating an Extension Function:**
   ```kotlin
   fun String.shout() = this.uppercase() + "!!!"

   println("hello".shout()) // Output: HELLO!!!
   ```

### **Coroutines:**
   - **Launching a Coroutine:**
   ```kotlin
   import kotlinx.coroutines.*

   fun main() = runBlocking {
       launch {
           delay(1000L)
           println("World!")
       }
       print("Hello, ")
   }
   // Output: Hello, World!
