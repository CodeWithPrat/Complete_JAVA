public class DataTypesExample {
    public static void main(String[] args) {
        // Numeric Data Types
        byte myByte = 100;                // Byte type (1 byte)
        short myShort = 32000;            // Short type (2 bytes)
        int myInt = 2000000000;           // Integer type (4 bytes)
        long myLong = 9223372036854775807L; // Long type (8 bytes)
        float myFloat = 3.14f;            // Float type (4 bytes)
        double myDouble = 2.71828;        // Double type (8 bytes)

        // Other Primitive Data Types
        char myChar = 'A';                // Character type (2 bytes)
        boolean myBoolean = true;         // Boolean type (1 bit)

        // Displaying Values
        System.out.println("Byte: " + myByte); // Byte: 100
        System.out.println("Short: " + myShort); // Short: 32000
        System.out.println("Integer: " + myInt); // Integer: 2000000000
        System.out.println("Long: " + myLong); // Long: 9223372036854775807
        System.out.println("Float: " + myFloat); // Float: 3.14
        System.out.println("Double: " + myDouble); // Double: 2.71828
        System.out.println("Character: " + myChar); // Character: A
        System.out.println("Boolean: " + myBoolean); // Boolean: true

        // Primitive Data Types - With Minimum and Maximum Values
        System.out.println("Byte Minimum Value: " + Byte.MIN_VALUE); // Byte Minimum Value: -128
        System.out.println("Byte Maximum Value: " + Byte.MAX_VALUE); // Byte Maximum Value: 127
        System.out.println("Short Minimum Value: " + Short.MIN_VALUE); // Short Minimum Value: -32768
        System.out.println("Short Maximum Value: " + Short.MAX_VALUE); // Short Maximum Value: 32767
        System.out.println("Integer Minimum Value: " + Integer.MIN_VALUE); // Integer Minimum Value: -2147483648
        System.out.println("Integer Maximum Value: " + Integer.MAX_VALUE); // Integer Maximum Value: 2147483647
        System.out.println("Long Minimum Value: " + Long.MIN_VALUE); // Long Minimum Value: -9223372036854775808
        System.out.println("Long Maximum Value: " + Long.MAX_VALUE); // Long Maximum Value: 9223372036854775807
        System.out.println("Float Minimum Value: " + Float.MIN_VALUE); // Float Minimum Value: 1.4E-45
        System.out.println("Float Maximum Value: " + Float.MAX_VALUE); // Float Maximum Value: 3.4028235E38
        System.out.println("Double Minimum Value: " + Double.MIN_VALUE); // Double Minimum Value: 4.9E-324
        System.out.println("Double Maximum Value: " + Double.MAX_VALUE); // Double Maximum Value: 1.7976931348623157E308
        System.out.println("Character Minimum Value: " + (int) Character.MIN_VALUE); // Character Minimum Value: 0
        System.out.println("Character Maximum Value: " + (int) Character.MAX_VALUE); // Character Maximum Value: 65535

      // Non-Primitive Data Type (String)
        String text = "Hello, World!";      // String type
    }
}

