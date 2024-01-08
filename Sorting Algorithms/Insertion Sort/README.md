# Insertion Sort Explained in Simple Terms

Insertion Sort is a straightforward sorting method that works similarly to arranging a hand of cards. Imagine you have a hand with some numbers written on cards: `[5, 2, 4, 6, 1, 3]`. Let's sort them using Insertion Sort.

## Algorithm Description

Insertion Sort works by taking each element from the unsorted section and inserting it into its correct position in the sorted section. Here's a brief overview:

1. **Start with the Second Element:** Begin from the second element and compare it with the elements in the sorted section.
2. **Insert into Sorted Section:** Insert the element into its correct position in the sorted section by shifting larger elements to the right.
3. **Repeat Until Sorted:** Continue this process for each element in the unsorted section until the entire array is sorted.

# Insertion Sort Explained in Simple Terms

Insertion Sort is a sorting algorithm that works like sorting a deck of cards in your hand. Imagine you have cards in your hand, and they're not in any particular order. You start sorting them using the Insertion Sort technique.

Let's say you have some numbers written on these cards: `[5, 2, 4, 6, 1, 3]`.

Here's how Insertion Sort works in simple steps:

1. **Start Sorting:** Imagine you're holding the cards in your hand. You take one card at a time and compare it with the cards in your other hand, which are already sorted.

2. **Insertion:** You pick up a card (let's start with the second card, `2`), and you compare it with the first card (`5`). Since `2` is smaller than `5`, you move `5` to the right and put `2` before `5`. Now, you have `[2, 5, 4, 6, 1, 3]`.

3. **Continuing the Process:** You take the next card (`4`) and compare it with the cards in the sorted hand. You move larger cards (`5`) to the right until you find the correct spot for `4`. So now, it becomes `[2, 4, 5, 6, 1, 3]`.

4. **Repeat until Sorted:** You keep doing this for each card in your hand. With each iteration, the sorted part of your hand increases, and eventually, all the cards are sorted. The final sorted array will be `[1, 2, 3, 4, 5, 6]`.

## Visual Illustration

Here's a visual representation of how Insertion Sort works:

Imagine you have an unsorted array `[5, 2, 4, 6, 1, 3]`.

1. **Initial Array:** `[5, 2, 4, 6, 1, 3]`

2. **Insertion Sort Steps:**  

   - `[5 | 2, 4, 6, 1, 3]`
   - `[2, 5 | 4, 6, 1, 3]`
   - `[2, 4, 5 | 6, 1, 3]`
   - `[2, 4, 5, 6 | 1, 3]`
   - `[1, 2, 4, 5, 6 | 3]`
   - `[1, 2, 3, 4, 5, 6]`

<p align="center">
  <img src="https://miro.medium.com/v2/resize:fit:862/1*OwXl0acSOQWPTsikNPtdqw.png" alt="Insertion Sort" title="Insertion sort algorithm">
</p>

## Pseudo-code Representation

```plaintext
InsertionSort(arr)
    n = arr.length
    for i = 1 to n-1
        key = arr[i]
        j = i - 1

        // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
        while j >= 0 and arr[j] > key
            arr[j + 1] = arr[j]
            j = j - 1
        arr[j + 1] = key
```

Here is a simple Java code that demonstrates Insertion Sort:

```java
public class InsertionSort {
    // Function to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length; // Get the length of the array
        for (int i = 1; i < n; ++i) { // Loop through the array starting from the second element
            int key = arr[i]; // Current element to be compared and inserted
            int j;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            for (j = i - 1; j >= 0 && arr[j] > key; --j) {
                arr[j + 1] = arr[j]; // Shift the element to the right
            }
            arr[j + 1] = key; // Place the key at its correct position in the sorted sequence
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3}; // Input array
        insertionSort(arr); // Sort the array using Insertion Sort

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

```
## Time Complexity

- **Best Case:** O(n) - When the array is already sorted.
- **Average Case:** O(n^2) - Generally.
- **Worst Case:** O(n^2) - When the array is in reverse order.

Insertion Sort has quadratic time complexity in the worst-case scenario, making it less efficient for large datasets. However, it performs relatively well for small datasets or nearly sorted arrays.

