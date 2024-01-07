public class OperatorExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 4;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        // Increment and Decrement Operators
        int num = 5;
        num++;
        System.out.println("Increment: " + num);
        num--;
        System.out.println("Decrement: " + num);

        // Relational Operators
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean greaterThan = a > b;
        boolean lessThan = a < b;
        boolean greaterThanOrEqual = a >= b;
        boolean lessThanOrEqual = a <= b;
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Greater Than: " + greaterThan);
        System.out.println("Less Than: " + lessThan);
        System.out.println("Greater Than or Equal: " + greaterThanOrEqual);
        System.out.println("Less Than or Equal: " + lessThanOrEqual);

        // Logical Operators
        boolean x = true, y = false;
        boolean logicalAnd = x && y;
        boolean logicalOr = x || y;
        boolean logicalNot = !x;
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);

        // Bitwise Operators
        int m = 5, n = 3;
        int bitwiseAnd = m & n;
        int bitwiseOr = m | n;
        int bitwiseXor = m ^ n;
        int bitwiseComplement = ~m;
        int leftShift = m << 1;
        int rightShift = m >> 1;
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise Complement: " + bitwiseComplement);
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);

        // Ternary Operator
        int p = 10, q = 20;
        int result = (p > q) ? p : q;
        System.out.println("Ternary Operator: " + result);
    }
}
/*
Arithmetic Operators (+, -, *, /, %)
Increment (++) and Decrement (--)
Relational Operators (==, !=, >, <, >=, <=)
Logical Operators (&&, ||, !)
Bitwise Operators (&, |, ^, ~, <<, >>)
Ternary Operator (? :)
*/
