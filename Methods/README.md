# Understanding Different Types of Methods in Java

This Java code example demonstrates various types of methods used in Java programming. The code defines a `MethodTypesExample` class showcasing different method types and their functionalities.

### Types of Methods Covered:

1. **Static Method:**
   - Defined using the `static` keyword.
   - Belongs to the class rather than an instance of the class.
   - Example: `static void staticMethod()`

2. **Instance Method:**
   - Associated with objects of the class.
   - Not declared as `static`.
   - Example: `void instanceMethod()`

3. **Void Method:**
   - Does not return any value.
   - Declared using the `void` keyword.
   - Example: `void voidMethod()`

4. **Non-Void Method:**
   - Returns a specific data type value.
   - Example: `int nonVoidMethod()`

5. **Parameterized Method:**
   - Accepts parameters or arguments.
   - Parameters are declared within parentheses after the method name.
   - Example: `void parameterizedMethod(int num)`

### Code Explanation:

The `MethodTypesExample` class contains methods representing each type:

- `staticMethod()` showcases a static method that can be accessed without creating an object of the class.
- `instanceMethod()` demonstrates an instance method associated with class objects.
- `voidMethod()` illustrates a method without returning any value.
- `nonVoidMethod()` returns an integer value.
- `parameterizedMethod(int num)` accepts and utilizes a parameter.

The `main` method serves as the entry point, showcasing the invocation of each method type and printing the expected outputs to the console.

### Example Code:

```java
public class MethodTypesExample {

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    // Void method (does not return a value)
    void voidMethod() {
        System.out.println("This is a void method.");
    }

    // Non-void method (returns an integer)
    int nonVoidMethod() {
        System.out.println("This is a non-void method returning an integer.");
        return 10;
    }

    // Parameterized method
    void parameterizedMethod(int num) {
        System.out.println("This is a parameterized method with value: " + num);
    }

    public static void main(String[] args) {
        MethodTypesExample obj = new MethodTypesExample();

        staticMethod(); // Expected output: This is a static method.
        obj.instanceMethod(); // Expected output: This is an instance method.
        obj.voidMethod(); // Expected output: This is a void method.

        int result = obj.nonVoidMethod();
        System.out.println("Returned value from non-void method: " + result); // Expected output: Returned value from non-void method: 10

        obj.parameterizedMethod(5); // Expected output: This is a parameterized method with value: 5
    }
}
```
# Understanding Static and Non-Static Methods in Java

Java supports both static and non-static methods, each having distinct characteristics and purposes.

| Characteristics       | Static Methods                      | Non-Static Methods (Instance Methods)  |
|-----------------------|-------------------------------------|---------------------------------------|
| Declaration           | Declared using the `static` keyword. | Not declared as `static`.              |
| Invocation            | Accessed using the class name directly. | Accessed using an object of the class. |
| Belongs to            | Belongs to the class itself.         | Associated with instances (objects) of the class. |
| Access to Members     | Can access only static members directly. | Can access both static and non-static members directly. |
| Usage                 | Used for utility methods, common functionality, or operations not dependent on instance-specific data. | Used for manipulating instance-specific data or performing operations unique to each instance. |
| Memory Allocation     | Allocated memory once at class loading. | Allocated memory for each object created from the class. |
| Lifetime              | Exists throughout program execution. | Exists as long as the object exists and is eligible for garbage collection when no longer referenced. |

This table provides a comprehensive comparison between static and non-static methods in Java, highlighting their differences in declaration, invocation, association, access to members, usage, memory allocation, and lifetime. Understanding these differences is crucial for effective utilization of methods in Java programming.

# Method Overloading in Java

Method overloading is a feature in Java that allows the creation of multiple methods within the same class, sharing the same name but differing in their parameter lists. This enables methods to perform different tasks based on the arguments passed to them.

### Key Characteristics of Method Overloading:

1. **Same Method Name:**
   - Overloaded methods share the same name within the class.
   - The method signature includes the method name and parameter list.

2. **Different Parameters:**
   - Overloaded methods have different parameter lists, differing in the number or types of parameters.

3. **Return Type:**
   - The return type of the method may or may not be the same. Method overloading is solely dependent on the method signature, not the return type.

4. **Compile-Time Polymorphism:**
   - The decision about which overloaded method to call is made by the compiler based on the arguments passed at compile time.

### Benefits of Method Overloading:

1. **Improved Code Readability:**
   - Grouping similar functionalities under the same method name enhances code readability and organization. Developers can easily identify related functionalities within the codebase.

2. **Avoidance of Complex Naming:**
   - Eliminates the need for cryptic method names to differentiate functionalities. Instead of creating numerous methods with slightly different names, overloading allows similar operations to be consolidated under a single, descriptive method name.

3. **Flexibility in Design:**
   - Allows for different parameter variations for similar operations. This flexibility provides convenience when dealing with methods that perform similar tasks but on different data types or with varying numbers of arguments.

### Example:

```java
public class Calculation {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + " " + b;
    }
}
```
# Rules for Method Overloading in Java

Method overloading is a feature in Java that allows the creation of multiple methods in the same class with the same name but different parameters. These methods perform similar tasks but can accept different inputs, offering flexibility and enhancing code readability.

### Rules for Method Overloading:

1. **Method Signature:**
   - Method overloading is determined by the method signature, which includes the method name and parameter list.
   - Two methods with the same name but different parameters (number, type, or order) can be overloaded.

2. **Parameters:**
   - Overloaded methods must differ in the number or type of parameters.
   - Differences in parameters include changes in the number of parameters, their types, or their order.

3. **Return Type:**
   - Overloaded methods can have the same or different return types.
   - Overloading is not affected by changes in the return type alone.

4. **Exception Handling:**
   - Overloaded methods can throw different exceptions.
   - Changing the type or number of exceptions thrown does not affect method overloading.

5. **Access Modifiers and Non-Access Modifiers:**
   - Method overloading is not affected by changes in access modifiers (public, private, protected) or non-access modifiers (static, final, abstract).

6. **Varargs and Overloading:**
   - Methods with variable-length arguments (varargs) can be overloaded with methods having explicitly defined parameters.
   - However, overloading methods with varargs and array parameters can lead to ambiguity.

### Example of Method Overloading:

```java
public class Calculation {

    // Overloaded methods to add integers
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded methods to concatenate strings
    public String add(String a, String b) {
        return a + " " + b;
    }
}
