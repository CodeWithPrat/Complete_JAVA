public class InsertionSort {
    // Function to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length; // Get the length of the array
        for (int i = 1; i < n; ++i) { // Loop through the array starting from the second element
            int key = arr[i]; // Current element to be compared and inserted
            int j;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            for (j = i - 1; j >= 0 && arr[j] > key; --j) {
                arr[j + 1] = arr[j]; // Shift the element to the right
            }
            arr[j + 1] = key; // Place the key at its correct position in the sorted sequence
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3}; // Input array
        insertionSort(arr); // Sort the array using Insertion Sort

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
