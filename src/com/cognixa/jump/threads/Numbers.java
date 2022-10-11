package com.cognixa.jump.threads;

// class just to hold some sort of operation to do in thread
public class Numbers {
	
	// takes in a number max and prints from zero up until the max number
	// also tells which thread is printing
	static public void print(int max) {
		
		for (int i = 0; i < max; i++) {
			System.out.println("Thread " + Thread.currentThread().getId()
					+ ": " + i);
			
		}
		
	}

}
