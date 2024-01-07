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

