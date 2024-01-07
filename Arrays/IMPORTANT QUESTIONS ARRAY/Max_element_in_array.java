import java.util.Scanner;

public class LargestNumberInArray {

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

        // Finding the largest number in the array
        int largestNumber = findLargestNumber(array);

        // Displaying the largest number
        System.out.println("The largest number in the array is: " + largestNumber);

        scanner.close();
    }

    // Method to find the largest number in a 1D array
    public static int findLargestNumber(int[] arr) {
        int max = arr[0]; // Assume the first element as the maximum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        return max;
    }
}
