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


Here is a simple Java code that demonstrates Insertion Sort:

```java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        insertionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
