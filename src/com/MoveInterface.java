package com;

public interface MoveInterface {
  
	public int rollDice();
	
	public Position playerNextMove(Position[] boardDimensions, Position playerCurrentPosition);
	
	public boolean isLandingOnSnake(Position[] boardDimensions); 
	
	public boolean isLandingOnLadder(Position[] boardDimensions);

}//end interface
