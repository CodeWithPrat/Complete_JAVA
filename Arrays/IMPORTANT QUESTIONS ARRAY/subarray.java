public class subarray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // Get subarray from index 2 to index 5 (inclusive)
        int start = 2;
        int end = 5;
        
        // Check if indices are valid
        if (start >= 0 && end < array.length && start <= end) {
            int subarrayLength = end - start + 1;
            int[] subarray = new int[subarrayLength];
            
            // Extract elements for the subarray
            int index = 0;
            for (int i = start; i <= end; i++) {
                subarray[index] = array[i];
                index++;
            }
            
            // Display subarray elements
            System.out.println("Subarray:");
            for (int element : subarray) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("Invalid indices for subarray.");
        }
    }
}
