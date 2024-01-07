import java.util.Scanner;

public class OneDimensionalArraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Getting elements for the array from user input
        System.out.println("Enter elements for the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculating the sum of elements in the array
        int sum = calculateSum(array);

        // Displaying the sum of elements
        System.out.println("Sum of elements in the array: " + sum);

        scanner.close();
    }

    // Method to calculate the sum of elements in a 1D array
    public static int calculateSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
