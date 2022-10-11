package com.cognixia.jump.codingproblems;

import java.util.Scanner;

public class StringChallenges {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		challenge1(input);
		challenge2(input);
		challenge3(input);
		input.close();
	}



	private static void challenge1(Scanner input) {
		StringBuilder str = new StringBuilder();
		System.out.print("Challenge 1\nEnter string to reverse: ");
		str.append(input.nextLine());
		str.reverse();
		System.out.println("Reversed string: " + str);
	}
	
	private static void challenge2(Scanner input) {
		System.out.print("Challenge2\nEnter string to reverse: ");
		String str = input.nextLine();
		StringBuilder newStr = new StringBuilder();
		
		for (int i = str.length()-1; i >= 0; i--) {
			newStr.append(str.charAt(i));
		}
		
		System.out.println("Reversed string: " + newStr);
		
	}
	
	private static void challenge3(Scanner input) {
		System.out.print("Challenge3\nEnter sentence to reverse: ");
		String[] words = input.nextLine().split(" ");
		for (int i = 0; i < words.length; i++) {
			// Taken from challenge1
			StringBuilder temp = new StringBuilder();
			temp.append(words[i]).reverse();
			//words[i] = temp.toString();
			System.out.println(temp);
		}
		
		
	}

}
