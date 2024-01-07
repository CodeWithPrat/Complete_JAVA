# Understanding Control Constructs in Java

Control constructs in Java are essential for controlling the flow of program execution. They enable developers to make decisions, iterate through code, and execute specific blocks based on conditions. This README provides an overview of various control structures available in Java along with examples.

### Control Structures Covered:

1. **If-Else Statement:**
   - Enables conditional execution based on a given condition.

2. **Switch Statement:**
   - Provides multi-branch selection based on a variable's value.

3. **Loops:**
   - **For Loop:** Executes a block of code repeatedly for a fixed number of times.
   - **While Loop:** Repeats a block of code while a specified condition is true.
   - **Do-While Loop:** Similar to a while loop but ensures that the code block executes at least once.

4. **Conditional Operator (Ternary Operator):**
   - An expression that evaluates a condition and returns one of two values depending on the result.

### Example Code:
```java
public class ControlConstructsExample {
    public static void main(String[] args) {
        // if-else statement
        int num = 20;
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
// switch statement
        int day = 4;
        String dayString;
        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            default:
                dayString = "Weekend";
        }
        System.out.println("Today is " + dayString);

        // for loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop
        int count = 0;
        System.out.println("Counting from 5 to 1:");
        while (count < 5) {
            System.out.print((5 - count) + " ");
            count++;
        }
        System.out.println();

        // do-while loop
        int num2 = 5;
        System.out.println("Counting from 1 to " + num2 + " using do-while loop:");
        do {
            System.out.print(num2 + " ");
            num2--;
        } while (num2 > 0);
        System.out.println();

        // Conditional Operator (Ternary Operator)
        int x = 10, y = 20;
        int max = (x > y) ? x : y;
        System.out.println("Maximum value between " + x + " and " + y + " is: " + max);
    
    }
}
```
# Jumping Control Constructs in Java

Jumping control constructs in Java alter the flow of a program by transferring control to another part of the code. They include the `break`, `continue`, and `return` statements.

### Control Constructs Covered:

1. **Break Statement:**
   - Used to terminate the loop or switch statement it is in.
   - In loops, it exits the loop entirely when encountered.

2. **Continue Statement:**
   - Skips the remaining code in the loop and moves to the next iteration.

3. **Return Statement:**
   - Exits from a method, optionally returning a value.

### Example Code:
```java
public class JumpingControlConstructsExample {
    public static void main(String[] args) {
        // Break Statement
        System.out.println("Example using Break Statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Terminates the loop when i becomes 3
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Continue Statement
        System.out.println("\nExample using Continue Statement:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue; // Skips printing 3 and moves to the next iteration
            }
            System.out.print(j + " ");
        }
        System.out.println();

        // Return Statement (within a method)
        System.out.println("\nExample using Return Statement:");
        int result = addNumbers(5, 3);
        System.out.println("Sum of two numbers: " + result);
    }

    // Method demonstrating the return statement
    public static int addNumbers(int a, int b) {
        return a + b; // Exits the method and returns the sum
    }
}

