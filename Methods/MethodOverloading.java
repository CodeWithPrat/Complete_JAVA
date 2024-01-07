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

    public static void main(String[] args) {
        Calculation calc = new Calculation();

        // Invoking the add method with two integers
        int sum1 = calc.add(5, 7);
        System.out.println("Sum of two integers: " + sum1);

        // Invoking the add method with three integers
        int sum2 = calc.add(10, 20, 30);
        System.out.println("Sum of three integers: " + sum2);

        // Invoking the add method with two strings
        String concatenatedString = calc.add("Hello", "World");
        System.out.println("Concatenated string: " + concatenatedString);
    }
}
