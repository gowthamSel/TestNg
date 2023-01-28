package org.TWOdimentionalArray.java;

import java.util.Iterator;
import java.util.Scanner;

public class AddTwoDimentionalArray {

	public static void main(String[] args) {

		AddOfTwoArrays();

	}

	public static  void AddOfTwoArrays() {

		int[][] first=new int[3][3];
		int[][] second=new int[3][3];

		int[][] sum=new int[3][3];

		Scanner scanner=new Scanner(System.in);

		System.out.println("pleace enter the values into the first array");
		//enter the values into the  array
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				first[i][j]=scanner.nextInt();
			}
		}
		System.out.println("compleated the enter values ");


		//printing the value of the arrays 
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(first[i][j]+" ");  //first[i][j]
			}
			System.out.println();
		}
		System.out.println("compleated and printing the value of the arrays ");

		System.out.println("pleace enter the values into the second array");
		//enter the values into the  array
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				second[i][j]=scanner.nextInt();
			}
		}
		System.out.println("compleated the enter  values ");

		//printing the value of the arrays 

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(second[i][j]+" ");  //first[i][j]
			}
			System.out.println();
		}
		//adding the values in the form of the matrix
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {

				sum[i][j]=second[i][j]+first[i][j];

			}
		}

		//printing the value of the arrays 
		for(int k=0;k<3;k++) {
			for(int j=0;j<3;j++) {
				System.out.print(second[k][j]+" ");  //first[i][j]
			}
			System.out.println();
		}
	}
}
//sum[i][j]=second[i][j]+first[i][j];

/*

 * 
 * 
 */



