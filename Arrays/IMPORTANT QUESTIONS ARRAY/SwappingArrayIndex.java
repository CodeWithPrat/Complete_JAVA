import java.util.Scanner;

public class SwappingArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//taking the size of the array
		System.out.println("Enetr the size of the array: ");
		int []arr = new int [sc.nextInt()];

		//taking the elements for the array
		System.out.println("Enetr "+ arr.length+" elements to store inside the array: ");
		for(int i = 0; i<=arr.length-1; i++) {
			arr[i]=sc.nextInt();
		}


		System.out.println("Enter the two indexes which you want to be swapped: ");

		System.out.print("x: ");
		int i1= sc.nextInt();

		System.out.print("y: ");
		int i2= sc.nextInt();

		// before swapping of the array will be 
		System.out.println("elemets before swapping:- ");
		for(int i = 0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		int temp;
		if(i1>=0 && i1<=arr.length-1 && i2>=0 && i2<=arr.length-1) {

			temp = arr[i1];
			arr[i1] = arr[i2];
			arr[i2] = temp;
			
			System.out.println("after swapping the array will be: ");
			for(int i = 0; i<=arr.length-1; i++) {
				System.out.print(arr[i]+" ");
			}

		}
		
		else {
			System.out.println("Enter the indexes between 0 and "+arr.length);

		}
	}
