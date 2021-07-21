package com;

public interface MoveInterface {
  
	public int rollDice();
	
	public Position playerNextMove(Position playerCurrentPosition);
	
	public boolean isLandingOnSnake(); 
	
	public boolean isLandingOnLadder();

}//end interface
