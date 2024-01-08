import java.util.Arrays; // Import required for Arrays.copyOfRange()

public class MergeSort {
    // Function to perform Merge Sort
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid); // Copy the left subarray
            int[] right = Arrays.copyOfRange(arr, mid, arr.length); // Copy the right subarray

            // Recursive calls to divide the array into smaller parts
            mergeSort(left);
            mergeSort(right);

            // Merge the divided arrays
            merge(arr, left, right);
        }
    }

    // Function to merge the divided arrays
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the divided arrays into a single sorted array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i]; // Copy the smaller element from the left array
                i++;
            } else {
                arr[k] = right[j]; // Copy the smaller element from the right array
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left array
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right array
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Main method to demonstrate Merge Sort
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3}; // Input array
        mergeSort(arr); // Sort the array using Merge Sort

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
