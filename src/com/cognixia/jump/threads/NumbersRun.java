package com.cognixia.jump.threads;

public class NumbersRun implements Runnable {

	// override annotation not necessary, but a good way to tag what methods are
	// overwritten ones
	@Override
	public void run() {
		// get the id for this thread
		System.out.println("Start Thread " + Thread.currentThread().getId());

		// do some operation
		Numbers.print(100);

	}

}
