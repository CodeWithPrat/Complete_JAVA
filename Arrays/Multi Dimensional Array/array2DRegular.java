import java.util.Scanner;

public class TwoDimensionalArrayLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Creating the 2D array based on user input size
        int[][] array = new int[rows][columns];

        System.out.println("Enter the elements of the array:");

        // Getting elements from the user and inserting them into the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Displaying the elements of the array using array.length and array[i].length
        System.out.println("Elements in the array:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
