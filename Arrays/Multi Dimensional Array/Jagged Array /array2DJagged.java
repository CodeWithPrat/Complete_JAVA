import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Creating a jagged array
        int[][] jaggedArray = new int[rows][];

        // Getting elements for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + i + ": ");
            int elements = scanner.nextInt();

            // Allocating memory for each row based on the number of elements
            jaggedArray[i] = new int[elements];

            // Getting elements for the current row
            System.out.println("Enter elements for row " + i + ":");
            for (int j = 0; j < elements; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Displaying the jagged array
        System.out.println("Jagged Array Elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
