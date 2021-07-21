package com;

public class Player implements PlayerInterface{
	
	Position currentPosition;
	String playerName;
	
	MoveInterface move;
	
	
	@Override
	public int getCurrentIndexOnBoard() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getTargetIndexOnBoard() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Position getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(Position currentPosition) {
		this.currentPosition = currentPosition;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	@Override
	public int playerNextNove() {
		move = new Move();
		int diceResult = move.rollDice();
		return 0;
	}
	
    

}//end class
