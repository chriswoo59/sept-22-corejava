package com.cognixia.jump.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// This class serves to run examples of try/catch, finally, try w/resources, propogation,
// throws, throw, and custom exceptions
public class ExceptionDriver {

	public static void main(String[] args) {
		
		int inNum = 0;
		boolean invalidInput = true;
		Scanner input = new Scanner(System.in);
		
		// try multiple catch - propogation
		try {
			
			while (invalidInput) {
				tryMultipleCatch(inNum, input);
			}
			invalidInput = false;

		} catch (InputMismatchException e) {
			System.out.println("Input a integer only.");
			input.next();
			//			e.printStackTrace();
		} catch (ArithmeticException e) { // empty catch block is BAD PRACTICE!
			System.out.println("Your input of " + inNum + " caused a " + e.getMessage() + " exception.");
			input.next();
			//			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			input.next();
		} 
		
		
//		tryScannerWithResources();
		
		// finally
//		tryWithFinallyScanner();
		
		input.close();

	}

	public static void tryMultipleCatch(int inNum, Scanner input) throws InputMismatchException, ArithmeticException, Exception{
			
				System.out.println("Input a integer:");
				inNum = input.nextInt();

				int ans = 10 / inNum;

				System.out.println(ans);
		
		System.out.println("Outside try/catch, your input was " + inNum);
	}

	public static void tryWithFinallyScanner() {
		Scanner sc3 = new Scanner(System.in);
		try {
			double inDouble = sc3.nextDouble();
			System.out.println("Finally example: " + inDouble);
		} catch(Exception e){
			e.printStackTrace();
		}
		finally {
			sc3.close();
		}
	}

	public static void tryScannerWithResources() {
		// try with resources
		try(Scanner sc2 = new Scanner(System.in);) {
			System.out.println("Enter a sentence: ");
			String sentence = sc2.nextLine();
			System.out.println(sentence);
		} catch (Exception e) {
			e.printStackTrace();
		} // no finally needed because of resource management.
	}

}
