package com.cognixia.jump.classandobjects;

public interface GamePlayer {
	
	// A variable in an interface, is public, static, and final, ALWAYS
	// public static final int PLAYER_NUMBER = 1;
	int PLAYER_NUMBER = 1;

	//public abstract void checkGameStatus();  is same as below,
	// all methods are public, and abstract
	void checkGameStatus();
	
}
