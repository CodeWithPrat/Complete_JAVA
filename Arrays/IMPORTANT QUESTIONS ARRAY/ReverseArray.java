public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        displayArray(array);

        reverseArray(array);

        System.out.println("\nArray after Reversal:");
        displayArray(array);
    }

    // Method to reverse the elements of an array using for loop
    static void reverseArray(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }

    // Method to display the elements of an array
    static void displayArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
