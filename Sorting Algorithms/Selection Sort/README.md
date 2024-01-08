# Selection Sort Explained in Simple Terms

Selection Sort is a simple sorting algorithm that sorts an array by repeatedly finding the minimum element from the unsorted part and placing it at the beginning. Imagine having a list of numbers written on cards: `[5, 2, 4, 6, 1, 3]`. Let's sort them using Selection Sort.

## Algorithm Explanation

1. **Find the smallest card:** Start by going through all the cards and finding the smallest one.
2. **Swap it with the first card:** Once you've found the smallest card, place it in the first position in your hand.
3. **Repeat for the remaining cards:** Look at the remaining cards (excluding the first one) and find the next smallest card. Swap it with the second card.
4. **Continue until all cards are in order:** Keep repeating this process until all cards are in the right order from smallest to largest.

## Example

Imagine you have cards with numbers written on them: `[5, 2, 4, 6, 1, 3]`.
- Start by finding the smallest card (`1`) and place it at the beginning.
- Next, find the next smallest card (`2`) and swap it with the second card.
- Repeat this process until all cards are in order: `[1, 2, 3, 4, 5, 6]`.

## Algorithm Description

The Selection Sort algorithm works in the following way:

1. **Find the Minimum Element:** Start by finding the smallest element in the array and swap it with the first element.
2. **Repeat the Process:** Move to the next position in the array and find the smallest element in the remaining unsorted part, then swap it with the element in that position.
3. **Continue Until Sorted:** Repeat this process until the entire array is sorted.

![Selection Sort GIF](https://miro.medium.com/v2/resize:fit:1144/1*5WXRN62ddiM_Gcf4GDdCZg.gif)
## Pseudo-code Representation

```plaintext
SelectionSort(arr)
    n = arr.length
    for i = 0 to n-1
        minIndex = i
        for j = i+1 to n
            if arr[j] < arr[minIndex]
                minIndex = j
        swap arr[minIndex] with arr[i]
```
## Pros and Cons
## Pros
- Simple Implementation: Selection Sort is easy to understand and implement.
- In-place Sorting: It sorts the array in-place, meaning it doesn't require extra memory space other than a few variables.

## Cons
- Inefficiency with Large Data Sets: Selection Sort has a time complexity of O(n^2), which makes it inefficient for large datasets.
- Not Suitable for Nearly Sorted Arrays: Even if the array is almost sorted, it doesn't perform significantly better than for completely random arrays.

## Time Complexity
- Best Case: O(n^2) - The same as the average and worst-case scenarios.
- Average Case: O(n^2) - The algorithm's performance is quadratic, making it less efficient for larger arrays.
  
## Here is a Java code example that demonstrates the Selection Sort algorithm:
```java
public class SelectionSort {
    // Function to perform Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length; // Get the length of the array
        for (int i = 0; i < n - 1; i++) { // Loop through the array elements
            int minIndex = i; // Assume the current index as the minimum
            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update the index of the minimum element
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method to demonstrate the Selection Sort algorithm
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3}; // Input array
        selectionSort(arr); // Sort the array using Selection Sort

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

