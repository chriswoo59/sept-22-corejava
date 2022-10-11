package com.cognixia.jump.javabasics;

public class WrapperClassesDriver {

	public static void main(String[] args) {
		
		// Numeric
			//Integer
			byte b = 1;
			Byte B = b; //autoboxing a primitive into its corresponding Wrapper class object
			Byte wByte = 4;
			Byte objByte = new Byte("4"); // deprecated using Wrapper constructors
			
			short s = 2;
			Short S = s;
			
			int i = 3;
			Integer I = i;
			
			long l = 4;
			Long L = l;
		
			//Decimal
			float f = 5.0f;
			Float F = f;
			
			double d = 6.0;
			Double D = d;
		
		// Text
			char c = 'c';
			Character C = c;
		
		// Logical
			boolean bool = true;
			Boolean Boolean = bool;
			
			
			
	
	}

}
