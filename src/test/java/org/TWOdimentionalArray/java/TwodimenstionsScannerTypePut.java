package org.TWOdimentionalArray.java;

import java.util.Iterator;
import java.util.Scanner;

public class TwodimenstionsScannerTypePut {


	public static void main(String[] args) {

		ScannerTwoDimensionArray();
	}
	
	/**this method is used for the put the values into the two dimentional array and
	 * by the using of the scanner input
	 * and also used for the getting the values from the array in the form of matrix*/

	//pleace seen the code and observe it for the loops how the values is given to the array
	public static  void ScannerTwoDimensionArray() {


		int[][] valus=new int[3][3];
		Scanner scanner=new Scanner(System.in);

		System.out.println("pleace enter the values into the array in the console");
		//enter the values into the array loop
		for (int i=0;i<3;i++) {

			for (int j=0;j<3;j++) {
				valus[i][j]=scanner.nextInt();
			} 
		}

		System.out.println("printing the values in the console");
		//this loop is for printing the values from the two dimentional array
		for (int i=0;i<3;i++) {

			for (int j=0;j<3;j++) {
				System.out.print(valus[i][j]+" ");     //	valus[i][j];
			}
			System.out.println();
		}

	}
}
