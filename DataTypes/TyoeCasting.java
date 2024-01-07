public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit type casting (Widening or Automatic)
        int myInt = 100;
        long myLong = myInt; // Implicit casting from int to long
        float myFloat = myLong; // Implicit casting from long to float
        double myDouble = myFloat; // Implicit casting from float to double

        // Displaying values after implicit casting
        System.out.println("Implicit Casting:");
        System.out.println("Int to Long: " + myLong); // Int to Long: 100
        System.out.println("Long to Float: " + myFloat); // Long to Float: 100.0
        System.out.println("Float to Double: " + myDouble); // Float to Double: 100.0

        // Explicit type casting (Narrowing or Manual)
        double myDouble2 = 1234.567;
        float myFloat2 = (float) myDouble2; // Explicit casting from double to float
        long myLong2 = (long) myFloat2; // Explicit casting from float to long
        int myInt2 = (int) myLong2; // Explicit casting from long to int

        // Displaying values after explicit casting
        System.out.println("\nExplicit Casting:");
        System.out.println("Double to Float: " + myFloat2); // Double to Float: 1234.567
        System.out.println("Float to Long: " + myLong2); // Float to Long: 1234
        System.out.println("Long to Int: " + myInt2); // Long to Int: 1234
    }
}
