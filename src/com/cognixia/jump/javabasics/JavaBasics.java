package com.cognixia.jump.javabasics;

public class JavaBasics {

	// Java starts here
	public static void main(String[] args) {
		
		// Java Primitive Variables\
		// When you make a variable, you declare (set's scope) and initialize, either at same time,
		// or you can break these steps up.
		
		//Syntax follows: data type, variable name = value;
		// Numerics:
		short s = 1;
		// final as a modifier on a variable, makes it constant
		final byte b; // declaring
		b = 0; // initializing
		int i = 5;
		long l = 1000;
		float f = 5.0f;
		double d = 5.0;
		
		// Text
		char c = 'c';
		
		// Logical
		boolean bool = true;
		
		System.out.println(b);
		
		// = is the assignment operator.
//		b = 10;
		
		System.out.println(b);
		
		double number = 5.9;
		int newNumber = (int) number;
		
		System.out.println(newNumber);
		
		// Logical Or
		if(bool == true ^ b == 1) {
			System.out.println("Condition 1 met.");
		}
		
		// Logical And
		if(bool == true && b == 0) {
			System.out.println("Condition 2 met.");
		}
		
		// ! Negates / Opposite Logic
		if(bool != true && b == 0) {
			System.out.println("Condition 3 met.");
		}
		
		// Same outcome as above
		if(!bool && b == 0) {
			System.out.println("Condition 4 met.");
		}
	
	

	}

}
