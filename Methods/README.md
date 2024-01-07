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

