public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		

		System.out.println("Please Enter the number of classes: ");
		float [][] st = new float [sc.nextInt()][];
		
		for(int i = 0; i<=st.length-1; i++ ) {
			System.out.println("Please Enter the number of students present in class: "+(i+1));
			st[i] = new float[sc.nextInt()];
		}
			
		

		for(int i = 0; i<=st.length-1; i++ ) {
			for(int j = 0; j<=st[i].length-1; j++ ) {
				System.out.println("In Class "+(i+1)+" Please Enter the Percentage of the student: "+(j+1));
				st[i][j] = sc.nextFloat();

			}
		}

		System.out.println("The array contents are: ");

		for(int i = 0; i<=st.length-1; i++ ) {
			for(int j = 0; j<=st[i].length-1; j++ ) {
				System.out.println("In The Class "+(i+1)+" student "+(j+1)+" is "+st[i][j]);
			}
		}


	}
