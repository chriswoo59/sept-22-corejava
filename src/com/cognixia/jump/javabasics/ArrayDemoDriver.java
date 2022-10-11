package com.cognixia.jump.javabasics;

import com.cognixia.jump.classandobjects.Animal;
import com.cognixia.jump.classandobjects.AnimalDriver;
import com.cognixia.jump.classandobjects.Horse;

// This class will demo declaring, instatiating, reading, writing, and looping through arrays, of 
// both primitive values, and objects.
public class ArrayDemoDriver {

	public static void main(String[] args) {
		
		// Declare an array
		int[] temperatures;
		int grades[] = {90, 85, 87, 70};
		
		// instatiate
		temperatures = new int[5];
		Animal[] animals = {
				new Animal(), 
				new Animal("horse", 500.0),
				new Animal("cat", 20.0),
				new Animal("dog", 20.0)};
		Animal[] altAnimals = new Animal[3];
		
		// read from array
		System.out.println(animals[0]);
		System.out.println(altAnimals[0]);
		
		// WARNING!  Out of Bounds
		System.out.println(grades[0]);
		
		// Write to array
		grades[0] = 100;
		System.out.println(grades[0]);
		
		System.out.println(animals[1]);
		
		animals[1] = null;
		System.out.println(animals[1]);
		
		//Iterating through an array
		// This is not optimal!
		System.out.println("\nLooping through grades array:");
		int counter = 0;
		while(counter < grades.length) {
			System.out.println(grades[counter++]);
		}
		
		System.out.println("\nfor loop through grades array");
		// use for loops instead!
		for(int index = 0; index < grades.length; index++) {
			System.out.println(grades[index]);
		}
		System.out.println();
		for(int i = grades.length -1; i >=0; i-=2) {
			System.out.println(grades[i]);
		}
		
		//for each loop
		// left side is a var that reps a single item in the array, which is the right of the :
		for(int grade : grades) {
			System.out.println(grade);
		}
		
		System.out.println("\nfor each loop");
		for (Animal animal : animals) {
			if(animal != null && animal.getType().equals("dog")) {
//				animal.setType("Bear");
				animal = null;
			}
//			System.out.println(animal);
		}
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] != null && animals[i].getType().equals("dog")) {
//				animal.setType("Bear");
				animals[i] = null;
			}
		}
		
		System.out.println("\nverify for each loop writing.");
		for (Animal animal : animals) {
	
			System.out.println(animal);
		}
		
		//Heterogenous Arrays
		Animal[] creatures = new Animal[4];
		
		creatures[0] = new Animal();
		creatures[1] = new Horse("Clydesdale", 500.0);
		creatures[2] = new Unicorn();
		creatures[3] = new Animal("Dog", 40.0);
		
		for (Animal animal : creatures) {
			System.out.println(animal);
		}
		
		char[][] grid = {
				{'a', 'b','c'},
				{'d','e', 'f'},
				{'g','h','i'}
				};
		
		for(int col = 0; col < grid[0].length; col++) {
			for(int row = 0; row < grid.length; row++) {
				System.out.println(grid[row][col]);
			}
		}
	}

}
