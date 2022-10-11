package com.cognixa.jump.threads;

// runner to test out NumThread class
//
public class NumThreadRunner {

	public static void main(String[] args) {

		// run first with this, the current thread running this code is the
		// main thread (id should be 1), comment it out after to run code a few
		// lines down
		// Numbers.print(100);

		System.out.println("Main Thread ID: " + Thread.currentThread().getId());

		int size = 3;
		Thread[] threads = new Thread[size];

		// use a loop to easily create threads and start them
		for (int i = 0; i < size; i++) {

			threads[i] = new NumThread();
			threads[i].start(); // threads will not wait for one another to print their numbers
		}

		// Note: Your system determines the IDs for the threads, which is why
		// are not 2, 3, and 4, even if the main thread is 1.
	}

}
