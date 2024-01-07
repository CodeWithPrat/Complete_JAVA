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
