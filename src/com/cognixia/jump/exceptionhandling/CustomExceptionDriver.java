package com.cognixia.jump.exceptionhandling;

public class CustomExceptionDriver {

	public static void main(String[] args) {

		int age = 18;
		
		try {
			
			if(age < 21) {
				throw new AgeException();
			}
			
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
