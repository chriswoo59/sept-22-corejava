package com.cognixia.jump.codingproblems;

import java.util.Arrays;

public class ArrayMethods {
	
	public static boolean matchArrays(int[] arr1, int[] arr2) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return (Arrays.equals(arr1, arr2));

	}
	
	public static int findMissingValue(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				return i + 1;
			}
		}
		// Reached end of loop without finding missing int
		return -1;
	}
}
