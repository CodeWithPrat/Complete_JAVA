import java.util.Scanner;

public class OneDimensionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Creating the array based on user input size
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        // Getting elements from the user and inserting them into the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Elements in the array:");

        // Displaying the elements of the array
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        scanner.close();
    }
}
