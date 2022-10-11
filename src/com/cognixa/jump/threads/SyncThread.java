package com.cognixa.jump.threads;

public class SyncThread extends Thread {

	private static int counter = 0;
	
	//snyc method
	public static synchronized void increment() {
		counter++;
	}
	
	public static synchronized void incrementAndPrint() {
		counter++;
		System.out.println("Thread " + Thread.currentThread().getId() + ": " + counter);
	}
	
	public static void staticBlockIncrement() {
		System.out.println("----------------");
		
		synchronized(SyncThread.class){
			counter++;
			System.out.println("Thread " + Thread.currentThread().getId() + ": " + counter);
		}
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			//Opt 1
//			increment();
//			System.out.println("Thread " + Thread.currentThread().getId() + ": " + counter);
			
			//Opt 2
//			incrementAndPrint();
			
			//Opt 3
			staticBlockIncrement();
		}
	}
	
}
