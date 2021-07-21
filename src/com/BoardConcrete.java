package com;

public class BoardConcrete implements Board{
	
	//board dimensions
	Position[] boardDimensions = new Position[100];
	
	/**
	 * Create the boards
	 */
	public  void createBoard(int numSnakes, int numLadder) {
		instantiateAllSnakes();
		instantiateAllLadders();
		
		//place snakes on the board
		for (int i = 0; i < presentSnakes.length; i++) {
			
			Position snake1 = presentSnakes[i];
			
			
		}//end 
		
		//place ladder on the board
		for (int j = 0; j < presentLadder.length; j++) {
			Position ladder = presentSnakes[j];
		}//end 
		
	}//end createBoard
	
	/**
	 * Instantiates all snakes
	 */
	private void instantiateAllSnakes(){
		Position snake1 = new Position(10,5);
		Position snake2 = new Position(27,10);
		Position snake3 = new Position(40, 20);
		Position snake4 = new Position(60, 10);
		Position snake5 = new Position(90, 30);
		presentSnakes[0] = snake1;
		presentSnakes[1] = snake2;
		presentSnakes[2] = snake3;
		presentSnakes[3] = snake4;
		presentSnakes[4] = snake5;
		
		
	}//end method instantiateAllSnakes
	
	/**
	 * Instantiates all Lates
	 */
	private void instantiateAllLadders(){
		Position ladder1 = new Position(8, 28);
		Position ladder2 = new Position(18,38);
		Position ladder3 = new Position(28, 45);
		Position ladder4 = new Position(38, 78);
		Position ladder5 = new Position(50,80);
		
		presentSnakes[0] = ladder1;
		presentSnakes[1] = ladder2;
		presentSnakes[2] = ladder3;
		presentSnakes[3] = ladder4;
		presentSnakes[4] = ladder5;
		
	}//end instantiateAllLadders

}//end class
