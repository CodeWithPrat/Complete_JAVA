# Searching Algorithms in Java

This repository contains Java implementations of various searching algorithms.

## Algorithms Included

### 1. Linear Search

Linear search is a simple searching algorithm that sequentially checks each element in a collection until the desired element is found.

- **File:** `LinearSearch.java`
- **Description:** Implementation of the linear search algorithm in Java.
- **Usage:** Provide an integer array and the element you want to find to the `linearSearch` method.

### 2. Binary Search

Binary search is a more efficient searching algorithm that works on sorted arrays by repeatedly dividing the search interval in half.

- **File:** `BinarySearch.java`
- **Description:** Implementation of the binary search algorithm in Java.
- **Usage:** Provide a sorted integer array and the element you want to find to the `binarySearch` method.

## How to Run

1. **Compile:** Compile the Java files using `javac <FileName>.java`.
2. **Run:** Execute the compiled file using `java <FileName>`.

## Usage Example

```java
public class Main {
    public static void main(String[] args) {
        // Example usage of Linear Search
        int[] linearArray = { 4, 2, 7, 1, 9, 5 };
        int linearTarget = 7;
        int linearResult = LinearSearch.linearSearch(linearArray, linearTarget);

        if (linearResult != -1) {
            System.out.println("Linear Search: Element found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Element not found in the array.");
        }

        // Example usage of Binary Search
        int[] binaryArray = { 1, 2, 4, 5, 7, 9 };
        int binaryTarget = 7;
        int binaryResult = BinarySearch.binarySearch(binaryArray, binaryTarget);

        if (binaryResult != -1) {
            System.out.println("Binary Search: Element found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found in the array.");
        }
    }
}

