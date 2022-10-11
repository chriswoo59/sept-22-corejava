package com.cognixia.jump.classandobjects;


public class AbstractClassAndInterfacesDriver {

	public static void main(String[] args) {
		
		// Showing Inherritence and Polymorphism in Instantiating Objects
		BasketBallPlayer bBallPlayer1 = new BasketBallPlayer();
		TeamSport bBallPlayer2 = new BasketBallPlayer();
		BallPlayer bBallPlayer3 = new BasketBallPlayer();
		GamePlayer bBallPlayer4 = new BasketBallPlayer();
		
		GamePlayer[] team1 = new GamePlayer[5];
		
		System.out.println(bBallPlayer1.callTimeOut());
		System.out.println(bBallPlayer2.callTimeOut());
		
		BallPlayer.showClock();
		
		System.out.println(bBallPlayer3.gameInPlay());
		
		

	}

}
