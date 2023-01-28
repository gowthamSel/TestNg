package org.TWOdimentionalArray.java;

import java.util.Iterator;
import java.util.Scanner;

import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

public class TwoDime_PutValues {


	public static void main(String[] args) {
		twoDimension();
	}

	
	/**the bellow syntax is shown it will be a two square brackets and place an numerics on it 
	 * i.e., first square is a number of row and second one is a number of coloums
	 * we can place the number of rows and coloumns in our requirements 
	 * for example 3,3 4,5, 5,8 etc */
	
	/**we also place a values on the array by the use of the leteral array-type
	 * that meanse array of values[][] like */
	
	public  static void twoDimension() {

		int[][] names=new int[3][3];
		//Scanner sc=new Scanner(System.in);

		
		//normal put the values into the two dimentional array
		names[0][0]=1;
		names[0][1]=2;
		names[0][2]=3;
		names[1][0]=4;
		names[1][1]=5;
		names[1][2]=6;
		names[2][0]=4;
		names[2][1]=5;
		names[2][2]=6;

		//System.out.println(names); 
		
		
		//this is a lateral type of two dimentional array
		
		int values[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(values);
	}
}
