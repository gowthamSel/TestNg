package org.TWOdimentionalArray.java;

public class ThreeDimensionalArray {


	public static void main(String[] args) {

	}

	public static void ThreeDimentionalArray() {


		/**the three dimentional array is same as the two dimentional array
		 * but the difference is it has 3 square brakets
		 * first one is number of arrays in the dimentions and 
		 * second one is number of rows and 
		 * third one is number of coloumns  */

		int[][][] values=new int[2][3][3];

		/**first array*/

		values[0][0][0]=1;
		values[0][0][1]=2;
		values[0][0][3]=3;

		values[0][1][0]=4;
		values[0][1][1]=5;
		values[0][1][3]=6;

		values[0][2][0]=7;
		values[0][2][1]=8;
		values[0][2][3]=9;

		/**second array*/

		values[0][0][0]=1;
		values[0][0][1]=2;
		values[0][0][3]=3;

		values[0][1][0]=4;
		values[0][1][1]=5;
		values[0][1][3]=6;

		values[0][2][0]=7;
		values[0][2][1]=8;
		values[0][2][3]=9;



		/**  array[0] [1   2   3]
		 *            [4   5   6]
		 *            [7   8   9]
		 *   
		 *   array[1] [1   2   3]
		 *            [4   5   6]
		 *            [7   8   9] it will be stored on this type */


		                     /**first array*/              /**second array*/
		int value[][][] = {{{1,2,3},{4,5,6},{7,8,9}}  ,  {{1,2,3},{4,5,6},{7,8,9}}};
		//{{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}}};

		//we print or add or enter the values into the three dimentional array 
		//give the loop conditions are like this bellow 
		
		/**for(< number of arrays)
		 *     for(< number of rows)
		 *        for(< number of coloumns)*/

	}
}