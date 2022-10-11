package com.cognixa.jump.threads;

public class SyncThreadRunner {

	public static void main(String[] args) {
		
		int size = 3;
		Thread[] threads = new Thread[size];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new SyncThread();
			threads[i].start();
		}

	}

}
