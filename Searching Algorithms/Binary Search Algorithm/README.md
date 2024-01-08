# Binary Search Algorithm

Binary Search is a highly efficient searching algorithm that works on sorted collections by repeatedly dividing the search interval in half.

## Overview

Binary Search is based on the principle of divide and conquer. It works by selecting the middle element of the sorted collection and comparing it with the target value. If the middle element matches the target, the search ends. If the target is smaller, the search continues in the lower half; otherwise, it continues in the upper half. This process is repeated until the target element is found or the search interval becomes empty.

## Implementation

The `BinarySearch.java` file contains the Java implementation of the Binary Search algorithm. The `binarySearch` method takes a sorted array of integers and a target element as input and performs the binary search.

# Binary Search Algorithm Explanation

Binary Search is a searching algorithm used to find the position of a target value within a sorted array efficiently.

## Algorithm Steps

1. **Initialize Pointers:** Set the `left` pointer to the start of the array (index 0) and the `right` pointer to the end of the array (index `array.length - 1`).

2. **Loop Until Pointers Meet:**
   - Continue the search as long as the `left` pointer is less than or equal to the `right` pointer.

3. **Calculate Middle Index:**
   - Compute the `mid` index as `(left + right) / 2` or `left + (right - left) / 2` to find the middle element.

4. **Compare Middle Element with Target:**
   - If the middle element is equal to the target, return the `mid` index as the position of the target element.
   - If the middle element is less than the target, update the `left` pointer to `mid + 1` to search the right half.
   - If the middle element is greater than the target, update the `right` pointer to `mid - 1` to search the left half.

5. **Repeat the Process:**
   - Continue the process, dividing the search interval in half at each iteration, until the target element is found or until the `left` pointer is greater than the `right` pointer.

6. **Return -1 if Element Not Found:**
   - If the element is not found after the loop, return -1 to indicate that the target element is not present in the array.

## Pseudocode

```plaintext
BinarySearch(array, target):
    left = 0
    right = array.length - 1

    while left <= right:
        mid = left + (right - left) / 2
        
        if array[mid] == target:
            return mid
        else if array[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    
    return -1 // Element not found
```

## Example
```java
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index where the target element is found
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
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
```
## Binary Search Algorithm

Binary Search is a highly efficient searching algorithm that works on sorted collections by repeatedly dividing the search interval in half.

### Usage

To use the `binarySearch` method, provide a sorted integer array and the element you want to find. Ensure the array is sorted beforehand for binary search to work correctly. Modify the `main` method in the `BinarySearch.java` file to test different scenarios.

### Time Complexity

Binary Search has an average and worst-case time complexity of O(log n), where 'n' is the number of elements in the collection. It efficiently halves the search space in each iteration, making it significantly faster than linear search for larger datasets.

### Advantages

- **Efficiency:** Highly efficient for searching within sorted collections.
- **Logarithmic Time Complexity:** Scales well for large datasets, reducing search time logarithmically.
- **Early Termination:** Terminates early once the element is found, optimizing the search process.
- **Suitable for Large Datasets:** Performs exceptionally well even with millions of elements due to its logarithmic time complexity.

### Disadvantages

- **Sorted Data Requirement:** Requires the collection to be sorted beforehand, which might add overhead if the data is frequently changing or needs frequent sorting.
- **Complexity of Implementation:** More complex to implement compared to linear search due to the need for a sorted data structure and handling the search iteration logic.
- **Not Suitable for Unsorted Data:** Limited applicability for unsorted or unordered collections.

### Conclusion

Binary Search offers a highly efficient way to search within sorted collections by continuously dividing the search interval. Its logarithmic time complexity makes it ideal for large datasets, providing faster search times compared to linear search. However, it requires sorted data, making it more suited for scenarios where data remains sorted or where optimizing search time for larger datasets is crucial.

