### **1. Object-Oriented Programming (OOP) in Kotlin:**

1. **Exercise 1.1:** Create a class `Circle` with a property `radius`. Add a method to calculate the area of the circle.
2. **Exercise 1.2:** Create a base class `Shape` with an abstract method `area()`. Create two derived classes `Rectangle` and `Triangle` implementing the `area()` method.
3. **Exercise 1.3:** Implement an interface `Perimeter` with a method `calculatePerimeter()`. Let `Rectangle` and `Triangle` implement this interface.
4. **Exercise 1.4:** Create a class `Square` inheriting from `Rectangle`. Override the `calculatePerimeter()` method appropriately.
5. **Exercise 1.5:** Implement polymorphism by creating an array of `Shape` and call the `area()` method on each element, observing the output.

### **2. Exception Handling in Kotlin:**

1. **Exercise 2.1:** Write a program to handle `NumberFormatException` when converting a string to an integer using `toInt()`.
2. **Exercise 2.2:** Create a custom exception `InvalidAgeException` and throw it if the age entered by the user is less than 18.
3. **Exercise 2.3:** Write a program that handles multiple exceptions when performing arithmetic operations.
4. **Exercise 2.4:** Create a `try-catch-finally` block to read from a file and handle `FileNotFoundException`. Use the `finally` block to close the file.
5. **Exercise 2.5:** Implement a program to rethrow an exception after logging it.

### **3. Data Classes:**

1. **Exercise 3.1:** Create a data class `Student` with properties `name` and `rollNo` and print its object.
2. **Exercise 3.2:** Implement `copy()` method for the `Student` data class to create a new object with modified properties.
3. **Exercise 3.3:** Overload component functions for the `Student` class and destructure its object.
4. **Exercise 3.4:** Create a list of `Student` objects and use the `any` and `all` functions to perform checks on the list.
5. **Exercise 3.5:** Implement a `compareTo` method in the `Student` class to compare students based on their `rollNo`.

### **4. Collections, Lambdas, and Scope Functions:**

1. **Exercise 4.1:** Create a mutable list and perform add, update, and remove operations using lambdas.
2. **Exercise 4.2:** Given a map of `name` to `age`, filter out entries where `age` is less than 18.
3. **Exercise 4.3:** Create a list of numbers and use scope functions to find the sum of squares of all even numbers.
4. **Exercise 4.4:** Use `with` and `run` scope functions to modify properties of an object and perform computations.
5. **Exercise 4.5:** Create a sequence from a collection and perform terminal operations using lambdas.

### **5. Extension Functions and Coroutines:**

1. **Exercise 5.1:** Create an extension function for `List<Int>` to find the average of all the elements in the list.
2. **Exercise 5.2:** Implement an extension function to reverse the words in a `String`.
3. **Exercise 5.3:** Create a simple coroutine to print “Hello” and “World” with a delay of 1 second between them.
4. **Exercise 5.4:** Launch multiple coroutines in parallel and observe their execution.
5. **Exercise 5.5:** Implement a coroutine to fetch data from a network call (use a dummy API or mock) and update the UI (print to console) with the fetched data.
