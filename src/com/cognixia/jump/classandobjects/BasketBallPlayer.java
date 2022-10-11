package com.cognixia.jump.classandobjects;

public class BasketBallPlayer extends TeamSport implements BallPlayer, GamePlayer{
	
	@Override
	public boolean gameInPlay() {
		return false;
	}
	
	@Override
	public double callTimeOut() {
		return 5.0;
	}

	@Override
	public void checkGameStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[] move() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean shoot() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pass() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean catchBall() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void talkToTeamMate() {
		// TODO Auto-generated method stub
		
	}



}
