import java.util.*;
public class secondLargestElement
{
 public static void main(String[] args)
 {
  // Given Array
  int inputArray[] = new int[] {10,43,27,98,75,59,191};

  // Sort Array
  Arrays.sort(inputArray);

  // Iterate Array to Second last element

  for(int i=0; i < inputArray.length; i++) {
      // Print second last element
      if(i == inputArray.length- 2)
          System.out.println(inputArray[i]);
  }
 }
}
