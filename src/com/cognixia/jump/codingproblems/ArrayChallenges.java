package com.cognixia.jump.codingproblems;

import java.util.Scanner;

public class ArrayChallenges {

	public static void main(String[] args) {
		
		//challenge1();
		challenge2();

	}
	
	//method with solution
	static void challenge1() {
		// Check if two arrays of the same data type have the same contents
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {3,2,4,1};
		
		int[] arr3 = new int[] {1,5,3,4};
		
		System.out.println(ArrayMethods.matchArrays(arr1, arr2));
		System.out.println(ArrayMethods.matchArrays(arr1, arr3));
		
		
	}
	
	static void challenge2() {
		// Find missing value in an array of 1 to 100
		System.out.print("Input the number to remove from the array [1-100]: ");
		Scanner input = new Scanner(System.in);
		int missing_number = input.nextInt() - 1;
		input.close();
		int[] arr100 = new int[100];
		for (int i = 0; i < 100; i++) {
			if (i < missing_number) {
				arr100[i] = i+1;
			}
			else {
				arr100[i] = i+2;
			}
			
		}
		System.out.println("The missing number is " + ArrayMethods.findMissingValue(arr100));
	}

}
