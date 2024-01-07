public class SeparateZerosNonZeros {

    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 0, 2, 8, 4, 0, 1};

        separateZerosNonZeros(arr);

        System.out.println("Array after separating zeros and non-zeros:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void separateZerosNonZeros(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] != 0 && left < right) {
                left++;
            }
            while (arr[right] == 0 && left < right) {
                right--;
            }

            if (left < right) {
                // Swap non-zero element at left with zero element at right
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
