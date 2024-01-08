public class BubbleSort {
    // Method to perform Bubble Sort on an array of integers
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Traverse through the array elements
        for (int i = 0; i < n - 1; i++) {
            // Last 'i' elements are already in place, so no need to check them again
            // Compare and swap adjacent elements if they are in the wrong order
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
