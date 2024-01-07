public class Intersection {
    
    public static void main(String[] args) {
        int[] x = {2, 5, 3, 7};
        int[] y = {5, 2, 9, 0, 1};

        // Display the first array
        System.out.println("The first array is: ");
        displayArray(x);
        
        // Display the second array
        System.out.println("\nThe second array is: ");
        displayArray(y);
        
        // Find and display the intersection of the two arrays
        intersection(x, y);
    }
    
    // Method to display an array
    static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Method to find and display the intersection of two arrays
    static void intersection(int x[], int y[]) {
        System.out.println("\nIntersection of the two arrays is: ");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    System.out.print(x[i] + " "); // Print the common element
                    break; // Break the inner loop once a match is found
                }
            }
        }
        System.out.println();
    }
}
