package com.learning.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row: ");
		int row = sc.nextInt();
		System.out.println("Enter col: ");
		int col = sc.nextInt();
		int [][] orgmat= new int [row][col];

		for(int i =0 ; i<orgmat.length; i++) {
			for(int j =0 ; j<orgmat[i].length; j++) {
				orgmat[i][j]= sc.nextInt();
			}
		}
		int [][] transmat=  transposemat(orgmat);
		
		System.out.println("The original matrix is: ");
		displaymat(orgmat);
		System.out.println("The transpose matrix is: ");
		displaymat(transmat);
		
	}
	
	public static int[][] transposemat(int[][] orgmat)
	{
		int col = orgmat.length;
		int row = orgmat[0].length;
		int [][] transmat= new int [row][col];
		for(int i =0 ; i<row; i++) {
			for(int j =0 ; j<col; j++) {
				transmat[j][i]= orgmat[i][j]; 
			}
		}
		return transmat;
	}
	
	public static void displaymat(int[][] matrix) {
		for(int i =0 ; i<matrix.length; i++) {
			for(int j =0 ; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
