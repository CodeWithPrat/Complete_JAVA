public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0; // Initialize the left pointer representing the start of the search interval
        int right = arr.length - 1; // Initialize the right pointer representing the end of the search interval

        while (left <= right) { // Continue the search until the left pointer is less than or equal to the right pointer
            int mid = left + (right - left) / 2; // Calculate the middle index of the search interval

            if (arr[mid] == target) {
                return mid; // Return the index where the target element is found
            }

            if (arr[mid] < target) {
                left = mid + 1; // Update the left pointer to narrow down the search to the right half
            } else {
                right = mid - 1; // Update the right pointer to narrow down the search to the left half
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    // Example usage in the main method
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 5, 7, 9 };
        int targetElement = 7;
        int result = binarySearch(array, targetElement);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
