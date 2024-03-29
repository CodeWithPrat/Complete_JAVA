# Java Data Types

In Java, data types are classified into two categories: **primitive data types** and **reference data types**. Data types specify the size and type of values that can be stored in variables.

### Primitive Data Types:

1. **Numeric Data Types:**
   - `byte`: 1 byte, stores integers in the range -128 to 127.
   - `short`: 2 bytes, stores integers in the range -32,768 to 32,767.
   - `int`: 4 bytes, stores integers in the range -2^31 to 2^31-1.
   - `long`: 8 bytes, stores integers in the range -2^63 to 2^63-1.
   - `float`: 4 bytes, stores floating-point numbers.
   - `double`: 8 bytes, stores floating-point numbers.

2. **Other Primitive Data Types:**
   - `char`: 2 bytes, stores a single character (Unicode character set).
   - `boolean`: 1 bit, stores true or false values.

### Reference Data Types:

1. **Class Types:**
   - User-defined classes and objects.

2. **Array Types:**
   - `Arrays`: A collection of elements of the same data type or objects.

3. **Interface Types:**
   - `Interfaces`: Defines a set of methods that a class must implement.

4. **Enumeration Types:**
   - `Enum`: A special data type that consists of a set of predefined constants.

5. **Other Reference Types:**
   - `String`: Represents a sequence of characters.
   - `Wrapper Classes` (e.g., `Integer`, `Double`, `Boolean`): Provide a way to use primitive data types as objects.
   - `Null Type`: Represents a reference that doesn't refer to any object.

### Example Code:
```java
public class DataTypesExample {
    public static void main(String[] args) {
        // Example of using different data types in Java
        byte myByte = 100;
        short myShort = 32000;
        int myInt = 2000000000;
        long myLong = 9223372036854775807L;
        float myFloat = 3.14f;
        double myDouble = 2.71828;
        char myChar = 'A';
        boolean myBoolean = true;

        // Displaying values
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Integer: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);
    }
}

```
# Rules for Creating Identifiers in Java

Identifiers are names given to variables, methods, classes, packages, and other elements in Java. They play a crucial role in programming, and there are specific rules that must be followed when creating identifiers.

### Rules for Identifiers:

1. **Valid Characters:** 
   - Identifiers can include letters (A-Z or a-z), digits (0-9), dollar signs ($), and underscore (_) characters.
   - The first character of an identifier cannot be a digit.

2. **Case Sensitivity:** 
   - Java is case-sensitive, meaning uppercase and lowercase letters are distinct. For instance, `myVariable` and `MyVariable` are treated as different identifiers.

3. **Keywords:** 
   - Identifiers cannot be Java keywords or reserved words. Avoid using reserved words like `int`, `class`, `if`, etc., as identifiers.

4. **Length:** 
   - There is no limit to the length of an identifier, but it's recommended to keep them concise and meaningful for readability.

5. **Naming Conventions:** 
   - Use meaningful names that describe the purpose of the variable, method, or class.
   - For variables and methods, use camelCase convention (e.g., `myVariable`, `calculateInterest()`).
   - For classes, use PascalCase convention (e.g., `MyClass`, `CustomerDetails`).

6. **Package Names:** 
   - Use lowercase letters for package names (e.g., `com.example.project`).
   - Avoid using underscore (_) in package names.

### Example:
```java
public class IdentifiersExample {
    public static void main(String[] args) {
        int myVariable = 10; // Valid identifier
        double $amount = 100.5; // Valid identifier
        String my_Name = "John"; // Valid identifier but discouraged (prefer camelCase)
        // int 123number = 123; // Invalid - Starts with a digit (not allowed)
        // double class = 4.5; // Invalid - Uses a reserved word as an identifier
    }
}
```

# Understanding Type Casting in Java

This Java program demonstrates the concept of type casting, which involves converting one data type into another. In Java, type casting can be categorized into implicit (widening) and explicit (narrowing) casting.

### Implicit (Widening) Casting:

- **Implicit casting** occurs automatically when a smaller data type is converted into a larger data type. This happens when there is no loss of information in the conversion.

    ```java
    int myInt = 100;
    long myLong = myInt; // Implicit casting from int to long
    float myFloat = myLong; // Implicit casting from long to float
    double myDouble = myFloat; // Implicit casting from float to double
    ```

    **Output after implicit casting:**
    - Int to Long: 100
    - Long to Float: 100.0
    - Float to Double: 100.0

### Explicit (Narrowing) Casting:

- **Explicit casting** is performed manually when converting from a larger data type to a smaller one. This conversion may result in data loss if the value being converted is too large for the target data type.

    ```java
    double myDouble2 = 1234.567;
    float myFloat2 = (float) myDouble2; // Explicit casting from double to float
    long myLong2 = (long) myFloat2; // Explicit casting from float to long
    int myInt2 = (int) myLong2; // Explicit casting from long to int
    ```

    **Output after explicit casting:**
    - Double to Float: 1234.567
    - Float to Long: 1234
    - Long to Int: 1234

This README provides an example showcasing both implicit and explicit type casting in Java, highlighting how data types can be converted from one type to another in different scenarios.
