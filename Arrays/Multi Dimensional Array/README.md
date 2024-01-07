# Java Program: User Input for 2D Array

This Java program enables users to input elements into a 2D array and then displays the elements along with comments using `array.length` and `array[i].length`.

## Program Explanation

### Input Process

1. **Getting the Size of the Array:** The program prompts the user to input the number of rows and columns for the 2D array.

2. **Inserting Elements:** Using nested loops, the program asks the user to input individual elements to fill the 2D array.

### Displaying Elements with Comments

After the user inputs all the elements, the program displays the elements of the 2D array along with comments indicating their positions.

The process involves iterating through the 2D array using nested loops:
- **Outer Loop (`for` loop):** Iterates through each row of the array using `array.length` to find the number of rows.
- **Inner Loop (`for` loop within the outer loop):** Iterates through each column of the current row using `array[i].length` to find the number of columns in each row.

The program prints the elements using `System.out.print()` and adds comments to signify each element's position by incorporating the row and column indices.

## How to Use

### Running the Program

To execute the program:

1. Compile the `TwoDimensionalArrayLength.java` file.
    ```bash
    javac TwoDimensionalArrayLength.java
    ```

2. Run the compiled program.
    ```bash
    java TwoDimensionalArrayLength
    ```

### Usage

1. Input the number of rows and columns for the 2D array when prompted.
2. Enter the individual elements for the array when prompted.
3. The program will display the elements of the array with comments using `array.length` and `array[i].length`.
