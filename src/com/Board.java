package com;

interface Board {
	final static int MAX_PLAYERS = 4;
	final static int NUM_LADDERS = 5;
	final static int NUM_SNAKES = 5;
	
	final static Position[] presentSnakes = new Position[5];
	final static Position[] presentLadder = new Position[5];
	
	
	
	public static void createBoard() {
		
	};
}//end interface
