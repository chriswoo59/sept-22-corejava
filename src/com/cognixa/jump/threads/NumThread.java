package com.cognixa.jump.threads;

public class NumThread extends Thread {

	// run method contains operation to do while thread is running
	@Override
	public void run() {
		// get the id for this thread
		System.out.println("Start Thread " + Thread.currentThread().getId());
		
		// do some operation
		// at this point create the Numbers.java file
		Numbers.print(100);
		
		// doesn't do anything
		// its just there courtesy and good practice
		super.run();
	}
	
}
