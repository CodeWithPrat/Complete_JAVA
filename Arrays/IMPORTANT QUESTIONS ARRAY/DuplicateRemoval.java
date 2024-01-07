public class DuplicateRemoval {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 40, 50, 50};  

        // Get the length of the array after removing duplicates
        int length = arr.length;
        length = removeDuplicateElements(arr, length);  

        // Printing array elements after removing duplicates
        System.out.println("Array without duplicates:");
        for (int i = 0; i < length; i++)  
            System.out.print(arr[i] + " ");  
    }  

    // Function to remove duplicates from the array
    public static int removeDuplicateElements(int arr[], int n) {  
        // If the array has 0 or 1 element, it has no duplicates
        if (n == 0 || n == 1) {
            return n;  
        }    

        int j = 0; // Initialize index for the next element  

        // Traverse the array to check for duplicates and remove them
        for (int i = 0; i < n - 1; i++) {
            // If the current element is not equal to the next element
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i]; // Copy non-duplicate element to the array
            }  
        }  

        arr[j++] = arr[n - 1]; // Copy the last element as it's always unique

        return j; // Return the new length of the array without duplicates
    }
}
