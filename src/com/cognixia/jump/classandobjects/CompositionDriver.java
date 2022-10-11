package com.cognixia.jump.classandobjects;

public class CompositionDriver {

	public static void main(String[] args) {
		
		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Vehicle();
		Engine engine1 = new Engine();
		
		// This is not standard or good practice;
//		car1.classType = "C";
		
		// do this instead!
		car1.setClassType("Sedan");
		
	
		
		System.out.println(car1.getClassType());
		
		System.out.println(car1.toString());
		System.out.println(car1);
		
		System.out.println(car2);
		System.out.println(engine1);
		


	}

}
