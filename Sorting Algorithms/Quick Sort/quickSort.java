public class QuickSort {

    // Function to initiate Quick Sort
    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1); // Initial call to sort the entire array
    }

    // Recursive function to perform Quick Sort
    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Get the pivot index
            sort(arr, low, pivotIndex - 1); // Sort the left subarray
            sort(arr, pivotIndex + 1, high); // Sort the right subarray
        }
    }

    // Partitioning the array and returning the pivot index
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the pivot element (usually the last element)
        int i = low - 1; // Index of smaller element

        // Loop through the array and rearrange elements around the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j); // Swap arr[i] and arr[j]
            }
        }

        swap(arr, i + 1, high); // Swap arr[i+1] and arr[high] (place the pivot in the correct position)
        return i + 1; // Return the pivot index
    }

    // Function to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to demonstrate Quick Sort
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3}; // Input array
        quickSort(arr); // Sort the array using Quick Sort

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
