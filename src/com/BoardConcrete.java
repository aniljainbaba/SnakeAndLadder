package com;

public class BoardConcrete implements Board{
	
	//board dimensions
	Position[] boardDimensions = new Position[100];
	
	/**
	 * Default constructor
	 */
	public BoardConcrete() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void createBoard() {
		
		try {
			instantiateAllSnakes();
			instantiateAllLadders();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Instantiates all snakes on the board
	 */
	private void instantiateAllSnakes() throws Exception{
		Position snake1 = new Position(10,5, "SNAKE");
		Position snake2 = new Position(27,10, "SNAKE");
		Position snake3 = new Position(40, 20,"SNAKE");
		Position snake4 = new Position(60, 10, "SNAKE");
		Position snake5 = new Position(90, 30,"SNAKE");
		presentSnakes[0] = snake1;
		presentSnakes[1] = snake2;
		presentSnakes[2] = snake3;
		presentSnakes[3] = snake4;
		presentSnakes[4] = snake5;
		
		//place snakes on the board
		for (int i = 0; i < presentSnakes.length; i++) {
			
			Position snake = presentSnakes[i];
			int fromCor = snake.getFromCorr();
			int toCor = snake.getToCorr();
			/*
			 * String targetIndexOnBoard = Integer.toString(fromCor) +
			 * Integer.toString(toCor) ; int targetIndex =
			 * Integer.parseInt(targetIndexOnBoard);
			 */
			//snake mouth is at toPosition, so movement happens from mouth position to tail
			boardDimensions[toCor] = snake;
			
		}//end 
		
		
	}//end method instantiateAllSnakes
	
	/**
	 * Instantiates all Ladders on the board
	 */
	private void instantiateAllLadders() throws Exception{
		Position ladder1 = new Position(8, 28, "LADDER");
		Position ladder2 = new Position(18,38, "LADDER");
		Position ladder3 = new Position(28, 45,"LADDER");
		Position ladder4 = new Position(38, 78, "LADDER");
		Position ladder5 = new Position(50,80,"LADDER");
		
		presentSnakes[0] = ladder1;
		presentSnakes[1] = ladder2;
		presentSnakes[2] = ladder3;
		presentSnakes[3] = ladder4;
		presentSnakes[4] = ladder5;
		
		//place ladders on the board
		for (int j = 0; j < presentLadder.length; j++) {
			Position ladder = presentLadder[j];
			
			int fromCor = ladder.getFromCorr();
			int toCor = ladder.getToCorr();
			/*
			 * String targetIndexOnBoard = Integer.toString(fromCor) +
			 * Integer.toString(toCor) ; int targetIndex =
			 * Integer.parseInt(targetIndexOnBoard);
			 */
			
			//ladder position move is from front end to tail end
			boardDimensions[toCor] = ladder;
		}
		
	}//end method nstantiateAllLadders

	

}//end class
